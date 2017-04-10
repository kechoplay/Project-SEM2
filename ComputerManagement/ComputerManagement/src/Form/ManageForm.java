/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Account.ChangePassword;
import Database.Data;
import Employees.Employ;
import Order.Order;
import Product.Product;

/**
 *
 * @author Admin
 */
public class ManageForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageForm
     */
    static Boolean loggedIn=false;
    public ManageForm() {
        initComponents();
    }

    public void setname(String s){
        lbname2.setText(s);
    }
    
    public String getname(){
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
        btnempl = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btndata = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnorder = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnchpass = new javax.swing.JMenuItem();
        btnout = new javax.swing.JMenuItem();
        btnexit = new javax.swing.JMenuItem();

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

        btnempl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnempl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Groups-Meeting-Dark-icon.png"))); // NOI18N
        btnempl.setText("EMPLOYEES");
        btnempl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnempl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnempl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemplActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btndata.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btndata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/web_database2.png"))); // NOI18N
        btndata.setText("DATABASE");
        btndata.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndata.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndataActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnorder.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/basket-icon.png"))); // NOI18N
        btnorder.setText("ORDER");
        btnorder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnorder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderActionPerformed(evt);
            }
        });

        jMenu1.setText("Systems");

        btnchpass.setText("Change Password");
        btnchpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchpassActionPerformed(evt);
            }
        });
        jMenu1.add(btnchpass);

        btnout.setText("LogOut");
        btnout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoutActionPerformed(evt);
            }
        });
        jMenu1.add(btnout);

        btnexit.setText("Exit Application");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jMenu1.add(btnexit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbname2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnempl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnorder, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbname)
                    .addComponent(lbname2))
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(btnempl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(btndata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnchpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchpassActionPerformed
        // TODO add your handling code here:
        ChangePassword cp=new ChangePassword();
        cp.setVisible(true);
        cp.setuser(this.lbname2.getText());
    }//GEN-LAST:event_btnchpassActionPerformed

    private void btnoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoutActionPerformed
        // TODO add your handling code here:
        loggedIn=false;
        this.dispose();
        LoginForm lf=new LoginForm();
        lf.show();
    }//GEN-LAST:event_btnoutActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnemplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemplActionPerformed
        // TODO add your handling code here:
        Employ em=new Employ();
        em.setVisible(true);
    }//GEN-LAST:event_btnemplActionPerformed

    private void btnproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproActionPerformed
        // TODO add your handling code here:
        Product pr=new Product();
        pr.setVisible(true);
    }//GEN-LAST:event_btnproActionPerformed

    private void btndataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndataActionPerformed
        // TODO add your handling code here:
        Data d=new Data();
        d.setVisible(true);
    }//GEN-LAST:event_btndataActionPerformed

    private void btnorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderActionPerformed
        // TODO add your handling code here:
        Order or=new Order();
        or.setVisible(true);
    }//GEN-LAST:event_btnorderActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnchpass;
    private javax.swing.JButton btndata;
    private javax.swing.JButton btnempl;
    private javax.swing.JMenuItem btnexit;
    private javax.swing.JButton btnorder;
    private javax.swing.JMenuItem btnout;
    private javax.swing.JButton btnpro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbname2;
    // End of variables declaration//GEN-END:variables
}