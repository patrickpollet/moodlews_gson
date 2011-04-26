/**
 * ForumDiscussionDatum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for GSON library by pp@patrickpollet.net using GsonBeanWriter
 */

package net.patrickpollet.moodlews_gson.core;


import net.patrickpollet.gson.GsonObject;

public class ForumDiscussionDatum  extends GsonObject {
    private java.lang.String message;

    private java.lang.String subject;


    /**
     * Gets the message value for this ForumDiscussionDatum.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ForumDiscussionDatum.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the subject value for this ForumDiscussionDatum.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ForumDiscussionDatum.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }

}
