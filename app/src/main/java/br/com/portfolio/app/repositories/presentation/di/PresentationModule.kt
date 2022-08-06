package br.com.portfolio.app.repositories.presentation.di

import br.com.portfolio.app.repositories.presentation.MainViewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object PresentationModule {
    fun load() {
        loadKoinModules(viewModelModule())
    }

    private fun viewModelModule(): Module {
        return module {
            factory { MainViewModel(get()) }
        }
    }
}