package lib.kg.cleanarch.data.mappers

import lib.kg.cleanarch.data.models.MusicEntity
import lib.kg.cleanarch.domain.models.Music

fun MusicEntity.toMusic() = Music(id, name, perfomer, album, duration)

fun Music.toMusicEntity() = MusicEntity(id, name, perfomer, album, duration)