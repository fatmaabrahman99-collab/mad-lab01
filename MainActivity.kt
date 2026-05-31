package tz.ac.suza.composebasicslab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import tz.ac.suza.composebasicslab.ui.theme.ComposeBasicsLabTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeBasicsLabTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    // Change composable here to test each exercise

                    //GreetingCard()

                   BusinessCard()

                    //FourQuadrantLayout()

                   //TaskCard()

                    //ResourceUsage()

                   // MaterialComponentsMiniShowcase()
                }
            }
        }
    }
}