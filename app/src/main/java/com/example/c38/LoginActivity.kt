package com.example.c38

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.c38.ui.theme.Blue
import com.example.c38.ui.theme.C38Theme
import com.example.c38.ui.theme.SmokyWhite

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginBody()
        }
    }
}

@Composable
fun LoginBody() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
    ) {
        Spacer(modifier = Modifier.height(100.dp))
        Text(
            "Sign In", style = TextStyle(
                color = Blue,
                fontWeight = FontWeight.W700,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            "It was popularized in 1960 nklhlflksflbfs with the release of Lorem Ipsum",
            style = TextStyle(
                color = SmokyWhite,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier
                .padding(vertical = 20.dp)
                .fillMaxWidth()
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Card(
                modifier = Modifier
                    .height(60.dp)
                    .weight(1f)
            ) {
                Row(modifier = Modifier.fillMaxSize()) {

                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            Card(
                modifier = Modifier
                    .height(60.dp)
                    .weight(1f)
            ) { }
        }


    }
}

@Preview
@Composable
fun LoginPreview() {
    LoginBody()
}
