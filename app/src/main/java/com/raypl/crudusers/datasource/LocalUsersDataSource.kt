package com.raypl.crudusers.datasource

import com.raypl.crudusers.model.UserAPIModel
import retrofit2.Response

class LocalUsersDataSource {

    fun retrieveUsers(): Response<List<UserAPIModel>> {
        return Response.success(listOf())
    }
}