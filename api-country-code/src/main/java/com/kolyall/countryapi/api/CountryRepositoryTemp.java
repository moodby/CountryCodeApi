package com.kolyall.countryapi.api;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RawRes;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kolyall.countryapi.objects.Country;
import com.kolyall.countryapi.objects.Language;
import com.kolyall.countryapi.utils.CountryUtils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by Nick Unuchek on 11.09.2017.
 */

public class CountryRepositoryTemp {

    public static Language loadedLibraryMasterListLanguage;
    static String dialogTitle;
    static String searchHintMessage;
    static String noResultFoundAckMessage;
    public static List<Country> loadedLibraryMaterList;
    private static String ANTIGUA_AND_BARBUDA_AREA_CODES = "268";
    private static String ANGUILLA_AREA_CODES = "264";
    private static String BARBADOS_AREA_CODES = "246";
    private static String BERMUDA_AREA_CODES = "441";
    private static String BAHAMAS_AREA_CODES = "242";
    private static String CANADA_AREA_CODES = "204/226/236/249/250/289/306/343/365/403/416/418/431/437/438/450/506/514/519/579/581/587/600/601/604/613/639/647/705/709/769/778/780/782/807/819/825/867/873/902/905/";
    private static String DOMINICA_AREA_CODES = "767";
    private static String DOMINICAN_REPUBLIC_AREA_CODES = "809/829/849";
    private static String GRENADA_AREA_CODES = "473";
    private static String JAMAICA_AREA_CODES = "876";
    private static String SAINT_KITTS_AND_NEVIS_AREA_CODES = "869";
    private static String CAYMAN_ISLANDS_AREA_CODES = "345";
    private static String SAINT_LUCIA_AREA_CODES = "758";
    private static String MONTSERRAT_AREA_CODES = "664";
    private static String PUERTO_RICO_AREA_CODES = "787";
    private static String SINT_MAARTEN_AREA_CODES = "721";
    private static String TURKS_AND_CAICOS_ISLANDS_AREA_CODES = "649";
    private static String TRINIDAD_AND_TOBAGO_AREA_CODES = "868";
    private static String SAINT_VINCENT_AND_THE_GRENADINES_AREA_CODES = "784";
    private static String BRITISH_VIRGIN_ISLANDS_AREA_CODES = "284";
    private static String US_VIRGIN_ISLANDS_AREA_CODES = "340";
    Context mContext;
    Gson mGson;

    public CountryRepositoryTemp(Context context, Gson gson) {
        mContext = context;
        mGson = gson;
    }

    public Observable<List<Country>> getCountryListObservable(Language language){
        Type type = new TypeToken<List<Country>>(){}.getType();
        Observable<List<Country>> responseFromRes = getResponseFromRes(language.getRawJsonId(), (Type) type);
        return responseFromRes;
    }

    @NonNull
    protected <T> Observable<T> getResponseFromRes(@RawRes int rawId, final Type type) {
        return readStringFromResObservable(rawId)
                .map(jsonObject -> {
                    Log.d(TAG, "call: getResponseFromRes: map: "+Thread.currentThread().getName());
                    return jsonToObj(jsonObject, type);
                });
    }

    @NonNull
    private Observable<String> readStringFromResObservable(@RawRes final int rawId) {
        return Observable.fromCallable(() -> {
            Log.d(TAG, "call: readStringFromResObservable fromCallable: "+Thread.currentThread().getName());
            return readJsonFromRes(rawId);
        }).subscribeOn(Schedulers.io());
//        Observable.unsafeCreate(new Observable.OnSubscribe<String>() {
//            @Override
//            public void call(Subscriber<? super String> subscriber) {
//                if (subscriber.isUnsubscribed()) return;
//
//                try {
//                    String jsonString = readJsonFromRes();
//                    subscriber.onNext(jsonString);
//                    subscriber.onCompleted();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                    subscriber.onError(e);
//                }
//            }
//        });
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

    public static void loadDataFromXML(Context context, Language language) {
        List<Country> countries = new ArrayList<Country>();
        String tempDialogTitle = "", tempSeachHint = "", tempNoResultAck = "";
        try {
            XmlPullParserFactory xmlFactoryObject = XmlPullParserFactory.newInstance();
            XmlPullParser xmlPullParser = xmlFactoryObject.newPullParser();
            InputStream ins = context.getResources().openRawResource(context.getResources().getIdentifier(language.toString().toLowerCase(), "raw", context.getPackageName()));
            xmlPullParser.setInput(ins, null);
            int event = xmlPullParser.getEventType();
            while (event != XmlPullParser.END_DOCUMENT) {
                String name = xmlPullParser.getName();
                switch (event) {
                    case XmlPullParser.START_TAG:
                        break;
                    case XmlPullParser.END_TAG:
                        switch (name) {
                            case "country":
                                Country country = new Country();
                                country.setRegionCode(xmlPullParser.getAttributeValue(null, "region_code").toUpperCase());
                                country.setCountryCode(xmlPullParser.getAttributeValue(null, "country_code"));
                                country.setEnglishName(xmlPullParser.getAttributeValue(null, "english_name"));
                                country.setName(xmlPullParser.getAttributeValue(null, "name"));
                                countries.add(country);
                                break;
                            case "ccp_dialog_title":
                                tempDialogTitle = xmlPullParser.getAttributeValue(null, "translation");
                                break;
                            case "ccp_dialog_search_hint_message":
                                tempSeachHint = xmlPullParser.getAttributeValue(null, "translation");
                                break;
                            case "ccp_dialog_no_result_ack_message":
                                tempNoResultAck = xmlPullParser.getAttributeValue(null, "translation");
                                break;
                        }
                        break;
                }
                event = xmlPullParser.next();
            }
            loadedLibraryMasterListLanguage = language;
        } catch (Exception e) {
            e.printStackTrace();
        }

        //if anything went wrong, countries will be loaded for english language
        if (countries.size() == 0) {
            loadedLibraryMasterListLanguage = Language.ENGLISH;
            countries = CountryUtils.getLibraryMasterCountriesEnglish();
        }

        dialogTitle = tempDialogTitle.length() > 0 ? tempDialogTitle : "Select a country";
        searchHintMessage = tempSeachHint.length() > 0 ? tempSeachHint : "Search...";
        noResultFoundAckMessage = tempNoResultAck.length() > 0 ? tempNoResultAck : "Results not found";
        loadedLibraryMaterList = countries;

        // sort list
        Collections.sort(loadedLibraryMaterList);
    }

    public static Language getLoadedLibraryMasterListLanguage() {
        return loadedLibraryMasterListLanguage;
    }

    public static void setLoadedLibraryMasterListLanguage(Language loadedLibraryMasterListLanguage) {
        CountryRepositoryTemp.loadedLibraryMasterListLanguage = loadedLibraryMasterListLanguage;
    }

    public static List<Country> getLoadedLibraryMaterList() {
        return loadedLibraryMaterList;
    }

    public static void setLoadedLibraryMaterList(List<Country> loadedLibraryMaterList) {
        CountryRepositoryTemp.loadedLibraryMaterList = loadedLibraryMaterList;
    }

    public static String getDialogTitle(Context context, Language language) {
        if (loadedLibraryMasterListLanguage == null || loadedLibraryMasterListLanguage != language || dialogTitle == null || dialogTitle.length() == 0) {
            loadDataFromXML(context, language);
        }
        return dialogTitle;
    }

    public static String getSearchHintMessage(Context context, Language language) {
        if (loadedLibraryMasterListLanguage == null || loadedLibraryMasterListLanguage != language || searchHintMessage == null || searchHintMessage.length() == 0) {
            loadDataFromXML(context, language);
        }
        return searchHintMessage;
    }

    public static String getNoResultFoundAckMessage(Context context, Language language) {
        if (loadedLibraryMasterListLanguage == null || loadedLibraryMasterListLanguage != language || noResultFoundAckMessage == null || noResultFoundAckMessage.length() == 0) {
            loadDataFromXML(context, language);
        }
        return noResultFoundAckMessage;
    }

    /**
     * Search a country which matches @param code.
     * @param context
     * @param preferredCountries is list of preference countries.
     * @param code               phone code. i.e "91" or "1"
     * @return Country that has phone code as @param code.
     * or returns null if no country matches given code.
     * if same code (e.g. +1) available for more than one country ( US, canada) , this function will return preferred country.
     */
    public static Country getCountryForCode(Context context, Language language, List<Country> preferredCountries, String code) {

        /**
         * check in preferred countries
         */
        if (preferredCountries != null && !preferredCountries.isEmpty()) {
            for (Country country : preferredCountries) {
                if (country.getCountryCode().equals(code)) {
                    return country;
                }
            }
        }

        for (Country country : getLibraryMasterCountryList(context, language)) {
            if (country.getCountryCode().equals(code)) {
                return country;
            }
        }
        return null;
    }

    /**
     * Search a country which matches @param nameCode.
     *
     * @param context
     * @param customMasterCountriesList
     * @param nameCode                  country name code. i.e US or us or Au. See countries.xml for all code names.  @return Country that has phone code as @param code.
     */
    public static Country getCountryForNameCodeFromCustomMasterList(Context context, List<Country> customMasterCountriesList, Language language, String nameCode) {
        if (customMasterCountriesList == null || customMasterCountriesList.size() == 0) {
            return getCountryForNameCodeFromLibraryMasterList(context, language, nameCode);
        } else {
            for (Country country : customMasterCountriesList) {
                if (country.getRegionCode().equalsIgnoreCase(nameCode)) {
                    return country;
                }
            }
        }
        return null;
    }

    /**
     * Search a country which matches @param nameCode.
     *
     * @param context
     * @param nameCode country name code. i.e US or us or Au. See countries.xml for all code names.
     * @return Country that has phone code as @param code.
     * or returns null if no country matches given code.
     */
    public static Country getCountryForNameCodeFromLibraryMasterList(Context context, Language language, String nameCode) {
        List<Country> countries = getLibraryMasterCountryList(context, language);
        for (Country country : countries) {
            if (country.getRegionCode().equalsIgnoreCase(nameCode)) {
                return country;
            }
        }
        return null;
    }

    /**
     * Search a country which matches @param code.
     *
     * @param context
     * @param preferredCountries list of country with priority,
     * @param code               phone code. i.e 91 or 1
     * @return Country that has phone code as @param code.
     * or returns null if no country matches given code.
     */
    static Country getCountryForCode(Context context, Language language, List<Country> preferredCountries, int code) {
        return getCountryForCode(context, language, preferredCountries, code + "");
    }

    /**
     * Finds country code by matching substring from left to right from full number.
     * For example. if full number is +819017901357
     * function will ignore "+" and try to find match for first character "8"
     * if any country found for code "8", will return that country. If not, then it will
     * try to find country for "81". and so on till first 3 characters ( maximum number of characters in country code is 3).
     *
     * @param context
     * @param preferredCountries countries of preference
     * @param fullNumber         full number ( "+" (optional)+ country code + carrier number) i.e. +819017901357 / 819017901357 / 918866667722
     * @return Country JP +81(Japan) for +819017901357 or 819017901357
     * Country IN +91(India) for  918866667722
     * null for 2956635321 ( as neither of "2", "29" and "295" matches any country code)
     */
    static Country getCountryForNumber(Context context, Language language, List<Country> preferredCountries, String fullNumber) {
        int firstDigit;
        //String plainNumber = PhoneNumberUtil.getInstance().normalizeDigitsOnly(fullNumber);
        if (fullNumber.length() != 0) {
            if (fullNumber.charAt(0) == '+') {
                firstDigit = 1;
            } else {
                firstDigit = 0;
            }
            Country country = null;
            for (int i = firstDigit; i < firstDigit + 4; i++) {
                String code = fullNumber.substring(firstDigit, i);
                if (code.equals("1")) {
                    return getNANPACountryForAreaCode(context, language, preferredCountries, fullNumber);
                } else {
                    country = getCountryForCode(context, language, preferredCountries, code);
                    if (country != null) {
                        return country;
                    }
                }
            }
        }
        return null;
    }

    //    public static List<Country> getCustomMasterCountryList(Context mContext, CountryCodePicker codePicker) {
//        codePicker.refreshCustomMasterList();
//        if (codePicker.customMasterCountriesList != null && codePicker.customMasterCountriesList.size() > 0) {
//            return codePicker.getCustomMasterCountriesList();
//        } else {
//            return getLibraryMasterCountryList(mContext, codePicker.getLanguageToApply());
//        }
//    }

    public static List<Country> getLibraryMasterCountryList(Context context, Language language) {
        if (loadedLibraryMasterListLanguage == null || language != loadedLibraryMasterListLanguage || loadedLibraryMaterList == null || loadedLibraryMaterList.size() == 0) { //when it is required to load country in country list
            loadDataFromXML(context, language);
        }
        return loadedLibraryMaterList;
    }

    /**
     * This function will detect NANP country based on area code.
     * North American Numbering Plan Administration handles numbering with +1 country code.
     * Area codes are taken from https://www.areacodelocations.info/areacodelist.html
     *
     * @param context
     * @param language
     * @param preferredCountries
     * @param phoneNumber        @return
     */
    private static Country getNANPACountryForAreaCode(Context context, Language language, List<Country> preferredCountries, String phoneNumber) {
        String nameCode = "us";
        String areaCode = "";
        //trim out + from number
        phoneNumber = phoneNumber.replace("+", "");
        if (phoneNumber.length() >= 4 && phoneNumber.charAt(0) == '1') { //minimum 4 digits are required to detect and first digit must be 1 (
            areaCode = phoneNumber.substring(1, 4);
        }

        //when number is partial and area code can not be detected, in that case country will be detected normally
        if (areaCode.length() != 3) {
            return getCountryForCode(context, language, preferredCountries, "1");
        }

        //if valid area code is detected then detect country based on it.
        if (ANTIGUA_AND_BARBUDA_AREA_CODES.contains(areaCode)) nameCode = "ag";
        else if (ANGUILLA_AREA_CODES.contains(areaCode)) nameCode = "ai";
        else if (BARBADOS_AREA_CODES.contains(areaCode)) nameCode = "bb";
        else if (BERMUDA_AREA_CODES.contains(areaCode)) nameCode = "bm";
        else if (BAHAMAS_AREA_CODES.contains(areaCode)) nameCode = "bs";
        else if (CANADA_AREA_CODES.contains(areaCode)) nameCode = "ca";
        else if (DOMINICA_AREA_CODES.contains(areaCode)) nameCode = "dm";
        else if (DOMINICAN_REPUBLIC_AREA_CODES.contains(areaCode)) nameCode = "do";
        else if (GRENADA_AREA_CODES.contains(areaCode)) nameCode = "gd";
        else if (JAMAICA_AREA_CODES.contains(areaCode)) nameCode = "jm";
        else if (SAINT_KITTS_AND_NEVIS_AREA_CODES.contains(areaCode)) nameCode = "kn";
        else if (CAYMAN_ISLANDS_AREA_CODES.contains(areaCode)) nameCode = "ky";
        else if (SAINT_LUCIA_AREA_CODES.contains(areaCode)) nameCode = "lc";
        else if (MONTSERRAT_AREA_CODES.contains(areaCode)) nameCode = "ms";
        else if (PUERTO_RICO_AREA_CODES.contains(areaCode)) nameCode = "pr";
        else if (SINT_MAARTEN_AREA_CODES.contains(areaCode)) nameCode = "sx";
        else if (TURKS_AND_CAICOS_ISLANDS_AREA_CODES.contains(areaCode)) nameCode = "tc";
        else if (TRINIDAD_AND_TOBAGO_AREA_CODES.contains(areaCode)) nameCode = "tt";
        else if (SAINT_VINCENT_AND_THE_GRENADINES_AREA_CODES.contains(areaCode)) nameCode = "vc";
        else if (BRITISH_VIRGIN_ISLANDS_AREA_CODES.contains(areaCode)) nameCode = "vg";
        else if (US_VIRGIN_ISLANDS_AREA_CODES.contains(areaCode)) nameCode = "vi";
        else
            nameCode = "us"; // if no other country had the the area code, by default it will set US.
        return getCountryForNameCodeFromLibraryMasterList(context, language, nameCode);
    }
}
