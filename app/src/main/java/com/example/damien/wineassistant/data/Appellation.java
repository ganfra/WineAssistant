
package com.example.damien.wineassistant.data;

import com.google.gson.annotations.Expose;

public class Appellation {

    @Expose
    private Long Id;
    @Expose
    private String Name;
    @Expose
    private String Url;
    @Expose
    private com.example.damien.wineassistant.data.Region Region;

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
     *     The Region
     */
    public com.example.damien.wineassistant.data.Region getRegion() {
        return Region;
    }

    /**
     * 
     * @param Region
     *     The Region
     */
    public void setRegion(com.example.damien.wineassistant.data.Region Region) {
        this.Region = Region;
    }

}
