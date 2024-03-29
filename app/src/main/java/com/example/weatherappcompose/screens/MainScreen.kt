package com.example.weatherappcompose.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.weatherappcompose.R
import com.example.weatherappcompose.ui.theme.BlueLight


@Preview(showBackground = true, device = "spec:width=400px,height=1000px,dpi=240")
@Composable
fun MainCard() {
    Column(
        modifier = Modifier
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
                    style = TextStyle(fontSize = 65.sp),
                    color = Color.White
                )
                Text(
                    text = "Облочно",
                    style = TextStyle(fontSize = 16.sp),
                    color = Color.White
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.is_serarc),
                            contentDescription = "serch",
                            tint = Color.White
                        )
                    }
                    Text(
                        text = "12 C/ 1 C",
                        modifier = Modifier.padding(top = 5.dp),
                        style = TextStyle(fontSize = 16.sp),
                        color = Color.White
                    )

                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.is_sync),
                            contentDescription = "sync",
                            tint = Color.White
                        )
                    }
                }
            }

        }
    }


}


@Composable
fun TabLayout() {

    val tabList = listOf("HOURS", "DAYS")

    Column(
        modifier = Modifier.clip(RoundedCornerShape(5.dp))
    ) {
        TabRow(
            selectedTabIndex = 0,
            indicator = {},
            containerColor = BlueLight
        ) {
            tabList.forEachIndexed { index, text ->
                Tab(
                    selected = false,
                    onClick = { },
                    text = { Text(text = text) })

            }
        }
    }
}