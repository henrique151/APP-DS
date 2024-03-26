package com.example.happaybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happaybirthday.ui.theme.HappayBirthdayTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappayBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = "3° Novotec Desenvolvimento de Sistemas",
                        message2 = "Henrique Porto de Sousa"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, message2: String, modifier: Modifier = Modifier) {
    Box(modifier, contentAlignment = Alignment.Center) {
        Column {
            Text(
                text = message,
                fontSize = 30.sp,
                lineHeight = 36.sp,
                textAlign = TextAlign.Center,
                color = Color.White // Definindo a cor do texto para branco
            )
            Text(
                text = message2,
                fontSize = 36.sp,
                lineHeight = 36.sp,
                textAlign = TextAlign.Center,
                color = Color.White // Definindo a cor do texto para branco
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappayBirthdayTheme {
        GreetingImage(
            message = "3° Novotec Desenvolvimento de Sistemas",
            message2 = "Henrique Porto de Sousa",
        )
    }
}
@Composable
fun GreetingImage(message: String, message2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.tencologia)
    Box(modifier.fillMaxSize()) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillBounds, // Para fazer a imagem ocupar todo o espaço disponível
            modifier = Modifier.fillMaxSize()
        )
        GreetingText(
            message = message,
            message2 = message2,
            modifier = Modifier.fillMaxSize()
        )
    }
}