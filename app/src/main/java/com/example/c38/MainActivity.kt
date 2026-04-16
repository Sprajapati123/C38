package com.example.c38

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.c38.ui.theme.C38Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainBody()
        }
    }
}

@Composable
fun MainBody() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(
                    R.drawable.outline_arrow_back_ios_new_24
                ),
                contentDescription = "This is back arrow"
            )
            Text(
                "sandis", style = TextStyle(
                    fontSize = 24.sp,
                    color = Color.Red,
                    fontWeight = FontWeight.W900,
                    fontStyle = FontStyle.Italic,
                    textDecoration = TextDecoration.Underline,
                    textAlign = TextAlign.Center
                )
            )
            Icon(
                painter = painterResource(
                    R.drawable.baseline_more_horiz_24
                ),
                contentDescription = null
            )
        }
        

    }
}

@Preview
@Composable
fun MainPreview() {
    MainBody()
}