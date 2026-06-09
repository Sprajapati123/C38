package com.example.c38.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.c38.model.ProductModel
import com.example.c38.repo.ProductRepo

class ProductViewModel(val repo: ProductRepo) : ViewModel() {

    fun addProduct(model: ProductModel, callback: (Boolean, String) -> Unit){
        repo.addProduct(model,callback)
    }
    fun updateProduct(id: String, model: ProductModel, callback: (Boolean, String) -> Unit){
        repo.updateProduct(id,model,callback)
    }
    fun deleteProduct(id: String, callback: (Boolean, String) -> Unit){
        repo.deleteProduct(id,callback)
    }

    private val _products = MutableLiveData<ProductModel?>()
    val products : MutableLiveData<ProductModel?> get() = _products

    private val _allProducts = MutableLiveData<List<ProductModel>?>()
    val allProducts : MutableLiveData<List<ProductModel>?> get() = _allProducts

    private val _loading = MutableLiveData<Boolean>()
    val loading : MutableLiveData<Boolean> get() = _loading
    fun getAllProduct(){
        _loading.value = true
        repo.getAllProduct { success, msg, products ->
            if(success){
                _allProducts.value = products
                _loading.value = false
            }else{
                _loading.value = false
                _allProducts.value = emptyList()
            }
        }
    }
    fun getProductByID(id: String){

        repo.getProductByID(id) { success, msg, products ->
            if(success){
                _products.value = products
            }else{
                _products.value = null
            }
        }
    }

}