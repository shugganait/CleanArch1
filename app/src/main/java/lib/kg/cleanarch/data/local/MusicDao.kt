package lib.kg.cleanarch.data.local

import androidx.room.*
import lib.kg.cleanarch.data.models.MusicEntity

@Dao
interface MusicDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addMusic(musicEntity: MusicEntity)

    @Query("SELECT * FROM musics")
    suspend fun getMusic(): List<MusicEntity>

    @Query("SELECT * FROM musics ORDER BY perfomer ASC")
    suspend fun getMusicByPerfomer(): List<MusicEntity>

    @Query("SELECT * FROM musics ORDER BY CAST(duration " + "AS INTEGER) ASC")
    suspend fun getMusicByDuration(): List<MusicEntity>

    @Update
    suspend fun updateMusic(musicEntity: MusicEntity)

    @Delete
    suspend fun deleteMusic(musicEntity: MusicEntity)

}