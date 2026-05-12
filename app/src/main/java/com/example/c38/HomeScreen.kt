package com.example.c38

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.c38.ui.theme.C38Theme

class HomeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomeBody()
        }
    }
}

@Composable
fun HomeBody() {
    LazyColumn  (
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
        }
        items(100){index->
            ElevatedButton(
                onClick = {},
                modifier = Modifier.height(200.dp)
            ) {
                Text("Submit")
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeBody()
}