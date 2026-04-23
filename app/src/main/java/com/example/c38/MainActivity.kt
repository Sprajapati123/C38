package com.example.c38

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.layout.ContentScale
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
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
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

        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.apple),
                contentDescription = null,
                modifier = Modifier
                    .height(70.dp)
                    .width(70.dp)
                    .clip(shape = RoundedCornerShape(100.dp)),
                contentScale = ContentScale.Crop

            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("174")
                Text("Posts")
            }
            Column {
                Text("1M")
                Text("Followers")
            }
            Column {
                Text("1M")
                Text("Followings")
            }

        }


    }
}

@Preview
@Composable
fun MainPreview() {
    MainBody()
}