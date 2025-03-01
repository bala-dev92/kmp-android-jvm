package com.balag.kmpsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.balag.kmplibrary.KmpLibrary
import com.balag.kmpsample.ui.theme.KMPSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KMPSampleTheme {
               CenteredButtonWithColumn()
            }
        }
    }
}

@Composable
fun CenteredButtonWithColumn() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            KmpLibrary().printMessage("Message from Android Sample Project")
        }) {
            Text(text = "Print Message")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KMPSampleTheme {
       CenteredButtonWithColumn()
    }
}