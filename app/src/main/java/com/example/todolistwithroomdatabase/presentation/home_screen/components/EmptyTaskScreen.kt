package com.example.todolistwithroomdatabase.presentation.home_screen.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun EmptyTaskScreen(paddingValues : PaddingValues){
    Box(
        modifier= Modifier
            .fillMaxSize()
            .padding(paddingValues),
        contentAlignment = Alignment.Center
    ){
        Text(text="No Tasks!",
            fontFamily= FontFamily.Default,
            fontWeight= FontWeight.SemiBold,
            color= Color(230,230,250),
            fontSize=32.sp)
    }
}