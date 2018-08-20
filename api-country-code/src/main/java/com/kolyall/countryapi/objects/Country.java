package com.kolyall.countryapi.objects;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.kolyall.countryapi.utils.CountryUtils;

import java.text.Collator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Created by hbb20 on 11/1/16.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter @Setter
public class Country implements Comparable<Country> {
    @Expose String regionCode;
    @Expose String countryCode;
    @Expose String name;
    @Expose String englishName;

    @Builder
    public Country(String nameCode, String phoneCode, String name) {
        this(nameCode,phoneCode,name,name);
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
