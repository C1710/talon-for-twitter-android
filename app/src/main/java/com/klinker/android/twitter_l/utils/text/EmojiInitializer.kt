package com.klinker.android.twitter_l.utils.text

import android.content.Context
import android.support.text.emoji.EmojiCompat
import de.c1710.filemojicompat.FileEmojiCompatConfig

object EmojiInitializer {

    fun initializeEmojiCompat(context: Context) {
        EmojiCompat.init(FileEmojiCompatConfig(context, null))
    }

}