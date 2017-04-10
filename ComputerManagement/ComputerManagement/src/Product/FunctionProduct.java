/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import DatabaseConnection.Connects;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Form.*;
import Product.*;

/**
 *
 * @author Admin
 */
public class FunctionProduct extends Connects {

    public static PreparedStatement pst;
    public static Statement st;
    public static ResultSet rs;
    public static Connection con = Connects.open();

    public static void InsertPro(String proid, String proname, String photo, String price, String groid, String supid) {
        String sql = "INSERT INTO Product (Pro_ID,Pro_Name,Pro_Photo,Pro_Price,Gro_ID,Sup_ID) VALUES (?, ?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, proid);
            pst.setString(2, proname);
            pst.setString(3, photo);
            pst.setString(4, price);
            pst.setString(5, groid);
            pst.setString(6, supid);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, " added product success ", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void UpdatePro(String proid1, String proid, String proname, String photo, String price, String groid, String supid) {
        String sql = "UPDATE Product SET Pro_ID='" + proid + "', Pro_Name='" + proname + "', Pro_Photo='" + photo + "', Pro_Price='" + price + "'"
                + ", Gro_ID='" + groid + "', Sup_ID='" + supid + "' WHERE Pro_ID='" + proid1 + "'";

        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update success", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void DeletePro(String proid) {
        String sql = "DELETE FROM Product WHERE Pro_ID='" + proid + "'";

        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "removed successfully ", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
