/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import DatabaseConnection.Connects;
import java.sql.Connection;
import java.sql.Date;
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
public class FunctionOrder {

    public static Connection con = Connects.open();
    public static PreparedStatement pst;
    public static ResultSet rs;
    public static Statement st;

    public static void InsertOrder(String ordid,String CusName, String CusAdd, String CusEmail, String CusMobile, String OrdTime, String StaffOrd) {
        String sql = "INSERT INTO [ComputerStore].[dbo].[Order] (Ord_ID,Cus_Name,Cus_Address,Cus_Email,Cus_Mobile,Ord_Time,Staff_Ord) VALUES(?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, ordid);
            pst.setString(2, CusName);
            pst.setString(3, CusAdd);
            pst.setString(4, CusEmail);
            pst.setString(5, CusMobile);
            pst.setString(6, OrdTime);
            pst.setString(7, StaffOrd);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Added Successfull", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void UpdateOrd(String OrdID, String CusName, String CusAdd, String CusEmail, String CusMobile, String OrdTime, String StaffOrd) {
        String sql = "UPDATE [ComputerStore].[dbo].[Order] SET Cus_Name='" + CusName + "',Cus_Address='" + CusAdd + "',Cus_Email='" + CusEmail + "',Cus_Mobile='" + CusMobile + "'"
                + ",Ord_Time='" + OrdTime + "',Staff_Ord='" + StaffOrd + "' WHERE Ord_ID='" + OrdID + "'";
        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update success", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void DeleteOrd(String ordid) {
        String sql = "DELETE FROM [ComputerStore].[dbo].[Order] WHERE Ord_ID='" + ordid + "'";
        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "removed successfully ", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void InsertOrdDetail(String ordid,String proid,int number, String price){
        String sql="INSERT INTO OrderDetail (Ord_ID,Pro_ID,Number,Price) VALUES (?,?,?,?)";
        try {
            pst=con.prepareStatement(sql);
            pst.setString(1, ordid);
            pst.setString(2, proid);
            pst.setInt(3, number);
            pst.setString(4, price);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Added Successfull", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void DeleteOrdDetail(String ordid) {
        String sql = "DELETE FROM [ComputerStore].[dbo].[OrderDetail] WHERE Ord_ID='" + ordid + "'";
        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FunctionOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
