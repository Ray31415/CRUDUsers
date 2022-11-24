package com.raypl.crudusers.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raypl.crudusers.domain.UsersUseCase
import kotlinx.coroutines.launch

class UsersViewModel(val userUseCase: UsersUseCase): ViewModel(){

//    init {
//        retrieveUserList()
//    }

    fun retrieveUserList() {
        viewModelScope.launch {
            userUseCase.retrieveUsersUseCase.invoke()
        }
    }
}