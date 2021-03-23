package com.alexanderpodkopaev.presentation.di

import com.alexanderpodkopaev.domain.di.DomainComponent
import com.alexanderpodkopaev.utilities.di.UtilsComponent
import dagger.Component

@Component(
    modules = [ScreenBindingModule::class],
    dependencies = [DomainComponent::class, UtilsComponent::class]
)
@PresentationScope
interface PresentationComponent {

    @Component.Builder
    interface Builder {

        fun domainComponent(domainComponent: DomainComponent): PresentationComponent.Builder
        fun utilsComponent(utilsComponent: UtilsComponent): PresentationComponent.Builder

        fun build(): PresentationComponent
    }
}