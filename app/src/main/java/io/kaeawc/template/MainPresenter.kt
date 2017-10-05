package io.kaeawc.template

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainPresenter(db: Database) {

    val interactor = MainInteractor(db)

    fun getImages(): Observable<List<Image>> {
        return interactor.getImages()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }

    fun onPause() {
    }
}
