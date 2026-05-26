package com.example.c38.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.c38.model.UserModel
import com.example.c38.repo.UserRepo

class UserViewModel(val repo : UserRepo) : ViewModel() {

    fun login(
        email: String, password: String,
        callback: (Boolean, String) -> Unit
    ){
        repo.login(email,password,callback)
    }


    fun forgetPassword(
        email: String,
        callback: (Boolean, String) -> Unit
    ){
        repo.forgetPassword(email,callback)
    }

    private val _loading = MutableLiveData<Boolean>()
    val loading : MutableLiveData<Boolean> get() = _loading

    private val _users = MutableLiveData<UserModel?>()
    val users : MutableLiveData<UserModel?> get() = _users

    private val _allUsers = MutableLiveData<List<UserModel>?>()
    val allUsers : MutableLiveData<List<UserModel>?> get() = _allUsers

    fun getUserById(
        id: String
    ){
       _loading.value = true
       repo.getUserById(id){
           success,msg,data->
           if(success){
               _users.value = data
               _loading.value = false
           }else{
               _users.value = null
               _loading.value = false
           }
       }
    }

    fun getAllUser(){

    }


    fun logout(callback: (Boolean, String) -> Unit){
        repo.logout(callback);
    }


    //authentication
    fun register(
        email: String, password: String,
        callback: (Boolean, String, String) -> Unit
    ){
        repo.register(email,password,callback)
    }


    fun addUser(id: String, model: UserModel, callback: (Boolean, String) -> Unit){
        repo.addUser(id,model,callback)
    }

    fun editProfile(id: String, model: UserModel, callback: (Boolean, String) -> Unit){
        repo.editProfile(id,model,callback)
    }

    fun deleteUser(id: String,callback: (Boolean, String) -> Unit){
        repo.deleteUser(id,callback)
    }
}