
package com.example.damien.wineassistant.data;

import com.google.gson.annotations.Expose;

public class GeoLocation {

    @Expose
    private Long Latitude;
    @Expose
    private Long Longitude;
    @Expose
    private String Url;

    /**
     * 
     * @return
     *     The Latitude
     */
    public Long getLatitude() {
        return Latitude;
    }

    /**
     * 
     * @param Latitude
     *     The Latitude
     */
    public void setLatitude(Long Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * 
     * @return
     *     The Longitude
     */
    public Long getLongitude() {
        return Longitude;
    }

    /**
     * 
     * @param Longitude
     *     The Longitude
     */
    public void setLongitude(Long Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * 
     * @return
     *     The Url
     */
    public String getUrl() {
        return Url;
    }

    /**
     * 
     * @param Url
     *     The Url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

}
