package eu.applabs.dagger2library.di

import dagger.Module
import dagger.Provides
import eu.applabs.dagger2library.repo.MessageRepository

/**
 * Sample module which provides the logic to build the dependency required by the @see FeatureActivity
 */
@Module
class RepositoryModule {

    /**
     * Resolve the dependency to the @see MessageRepository by creating a new instance and passing some sample message
     */
    @Provides
    fun providesMessageRepository() : MessageRepository {
        return MessageRepository("Hello from library")
    }

}