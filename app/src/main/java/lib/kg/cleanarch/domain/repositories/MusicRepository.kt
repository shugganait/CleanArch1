package lib.kg.cleanarch.domain.repositories

import kotlinx.coroutines.flow.Flow
import lib.kg.cleanarch.domain.models.Music
import lib.kg.cleanarch.domain.utils.Resource

interface MusicRepository {
    fun addMusic(music: Music) : Flow<Resource<Unit>>

    fun getMusic(): Flow<Resource<List<Music>>>

    fun getMusicByPerfomer(): Flow<Resource<List<Music>>>

    fun getMusicByDuration(): Flow<Resource<List<Music>>>

    fun updateMusic(music: Music) : Flow<Resource<Unit>>

    fun deleteMusic(music: Music) : Flow<Resource<Unit>>
}