package io.kaeawc.template

import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Database

@Database(entities = [Image::class], version = 1)
abstract class Database : RoomDatabase() {

    abstract fun imageRepository(): ImageRepository
}
