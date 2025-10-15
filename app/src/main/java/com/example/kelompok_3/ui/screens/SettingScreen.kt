package com.example.kelompok_3.ui.screens


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SettingsScreen() {
    Box(    Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("Settings Screen", style = MaterialTheme.typography.headlineSmall)
    }
}
