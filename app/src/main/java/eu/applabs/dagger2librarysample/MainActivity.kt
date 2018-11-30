package eu.applabs.dagger2librarysample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import eu.applabs.dagger2library.Library
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Simple activity used as entry point of the application. It just provides a button which will start the feature of the
 * library.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowLibraryFeature.setOnClickListener {
            Library.startFeature(this)
        }
    }
}
