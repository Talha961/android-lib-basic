package com.example.libraryimplementaion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.libraryimplementaion.ui.theme.LibraryImplementaionTheme
import com.example.splashscreen.Company
import com.example.splashscreen.SplashScreenDesign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LibraryImplementaionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SplashScreenDesign(
                        image = painterResource(id = R.drawable.ic_launcher_foreground),
                        title = Company.getName("Talha")
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LibraryImplementaionTheme {
        SplashScreenDesign(
            image = painterResource(id = R.drawable.ic_launcher_background),
            title = Company.getName("Talha")
        )
    }
}