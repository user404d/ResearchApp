package com.djsg38.locationprivacyapp.models;

import io.realm.RealmObject;


public class Location extends RealmObject {
    public double Long, Lat;

    public double getLong() {
        return Long;
    }

    public Location setLong(double aLong) {
        this.Long = aLong;
        return this;
    }

    public double getLat() {
        return Lat;
    }

    public Location setLat(double lat) {
        this.Lat = lat;
        return this;
    }

}

