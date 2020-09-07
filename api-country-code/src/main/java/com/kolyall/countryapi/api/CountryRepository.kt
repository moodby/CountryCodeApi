package com.kolyall.countryapi.api

import android.content.ContentValues
import android.content.Context
import android.util.Log
import androidx.annotation.RawRes
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.kolyall.countryapi.objects.Country
import com.kolyall.countryapi.objects.Language
import io.reactivex.Maybe
import io.reactivex.schedulers.Schedulers
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.Reader
import java.io.StringWriter
import java.io.Writer
import java.lang.reflect.Type
import java.util.Locale

/**
 * Created by Nick Unuchek on 11.09.2017.
 */
class CountryRepository(private var context: Context, private var gson: Gson) {

    fun getCountryList(localeLanguageCode: String = Locale.getDefault().language): Maybe<List<Country>> {
        val type = object : TypeToken<List<Country>>() {}.type
        return getResponseFromRes(getLanguage(localeLanguageCode).rawJsonId, type as Type)
    }

    fun getCountryByRegionCode(regionCode: String, localeLanguageCode: String = Locale.getDefault().language): Maybe<Country> {
        return getCountryList(localeLanguageCode)
            .map { list ->
                list.firstOrNull { country -> country.regionCode == regionCode.toLowerCase() }
            }
    }

    private fun getLanguage(localeLanguageCode: String): Language {
        for (language in Language.values()) {
            if (language.code == localeLanguageCode) {
                return language
            }
        }
        return Language.ENGLISH
    }

    protected fun <T> getResponseFromRes(@RawRes rawId: Int, type: Type): Maybe<T> {
        return readStringFromResObservable(rawId)
            .map { jsonObject ->
                Log.d(
                    ContentValues.TAG,
                    "call: getResponseFromRes: map: " + Thread.currentThread().name
                )
                jsonToObj<T>(jsonObject, type)
            }
    }

    private fun readStringFromResObservable(@RawRes rawId: Int): Maybe<String> {
        return Maybe.fromCallable {
            Log.d(
                ContentValues.TAG,
                "call: readStringFromResObservable fromCallable: " + Thread.currentThread().name
            )
            readJsonFromRes(rawId)
        }.subscribeOn(Schedulers.io())
    }

    @Throws(IOException::class)
    private fun readJsonFromRes(rawId: Int): String {
        Log.d(ContentValues.TAG, "call: readJsonFromRes method: " + Thread.currentThread().name)
        val stream = context.resources.openRawResource(rawId)
        val writer: Writer = StringWriter()
        val buffer = CharArray(1024)
        stream.use { useStream ->
            val reader: Reader = BufferedReader(InputStreamReader(useStream, Charsets.UTF_8))
            var n: Int
            while (reader.read(buffer).also { n = it } != -1) {
                writer.write(buffer, 0, n)
            }
        }
        return writer.toString()
    }

    private fun <T> jsonToObj(json: String, type: Type): T {
        return gson.fromJson(json, type)
    }
}