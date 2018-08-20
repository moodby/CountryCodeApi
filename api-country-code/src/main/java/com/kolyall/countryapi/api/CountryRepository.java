package com.kolyall.countryapi.api;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RawRes;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kolyall.countryapi.objects.Country;
import com.kolyall.countryapi.objects.Language;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

import rx.Observable;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

import static android.content.ContentValues.TAG;

/**
 * Created by Nick Unuchek on 11.09.2017.
 */

public class CountryRepository {

    Context mContext;
    Gson mGson;

    public CountryRepository(Context context, Gson gson) {
        mContext = context;
        mGson = gson;
    }

    public Observable<List<Country>> getCountryListObservable(){
        Type type = new TypeToken<List<Country>>(){}.getType();
        return getResponseFromRes(getLanguage().getRawJsonId(), (Type) type);
    }

    public Observable<Country> getCountryByRegionCodeObservable(String regionCode){
        return getCountryListObservable()
                .flatMap(Observable::from)
                .filter(country -> country.getRegionCode().equals(regionCode.toLowerCase()));
    }

    private Language getLanguage() {
        String localeLanguage = Locale.getDefault().getLanguage();
        for (Language language:Language.values()){
            if (language.getCode().equals(localeLanguage)){
                return language;
            }
        }
        return Language.ENGLISH;
    }

    @NonNull
    protected <T> Observable<T> getResponseFromRes(@RawRes int rawId, final Type type) {
        return readStringFromResObservable(rawId)
                .map(new Func1<String, T>() {
                    @Override
                    public T call(String jsonObject) {
                        Log.d(TAG, "call: getResponseFromRes: map: "+Thread.currentThread().getName());
                        return jsonToObj(jsonObject, type);
                    }
                });
    }

    @NonNull
    private Observable<String> readStringFromResObservable(@RawRes final int rawId) {
        return Observable.fromCallable(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Log.d(TAG, "call: readStringFromResObservable fromCallable: "+Thread.currentThread().getName());
                return readJsonFromRes(rawId);
            }
        }).subscribeOn(Schedulers.io());
    }

    private String readJsonFromRes(int rawId) throws IOException {
        Log.d(TAG, "call: readJsonFromRes method: "+Thread.currentThread().getName());
        InputStream is = mContext.getResources().openRawResource(rawId);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try {
            Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
        } finally {
            is.close();
        }

        return writer.toString();
    }

    private <T> T jsonToObj(String json,Type type) {
        return mGson.fromJson(json, type);
    }

}
