package com.example.navigation.data

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import kotlinx.coroutines.launch

class MainViewModel(val dataBase: CreateDataBase) : ViewModel() {
    val itemsList = dataBase.dao.getUserList()
    var userEntity: User? = null

    fun insertItem(login: String, password: String) = viewModelScope.launch {
        val nameItem = userEntity?.copy(login = login, password = password)
            ?: User(id = 0,login =  login, password = password)
        dataBase.dao.insertRegistration(nameItem)
        userEntity = null

    }

    fun deleteItem(item: User) = viewModelScope.launch {
        dataBase.dao.deleteUser(item)
    }

    fun getPass(login: String) : String {
        return dataBase.dao.getPassword(login)
    }

    companion object{
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory{
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras): T {
                val database = (checkNotNull(extras[APPLICATION_KEY]) as App).dataBase
                return MainViewModel(database) as T
            }
        }
    }
}