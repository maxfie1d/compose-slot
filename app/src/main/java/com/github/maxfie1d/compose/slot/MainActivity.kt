package com.github.maxfie1d.compose.slot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import com.github.maxfie1d.compose.slot.ui.theme.ComposeslotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeslotTheme(
                darkTheme = true,
            ) {
                MainScreen()
            }
        }
    }
}
