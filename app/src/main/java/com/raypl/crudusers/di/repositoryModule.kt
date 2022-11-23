package com.raypl.crudusers.di

import com.raypl.crudusers.datasource.RemoteUsersDataSource
import com.raypl.crudusers.repository.UsersRepository
import org.koin.core.qualifier.named
import org.koin.dsl.module

internal const val USERS_REPOSITORY = "UsersRepository"

var repositoryModule = module {
    single(named(USERS_REPOSITORY)) {
        UsersRepository(
            get(named(USERS_REMOTE_DATA_SOURCE)),
            get(named(USERS_LOCAL_DATA_SOURCE))
        )
    }
}