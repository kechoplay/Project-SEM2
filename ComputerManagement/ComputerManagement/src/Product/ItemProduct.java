/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author Admin
 */
public class ItemProduct {

    private int PROID;
    private String PRONAME;
    private String PROPHOTO;
    private float PROPRICE;
    private String GROID;
    private String SUPID;

    public ItemProduct() {
    }

    public ItemProduct(int PROID,float PROPRICE,String PRONAME) {
        this.PROID = PROID;
        this.PROPRICE=PROPRICE;
        this.PRONAME=PRONAME;
    }

    public ItemProduct(int PROID, String PRONAME, String PROPHOTO, float PROPRICE, String GROID, String supid) {
        this.PROID = PROID;
        this.PRONAME = PRONAME;
        this.PROPHOTO = PROPHOTO;
        this.PROPRICE = PROPRICE;
        this.GROID = GROID;
        this.SUPID = supid;
    }

    /**
     * @return the PROID
     */
    public int getPROID() {
        return PROID;
    }

    /**
     * @param PROID the PROID to set
     */
    public void setPROID(int PROID) {
        this.PROID = PROID;
    }

    /**
     * @return the PRONAME
     */
    public String getPRONAME() {
        return PRONAME;
    }

    /**
     * @param PRONAME the PRONAME to set
     */
    public void setPRONAME(String PRONAME) {
        this.PRONAME = PRONAME;
    }

    /**
     * @return the PROPHOTO
     */
    public String getPROPHOTO() {
        return PROPHOTO;
    }

    /**
     * @param PROPHOTO the PROPHOTO to set
     */
    public void setPROPHOTO(String PROPHOTO) {
        this.PROPHOTO = PROPHOTO;
    }

    /**
     * @return the PROPRICE
     */
    public float getPROPRICE() {
        return PROPRICE;
    }

    /**
     * @param PROPRICE the PROPRICE to set
     */
    public void setPROPRICE(float PROPRICE) {
        this.PROPRICE = PROPRICE;
    }

    /**
     * @return the GROID
     */
    public String getGROID() {
        return GROID;
    }

    /**
     * @param GROID the GROID to set
     */
    public void setGROID(String GROID) {
        this.GROID = GROID;
    }

    /**
     * @return the SUPID
     */
    public String getSUPID() {
        return SUPID;
    }

    /**
     * @param SUPID the SUPID to set
     */
    public void setSUPID(String supid) {
        this.SUPID = supid;
    }
}
