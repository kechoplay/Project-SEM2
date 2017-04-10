/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import DatabaseConnection.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FunctionAccount {

    public static PreparedStatement pst;
    public static ResultSet rs;
    public static Connection con=Connects.open();
    
    public static void ResetPass(String users) {
        String sql = "update Staff set Pass='123456789' where UserS='" + users + "'";
        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Reset successfull", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public static void changepass(String users,String pas){
         String sql = "update Staff set Pass='"+pas+"' where UserS='" + users + "'";
        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Change successfull", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
