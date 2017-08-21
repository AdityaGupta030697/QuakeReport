package com.example.android.quakereport;

/**
 * Created by aditya on 16-05-2017.
 */

public class Earthquake {
    // @param magnitude earth quake magnitude
    private double magnitude;

    // @param city location of earthquake
    private String location;

    // @param date , the  date of the earthquake
    private String date;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds,String url) {
        this.magnitude = magnitude;
        this.location = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;

    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
