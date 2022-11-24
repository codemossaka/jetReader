package com.godsonpeya.jetreader.screens.details

import androidx.lifecycle.ViewModel
import com.godsonpeya.jetreader.data.Resource
import com.godsonpeya.jetreader.model.Item
import com.godsonpeya.jetreader.repository.BookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(private val repository: BookRepository)

    : ViewModel(){
        suspend fun getBookInfo(bookId: String): Resource<Item> {
            return repository.getBookInfo(bookId)
        }
    }