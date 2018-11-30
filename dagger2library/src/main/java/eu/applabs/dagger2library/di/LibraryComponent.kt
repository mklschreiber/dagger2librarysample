package eu.applabs.dagger2library.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Component for the library which need to be included in the dependency graph of the sample application as we have
 * no own instance of the application class and therefore no possibility to use the new API @see AndroidInjection.inject(this)
 * within the activities provided by the library
 */
@Component(
    modules = [
        ActivityBindingModule::class,
        RepositoryModule::class,
        AndroidSupportInjectionModule::class
    ]
)
interface LibraryComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): LibraryComponent
    }
}