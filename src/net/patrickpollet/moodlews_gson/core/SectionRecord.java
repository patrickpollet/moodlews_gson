/**
 * SectionRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for GSON library by pp@patrickpollet.net using GsonBeanWriter
 */

package net.patrickpollet.moodlews_gson.core;


import net.patrickpollet.gson.GsonObject;

public class SectionRecord  extends GsonObject {
    private int course;

    private java.lang.String error;

    private int id;

    private int section;

    private java.lang.String sequence;

    private java.lang.String summary;

    private int visible;


    /**
     * Gets the course value for this SectionRecord.
     * 
     * @return course
     */
    public int getCourse() {
        return course;
    }


    /**
     * Sets the course value for this SectionRecord.
     * 
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
    }


    /**
     * Gets the error value for this SectionRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this SectionRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the id value for this SectionRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this SectionRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the section value for this SectionRecord.
     * 
     * @return section
     */
    public int getSection() {
        return section;
    }


    /**
     * Sets the section value for this SectionRecord.
     * 
     * @param section
     */
    public void setSection(int section) {
        this.section = section;
    }


    /**
     * Gets the sequence value for this SectionRecord.
     * 
     * @return sequence
     */
    public java.lang.String getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this SectionRecord.
     * 
     * @param sequence
     */
    public void setSequence(java.lang.String sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the summary value for this SectionRecord.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this SectionRecord.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the visible value for this SectionRecord.
     * 
     * @return visible
     */
    public int getVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this SectionRecord.
     * 
     * @param visible
     */
    public void setVisible(int visible) {
        this.visible = visible;
    }

}
