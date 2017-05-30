package com.example.guest.weatherandroid.Model;


public class Weather {

    private String mCity;
    private double mKelvin;
    private String mIconID;
    private String mDesc;

    public Weather(String city, double kelvin, String iconID, String desc){
        this.mCity = city;
        this.mKelvin = kelvin;
        this.mIconID = iconID;
        this.mDesc = desc;
    }

    public String getCity() {
        return mCity;
    }

    public double getKelvin() {
        return mKelvin;
    }

    public String getIconID() {
        return mIconID;
    }

    public String getDesc() {
        return mDesc;
    }
}