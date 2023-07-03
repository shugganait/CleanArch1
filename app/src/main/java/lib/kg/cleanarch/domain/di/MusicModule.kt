package lib.kg.cleanarch.domain.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import lib.kg.cleanarch.data.local.MusicDao
import lib.kg.cleanarch.data.local.MusicDataBase
import lib.kg.cleanarch.data.repositories.MusicRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MusicModule {

    @Singleton
    @Provides
    fun provideMusicDataBase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        MusicDataBase::class.java,
        "musics"
    )

    @Provides
    fun provideMusicDao(musicDataBase: MusicDataBase) = musicDataBase.musicDao()

    @Provides
    fun provideMusicRepository(musicDao: MusicDao) = MusicRepositoryImpl(musicDao)
}