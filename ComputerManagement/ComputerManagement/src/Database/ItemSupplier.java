/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Admin
 */
public class ItemSupplier {
    private String SupID;
    private String SupName;
    private String SupPhone;

    public ItemSupplier(String SupID, String SupName, String SupPhone) {
        this.SupID = SupID;
        this.SupName = SupName;
        this.SupPhone = SupPhone;
    }

    /**
     * @return the SupID
     */
    public String getSupID() {
        return SupID;
    }

    /**
     * @param SupID the SupID to set
     */
    public void setSupID(String SupID) {
        this.SupID = SupID;
    }

    /**
     * @return the SupName
     */
    public String getSupName() {
        return SupName;
    }

    /**
     * @param SupName the SupName to set
     */
    public void setSupName(String SupName) {
        this.SupName = SupName;
    }

    /**
     * @return the SupPhone
     */
    public String getSupPhone() {
        return SupPhone;
    }

    /**
     * @param SupPhone the SupPhone to set
     */
    public void setSupPhone(String SupPhone) {
        this.SupPhone = SupPhone;
    }
    
    
}
