package com.alexanderpodkopaev.domain.di

import com.alexanderpodkopaev.domain.di.modules.UseCasesModules
import dagger.Component

@Component(modules = [UseCasesModules::class])
@DomainScope
class DomainComponent {

    @Component.Builder
    interface Builder {
        fun build(): DomainComponent
    }
}