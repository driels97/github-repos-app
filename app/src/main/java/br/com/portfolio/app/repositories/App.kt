package br.com.portfolio.app.repositories

import android.app.Application
import br.com.portfolio.app.repositories.data.di.DataModule
import br.com.portfolio.app.repositories.domain.di.DominModule
import br.com.portfolio.app.repositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DominModule.load()
        PresentationModule.load()
    }
}