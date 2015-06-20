
package com.example.damien.wineassistant.data;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Status {

    @Expose
    private List<Object> Messages = new ArrayList<Object>();
    @Expose
    private Long ReturnCode;

    /**
     * 
     * @return
     *     The Messages
     */
    public List<Object> getMessages() {
        return Messages;
    }

    /**
     * 
     * @param Messages
     *     The Messages
     */
    public void setMessages(List<Object> Messages) {
        this.Messages = Messages;
    }

    /**
     * 
     * @return
     *     The ReturnCode
     */
    public Long getReturnCode() {
        return ReturnCode;
    }

    /**
     * 
     * @param ReturnCode
     *     The ReturnCode
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

}
