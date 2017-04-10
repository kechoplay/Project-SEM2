/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import java.sql.Date;



/**
 *
 * @author Admin
 */
public class ItemOrder {
    private int OrdID;
    private String CusName;
    private String CusAdd;
    private String CusEmail;
    private String CusMobile;
    private int StaffID;
    private Date OrdTime;
    private String StaffOrd;

    public ItemOrder(int OrdID) {
        this.OrdID = OrdID;
    }
    
    public ItemOrder(int OrdID, String CusName, String CusAdd, String CusEmail, String CusMobile, int StaffID, Date OrdTime, String StaffOrd) {
        this.OrdID = OrdID;
        this.CusName = CusName;
        this.CusAdd = CusAdd;
        this.CusEmail = CusEmail;
        this.CusMobile = CusMobile;
        this.StaffID = StaffID;
        this.OrdTime = OrdTime;
        this.StaffOrd = StaffOrd;
    }

    /**
     * @return the OrdID
     */
    public int getOrdID() {
        return OrdID;
    }

    /**
     * @param OrdID the OrdID to set
     */
    public void setOrdID(int OrdID) {
        this.OrdID = OrdID;
    }

    /**
     * @return the CusName
     */
    public String getCusName() {
        return CusName;
    }

    /**
     * @param CusName the CusName to set
     */
    public void setCusName(String CusName) {
        this.CusName = CusName;
    }

    /**
     * @return the CusAdd
     */
    public String getCusAdd() {
        return CusAdd;
    }

    /**
     * @param CusAdd the CusAdd to set
     */
    public void setCusAdd(String CusAdd) {
        this.CusAdd = CusAdd;
    }

    /**
     * @return the CusEmail
     */
    public String getCusEmail() {
        return CusEmail;
    }

    /**
     * @param CusEmail the CusEmail to set
     */
    public void setCusEmail(String CusEmail) {
        this.CusEmail = CusEmail;
    }

    /**
     * @return the CusMobile
     */
    public String getCusMobile() {
        return CusMobile;
    }

    /**
     * @param CusMobile the CusMobile to set
     */
    public void setCusMobile(String CusMobile) {
        this.CusMobile = CusMobile;
    }

    /**
     * @return the StaffID
     */
    public int getStaffID() {
        return StaffID;
    }

    /**
     * @param StaffID the StaffID to set
     */
    public void setStaffID(int StaffID) {
        this.StaffID = StaffID;
    }

    /**
     * @return the OrdTime
     */
    public Date getOrdTime() {
        return OrdTime;
    }

    /**
     * @param OrdTime the OrdTime to set
     */
    public void setOrdTime(Date OrdTime) {
        this.OrdTime = OrdTime;
    }

    /**
     * @return the StaffOrd
     */
    public String getStaffOrd() {
        return StaffOrd;
    }

    /**
     * @param StaffOrd the StaffOrd to set
     */
    public void setStaffOrd(String StaffOrd) {
        this.StaffOrd = StaffOrd;
    }
    
    
}
