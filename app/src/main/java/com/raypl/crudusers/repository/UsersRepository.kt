package com.raypl.crudusers.repository

import com.raypl.crudusers.datasource.LocalUsersDataSource
import com.raypl.crudusers.datasource.RemoteUsersDataSource
import com.raypl.crudusers.model.UserAPIModel
import retrofit2.Response

class UsersRepository(val remoteUsersDataSource: RemoteUsersDataSource, val localUsersDataSource: LocalUsersDataSource){
    suspend fun retrieveUsers(): Response<List<UserAPIModel>> {
        return remoteUsersDataSource.retrieveUsers()
    }
}