package main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.singleWindowApplication
import java.io.File

@Composable
fun InsertPanel() {
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        // Left Sidebar
        Column(
            modifier = Modifier
                .width(57.dp) // Adjust width as needed
                .fillMaxHeight()
                .background(Color(0xFF1E1E1E))
                .padding(16.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {

            // Main Content Area
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                BasicText("Main Content", style = TextStyle(fontSize = 24.sp))
            }
        }
    }

    fun main() = singleWindowApplication(
        title = "Evision"
    ) {
        InsertPanel()
    }
}
