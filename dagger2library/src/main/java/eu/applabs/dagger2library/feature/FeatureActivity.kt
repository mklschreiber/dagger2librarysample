package eu.applabs.dagger2library.feature

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import dagger.android.AndroidInjection
import eu.applabs.dagger2library.R
import eu.applabs.dagger2library.repo.MessageRepository
import javax.inject.Inject

/**
 * Sample activity displaying a simple message by using the dependency injection provided by Dagger
 */
class FeatureActivity : AppCompatActivity() {

    @Inject
    lateinit var messageRepository: MessageRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
        AndroidInjection.inject(this)

        findViewById<TextView>(R.id.textView).text = messageRepository.message
    }
}