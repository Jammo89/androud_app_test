package com.example.weatherappcompose.screens

import android.content.Context
import android.widget.EditText
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.weatherappcompose.R
import com.example.weatherappcompose.ui.theme.BlueLight


@Preview(showBackground = true, device = "spec:width=1080px,height=2340px,dpi=320")
@Composable
fun MainScreen() {


    Image(
        painter = painterResource(id = R.drawable.main_fon),
        contentDescription = "main_fon",
        modifier = Modifier
            .fillMaxSize()
            .alpha(0.5f),
        contentScale = ContentScale.Crop
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
    ) {
        //CARD ......................................................................
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = BlueLight,

                ),
            shape = RoundedCornerShape(10.dp),
        )
        {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier
                            .padding(start = 6.dp, top = 6.dp),
                        text = "02 January 2024",
                        style = TextStyle(fontSize = 15.sp),
                        color = Color.White
                    )
                    AsyncImage(
                        modifier = Modifier.size(35.dp),
                        model = "https://cdn.weatherapi.com/weather/64x64/night/116.png",
                        contentDescription = "Погода"

                    )
                }

                Text(
                    text = "London",
                    style = TextStyle(fontSize = 25.sp),
                    color = Color.White
                )
                Text(
                    text = "25 C",
                    style = TextStyle(fontSize = 45.sp),
                    color = Color.White
                )
                Text(
                    text = "Облочно",
                    style = TextStyle(fontSize = 25.sp),
                    color = Color.White
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "asdfds",color = Color.White)
                    Text(text = "asdfds",color = Color.White)
                }
            }

        }
    }


}
