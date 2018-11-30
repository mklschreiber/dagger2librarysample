package eu.applabs.dagger2librarysample

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import eu.applabs.dagger2library.Library
import eu.applabs.dagger2librarysample.di.DaggerAppComponent

/**
 * Application class which is registered in the @see Manifest and is used to create the dependency graph of Dagger
 */
class SampleApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
            .application(this)
            .libraryComponent(Library.buildComponent(this)) // Use the static function of the library to build the component
            .build()
    }
}