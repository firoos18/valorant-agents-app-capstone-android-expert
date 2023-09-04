package com.example.capstone.core.domain.repository

import com.example.capstone.core.data.source.Resource
import com.example.capstone.core.domain.models.ArticlesItem
import kotlinx.coroutines.flow.Flow

interface ArticleRepository {
    fun getAllArticle() : Flow<Resource<List<ArticlesItem>>>

    fun getFavoriteArticle() : Flow<List<ArticlesItem>>

    fun setFavoriteArticle(article : ArticlesItem, state : Boolean)
}