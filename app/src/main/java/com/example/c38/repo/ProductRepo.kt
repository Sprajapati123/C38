package com.example.c38.repo

import com.example.c38.model.ProductModel

interface ProductRepo {
    fun addProduct(model: ProductModel, callback: (Boolean, String) -> Unit)
    fun updateProduct(id: String, model: ProductModel, callback: (Boolean, String) -> Unit)
    fun deleteProduct(id: String, callback: (Boolean, String) -> Unit)
    fun getAllProduct(callback: (Boolean, String, List<ProductModel>?) -> Unit)
    fun getProductByID(id: String, callback: (Boolean, String, ProductModel?) -> Unit)
}