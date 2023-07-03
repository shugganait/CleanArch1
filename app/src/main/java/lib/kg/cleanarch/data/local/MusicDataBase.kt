package lib.kg.cleanarch.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import lib.kg.cleanarch.data.models.MusicEntity

@Database(entities = [MusicEntity::class], version = 1)
abstract class MusicDataBase: RoomDatabase() {
    abstract fun musicDao(): MusicDao
}