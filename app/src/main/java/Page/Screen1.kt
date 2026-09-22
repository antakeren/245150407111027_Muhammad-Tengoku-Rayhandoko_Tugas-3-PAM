package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen1(onNavigateToScreen2: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        // Tulisan Screen 1
        Text(text = "Screen 1", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp))

        // NIM dan Nama di bawah tulisan Screen 1
        UserHeader()

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = onNavigateToScreen2,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Ke Halaman 2")
        }
    }
}