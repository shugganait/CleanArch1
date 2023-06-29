package lib.kg.cleanarch.data.local

import androidx.room.*
import lib.kg.cleanarch.data.models.ContanctEntity

@Dao
interface ContactDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addContact(contactEntity: ContanctEntity)

    @Query("SELECT * FROM contacts")
    suspend fun getContacts(): List<ContanctEntity>

    @Update
    suspend fun updateContact(contactEntity: ContanctEntity)

    @Delete
    suspend fun deleteContact(contactEntity: ContanctEntity)

}