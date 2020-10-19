package com.example.hallopose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
import com.example.hallopose.ui.HalloPoseTheme
import com.example.hallopose.ui.Home

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HalloPoseTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    Home()
                }
            }
        }
    }
}

