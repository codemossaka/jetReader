package com.godsonpeya.jetreader.di

import com.godsonpeya.jetreader.network.BooksApi
import com.godsonpeya.jetreader.repository.FireRepository
import com.godsonpeya.jetreader.utils.Constants
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideFireBookRepository() =
        FireRepository(queryBook = FirebaseFirestore.getInstance().collection("books"))

    @Singleton
    @Provides
    fun provideBookApi(): BooksApi {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build().create(BooksApi::class.java)
    }
}