package com.example.c38.model

data class ProductModel(
    var id : String = "",
    var name : String = "",
    var price : Double = 0.0,
    var description : String = "",
){
    fun toMap() : Map<String,Any?>{
        return mapOf(
            "name" to name,
            "price" to price,
            "description" to description,
        )
    }
}
