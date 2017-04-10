/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Connects {
    
    public static String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    public static String url = "jdbc:odbc:computer";
    public static String user = "";
    public static String pass = "";
    public static Connection con = null;
    
    public static Connection open() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            st.execute("use ComputerStore;");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Connects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connects.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void close() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void close(PreparedStatement ps) {
        try {
            if (ps != null) {
                
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void close(PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connects.class.getName()).log(Level.SEVERE, null, ex);
        }
        close(ps);
    }
    
    public ResultSet getData(String sql) {
        ResultSet rs = null;
        try {
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Connects.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
