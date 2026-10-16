package com.sena.first_project.ui.section

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HeaderSection(){
    Box(
        modifier = Modifier.fillMaxWidth().height(90.dp),
        contentAlignment = Alignment.Center
    )
    {
        Text(text = "Juvelly Bustamante")
    }
}