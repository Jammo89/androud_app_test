package com.example.weatherappcompose


import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.weatherappcompose.screens.MainScreen

import com.example.weatherappcompose.ui.theme.WeatherAppComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppComposeTheme {
                MainScreen()
            }
        }
    }
}
const val KEY_API = "2d0f72952eec453aa8a151834240101"
