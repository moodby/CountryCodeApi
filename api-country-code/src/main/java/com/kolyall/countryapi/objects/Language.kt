package com.kolyall.countryapi.objects

import androidx.annotation.RawRes
import com.kolyall.countryapi.R

/**
 * Created by Nick Unuchek on 11.09.2017.
 */
enum class Language(var code: String, @RawRes var rawJsonId: Int) {
    ARABIC("ar", R.raw.json_english),
    BENGALI("bn", R.raw.json_english),
    CHINESE_SIMPLIFIED("zh", R.raw.json_english),
    CHINESE_TRADITIONAL("zh", R.raw.json_english),
    ENGLISH("en", R.raw.json_english),
    FRENCH("fr", R.raw.json_english),
    GERMAN("de", R.raw.json_english),
    GUJARATI("gu", R.raw.json_english),
    HEBREW("iw", R.raw.json_english),
    HINDI("hi", R.raw.json_english),
    INDONESIA("in", R.raw.json_english),
    JAPANESE("ja", R.raw.json_english),
    KOREAN("ko", R.raw.json_english),
    PORTUGUESE("pt", R.raw.json_english),
    RUSSIAN("ru", R.raw.json_russian),
    SPANISH("es", R.raw.json_english),
    TURKISH("tr", R.raw.json_english),
    UKRAINIAN("uk", R.raw.json_russian);
}