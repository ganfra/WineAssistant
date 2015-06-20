
package com.example.damien.wineassistant.data;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;

public class Products {

    @Expose
    private java.util.List<com.example.damien.wineassistant.data.List> List = new ArrayList<com.example.damien.wineassistant.data.List>();
    @Expose
    private Long Offset;
    @Expose
    private Long Total;
    @Expose
    private String Url;

    /**
     * 
     * @return
     *     The List
     */
    public java.util.List<com.example.damien.wineassistant.data.List> getList() {
        return List;
    }

    /**
     * 
     * @param List
     *     The List
     */
    public void setList(java.util.List<com.example.damien.wineassistant.data.List> List) {
        this.List = List;
    }

    /**
     * 
     * @return
     *     The Offset
     */
    public Long getOffset() {
        return Offset;
    }

    /**
     * 
     * @param Offset
     *     The Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 
     * @return
     *     The Total
     */
    public Long getTotal() {
        return Total;
    }

    /**
     * 
     * @param Total
     *     The Total
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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
