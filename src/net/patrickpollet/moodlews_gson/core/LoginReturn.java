/**
 * LoginReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for GSON library by pp@patrickpollet.net using GsonBeanWriter
 */

package net.patrickpollet.moodlews_gson.core;


import net.patrickpollet.gson.GsonObject;

public class LoginReturn  extends GsonObject {
    private int client;

    private java.lang.String sessionkey;


    /**
     * Gets the client value for this LoginReturn.
     * 
     * @return client
     */
    public int getClient() {
        return client;
    }


    /**
     * Sets the client value for this LoginReturn.
     * 
     * @param client
     */
    public void setClient(int client) {
        this.client = client;
    }


    /**
     * Gets the sessionkey value for this LoginReturn.
     * 
     * @return sessionkey
     */
    public java.lang.String getSessionkey() {
        return sessionkey;
    }


    /**
     * Sets the sessionkey value for this LoginReturn.
     * 
     * @param sessionkey
     */
    public void setSessionkey(java.lang.String sessionkey) {
        this.sessionkey = sessionkey;
    }

}
