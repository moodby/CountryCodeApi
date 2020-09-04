package com.kolyall.countryapi.objects

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.kolyall.countryapi.utils.CountryUtils
import com.kolyall.countryapi.utils.flagDrawableResId
import java.text.Collator

/**
 * Created by hbb20 on 11/1/16.
 */
class Country(
    @SerializedName("region_code")
    @Expose
    var regionCode: String = "",

    @SerializedName("country_code")
    @Expose
    var countryCode: String = "",

    @SerializedName("english_name")
    @Expose
    var englishName: String = ""
) : Comparable<Country> {

    @SerializedName("name")
    @Expose
    lateinit var name: String

    /**
     * If country have query word in name or name code or phone code, this will return true.
     */
    fun isEligibleForQuery(text: String): Boolean {
        val query = text.toLowerCase()
        return name.toLowerCase().contains(query)
            || regionCode.toLowerCase().contains(query)
            || countryCode.toLowerCase().contains(query)
            || englishName.toLowerCase().contains(query)
    }

    override fun compareTo(other: Country): Int {
        return Collator.getInstance().compare(name, other.name)
    }
}