package com.raypl.crudusers.domain

import com.raypl.crudusers.repository.UsersRepository

class RetrieveUsersUseCase(val usersRepository: UsersRepository) {

    suspend operator fun invoke() {
        usersRepository.retrieveUsers(true)
    }
}