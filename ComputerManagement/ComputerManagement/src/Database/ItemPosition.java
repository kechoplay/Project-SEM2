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
public class ItemPosition {
    private String PosID;
    private String PosName;

    public ItemPosition(String PosID, String PosName) {
        this.PosID = PosID;
        this.PosName = PosName;
    }

    /**
     * @return the PosID
     */
    public String getPosID() {
        return PosID;
    }

    /**
     * @param PosID the PosID to set
     */
    public void setPosID(String PosID) {
        this.PosID = PosID;
    }

    /**
     * @return the PosName
     */
    public String getPosName() {
        return PosName;
    }

    /**
     * @param PosName the PosName to set
     */
    public void setPosName(String PosName) {
        this.PosName = PosName;
    }
    
    
}
