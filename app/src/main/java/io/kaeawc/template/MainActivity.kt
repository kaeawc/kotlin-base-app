package io.kaeawc.template

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var db: Database

    var presenter: MainPresenter? = null
    lateinit var disposable: CompositeDisposable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppComponent.init(application as App).inject(this)
    }

    override fun onResume() {
        super.onResume()
        if (!disposable.isDisposed) disposable.dispose()
        presenter?.let {
            disposable.add(it.getImages().subscribe(
                    { photos -> onImagesLoaded(photos) },
                    { error -> onFailedToLoadImages(error) }))
        }
    }

    override fun onPause() {
        super.onPause()
        if (!disposable.isDisposed) disposable.dispose()
    }

    fun onImagesLoaded(images: List<Image>) {

    }

    fun onFailedToLoadImages(error: Throwable) {
        Timber.e(error, "Could not load images correctly")
    }
}
