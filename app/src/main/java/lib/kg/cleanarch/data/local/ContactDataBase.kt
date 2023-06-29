package lib.kg.cleanarch.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import lib.kg.cleanarch.data.models.ContanctEntity

@Database(entities = [ContanctEntity::class], version = 1)
abstract class ContactDataBase: RoomDatabase() {
    abstract fun contactDao(): ContactDao
}