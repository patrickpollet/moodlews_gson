/**
 * FileRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for GSON library by pp@patrickpollet.net using GsonBeanWriter
 */

package net.patrickpollet.moodlews_gson.core;


import net.patrickpollet.gson.GsonObject;

public class FileRecord  extends GsonObject {
    private java.lang.String filecontent;

    private java.lang.String filename;

    private java.lang.String filepath;

    private int filesize;

    private java.lang.String fileurl;


    /**
     * Gets the filecontent value for this FileRecord.
     * 
     * @return filecontent
     */
    public java.lang.String getFilecontent() {
        return filecontent;
    }


    /**
     * Sets the filecontent value for this FileRecord.
     * 
     * @param filecontent
     */
    public void setFilecontent(java.lang.String filecontent) {
        this.filecontent = filecontent;
    }


    /**
     * Gets the filename value for this FileRecord.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this FileRecord.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }


    /**
     * Gets the filepath value for this FileRecord.
     * 
     * @return filepath
     */
    public java.lang.String getFilepath() {
        return filepath;
    }


    /**
     * Sets the filepath value for this FileRecord.
     * 
     * @param filepath
     */
    public void setFilepath(java.lang.String filepath) {
        this.filepath = filepath;
    }


    /**
     * Gets the filesize value for this FileRecord.
     * 
     * @return filesize
     */
    public int getFilesize() {
        return filesize;
    }


    /**
     * Sets the filesize value for this FileRecord.
     * 
     * @param filesize
     */
    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }


    /**
     * Gets the fileurl value for this FileRecord.
     * 
     * @return fileurl
     */
    public java.lang.String getFileurl() {
        return fileurl;
    }


    /**
     * Sets the fileurl value for this FileRecord.
     * 
     * @param fileurl
     */
    public void setFileurl(java.lang.String fileurl) {
        this.fileurl = fileurl;
    }

}
