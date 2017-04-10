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
public class ItemGroup {
    private String GroID;
    private String GroName;

    public ItemGroup(String GroID, String GroName) {
        this.GroID = GroID;
        this.GroName = GroName;
    }

    /**
     * @return the GroID
     */
    public String getGroID() {
        return GroID;
    }

    /**
     * @param GroID the GroID to set
     */
    public void setGroID(String GroID) {
        this.GroID = GroID;
    }

    /**
     * @return the GroName
     */
    public String getGroName() {
        return GroName;
    }

    /**
     * @param GroName the GroName to set
     */
    public void setGroName(String GroName) {
        this.GroName = GroName;
    }
    
     
}
