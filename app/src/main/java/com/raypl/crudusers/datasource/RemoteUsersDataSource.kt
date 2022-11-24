package com.raypl.crudusers.datasource

import com.raypl.crudusers.model.UserAPIModel
import retrofit2.Response

class RemoteUsersDataSource(val usersAPIService: UsersAPIService) {

    suspend fun retrieveUsers(): Response<List<UserAPIModel>> {
        return usersAPIService.retrieveUsers()
    }
}