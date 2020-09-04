package com.kolyall.countryapi.utils

import androidx.annotation.DrawableRes
import com.kolyall.countryapi.R
import com.kolyall.countryapi.objects.Country
import java.util.ArrayList

/**
 * Created by Nick Unuchek on 11.09.2017.
 */
object CountryUtils {


    @JvmStatic
    val libraryMasterCountriesEnglish: List<Country>
        get() {
            val countries: MutableList<Country> = ArrayList()
            countries.add(Country("af", "93", "Afghanistan"))
            countries.add(Country("al", "355", "Albania"))
            countries.add(Country("dz", "213", "Algeria"))
            countries.add(Country("ad", "376", "Andorra"))
            countries.add(Country("ao", "244", "Angola"))
            countries.add(Country("ai", "1", "Anguilla"))
            countries.add(Country("aq", "672", "Antarctica"))
            countries.add(Country("ag", "1", "Antigua and Barbuda"))
            countries.add(Country("ar", "54", "Argentina"))
            countries.add(Country("am", "374", "Armenia"))
            countries.add(Country("aw", "297", "Aruba"))
            countries.add(Country("au", "61", "Australia"))
            countries.add(Country("at", "43", "Austria"))
            countries.add(Country("az", "994", "Azerbaijan"))
            countries.add(Country("bs", "1", "Bahamas"))
            countries.add(Country("bh", "973", "Bahrain"))
            countries.add(Country("bd", "880", "Bangladesh"))
            countries.add(Country("bb", "1", "Barbados"))
            countries.add(Country("by", "375", "Belarus"))
            countries.add(Country("be", "32", "Belgium"))
            countries.add(Country("bz", "501", "Belize"))
            countries.add(Country("bj", "229", "Benin"))
            countries.add(Country("bm", "1", "Bermuda"))
            countries.add(Country("bt", "975", "Bhutan"))
            countries.add(Country("bo", "591", "Bolivia, Plurinational State Of"))
            countries.add(Country("ba", "387", "Bosnia And Herzegovina"))
            countries.add(Country("bw", "267", "Botswana"))
            countries.add(Country("br", "55", "Brazil"))
            countries.add(Country("vg", "1", "British Virgin Islands"))
            countries.add(Country("bn", "673", "Brunei Darussalam"))
            countries.add(Country("bg", "359", "Bulgaria"))
            countries.add(Country("bf", "226", "Burkina Faso"))
            countries.add(Country("mm", "95", "Myanmar"))
            countries.add(Country("bi", "257", "Burundi"))
            countries.add(Country("kh", "855", "Cambodia"))
            countries.add(Country("cm", "237", "Cameroon"))
            countries.add(Country("ca", "1", "Canada"))
            countries.add(Country("cv", "238", "Cape Verde"))
            countries.add(Country("ky", "1", "Cayman Islands"))
            countries.add(Country("cf", "236", "Central African Republic"))
            countries.add(Country("td", "235", "Chad"))
            countries.add(Country("cl", "56", "Chile"))
            countries.add(Country("cn", "86", "China"))
            countries.add(Country("cx", "61", "Christmas Island"))
            countries.add(Country("cc", "61", "Cocos (keeling) Islands"))
            countries.add(Country("co", "57", "Colombia"))
            countries.add(Country("km", "269", "Comoros"))
            countries.add(Country("cg", "242", "Congo"))
            countries.add(Country("cd", "243", "Congo, The Democratic Republic Of The"))
            countries.add(Country("ck", "682", "Cook Islands"))
            countries.add(Country("cr", "506", "Costa Rica"))
            countries.add(Country("hr", "385", "Croatia"))
            countries.add(Country("cu", "53", "Cuba"))
            countries.add(Country("cy", "357", "Cyprus"))
            countries.add(Country("cz", "420", "Czech Republic"))
            countries.add(Country("dk", "45", "Denmark"))
            countries.add(Country("dj", "253", "Djibouti"))
            countries.add(Country("dm", "1", "Dominica"))
            countries.add(Country("do", "1", "Dominican Republic"))
            countries.add(Country("tl", "670", "Timor-leste"))
            countries.add(Country("ec", "593", "Ecuador"))
            countries.add(Country("eg", "20", "Egypt"))
            countries.add(Country("sv", "503", "El Salvador"))
            countries.add(Country("gq", "240", "Equatorial Guinea"))
            countries.add(Country("er", "291", "Eritrea"))
            countries.add(Country("ee", "372", "Estonia"))
            countries.add(Country("et", "251", "Ethiopia"))
            countries.add(Country("fk", "500", "Falkland Islands (malvinas)"))
            countries.add(Country("fo", "298", "Faroe Islands"))
            countries.add(Country("fj", "679", "Fiji"))
            countries.add(Country("fi", "358", "Finland"))
            countries.add(Country("fr", "33", "France"))
            countries.add(Country("gf", "594", "French Guyana"))
            countries.add(Country("pf", "689", "French Polynesia"))
            countries.add(Country("ga", "241", "Gabon"))
            countries.add(Country("gm", "220", "Gambia"))
            countries.add(Country("ge", "995", "Georgia"))
            countries.add(Country("de", "49", "Germany"))
            countries.add(Country("gh", "233", "Ghana"))
            countries.add(Country("gi", "350", "Gibraltar"))
            countries.add(Country("gr", "30", "Greece"))
            countries.add(Country("gl", "299", "Greenland"))
            countries.add(Country("gd", "1", "Grenada"))
            countries.add(Country("gt", "502", "Guatemala"))
            countries.add(Country("gn", "224", "Guinea"))
            countries.add(Country("gw", "245", "Guinea-bissau"))
            countries.add(Country("gy", "592", "Guyana"))
            countries.add(Country("ht", "509", "Haiti"))
            countries.add(Country("hn", "504", "Honduras"))
            countries.add(Country("hk", "852", "Hong Kong"))
            countries.add(Country("hu", "36", "Hungary"))
            countries.add(Country("in", "91", "India"))
            countries.add(Country("id", "62", "Indonesia"))
            countries.add(Country("ir", "98", "Iran, Islamic Republic Of"))
            countries.add(Country("iq", "964", "Iraq"))
            countries.add(Country("ie", "353", "Ireland"))
            countries.add(Country("im", "44", "Isle Of Man"))
            countries.add(Country("il", "972", "Israel"))
            countries.add(Country("ps", "970", "Palestine"))
            countries.add(Country("it", "39", "Italy"))
            countries.add(Country("ci", "225", "Côte D\'ivoire"))
            countries.add(Country("jm", "1", "Jamaica"))
            countries.add(Country("jp", "81", "Japan"))
            countries.add(Country("jo", "962", "Jordan"))
            countries.add(Country("kz", "7", "Kazakhstan"))
            countries.add(Country("ke", "254", "Kenya"))
            countries.add(Country("ki", "686", "Kiribati"))
            countries.add(Country("kw", "965", "Kuwait"))
            countries.add(Country("kg", "996", "Kyrgyzstan"))
            countries.add(Country("la", "856", "Lao People\'s Democratic Republic"))
            countries.add(Country("lv", "371", "Latvia"))
            countries.add(Country("lb", "961", "Lebanon"))
            countries.add(Country("ls", "266", "Lesotho"))
            countries.add(Country("lr", "231", "Liberia"))
            countries.add(Country("ly", "218", "Libya"))
            countries.add(Country("li", "423", "Liechtenstein"))
            countries.add(Country("lt", "370", "Lithuania"))
            countries.add(Country("lu", "352", "Luxembourg"))
            countries.add(Country("mo", "853", "Macao"))
            countries.add(Country("mk", "389", "Macedonia, The Former Yugoslav Republic Of"))
            countries.add(Country("mg", "261", "Madagascar"))
            countries.add(Country("mw", "265", "Malawi"))
            countries.add(Country("my", "60", "Malaysia"))
            countries.add(Country("mv", "960", "Maldives"))
            countries.add(Country("ml", "223", "Mali"))
            countries.add(Country("mt", "356", "Malta"))
            countries.add(Country("mh", "692", "Marshall Islands"))
            countries.add(Country("mq", "596", "Martinique"))
            countries.add(Country("mr", "222", "Mauritania"))
            countries.add(Country("mu", "230", "Mauritius"))
            countries.add(Country("yt", "262", "Mayotte"))
            countries.add(Country("mx", "52", "Mexico"))
            countries.add(Country("fm", "691", "Micronesia, Federated States Of"))
            countries.add(Country("md", "373", "Moldova, Republic Of"))
            countries.add(Country("mc", "377", "Monaco"))
            countries.add(Country("mn", "976", "Mongolia"))
            countries.add(Country("ms", "1", "Montserrat"))
            countries.add(Country("me", "382", "Montenegro"))
            countries.add(Country("ma", "212", "Morocco"))
            countries.add(Country("mz", "258", "Mozambique"))
            countries.add(Country("na", "264", "Namibia"))
            countries.add(Country("nr", "674", "Nauru"))
            countries.add(Country("np", "977", "Nepal"))
            countries.add(Country("nl", "31", "Netherlands"))
            countries.add(Country("nc", "687", "New Caledonia"))
            countries.add(Country("nz", "64", "New Zealand"))
            countries.add(Country("ni", "505", "Nicaragua"))
            countries.add(Country("ne", "227", "Niger"))
            countries.add(Country("ng", "234", "Nigeria"))
            countries.add(Country("nu", "683", "Niue"))
            countries.add(Country("kp", "850", "North Korea"))
            countries.add(Country("no", "47", "Norway"))
            countries.add(Country("om", "968", "Oman"))
            countries.add(Country("pk", "92", "Pakistan"))
            countries.add(Country("pw", "680", "Palau"))
            countries.add(Country("pa", "507", "Panama"))
            countries.add(Country("pg", "675", "Papua New Guinea"))
            countries.add(Country("py", "595", "Paraguay"))
            countries.add(Country("pe", "51", "Peru"))
            countries.add(Country("ph", "63", "Philippines"))
            countries.add(Country("pn", "870", "Pitcairn"))
            countries.add(Country("pl", "48", "Poland"))
            countries.add(Country("pt", "351", "Portugal"))
            countries.add(Country("pr", "1", "Puerto Rico"))
            countries.add(Country("qa", "974", "Qatar"))
            countries.add(Country("re", "262", "Réunion"))
            countries.add(Country("ro", "40", "Romania"))
            countries.add(Country("ru", "7", "Russian Federation"))
            countries.add(Country("rw", "250", "Rwanda"))
            countries.add(Country("bl", "590", "Saint Barthélemy"))
            countries.add(Country("kn", "1", "Saint Kitts and Nevis"))
            countries.add(Country("lc", "1", "Saint Lucia"))
            countries.add(Country("vc", "1", "Saint Vincent & The Grenadines"))
            countries.add(Country("ws", "685", "Samoa"))
            countries.add(Country("sm", "378", "San Marino"))
            countries.add(Country("st", "239", "Sao Tome And Principe"))
            countries.add(Country("sa", "966", "Saudi Arabia"))
            countries.add(Country("sn", "221", "Senegal"))
            countries.add(Country("rs", "381", "Serbia"))
            countries.add(Country("sc", "248", "Seychelles"))
            countries.add(Country("sl", "232", "Sierra Leone"))
            countries.add(Country("sg", "65", "Singapore"))
            countries.add(Country("sx", "1", "Sint Maarten"))
            countries.add(Country("sk", "421", "Slovakia"))
            countries.add(Country("si", "386", "Slovenia"))
            countries.add(Country("sb", "677", "Solomon Islands"))
            countries.add(Country("so", "252", "Somalia"))
            countries.add(Country("za", "27", "South Africa"))
            countries.add(Country("kr", "82", "South Korea"))
            countries.add(Country("es", "34", "Spain"))
            countries.add(Country("lk", "94", "Sri Lanka"))
            countries.add(Country("sh", "290", "Saint Helena, Ascension And Tristan Da Cunha"))
            countries.add(Country("pm", "508", "Saint Pierre And Miquelon"))
            countries.add(Country("sd", "249", "Sudan"))
            countries.add(Country("sr", "597", "Suriname"))
            countries.add(Country("sz", "268", "Swaziland"))
            countries.add(Country("se", "46", "Sweden"))
            countries.add(Country("ch", "41", "Switzerland"))
            countries.add(Country("sy", "963", "Syrian Arab Republic"))
            countries.add(Country("tw", "886", "Taiwan, Province Of China"))
            countries.add(Country("tj", "992", "Tajikistan"))
            countries.add(Country("tz", "255", "Tanzania, United Republic Of"))
            countries.add(Country("th", "66", "Thailand"))
            countries.add(Country("tg", "228", "Togo"))
            countries.add(Country("tk", "690", "Tokelau"))
            countries.add(Country("to", "676", "Tonga"))
            countries.add(Country("tt", "1", "Trinidad & Tobago"))
            countries.add(Country("tn", "216", "Tunisia"))
            countries.add(Country("tr", "90", "Turkey"))
            countries.add(Country("tm", "993", "Turkmenistan"))
            countries.add(Country("tc", "1", "Turks and Caicos Islands"))
            countries.add(Country("tv", "688", "Tuvalu"))
            countries.add(Country("ae", "971", "United Arab Emirates"))
            countries.add(Country("ug", "256", "Uganda"))
            countries.add(Country("gb", "44", "United Kingdom"))
            countries.add(Country("ua", "380", "Ukraine"))
            countries.add(Country("uy", "598", "Uruguay"))
            countries.add(Country("us", "1", "United States"))
            countries.add(Country("vi", "1", "US Virgin Islands"))
            countries.add(Country("uz", "998", "Uzbekistan"))
            countries.add(Country("vu", "678", "Vanuatu"))
            countries.add(Country("va", "39", "Holy See (vatican City State)"))
            countries.add(Country("ve", "58", "Venezuela, Bolivarian Republic Of"))
            countries.add(Country("vn", "84", "Viet Nam"))
            countries.add(Country("wf", "681", "Wallis And Futuna"))
            countries.add(Country("ye", "967", "Yemen"))
            countries.add(Country("zm", "260", "Zambia"))
            countries.add(Country("zw", "263", "Zimbabwe"))
            return countries
        }

    fun getFilteredCountries(query: String, masterList: List<Country>): List<Country> {
        val list  = mutableListOf<Country>()
        //        preferredCountriesCount = 0;
//            for (Country country : mMasterList) {
//                if (country.isEligibleForQuery(query)) {
//                    list.add(country);
//                    preferredCountriesCount++;
//                }
//            }

//            if (list.size() > 0) { //means at least one preferred country is added.
//                Country divider = null;
//                list.add(divider);
//                preferredCountriesCount++;
//            }
        for (country in masterList) {
            if (country.isEligibleForQuery(query) && !list.contains(country)) {
                list.add(country)
            }
        }
        return list
    }
}

val Country.flagDrawableResId: Int
    @DrawableRes
    get() {
        return when (regionCode.toLowerCase()) {
            "ad" -> R.drawable.flag_andorra
            "ae" -> R.drawable.flag_uae
            "af" -> R.drawable.flag_afghanistan
            "ag" -> R.drawable.flag_antigua_and_barbuda
            "ai" -> R.drawable.flag_anguilla
            "al" -> R.drawable.flag_albania
            "am" -> R.drawable.flag_armenia
            "ao" -> R.drawable.flag_angola
            "aq" -> R.drawable.flag_antarctica
            "ar" -> R.drawable.flag_argentina
            "at" -> R.drawable.flag_austria
            "au" -> R.drawable.flag_australia
            "aw" -> R.drawable.flag_aruba
            "az" -> R.drawable.flag_azerbaijan
            "ba" -> R.drawable.flag_bosnia
            "bb" -> R.drawable.flag_barbados
            "bd" -> R.drawable.flag_bangladesh
            "be" -> R.drawable.flag_belgium
            "bf" -> R.drawable.flag_burkina_faso
            "bg" -> R.drawable.flag_bulgaria
            "bh" -> R.drawable.flag_bahrain
            "bi" -> R.drawable.flag_burundi
            "bj" -> R.drawable.flag_benin
            "bl" -> R.drawable.flag_saint_barthelemy // custom
            "bm" -> R.drawable.flag_bermuda
            "bn" -> R.drawable.flag_brunei
            "bo" -> R.drawable.flag_bolivia
            "br" -> R.drawable.flag_brazil
            "bs" -> R.drawable.flag_bahamas
            "bt" -> R.drawable.flag_bhutan
            "bw" -> R.drawable.flag_botswana
            "by" -> R.drawable.flag_belarus
            "bz" -> R.drawable.flag_belize
            "ca" -> R.drawable.flag_canada
            "cc" -> R.drawable.flag_cocos // custom
            "cd" -> R.drawable.flag_democratic_republic_of_the_congo
            "cf" -> R.drawable.flag_central_african_republic
            "cg" -> R.drawable.flag_republic_of_the_congo
            "ch" -> R.drawable.flag_switzerland
            "ci" -> R.drawable.flag_cote_divoire
            "ck" -> R.drawable.flag_cook_islands
            "cl" -> R.drawable.flag_chile
            "cm" -> R.drawable.flag_cameroon
            "cn" -> R.drawable.flag_china
            "co" -> R.drawable.flag_colombia
            "cr" -> R.drawable.flag_costa_rica
            "cu" -> R.drawable.flag_cuba
            "cv" -> R.drawable.flag_cape_verde
            "cx" -> R.drawable.flag_christmas_island
            "cy" -> R.drawable.flag_cyprus
            "cz" -> R.drawable.flag_czech_republic
            "de" -> R.drawable.flag_germany
            "dj" -> R.drawable.flag_djibouti
            "dk" -> R.drawable.flag_denmark
            "dm" -> R.drawable.flag_dominica
            "do" -> R.drawable.flag_dominican_republic
            "dz" -> R.drawable.flag_algeria
            "ec" -> R.drawable.flag_ecuador
            "ee" -> R.drawable.flag_estonia
            "eg" -> R.drawable.flag_egypt
            "er" -> R.drawable.flag_eritrea
            "es" -> R.drawable.flag_spain
            "et" -> R.drawable.flag_ethiopia
            "fi" -> R.drawable.flag_finland
            "fj" -> R.drawable.flag_fiji
            "fk" -> R.drawable.flag_falkland_islands
            "fm" -> R.drawable.flag_micronesia
            "fo" -> R.drawable.flag_faroe_islands
            "fr" -> R.drawable.flag_france
            "ga" -> R.drawable.flag_gabon
            "gb" -> R.drawable.flag_united_kingdom
            "gd" -> R.drawable.flag_grenada
            "ge" -> R.drawable.flag_georgia
            "gf" -> R.drawable.flag_guyane
            "gh" -> R.drawable.flag_ghana
            "gi" -> R.drawable.flag_gibraltar
            "gl" -> R.drawable.flag_greenland
            "gm" -> R.drawable.flag_gambia
            "gn" -> R.drawable.flag_guinea
            "gq" -> R.drawable.flag_equatorial_guinea
            "gr" -> R.drawable.flag_greece
            "gt" -> R.drawable.flag_guatemala
            "gw" -> R.drawable.flag_guinea_bissau
            "gy" -> R.drawable.flag_guyana
            "hk" -> R.drawable.flag_hong_kong
            "hn" -> R.drawable.flag_honduras
            "hr" -> R.drawable.flag_croatia
            "ht" -> R.drawable.flag_haiti
            "hu" -> R.drawable.flag_hungary
            "id" -> R.drawable.flag_indonesia
            "ie" -> R.drawable.flag_ireland
            "il" -> R.drawable.flag_israel
            "im" -> R.drawable.flag_isleof_man // custom
            "in" -> R.drawable.flag_india
            "iq" -> R.drawable.flag_iraq_new
            "ir" -> R.drawable.flag_iran
            "it" -> R.drawable.flag_italy
            "jm" -> R.drawable.flag_jamaica
            "jo" -> R.drawable.flag_jordan
            "jp" -> R.drawable.flag_japan
            "ke" -> R.drawable.flag_kenya
            "kg" -> R.drawable.flag_kyrgyzstan
            "kh" -> R.drawable.flag_cambodia
            "ki" -> R.drawable.flag_kiribati
            "km" -> R.drawable.flag_comoros
            "kn" -> R.drawable.flag_saint_kitts_and_nevis
            "kp" -> R.drawable.flag_north_korea
            "kr" -> R.drawable.flag_south_korea
            "kw" -> R.drawable.flag_kuwait
            "ky" -> R.drawable.flag_cayman_islands
            "kz" -> R.drawable.flag_kazakhstan
            "la" -> R.drawable.flag_laos
            "lb" -> R.drawable.flag_lebanon
            "lc" -> R.drawable.flag_saint_lucia
            "li" -> R.drawable.flag_liechtenstein
            "lk" -> R.drawable.flag_sri_lanka
            "lr" -> R.drawable.flag_liberia
            "ls" -> R.drawable.flag_lesotho
            "lt" -> R.drawable.flag_lithuania
            "lu" -> R.drawable.flag_luxembourg
            "lv" -> R.drawable.flag_latvia
            "ly" -> R.drawable.flag_libya
            "ma" -> R.drawable.flag_morocco
            "mc" -> R.drawable.flag_monaco
            "md" -> R.drawable.flag_moldova
            "me" -> R.drawable.flag_of_montenegro // custom
            "mg" -> R.drawable.flag_madagascar
            "mh" -> R.drawable.flag_marshall_islands
            "mk" -> R.drawable.flag_macedonia
            "ml" -> R.drawable.flag_mali
            "mm" -> R.drawable.flag_myanmar
            "mn" -> R.drawable.flag_mongolia
            "mo" -> R.drawable.flag_macao
            "mq" -> R.drawable.flag_martinique
            "mr" -> R.drawable.flag_mauritania
            "ms" -> R.drawable.flag_montserrat
            "mt" -> R.drawable.flag_malta
            "mu" -> R.drawable.flag_mauritius
            "mv" -> R.drawable.flag_maldives
            "mw" -> R.drawable.flag_malawi
            "mx" -> R.drawable.flag_mexico
            "my" -> R.drawable.flag_malaysia
            "mz" -> R.drawable.flag_mozambique
            "na" -> R.drawable.flag_namibia
            "nc" -> R.drawable.flag_new_caledonia // custom
            "ne" -> R.drawable.flag_niger
            "ng" -> R.drawable.flag_nigeria
            "ni" -> R.drawable.flag_nicaragua
            "nl" -> R.drawable.flag_netherlands
            "no" -> R.drawable.flag_norway
            "np" -> R.drawable.flag_nepal
            "nr" -> R.drawable.flag_nauru
            "nu" -> R.drawable.flag_niue
            "nz" -> R.drawable.flag_new_zealand
            "om" -> R.drawable.flag_oman
            "pa" -> R.drawable.flag_panama
            "pe" -> R.drawable.flag_peru
            "pf" -> R.drawable.flag_french_polynesia
            "pg" -> R.drawable.flag_papua_new_guinea
            "ph" -> R.drawable.flag_philippines
            "pk" -> R.drawable.flag_pakistan
            "pl" -> R.drawable.flag_poland
            "pm" -> R.drawable.flag_saint_pierre
            "pn" -> R.drawable.flag_pitcairn_islands
            "pr" -> R.drawable.flag_puerto_rico
            "ps" -> R.drawable.flag_palestine
            "pt" -> R.drawable.flag_portugal
            "pw" -> R.drawable.flag_palau
            "py" -> R.drawable.flag_paraguay
            "qa" -> R.drawable.flag_qatar
            "re" -> R.drawable.flag_martinique // no exact flag found
            "ro" -> R.drawable.flag_romania
            "rs" -> R.drawable.flag_serbia // custom
            "ru" -> R.drawable.flag_russian_federation
            "rw" -> R.drawable.flag_rwanda
            "sa" -> R.drawable.flag_saudi_arabia
            "sb" -> R.drawable.flag_soloman_islands
            "sc" -> R.drawable.flag_seychelles
            "sd" -> R.drawable.flag_sudan
            "se" -> R.drawable.flag_sweden
            "sg" -> R.drawable.flag_singapore
            "sh" -> R.drawable.flag_saint_helena // custom
            "si" -> R.drawable.flag_slovenia
            "sk" -> R.drawable.flag_slovakia
            "sl" -> R.drawable.flag_sierra_leone
            "sm" -> R.drawable.flag_san_marino
            "sn" -> R.drawable.flag_senegal
            "so" -> R.drawable.flag_somalia
            "sr" -> R.drawable.flag_suriname
            "st" -> R.drawable.flag_sao_tome_and_principe
            "sv" -> R.drawable.flag_el_salvador
            "sx" -> R.drawable.flag_sint_maarten
            "sy" -> R.drawable.flag_syria
            "sz" -> R.drawable.flag_swaziland
            "tc" -> R.drawable.flag_turks_and_caicos_islands
            "td" -> R.drawable.flag_chad
            "tg" -> R.drawable.flag_togo
            "th" -> R.drawable.flag_thailand
            "tj" -> R.drawable.flag_tajikistan
            "tk" -> R.drawable.flag_tokelau // custom
            "tl" -> R.drawable.flag_timor_leste
            "tm" -> R.drawable.flag_turkmenistan
            "tn" -> R.drawable.flag_tunisia
            "to" -> R.drawable.flag_tonga
            "tr" -> R.drawable.flag_turkey
            "tt" -> R.drawable.flag_trinidad_and_tobago
            "tv" -> R.drawable.flag_tuvalu
            "tw" -> R.drawable.flag_taiwan
            "tz" -> R.drawable.flag_tanzania
            "ua" -> R.drawable.flag_ukraine
            "ug" -> R.drawable.flag_uganda
            "us" -> R.drawable.flag_united_states_of_america
            "uy" -> R.drawable.flag_uruguay
            "uz" -> R.drawable.flag_uzbekistan
            "va" -> R.drawable.flag_vatican_city
            "vc" -> R.drawable.flag_saint_vicent_and_the_grenadines
            "ve" -> R.drawable.flag_venezuela
            "vg" -> R.drawable.flag_british_virgin_islands
            "vi" -> R.drawable.flag_us_virgin_islands
            "vn" -> R.drawable.flag_vietnam
            "vu" -> R.drawable.flag_vanuatu
            "wf" -> R.drawable.flag_wallis_and_futuna
            "ws" -> R.drawable.flag_samoa
            "ye" -> R.drawable.flag_yemen
            "yt" -> R.drawable.flag_martinique // no exact flag found
            "za" -> R.drawable.flag_south_africa
            "zm" -> R.drawable.flag_zambia
            "zw" -> R.drawable.flag_zimbabwe
            else -> R.drawable.flag_transparent
        }
    }