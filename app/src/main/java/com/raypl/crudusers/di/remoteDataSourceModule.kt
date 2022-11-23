package com.raypl.crudusers.di

import com.raypl.crudusers.datasource.RemoteUsersDataSource
import com.raypl.crudusers.datasource.UsersAPIService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

internal const val USERS_REMOTE_DATA_SOURCE = "UsersRemoteDataSource"

var remoteDataSourceModule = module{
    single(named(USERS_REMOTE_DATA_SOURCE)){ RemoteUsersDataSource(apiService()) }
}

private fun apiService(): UsersAPIService {
    return retrofit().create(UsersAPIService::class.java)
}

private fun retrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://hello-world.innocv.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttp())
        .build()
}

private fun okHttp(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor()

    httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

    return OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor)
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .build()
}
