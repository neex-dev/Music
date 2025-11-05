package com.viza.music.models

import androidx.compose.runtime.Immutable
import androidx.room.Embedded
import com.neex.music.db.entities.Song

@Immutable
data class SongOfflineContent(
    @Embedded val song: Song,
    val contentLength: Long?
)
