package com.metehanbolat.data.di.usecase

import com.metehanbolat.domain.usecase.getallproductsusecase.GetAllProductsUseCase
import com.metehanbolat.domain.usecase.getallproductsusecase.GetAllProductsUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class UseCaseModule {

    @Binds
    @ViewModelScoped
    abstract fun bindGetAllProductsUseCase(getAllProductsUseCaseImpl: GetAllProductsUseCaseImpl): GetAllProductsUseCase
}