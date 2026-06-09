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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.c38.model.ProductModel
import com.example.c38.repo.ProductRepoImpl
import com.example.c38.ui.theme.C38Theme
import com.example.c38.viewmodel.ProductViewModel

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
    var name by remember { mutableStateOf("") }
    var id by remember { mutableStateOf("") }
    var price by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    val productViewModel = remember { ProductViewModel(ProductRepoImpl()) }

    val allProducts = productViewModel.allProducts.observeAsState(initial = emptyList())

    val loading = productViewModel.loading.observeAsState(initial = false)

    val products = productViewModel.products.observeAsState(initial = null)
    var showDialog by remember { mutableStateOf(false) }



    LaunchedEffect(products.value) {
        productViewModel.getAllProduct()
        products.value?.let {
            name = it.name
            price = it.price.toString()
            description = it.description
            id = it.id
        }

    }


    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                //navigate to add product activity
            }) {
                Icon(Icons.Default.Add, contentDescription = null)
            }
        },
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
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            if(showDialog){
                item {
                    AlertDialog(
                        onDismissRequest = {
                            showDialog = false
                        },
                        confirmButton = {
                            TextButton(onClick = {
                                val model = ProductModel(
                                    id = id,
                                    name= name,
                                    price = price.toDouble(),
                                    description = description,
                                )
                                productViewModel.updateProduct(id,model){
                                    success,msg->
                                    if(success){
                                        showDialog = false
                                    }else{
                                        showDialog = false
                                    }
                                }
                            }) {
                                Text("Update")
                            }
                        },
                        dismissButton = {
                            TextButton(onClick = {
                                showDialog = false
                            }) {
                                Text("Cancel")
                            }
                        },
                        title = {Text("Update Product")},
                        text = {
                            Column {
                                OutlinedTextField(
                                    value = name,
                                    onValueChange = {
                                        //ram
                                        name = it
                                    },
                                    shape = RoundedCornerShape(12.dp),
                                    modifier = Modifier.fillMaxWidth(),
                                    placeholder = {
                                        Text("Product name")
                                    },
                                    colors = TextFieldDefaults.colors(
                                        unfocusedIndicatorColor = Color.Transparent,
                                        unfocusedContainerColor = Color.Gray.copy(alpha = 0.1f),
                                        focusedContainerColor = Color.Gray.copy(alpha = 0.1f),
                                        focusedIndicatorColor = Color.Blue,
                                    )
                                )
                                Spacer(modifier = Modifier.height(20.dp))

                                OutlinedTextField(
                                    value = price,
                                    onValueChange = {
                                        //ram
                                        price = it
                                    },
                                    shape = RoundedCornerShape(12.dp),
                                    modifier = Modifier.fillMaxWidth(),
                                    placeholder = {
                                        Text("Product price")
                                    },
                                    colors = TextFieldDefaults.colors(
                                        unfocusedIndicatorColor = Color.Transparent,
                                        unfocusedContainerColor = Color.Gray.copy(alpha = 0.1f),
                                        focusedContainerColor = Color.Gray.copy(alpha = 0.1f),
                                        focusedIndicatorColor = Color.Blue,
                                    )
                                )
                                Spacer(modifier = Modifier.height(20.dp))

                                OutlinedTextField(
                                    value = description,
                                    onValueChange = {
                                        //ram
                                        description = it
                                    },
                                    shape = RoundedCornerShape(12.dp),
                                    modifier = Modifier.fillMaxWidth(),
                                    placeholder = {
                                        Text("Product description")
                                    },
                                    colors = TextFieldDefaults.colors(
                                        unfocusedIndicatorColor = Color.Transparent,
                                        unfocusedContainerColor = Color.Gray.copy(alpha = 0.1f),
                                        focusedContainerColor = Color.Gray.copy(alpha = 0.1f),
                                        focusedIndicatorColor = Color.Blue,
                                    )
                                )
                            }
                        }
                    )
                }
            }
            if(loading.value){
                item {
                    CircularProgressIndicator()
                }
            }else{
                items(allProducts.value!!.size) { index ->
                    val data = allProducts.value!![index]
                    Column {
                        Text(data.name)
                        Text(data.price.toString())
                        Text(data.description)
                        TextButton(onClick = {
                            showDialog = true
                            productViewModel.getProductByID(data.id)
                        }) {
                            Text("Edit")
                        }
                        TextButton(onClick = {
                            productViewModel.deleteProduct(data.id) { success, msg ->
                            }
                        }) {
                            Text("Delete")
                        }
                    }
                }

            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeBody()
}