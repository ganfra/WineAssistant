
package com.example.damien.wineassistant.data;

import com.google.gson.annotations.Expose;

public class WineResult {

    @Expose
    private com.example.damien.wineassistant.data.Status Status;
    @Expose
    private com.example.damien.wineassistant.data.Products Products;

    /**
     * 
     * @return
     *     The Status
     */
    public com.example.damien.wineassistant.data.Status getStatus() {
        return Status;
    }

    /**
     * 
     * @param Status
     *     The Status
     */
    public void setStatus(com.example.damien.wineassistant.data.Status Status) {
        this.Status = Status;
    }

    /**
     * 
     * @return
     *     The Products
     */
    public com.example.damien.wineassistant.data.Products getProducts() {
        return Products;
    }

    /**
     * 
     * @param Products
     *     The Products
     */
    public void setProducts(com.example.damien.wineassistant.data.Products Products) {
        this.Products = Products;
    }

}
