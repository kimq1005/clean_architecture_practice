package com.example.presentation.myScreen

import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign


@Composable
fun YeahManScreen(text:String){
    Column(modifier = Modifier.fillMaxWidth().background(Color.Blue)) {
        Text(text = text, textAlign = TextAlign.Center)

    }
}