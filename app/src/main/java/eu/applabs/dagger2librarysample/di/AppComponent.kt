package eu.applabs.dagger2librarysample.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import eu.applabs.dagger2library.di.LibraryComponent

/**
 * Component of the application which lists the @see LibraryComponent as dependency and therefore adds a builder function for it
 */
@Component(modules = [AndroidSupportInjectionModule::class], dependencies = [LibraryComponent::class])
interface AppComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder
        fun libraryComponent(libraryComponent: LibraryComponent): Builder

        fun build(): AppComponent
    }

}