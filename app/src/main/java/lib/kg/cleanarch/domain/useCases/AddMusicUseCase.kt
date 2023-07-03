package lib.kg.cleanarch.domain.useCases

import lib.kg.cleanarch.domain.models.Music
import lib.kg.cleanarch.domain.repositories.MusicRepository
import javax.inject.Inject

class AddMusicUseCase @Inject constructor(
    private val musicRepository :  MusicRepository
) {

    fun addMusic(music: Music) {
        musicRepository.addMusic(music)
    }

}