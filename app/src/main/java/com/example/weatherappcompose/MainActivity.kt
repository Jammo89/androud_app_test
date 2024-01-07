package com.example.weatherappcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.weatherappcompose.screens.MainCard
import com.example.weatherappcompose.screens.TabLayout
import com.example.weatherappcompose.ui.theme.WeatherAppComposeTheme
import com.example.weatherappcompose.screens.ListItem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppComposeTheme {
                Image(
                    painter = painterResource(id = R.drawable.main_fon),
                    contentDescription = "main_fon",
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.5f),
                    contentScale = ContentScale.Crop
                )
                Column {
                    MainCard()
                    TabLayout()
                    ListItem()
                }

            }
        }
    }
}

const val KEY_API = "2d0f72952eec453aa8a151834240101"
