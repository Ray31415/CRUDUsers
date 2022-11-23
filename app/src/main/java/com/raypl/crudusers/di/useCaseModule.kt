package com.raypl.crudusers.di

import com.raypl.crudusers.datasource.LocalUsersDataSource
import com.raypl.crudusers.domain.*
import org.koin.core.qualifier.named
import org.koin.dsl.module

internal const val USERS_USE_CASE = "UsersUseCase"
internal const val RETRIEVE_USERS = "RetrieveUsers"
internal const val REMOVE_USERS = "RemoveUsers"
internal const val ADD_USERS = "AddUsers"
internal const val EDIT_USERS = "EditUsers"

var useCaseModule = module{

    single(named(RETRIEVE_USERS)){ RetrieveUsersUseCase(get(named(USERS_REPOSITORY))) }
    single(named(REMOVE_USERS)){ RemoveUserUseCase(get(named(USERS_REPOSITORY))) }
    single(named(ADD_USERS)){ AddUserUseCase(get(named(USERS_REPOSITORY))) }
    single(named(EDIT_USERS)){ EditUserUseCase(get(named(USERS_REPOSITORY))) }

    single(named(USERS_USE_CASE)){ UsersUseCase(
        get(named(RETRIEVE_USERS)),
        get(named(ADD_USERS)),
        get(named(EDIT_USERS)),
        get(named(REMOVE_USERS))
    ) }
}