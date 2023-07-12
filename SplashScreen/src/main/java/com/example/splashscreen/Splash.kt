package com.example.splashscreen

import android.provider.SyncStateContract.Columns
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlin.time.ExperimentalTime
import kotlin.time.seconds

@OptIn(ExperimentalTime::class)
@Composable
fun SplashScreenDesign(image: Painter, title: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        var progress = 0.5f
        Image(
            painter = image,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(65.dp),
            contentDescription = "image"
        )
        Spacer(modifier = Modifier.padding(top = 20.dp))
        Text(text = title, fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = Color.Black)
        Spacer(modifier = Modifier.padding(top = 20.dp))
        LinearProgressIndicator(
            progress = progress,
            modifier = Modifier
                .width(100.dp)
                .height(5.dp),
            color = Color.Blue,
            trackColor = Color.Yellow
        )
        LaunchedEffect(key1 = true, block = {
            delay(2.seconds)
            progress=1f
        })
    }
}