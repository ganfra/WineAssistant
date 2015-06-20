
package com.example.damien.wineassistant.data;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;

public class List {

    @Expose
    private Long Id;
    @Expose
    private String Name;
    @Expose
    private String Url;
    @Expose
    private com.example.damien.wineassistant.data.Appellation Appellation;
    @Expose
    private java.util.List<Label> Labels = new ArrayList<Label>();
    @Expose
    private String Type;
    @Expose
    private com.example.damien.wineassistant.data.Varietal Varietal;
    @Expose
    private com.example.damien.wineassistant.data.Vineyard Vineyard;
    @Expose
    private String Vintage;
    @Expose
    private com.example.damien.wineassistant.data.Community Community;
    @Expose
    private String Description;
    @Expose
    private GeoLocation_ GeoLocation;
    @Expose
    private Float PriceMax;
    @Expose
    private Float PriceMin;
    @Expose
    private Float PriceRetail;
    @Expose
    private java.util.List<ProductAttribute> ProductAttributes = new ArrayList<ProductAttribute>();
    @Expose
    private com.example.damien.wineassistant.data.Ratings Ratings;
    @Expose
    private Object Retail;
    @Expose
    private com.example.damien.wineassistant.data.Vintages Vintages;

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
     *     The Appellation
     */
    public com.example.damien.wineassistant.data.Appellation getAppellation() {
        return Appellation;
    }

    /**
     * 
     * @param Appellation
     *     The Appellation
     */
    public void setAppellation(com.example.damien.wineassistant.data.Appellation Appellation) {
        this.Appellation = Appellation;
    }

    /**
     * 
     * @return
     *     The Labels
     */
    public java.util.List<Label> getLabels() {
        return Labels;
    }

    /**
     * 
     * @param Labels
     *     The Labels
     */
    public void setLabels(java.util.List<Label> Labels) {
        this.Labels = Labels;
    }

    /**
     * 
     * @return
     *     The Type
     */
    public String getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 
     * @return
     *     The Varietal
     */
    public com.example.damien.wineassistant.data.Varietal getVarietal() {
        return Varietal;
    }

    /**
     * 
     * @param Varietal
     *     The Varietal
     */
    public void setVarietal(com.example.damien.wineassistant.data.Varietal Varietal) {
        this.Varietal = Varietal;
    }

    /**
     * 
     * @return
     *     The Vineyard
     */
    public com.example.damien.wineassistant.data.Vineyard getVineyard() {
        return Vineyard;
    }

    /**
     * 
     * @param Vineyard
     *     The Vineyard
     */
    public void setVineyard(com.example.damien.wineassistant.data.Vineyard Vineyard) {
        this.Vineyard = Vineyard;
    }

    /**
     * 
     * @return
     *     The Vintage
     */
    public String getVintage() {
        return Vintage;
    }

    /**
     * 
     * @param Vintage
     *     The Vintage
     */
    public void setVintage(String Vintage) {
        this.Vintage = Vintage;
    }

    /**
     * 
     * @return
     *     The Community
     */
    public com.example.damien.wineassistant.data.Community getCommunity() {
        return Community;
    }

    /**
     * 
     * @param Community
     *     The Community
     */
    public void setCommunity(com.example.damien.wineassistant.data.Community Community) {
        this.Community = Community;
    }

    /**
     * 
     * @return
     *     The Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * 
     * @param Description
     *     The Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 
     * @return
     *     The GeoLocation
     */
    public GeoLocation_ getGeoLocation() {
        return GeoLocation;
    }

    /**
     * 
     * @param GeoLocation
     *     The GeoLocation
     */
    public void setGeoLocation(GeoLocation_ GeoLocation) {
        this.GeoLocation = GeoLocation;
    }

    /**
     * 
     * @return
     *     The PriceMax
     */
    public Float getPriceMax() {
        return PriceMax;
    }

    /**
     * 
     * @param PriceMax
     *     The PriceMax
     */
    public void setPriceMax(Float PriceMax) {
        this.PriceMax = PriceMax;
    }

    /**
     * 
     * @return
     *     The PriceMin
     */
    public Float getPriceMin() {
        return PriceMin;
    }

    /**
     * 
     * @param PriceMin
     *     The PriceMin
     */
    public void setPriceMin(Float PriceMin) {
        this.PriceMin = PriceMin;
    }

    /**
     * 
     * @return
     *     The PriceRetail
     */
    public Float getPriceRetail() {
        return PriceRetail;
    }

    /**
     * 
     * @param PriceRetail
     *     The PriceRetail
     */
    public void setPriceRetail(Float PriceRetail) {
        this.PriceRetail = PriceRetail;
    }

    /**
     * 
     * @return
     *     The ProductAttributes
     */
    public java.util.List<ProductAttribute> getProductAttributes() {
        return ProductAttributes;
    }

    /**
     * 
     * @param ProductAttributes
     *     The ProductAttributes
     */
    public void setProductAttributes(java.util.List<ProductAttribute> ProductAttributes) {
        this.ProductAttributes = ProductAttributes;
    }

    /**
     * 
     * @return
     *     The Ratings
     */
    public com.example.damien.wineassistant.data.Ratings getRatings() {
        return Ratings;
    }

    /**
     * 
     * @param Ratings
     *     The Ratings
     */
    public void setRatings(com.example.damien.wineassistant.data.Ratings Ratings) {
        this.Ratings = Ratings;
    }

    /**
     * 
     * @return
     *     The Retail
     */
    public Object getRetail() {
        return Retail;
    }

    /**
     * 
     * @param Retail
     *     The Retail
     */
    public void setRetail(Object Retail) {
        this.Retail = Retail;
    }

    /**
     * 
     * @return
     *     The Vintages
     */
    public com.example.damien.wineassistant.data.Vintages getVintages() {
        return Vintages;
    }

    /**
     * 
     * @param Vintages
     *     The Vintages
     */
    public void setVintages(com.example.damien.wineassistant.data.Vintages Vintages) {
        this.Vintages = Vintages;
    }

}
