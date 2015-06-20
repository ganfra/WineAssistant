
package com.example.damien.wineassistant.data;

import com.google.gson.annotations.Expose;

public class Community {

    @Expose
    private com.example.damien.wineassistant.data.Reviews Reviews;
    @Expose
    private String Url;

    /**
     * 
     * @return
     *     The Reviews
     */
    public com.example.damien.wineassistant.data.Reviews getReviews() {
        return Reviews;
    }

    /**
     * 
     * @param Reviews
     *     The Reviews
     */
    public void setReviews(com.example.damien.wineassistant.data.Reviews Reviews) {
        this.Reviews = Reviews;
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
