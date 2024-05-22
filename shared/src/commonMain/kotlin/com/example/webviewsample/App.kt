package com.example.webviewsample

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun App(modifier: Modifier = Modifier) {
    var count by remember{
        mutableIntStateOf(0)
    }

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

        Button(onClick = {count++}, content = {
            Text("Count : $count")
        })
    }
    
}