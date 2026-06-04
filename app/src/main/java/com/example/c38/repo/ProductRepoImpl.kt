package com.example.c38.repo

import com.example.c38.model.ProductModel
import com.example.c38.model.UserModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ProductRepoImpl : ProductRepo {
    val database = FirebaseDatabase.getInstance()
    val ref = database.getReference("products")

    override fun addProduct(
        model: ProductModel,
        callback: (Boolean, String) -> Unit
    ) {
        val id = ref.push().key.toString()
        model.id = id

        ref.child(id).setValue(model).addOnCompleteListener {
            if (it.isSuccessful) {
                callback(true, "Product added succesfully")
            } else {
                callback(false, "${it.exception?.message}")
            }
        }
    }

    override fun updateProduct(
        id: String,
        model: ProductModel,
        callback: (Boolean, String) -> Unit
    ) {
        ref.child(model.id).updateChildren(model.toMap()).addOnCompleteListener {
            if (it.isSuccessful) {
                callback(true, "Product updated succesfully")
            } else {
                callback(false, "${it.exception?.message}")
            }
        }
    }

    override fun deleteProduct(
        id: String,
        callback: (Boolean, String) -> Unit
    ) {
        ref.child(id).removeValue().addOnCompleteListener {
            if (it.isSuccessful) {
                callback(true, "Product deleted succesfully")
            } else {
                callback(false, "${it.exception?.message}")
            }
        }
    }

    override fun getAllProduct(callback: (Boolean, String, List<ProductModel>?) -> Unit) {
        ref.addValueEventListener(object  : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    val allProducts = mutableListOf<ProductModel>()
                    for(user in snapshot.children){
                        val data = user.getValue(ProductModel::class.java)
                        if(data != null){
                            allProducts.add(data)
                        }
                    }
                    callback(true,"Product Fetched",allProducts)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                callback(false,error.message,emptyList())
            }
        })
    }

    override fun getProductByID(
        id: String,
        callback: (Boolean, String, ProductModel?) -> Unit
    ) {
        ref.child(id).addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    var product = snapshot.getValue(ProductModel::class.java)
                    product.let {
                        callback(true, "product fetched", it)
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                callback(false, error.message, null)
            }
        })
    }
}