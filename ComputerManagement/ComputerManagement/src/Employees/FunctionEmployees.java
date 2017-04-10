/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import DatabaseConnection.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FunctionEmployees extends Connects {

    public static PreparedStatement pst;
    public static Connection con=Connects.open();

    public static void InsertEm(String stafid, String use, String pas, String fname, String birthd, String mobil, String addre, String gend, String posi) {
        String sql = "INSERT INTO Staff (Staff_ID,UserS,Pass,Fullname,Birthday,Mobile,Address,Gender,Pos_ID) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, stafid);
            pst.setString(2, use);
            pst.setString(3, pas);
            pst.setString(4, fname);
            pst.setString(5, birthd);
            pst.setString(6, mobil);
            pst.setString(7, addre);
            pst.setString(8, gend);
            pst.setString(9, posi);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, use + " added staff success ", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void UpdateEm(String staf, String staf1, String use, String pas, String nam, String bir, String mob, String addr, String gend, String posii) {
        String sql = "UPDATE Staff SET Staff_ID='" + staf + "', UserS='" + use + "', Pass='" + pas + "', FullName='" + nam + "', Birthday='" + bir + "'"
                + ", Mobile='" + mob + "', Address='" + addr + "', Gender='" + gend + "', Pos_ID='" + posii + "' WHERE Staff_ID='" + staf1 + "'";

        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update success", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void DeleteEm(String staf) {
        String sql = "DELETE FROM Staff WHERE Staff_ID='" + staf + "'";

        try {
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "removed successfully ", "Notification", 1);
        } catch (SQLException ex) {
            Logger.getLogger(FunctionEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
