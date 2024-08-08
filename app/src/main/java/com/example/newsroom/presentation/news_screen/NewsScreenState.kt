package com.example.newsroom.presentation.news_screen

import com.example.newsroom.domain.model.Article

data class NewsScreenState(     // for user action
    // any value that can change duyring the usage of app
    val isLoading: Boolean = false,
    val articles: List<Article> = emptyList(),
    val error: String? = null,
    val isSearchBarVisible: Boolean= false,
    val selectedArticle: Article? = null,
    val category: String = "General",
    val searchQuery: String = ""
)
