package io.kaeawc.template

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var disposable: CompositeDisposable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        if (!disposable.isDisposed) disposable.dispose()
    }

    override fun onPause() {
        super.onPause()
        if (!disposable.isDisposed) disposable.dispose()
    }
}
