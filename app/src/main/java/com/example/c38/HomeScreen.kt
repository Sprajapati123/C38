package com.example.c38

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeBody() {

    val productList = listOf(
        ProductModel(image = R.drawable.google, username = "Google"),
        ProductModel(image = R.drawable.faceebook, username = "Facebook"),
        ProductModel(image = R.drawable.apple, username = "Apple"),
        ProductModel(image = R.drawable.samsung, username = "Samsung"),
        ProductModel(image = R.drawable.picker, username = "Gambler"),
        ProductModel(image = R.drawable.ball, username = "Baller"),

        )

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta,
                    titleContentColor = Color.Yellow,
                    navigationIconContentColor = Color.White
                ),
                title = {
                    Text("Dashboard")
                },
                navigationIcon = {
                    IconButton(onClick = {
//                        activity?.finish()
                    }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = null)
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Search, contentDescription = "Search")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Settings, contentDescription = "Settings")
                    }
                },

                )
        },
        bottomBar = {

        }

    ) {

        padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            item {

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp)
                ) {
                    items(productList.size) { index ->
                        Column(
                            modifier = Modifier.padding(end = 20.dp)
                        ) {
                            Image(
                                painter = painterResource(productList[index].image),
                                contentDescription = null,
                                modifier = Modifier.size(60.dp)
                            )
                            Text(productList[index].username)
                        }
                    }
                }
            }
            items(productList.size) { index ->
                //design like post of instagram feed
            }


            //        item {
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text("Submit")
            //            }
            //        }
            //        items(100){index->
            //            ElevatedButton(
            //                onClick = {},
            //                modifier = Modifier.height(200.dp)
            //            ) {
            //                Text(index.toString())
            //            }
            //        }
            //        item{
            //            Text("njklshdfjbsdkdj")
            //        }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeBody()
}