package white.ball.rick_and_morty.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import white.ball.rick_and_morty.data.remote_storage.retrofit.repository_impl.RickAndMortyRepositoryImpl
import white.ball.rick_and_morty.domain.repository.RickAndMortyRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindRickAndMortyRepository(impl: RickAndMortyRepositoryImpl): RickAndMortyRepository
}