package com.raypl.crudusers.di

import com.raypl.crudusers.datasource.LocalUsersDataSource
import org.koin.core.qualifier.named
import org.koin.dsl.module

internal const val USERS_LOCAL_DATA_SOURCE = "UsersLocalDataSource"

var localDataSourceModule = module{

    single(named(USERS_LOCAL_DATA_SOURCE)){ LocalUsersDataSource() }
}