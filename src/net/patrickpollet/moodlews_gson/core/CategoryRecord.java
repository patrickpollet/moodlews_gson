/**
 * CategoryRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for GSON library by pp@patrickpollet.net using GsonBeanWriter
 */

package net.patrickpollet.moodlews_gson.core;


import net.patrickpollet.gson.GsonObject;

public class CategoryRecord  extends GsonObject {
    private int coursecount;

    private int depth;

    private java.lang.String description;

    private java.lang.String error;

    private int id;

    private java.lang.String name;

    private int parent;

    private java.lang.String path;

    private int sortorder;

    private int timemodified;

    private int visible;


    /**
     * Gets the coursecount value for this CategoryRecord.
     * 
     * @return coursecount
     */
    public int getCoursecount() {
        return coursecount;
    }


    /**
     * Sets the coursecount value for this CategoryRecord.
     * 
     * @param coursecount
     */
    public void setCoursecount(int coursecount) {
        this.coursecount = coursecount;
    }


    /**
     * Gets the depth value for this CategoryRecord.
     * 
     * @return depth
     */
    public int getDepth() {
        return depth;
    }


    /**
     * Sets the depth value for this CategoryRecord.
     * 
     * @param depth
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }


    /**
     * Gets the description value for this CategoryRecord.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CategoryRecord.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the error value for this CategoryRecord.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this CategoryRecord.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the id value for this CategoryRecord.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this CategoryRecord.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this CategoryRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CategoryRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parent value for this CategoryRecord.
     * 
     * @return parent
     */
    public int getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this CategoryRecord.
     * 
     * @param parent
     */
    public void setParent(int parent) {
        this.parent = parent;
    }


    /**
     * Gets the path value for this CategoryRecord.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this CategoryRecord.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the sortorder value for this CategoryRecord.
     * 
     * @return sortorder
     */
    public int getSortorder() {
        return sortorder;
    }


    /**
     * Sets the sortorder value for this CategoryRecord.
     * 
     * @param sortorder
     */
    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
    }


    /**
     * Gets the timemodified value for this CategoryRecord.
     * 
     * @return timemodified
     */
    public int getTimemodified() {
        return timemodified;
    }


    /**
     * Sets the timemodified value for this CategoryRecord.
     * 
     * @param timemodified
     */
    public void setTimemodified(int timemodified) {
        this.timemodified = timemodified;
    }


    /**
     * Gets the visible value for this CategoryRecord.
     * 
     * @return visible
     */
    public int getVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this CategoryRecord.
     * 
     * @param visible
     */
    public void setVisible(int visible) {
        this.visible = visible;
    }

}
