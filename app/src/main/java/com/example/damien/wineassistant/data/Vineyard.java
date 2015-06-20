
package com.example.damien.wineassistant.data;

import com.google.gson.annotations.Expose;

public class Vineyard {

    @Expose
    private Long Id;
    @Expose
    private String Name;
    @Expose
    private String Url;
    @Expose
    private String ImageUrl;
    @Expose
    private com.example.damien.wineassistant.data.GeoLocation GeoLocation;

    /**
     * 
     * @return
     *     The Id
     */
    public Long getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 
     * @param Name
     *     The Name
     */
    public void setName(String Name) {
        this.Name = Name;
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

    /**
     * 
     * @return
     *     The ImageUrl
     */
    public String getImageUrl() {
        return ImageUrl;
    }

    /**
     * 
     * @param ImageUrl
     *     The ImageUrl
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * 
     * @return
     *     The GeoLocation
     */
    public com.example.damien.wineassistant.data.GeoLocation getGeoLocation() {
        return GeoLocation;
    }

    /**
     * 
     * @param GeoLocation
     *     The GeoLocation
     */
    public void setGeoLocation(com.example.damien.wineassistant.data.GeoLocation GeoLocation) {
        this.GeoLocation = GeoLocation;
    }

}
