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
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

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
                .background(Color.LightGray)
                .padding(16.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
          val image: Painter = painterResource("EvisionIcon_sidebar.svg")
        }

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

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        InsertPanel()
    }
}
