package com.example.learnjetpackcompose

import android.icu.lang.UCharacter.VerticalOrientation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learnjetpackcompose.ui.theme.LearnJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnJetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PrimeiraTela()
                }
            }
        }
    }
}

@Composable
fun PrimeiraTela() {
    Column() {
        Text(
            "Eai JetPack Compose :)"
        )
        Text(
            "Vamos começar a aprender?"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PrimeiraTelaPreview() {
    LearnJetPackComposeTheme {
        PrimeiraTela()
    }
}