
package com.example.damien.wineassistant.data;

import com.google.gson.annotations.Expose;

public class Varietal {

    @Expose
    private Long Id;
    @Expose
    private String Name;
    @Expose
    private String Url;
    @Expose
    private com.example.damien.wineassistant.data.WineType WineType;

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
     *     The WineType
     */
    public com.example.damien.wineassistant.data.WineType getWineType() {
        return WineType;
    }

    /**
     * 
     * @param WineType
     *     The WineType
     */
    public void setWineType(com.example.damien.wineassistant.data.WineType WineType) {
        this.WineType = WineType;
    }

}
