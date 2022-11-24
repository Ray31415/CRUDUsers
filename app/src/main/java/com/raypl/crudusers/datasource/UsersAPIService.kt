package com.raypl.crudusers.datasource

import com.raypl.crudusers.model.UserAPIModel
import retrofit2.Response
import retrofit2.http.GET

interface UsersAPIService {

    @GET("api/User")
    suspend fun retrieveUsers(): Response<List<UserAPIModel>>
}