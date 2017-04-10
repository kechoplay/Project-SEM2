/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Account.ChangePassword;
import Database.Data;
import Order.Order;
import Product.Product;

/**
 *
 * @author Admin
 */
public class StaffForm extends javax.swing.JFrame {

    /**
     * Creates new form StaffForm
     */
    static Boolean loggedIn = false;

    public StaffForm() {
        initComponents();
    }

    public void setname(String s) {
        lbname2.setText(s);
    }

    public String getname() {
        return lbname2.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbname = new javax.swing.JLabel();
        lbname2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnpro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnDB = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmnchange = new javax.swing.JMenuItem();
        jmnout = new javax.swing.JMenuItem();
        jmnexit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbname.setText("Hello : ");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("PLEASE SELECT THE FUNCTION");

        btnpro.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/shopping-bag-icon.png"))); // NOI18N
        btnpro.setText("PRODUCT");
        btnpro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnDB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/web_database2.png"))); // NOI18N
        btnDB.setText("DATABASE");
        btnDB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDBActionPerformed(evt);
            }
        });

        btnOrder.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/basket-icon.png"))); // NOI18N
        btnOrder.setText("ORDER");
        btnOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOrder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jMenu1.setText("Systems");

        jmnchange.setText("Change Password");
        jmnchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnchangeActionPerformed(evt);
            }
        });
        jMenu1.add(jmnchange);

        jmnout.setText("LogOut");
        jmnout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnoutActionPerformed(evt);
            }
        });
        jMenu1.add(jmnout);

        jmnexit.setText("Exit Application");
        jmnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnexitActionPerformed(evt);
            }
        });
        jMenu1.add(jmnexit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbname2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnpro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbname)
                    .addComponent(lbname2))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator1)
                        .addComponent(btnpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmnchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnchangeActionPerformed
        // TODO add your handling code here:
        ChangePassword cp = new ChangePassword();
        cp.setVisible(true);
        cp.setuser(this.lbname2.getText());
    }//GEN-LAST:event_jmnchangeActionPerformed

    private void jmnoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnoutActionPerformed
        // TODO add your handling code here:
        loggedIn = false;
        this.dispose();
        LoginForm lf = new LoginForm();
        lf.show();
    }//GEN-LAST:event_jmnoutActionPerformed

    private void jmnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmnexitActionPerformed

    private void btnDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDBActionPerformed
        // TODO add your handling code here:
        Data d = new Data();
        d.setVisible(true);
    }//GEN-LAST:event_btnDBActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        Order or = new Order();
        or.setVisible(true);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproActionPerformed
        // TODO add your handling code here:
        Product pr = new Product();
        pr.setVisible(true);
    }//GEN-LAST:event_btnproActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDB;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnpro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem jmnchange;
    private javax.swing.JMenuItem jmnexit;
    private javax.swing.JMenuItem jmnout;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbname2;
    // End of variables declaration//GEN-END:variables
}
