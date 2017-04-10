/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import DatabaseConnection.Connects;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FunctionData {

    public static PreparedStatement pst;
    public static Statement st;
    public static ResultSet rs;
    public static Connection con=Connects.open();

    public static void InsertSup(String supid, String supname, String supphone) {
        String sql = "INSERT INTO Supplier (Sup_ID,Sup_Name,Sup_Telephone) VALUES (?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, supid);
            pst.setString(2, supname);
            pst.setString(3, supphone);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, " added supplier success ", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void UpdateSup(String supid1, String supid, String supname, String supphone) {
        String sql = "UPDATE Supplier SET Sup_ID='" + supid + "', Sup_Name='" + supname + "', Sup_Telephone='" + supphone + "' WHERE Sup_ID='" + supid1 + "'";

        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update success", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void DeleteSup(String supid) {
        String sql = "DELETE FROM Supplier WHERE Sup_ID='" + supid + "'";

        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "removed successfully ", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void InsertGro(String groid, String groname) {
        String sql = "INSERT INTO ProGroups (Gro_ID,Gro_Name) VALUES (?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, groid);
            pst.setString(2, groname);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, " added supplier success ", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void UpdateGro(String groid1, String groid, String groname) {
        String sql = "UPDATE ProGroups SET Gro_ID='" + groid + "', Gro_Name='" + groname + "' WHERE Gro_ID='" + groid1 + "'";

        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update success", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void DeleteGro(String groid) {
        String sql = "DELETE FROM ProGroups WHERE Gro_ID='" + groid + "'";

        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "removed successfully ", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void InsertPos(String posid, String posname) {
        String sql = "INSERT INTO Position (Pos_ID,Pos_Name) VALUES (?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, posid);
            pst.setString(2, posname);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, " added position success ", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void UpdatePos(String posid1, String posid, String posname) {
        String sql = "UPDATE Position SET Pos_ID='" + posid + "', Pos_Name='" + posname + "' WHERE Pos_ID='" + posid1 + "'";

        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update success", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void DeletePos(String posid) {
        String sql = "DELETE FROM Position WHERE Pos_ID='" + posid + "'";

        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "removed successfully ", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
