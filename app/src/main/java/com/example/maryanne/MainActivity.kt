package com.example.maryanne

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.maryanne.ui.theme.MaryanneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            demo()

        }
    }
}

@Composable
fun demo(){
    Column (modifier = Modifier.fillMaxSize()){
        Text("Hello Maryanne \uD83D\uDE0A ", color = Color.Gray,
            fontSize =30.sp,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
            textDecoration = TextDecoration.Underline)

        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "Welcome to Android",
            color = Color.Magenta,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive)
        Text(text = "Kotlin",
            color = Color.Blue,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif)

        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "Jetpack compose",
            color = Color.Cyan,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif)
        Divider()
        Spacer(modifier = Modifier.height(30.dp))


        Row {
            Text(text = "Hey", fontSize = 30.sp)

            Spacer(modifier = Modifier.width(20.dp))

            Text(text = "Hello",fontSize = 30.sp)
        }

        Row {
            Text(text = "eMobilis", fontSize = 30.sp)

            Spacer(modifier = Modifier.width(20.dp))

            Text(text = "Technology",fontSize = 30.sp)
        }
        /*Box {
            Text(text = "yes")
            Text(text = "no")
        }*/


    }

}


@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    demo()
}
