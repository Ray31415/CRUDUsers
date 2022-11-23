package com.raypl.crudusers.domain

data class UsersUseCase (
    val retrieveUsersUseCase: RetrieveUsersUseCase,
    val addUserUseCase: AddUserUseCase,
    val editUserUseCase: EditUserUseCase,
    val removeUserUseCase: RemoveUserUseCase
        )