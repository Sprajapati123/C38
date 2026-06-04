package com.example.c38.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.c38.model.ProductModel
import com.example.c38.repo.ProductRepoImpl
import com.example.c38.view.ui.theme.C38Theme
import com.example.c38.viewmodel.ProductViewModel

class AddProductActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AddProductBody()
        }
    }
}

@Composable
fun AddProductBody() {

    val viewmodel = remember { ProductViewModel(ProductRepoImpl()) }

    val context = LocalContext.current
    var name by remember { mutableStateOf("") }
    var price by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    LazyColumn {
        item {
            Spacer(modifier = Modifier.height(20.dp))
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
            Spacer(modifier = Modifier.height(20.dp))

            ElevatedButton(onClick = {
                val model = ProductModel(
                    id = "",
                    name = name,
                    price = price.toDouble(),
                    description = description
                )
                viewmodel.addProduct(model) { success, message ->
                    if (success) {
                        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(context, message, Toast.LENGTH_LONG).show()

                    }
                }
            }) {
                Text("Add Products")
            }
        }
    }
}

@Preview
@Composable
fun AddProductPreview() {
    AddProductBody()
}