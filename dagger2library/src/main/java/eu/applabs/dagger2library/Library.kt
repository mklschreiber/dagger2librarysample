package eu.applabs.dagger2library

import android.app.Application
import android.content.Context
import android.content.Intent
import eu.applabs.dagger2library.di.DaggerLibraryComponent
import eu.applabs.dagger2library.di.LibraryComponent
import eu.applabs.dagger2library.feature.FeatureActivity

/**
 * Facade of the library providing the
 */
class Library {
    companion object {
        fun buildComponent(application: Application) : LibraryComponent {
            return DaggerLibraryComponent.builder().application(application).build()
        }

        fun startFeature(context: Context) {
            val intent = Intent(context, FeatureActivity::class.java)
            context.startActivity(intent)
        }
    }
}