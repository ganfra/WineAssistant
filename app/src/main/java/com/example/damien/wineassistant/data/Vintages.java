
package com.example.damien.wineassistant.data;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;

public class Vintages {

    @Expose
    private java.util.List<Object> List = new ArrayList<Object>();

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
