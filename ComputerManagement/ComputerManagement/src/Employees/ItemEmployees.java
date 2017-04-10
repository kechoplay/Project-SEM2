/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees;

/**
 *
 * @author Admin
 */
public class ItemEmployees {
    private String USER;
    private String PASS;
    private String FULLNAME;
    private String BIRTHDAY;
    private String ADDRESS;
    private String MOBILE;
    private String GENDER;
    private String POSITIONNAME;

    public ItemEmployees(String USER,String PASS,String FULLNAME,String BIRTHDAY,String ADDRESS,String MOBILE,
            String GENDER,String POSITIONNAME){
        this.USER = USER;
        this.PASS = PASS;
        this.FULLNAME = FULLNAME;
        this.BIRTHDAY = BIRTHDAY;
        this.ADDRESS = ADDRESS;
        this.GENDER = GENDER;
        this.MOBILE = MOBILE;
        this.POSITIONNAME = POSITIONNAME;
    }
    /**
     * @return the USER
     */
    public String getUSER() {
        return USER;
    }

    /**
     * @param USER the USER to set
     */
    public void setUSER(String USER) {
        this.USER = USER;
    }

    /**
     * @return the PASS
     */
    public String getPASS() {
        return PASS;
    }

    /**
     * @param PASS the PASS to set
     */
    public void setPASS(String PASS) {
        this.PASS = PASS;
    }

    /**
     * @return the FULLNAME
     */
    public String getFULLNAME() {
        return FULLNAME;
    }

    /**
     * @param FULLNAME the FULLNAME to set
     */
    public void setFULLNAME(String FULLNAME) {
        this.FULLNAME = FULLNAME;
    }

    /**
     * @return the BIRTHDAY
     */
    public String getBIRTHDAY() {
        return BIRTHDAY;
    }

    /**
     * @param BIRTHDAY the BIRTHDAY to set
     */
    public void setBIRTHDAY(String BIRTHDAY) {
        this.BIRTHDAY = BIRTHDAY;
    }

    /**
     * @return the ADDRESS
     */
    public String getADDRESS() {
        return ADDRESS;
    }

    /**
     * @param ADDRESS the ADDRESS to set
     */
    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    /**
     * @return the MOBILE
     */
    public String getMOBILE() {
        return MOBILE;
    }

    /**
     * @param MOBILE the MOBILE to set
     */
    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    /**
     * @return the GENDER
     */
    public String getGENDER() {
        return GENDER;
    }

    /**
     * @param GENDER the GENDER to set
     */
    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    /**
     * @return the POSITIONNAME
     */
    public String getPOSITIONNAME() {
        return POSITIONNAME;
    }

    /**
     * @param POSITIONNAME the POSITIONNAME to set
     */
    public void setPOSITIONNAME(String POSITIONNAME) {
        this.POSITIONNAME = POSITIONNAME;
    }
}
