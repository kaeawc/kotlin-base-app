package io.kaeawc.template

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "images")
class Image {

    @PrimaryKey
    private val id: Int = 0

    @ColumnInfo
    private val url: String? = null
}
