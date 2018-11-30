package eu.applabs.dagger2library.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import eu.applabs.dagger2library.feature.FeatureActivity


/**
 * Module to list all Activities that need to use the dependency injection
 */
@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun bindFeatureActivity() : FeatureActivity

}