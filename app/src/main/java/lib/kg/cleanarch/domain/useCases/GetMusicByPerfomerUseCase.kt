package lib.kg.cleanarch.domain.useCases

import kotlinx.coroutines.flow.Flow
import lib.kg.cleanarch.domain.models.Music
import lib.kg.cleanarch.domain.repositories.MusicRepository
import lib.kg.cleanarch.domain.utils.Resource
import javax.inject.Inject

class GetMusicByPerfomerUseCase @Inject constructor(
    private val musicRepository: MusicRepository
) {
    fun getMusicByPerfomer(): Flow<Resource<List<Music>>> {
        return musicRepository.getMusicByPerfomer()
    }
}