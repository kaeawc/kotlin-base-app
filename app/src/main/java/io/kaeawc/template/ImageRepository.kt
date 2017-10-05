package io.kaeawc.template

import android.arch.persistence.room.*
import io.reactivex.Observable

@Dao
interface ImageRepository {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertImages(vararg images: Image)

    @Update
    fun updateImages(vararg images: Image)

    @Query("SELECT id, url FROM images")
    fun getAllImages(): Observable<List<Image>>
}
