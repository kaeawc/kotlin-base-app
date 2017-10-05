package io.kaeawc.template

import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import android.arch.persistence.room.Room
import android.app.Application

@Module
class AppModule(private val app: Application) {

    @Provides
    @Singleton
    fun provideRoomDatabase(): Database {
        return Room.databaseBuilder(app,
                Database::class.java, "database-name").build()
    }
}
