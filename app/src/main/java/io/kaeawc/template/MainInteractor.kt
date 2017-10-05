package io.kaeawc.template

import io.reactivex.Observable

/**
 * Created by jason on 10/4/17.
 */
class MainInteractor(open val db: Database) {

    fun getImages(): Observable<List<Image>> {
        return db.imageRepository().getAllImages()
    }

}