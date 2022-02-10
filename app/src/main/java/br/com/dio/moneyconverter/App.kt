package br.com.dio.moneyconverter

import android.app.Application
import br.com.dio.moneyconverter.data.di.DataModules
import br.com.dio.moneyconverter.domain.di.DomainModule
import br.com.dio.moneyconverter.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}