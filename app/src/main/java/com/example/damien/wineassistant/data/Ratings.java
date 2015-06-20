
package com.example.damien.wineassistant.data;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;

public class Ratings {

    @Expose
    private Long HighestScore;
    @Expose
    private java.util.List<Object> List = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The HighestScore
     */
    public Long getHighestScore() {
        return HighestScore;
    }

    /**
     * 
     * @param HighestScore
     *     The HighestScore
     */
    public void setHighestScore(Long HighestScore) {
        this.HighestScore = HighestScore;
    }

    /**
     * 
     * @return
     *     The List
     */
    public java.util.List<Object> getList() {
        return List;
    }

    /**
     * 
     * @param List
     *     The List
     */
    public void setList(java.util.List<Object> List) {
        this.List = List;
    }

}
