package com.neex.music.models

import com.metrolist.innertube.models.YTItem
import com.neex.music.db.entities.LocalItem

data class SimilarRecommendation(
    val title: LocalItem,
    val items: List<YTItem>,
)
