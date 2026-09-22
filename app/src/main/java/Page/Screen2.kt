package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        // Tulisan Screen 2
        Text(text = "Screen 2", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp))

        // NIM dan Nama di bawah tulisan Screen 2
        UserHeader()
    }
}