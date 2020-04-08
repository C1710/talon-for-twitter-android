package com.klinker.android.twitter_l.utils.text

import android.content.Context
import android.os.Build
import androidx.emoji.text.EmojiCompat
import androidx.emoji.text.FontRequestEmojiCompatConfig
import androidx.core.provider.FontRequest
import android.util.Log
import com.klinker.android.twitter_l.R
import com.klinker.android.twitter_l.data.EmojiStyle
import com.klinker.android.twitter_l.settings.AppSettings
import com.klinker.android.twitter_l.utils.Utils
import de.c1710.filemojicompat.FileEmojiCompatConfig
import java.io.File

object EmojiInitializer {
    private const val TAG = "EmojiInitializer"

    fun initializeEmojiCompat(context: Context) {
        if (AppSettings.getInstance(context).emojiStyle == EmojiStyle.ANDROID_O)
            initializeWithFile(context)
    }

    private fun initializeWithFile(context: Context) {
        val fontFile = File(context.getExternalFilesDir(null), "BlobmojiCompat.ttf")
        EmojiCompat.init(FileEmojiCompatConfig(context, fontFile)
                .setReplaceAll(true))
    }

}