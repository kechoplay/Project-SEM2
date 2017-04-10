/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import java.sql.Connection;
import DatabaseConnection.Connects;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class CheckLog {

    public static Connection con = null;
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;

    public static String TestConnect() {
        try {
            con=Connects.open();
            return "ket noi thanh cong";
        } catch (Exception e) {
            return "ket noi k thanh cong";
        }
    }

    public static ResultSet Log(String user, String pass) {
        String sql = "select * from Staff where UserS=? and Pass=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);
            return rs = pst.executeQuery();
        } catch (Exception e) {
            return rs = null;
        }
    }
}
