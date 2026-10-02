package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class ItemData(
    val id: Int,
    val title: String,
    val imageRes: Int
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    LazyListScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyListScreen() {
    val itemList = listOf(
        ItemData(1, "Indonesia", R.drawable.indo),
        ItemData(2, "Belgia", R.drawable.belgia),
        ItemData(3, "Brazil", R.drawable.brazil),
        ItemData(4, "Cina", R.drawable.cina),
        ItemData(5, "Inggris", R.drawable.en),
        ItemData(6, "Irlandia", R.drawable.irlandia),
        ItemData(7, "Islandia", R.drawable.islandia),
        ItemData(8, "Itali", R.drawable.itali),
        ItemData(9, "Jepang", R.drawable.jp),
        ItemData(10, "Malaysia", R.drawable.malaysia),
        ItemData(11, "Norwegia", R.drawable.norway),
        ItemData(12, "Singapura", R.drawable.singapura)
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 24.dp)
    ) {
        stickyHeader {
            UserHeader()
        }
        items(itemList) { item ->
            ItemRow(item = item)
        }
    }
}

@Composable
fun ItemRow(item: ItemData) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = item.imageRes),
                contentDescription = item.title,
                modifier = Modifier
                    .size(80.dp)
                    .padding(end = 16.dp)
            )
            Text(
                text = item.title,
                fontSize = 18.sp
            )
        }
    }
}