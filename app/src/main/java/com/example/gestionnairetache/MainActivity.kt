package com.example.gestionnairetache

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.absolutePadding
import com.example.gestionnairetache.ui.theme.GestionnairetacheTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestionnairetacheTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        GreetingImg(
                            message = "image"
                        )
                        Greeting(
                            name = "",
                            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
                        )
                        Greeting2(
                            name = "",
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun GreetingImg(message: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)

    Image(
        painter = image,
        contentDescription = message,
        modifier = modifier
    )
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "All tasks completed",
        modifier = modifier,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp //
    )
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Nice work!",
        modifier = modifier,
        fontSize = 16.sp
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GestionnairetacheTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                GreetingImg("image")
                Greeting("All tasks completed")
                Greeting2("Nice work!")
            }
        }
    }
}