package id.aej.jeky.ui.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import id.aej.jeky.ui.presentation.component.TextHeader
import id.aej.jeky.ui.presentation.theme.JekyTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                runBlocking {
                    delay(5000L)
                }
                false
            }
        }
        setContent {
            JekyTheme {
                JekyApps()
            }
        }
    }
}

@Composable
fun JekyApps() {
    TextHeader(
        modifier = Modifier.padding(horizontal = 24.dp).padding(top = 44.dp),
        headerText = "Selamat Datang",
        supportText = "Masukkan email dan password dari akun yang pernah kamu buat sebelumnya"
    )
}