/**
 * EnrolRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for GSON library by pp@patrickpollet.net using GsonBeanWriter
 */

package net.patrickpollet.moodlews_gson.core;


import net.patrickpollet.gson.GsonObject;

public class EnrolRecord  extends GsonObject {
    private java.lang.String course;

    private java.lang.String enrol;

    private java.lang.String error;

    private int timeaccess;

    private int timeend;

    private int timestart;

    private java.lang.String userid;


    /**
     * Gets the course value for this EnrolRecord.
     * 
     * @return course
     */
    public java.lang.String getCourse() {
        return course;
    }


    /**
     * Sets the course value for this EnrolRecord.
     * 
     * @param course
     */
    public void setCourse(java.lang.String course) {
        this.course = course;
    }


    /**
     * Gets the enrol value for this EnrolRecord.
     * 
     * @return enrol
     */
    public java.lang.String getEnrol() {
        return enrol;
    }


    /**
     * Sets the enrol value for this EnrolRecord.
     * 
     * @param enrol
     */
    public void setEnrol(java.lang.String enrol) {
        this.enrol = enrol;
    }


    /**
     * Gets the error value for this EnrolRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this EnrolRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the timeaccess value for this EnrolRecord.
     * 
     * @return timeaccess
     */
    public int getTimeaccess() {
        return timeaccess;
    }


    /**
     * Sets the timeaccess value for this EnrolRecord.
     * 
     * @param timeaccess
     */
    public void setTimeaccess(int timeaccess) {
        this.timeaccess = timeaccess;
    }


    /**
     * Gets the timeend value for this EnrolRecord.
     * 
     * @return timeend
     */
    public int getTimeend() {
        return timeend;
    }


    /**
     * Sets the timeend value for this EnrolRecord.
     * 
     * @param timeend
     */
    public void setTimeend(int timeend) {
        this.timeend = timeend;
    }


    /**
     * Gets the timestart value for this EnrolRecord.
     * 
     * @return timestart
     */
    public int getTimestart() {
        return timestart;
    }


    /**
     * Sets the timestart value for this EnrolRecord.
     * 
     * @param timestart
     */
    public void setTimestart(int timestart) {
        this.timestart = timestart;
    }


    /**
     * Gets the userid value for this EnrolRecord.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this EnrolRecord.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }

}
