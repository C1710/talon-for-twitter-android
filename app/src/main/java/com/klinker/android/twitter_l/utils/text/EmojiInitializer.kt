package com.klinker.android.twitter_l.utils.text

import android.content.Context
import de.c1710.filemojicompat.FileEmojiCompatConfig
import androidx.emoji.text.EmojiCompat
import androidx.emoji.text.FontRequestEmojiCompatConfig
import androidx.core.provider.FontRequest

object EmojiInitializer {

    fun initializeEmojiCompat(context: Context) {
        EmojiCompat.init(FileEmojiCompatConfig(context, null))
    }

}