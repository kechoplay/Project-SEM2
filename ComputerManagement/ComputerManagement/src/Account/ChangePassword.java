/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import static Account.FunctionAccount.con;
import static Account.FunctionAccount.pst;
import static Account.FunctionAccount.rs;
import DatabaseConnection.*;
import java.sql.Connection;
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
public class ChangePassword extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement st;

    Connects cn = new Connects();
    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
        this.setTitle("Change Password");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        con = cn.open();
        try {
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txtuser.setEnabled(false);
    }

    public void setuser(String s) {
        txtuser.setText(s);
    }

    public String getuser() {
        return txtuser.getText();
    }

    public void send() {
        String u = txtuser.getText();
        String pw = txtoldpas.getText();
        if (pw.equals("")) {
            JOptionPane.showMessageDialog(null, "please enter old password");
            txtoldpas.requestFocus();
            return;
        }
        String pw1 = txtnewpas.getText();
        if (pw1.equals("")) {
            JOptionPane.showMessageDialog(null, "please enter new password");
            txtnewpas.requestFocus();
            return;
        }
        String pw2 = txtrepas.getText();
        if (pw2.equals("")) {
            JOptionPane.showMessageDialog(null, "please enter new password");
            txtrepas.requestFocus();
            return;
        }
        if (!pw1.equals(pw2)) {
            JOptionPane.showMessageDialog(null, "the new password incorrect");
            txtrepas.requestFocus();
            return;
        }

        try {
            String sql = "select Pass from [ComputerStore].[dbo].[Staff] where UserS=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, txtuser.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                String mk = rs.getString("Pass");
                if (mk.equals(pw)) {
                    FunctionAccount.changepass(u, pw2);
                } else {
                    JOptionPane.showMessageDialog(null, "password incorrect");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtuser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        txtoldpas = new javax.swing.JPasswordField();
        txtnewpas = new javax.swing.JPasswordField();
        txtrepas = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("UserName : ");

        jLabel2.setText("Old Password : ");

        jLabel3.setText("New Password : ");

        jLabel4.setText("Re - Password : ");

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtoldpas)
                            .addComponent(txtnewpas)
                            .addComponent(txtrepas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnclear)
                        .addGap(91, 91, 91)
                        .addComponent(btnok)
                        .addGap(95, 95, 95)
                        .addComponent(btnexit)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtoldpas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnewpas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtrepas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclear)
                    .addComponent(btnexit)
                    .addComponent(btnok))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        send();
    }//GEN-LAST:event_btnokActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtnewpas.setText("");
        txtoldpas.setText("");
        txtrepas.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtnewpas;
    private javax.swing.JPasswordField txtoldpas;
    private javax.swing.JPasswordField txtrepas;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}