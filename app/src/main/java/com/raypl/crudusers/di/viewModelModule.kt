package com.raypl.crudusers.di

import com.raypl.crudusers.ui.UsersViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

var viewModelModule = module{

    viewModel { UsersViewModel(get(named(USERS_USE_CASE))) }
}