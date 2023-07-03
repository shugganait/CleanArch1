package lib.kg.cleanarch.domain.useCases

import lib.kg.cleanarch.domain.models.Music
import lib.kg.cleanarch.domain.repositories.MusicRepository
import javax.inject.Inject

class UpdateMusicUseCase @Inject constructor(
    private val musicRepository: MusicRepository
) {
    fun updateMusic(music: Music) {
        musicRepository.updateMusic(music)
    }
}