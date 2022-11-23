package com.raypl.crudusers

import android.app.Application
import com.raypl.crudusers.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CrudApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin()
    }

    private fun startKoin() {
        startKoin {
            androidContext(this@CrudApplication)
            modules(listOf(
                viewModelModule,
                useCaseModule,
                repositoryModule,
                remoteDataSourcemodule,
                localDataSourceModule
            )
            )
        }
    }
}