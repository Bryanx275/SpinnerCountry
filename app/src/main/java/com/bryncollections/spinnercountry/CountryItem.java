package com.bryncollections.spinnercountry;

public class CountryItem {
    private String mCountryName;
    private int mFlagImage;

    public CountryItem(String CountryName, int FlagImage){
        mCountryName = CountryName;
        mFlagImage = FlagImage;
    }

    public String getCountryName(){
        return mCountryName;
    }

    public int getFlagImage(){
        return mFlagImage;
    }
}
