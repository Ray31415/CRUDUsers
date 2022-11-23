package com.raypl.crudusers.repository

import com.raypl.crudusers.datasource.LocalUsersDataSource
import com.raypl.crudusers.datasource.RemoteUsersDataSource

class UsersRepository(val remoteUsersDataSource: RemoteUsersDataSource, val localUsersDataSource: LocalUsersDataSource){

}