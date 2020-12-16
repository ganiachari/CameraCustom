package com.cameracustom.models;

/**
 * Created by Home on 6/10/2017.
 */


public class ImageUploadInfo {
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double latitude;

    public ImageUploadInfo(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double longitude;

}
