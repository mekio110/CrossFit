package com.crossFit.library.pojos;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

public class University {

    @SerializedName("state-province")
    private String stateProvince;

    @SerializedName("web_pages")
    private String[] webPages;

    @SerializedName("alpha_two_code")
    private String countryCode;

    private String country;

    private String name;

    private String[] domains;

    public University(){}

    public University(String stateProvince, String[] webPages, String countryCode, String country, String name, String[] domains){
        this.stateProvince = stateProvince;
        this.webPages = webPages;
        this.countryCode = countryCode;
        this.country = country;
        this.name = name;
        this.domains = domains;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String[] getWebPages() {
        return webPages;
    }

    public void setWebPages(String[] webPages) {
        this.webPages = webPages;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDomains() {
        return domains;
    }

    public void setDomains(String[] domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "University{" +
                "stateProvince='" + stateProvince + '\'' +
                ", webPages=" + Arrays.toString(webPages) +
                ", countryCode='" + countryCode + '\'' +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", domains=" + Arrays.toString(domains) +
                '}';
    }
}