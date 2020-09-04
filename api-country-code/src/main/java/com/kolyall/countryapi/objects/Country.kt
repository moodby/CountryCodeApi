package com.kolyall.countryapi.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kolyall.countryapi.utils.CountryUtils;

import java.text.Collator;

import androidx.annotation.NonNull;


/**
 * Created by hbb20 on 11/1/16.
 */
public class Country implements Comparable<Country> {
    @SerializedName("region_code")
    @Expose String regionCode;

    @SerializedName("country_code")
    @Expose String countryCode;

    @SerializedName("name")
    @Expose String name;

    @SerializedName("english_name")
    @Expose String englishName;

    public Country() {
    }

    public Country(String nameCode, String phoneCode, String name) {
        this(nameCode, phoneCode, name, name);
    }

    public Country(String regionCode, String countryCode, String name, String englishName) {
        this.regionCode = regionCode;
        this.countryCode = countryCode;
        this.name = name;
        this.englishName = englishName;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }


    public int getFlagDrawableResId() {
        return CountryUtils.getFlagDrawableResId(this);
    }

    /**
     * If country have query word in name or name code or phone code, this will return true.
     */
    public boolean isEligibleForQuery(String query) {
        query = query.toLowerCase();
        return getName().toLowerCase().contains(query) || getRegionCode().toLowerCase().contains(query) || getCountryCode().toLowerCase().contains(query) || getEnglishName().toLowerCase().contains(query);
    }

    @Override
    public int compareTo(@NonNull Country other) {
        return Collator.getInstance().compare(this.getName(), other.getName());
    }
}
