/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import DatabaseConnection.Connects;
import Product.ItemProduct;
import Product.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Orders
     */
    ResultSet rs;
    Connection con;
    Statement st;
    Connects cn = new Connects();
    public static String ordID = null;

    ItemProduct item;

    Vector cols=new Vector();
    
    Vector data=new Vector();
    Vector column=new Vector();
    public Order(ItemProduct item) {
        this.setTitle("Order");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        con = cn.open();
        try {
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();

        txtproid.setText(item.getPROID() + "");
        txtPrice.setText(item.getPROPRICE() + "");
        txtproname.setText(item.getPRONAME());
        txtordIDDetail.setText(ordID);
        String str=txtordIDDetail.getText();
        loadTblOrderDetail("Select Pro_ID,Number,Price from [ComputerStore].[dbo].[OrderDetail] where Ord_ID='" + str + "'");
        loadTbl("SelectAllOrder");
        loadcbbox("Select FullName from Staff where Pos_ID=3");
        
        cols.add("Product ID");
        cols.add("Number");
        cols.add("Price");
        column.add(item.getPROID());
        column.add("");
        column.add(item.getPROPRICE());
        data.add(column);
        tblOrdDetail.setModel(new DefaultTableModel(data,cols));
    }

    public Order() {
        this.setTitle("Order");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        con = cn.open();
        try {
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.setVisible(true);
        
        
        loadTbl("SelectAllOrder");
        loadcbbox("Select FullName from Staff where Pos_ID=3");
    }

    public void ProcessCtr(boolean b){
        txtCusAddr.setText("");
        txtCusEmail.setText("");
        txtCusMobile.setText("");
        txtCusName.setText("");
        txtOrdId.setText("");
        txtOrdTime.setText("");
    }
    
    public void loadcbbox(String sql) {
        rs = cn.getData(sql);
        try {
            while (rs.next()) {
                this.cbStaffOrd.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadTblOrderDetail(String sql) {
        rs = cn.getData(sql);
        Vector col = new Vector();
        col.add("Product ID");
        col.add("Number");
        col.add("Price");
        Vector data = new Vector();
        try {
            while (rs.next()) {
                Vector column = new Vector();
                column.add(rs.getInt(1));
                column.add(rs.getInt(2));
                column.add(rs.getFloat(3));
                data.add(column);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblOrdDetail.setModel(new DefaultTableModel(data, col));
    }

    public void loadTbl(String sql) {
        rs = cn.getData(sql);
        Vector col = new Vector();
        col.add("OrderID");
        col.add("Customer Name");
        col.add("Customer Address");
        col.add("Customer Email");
        col.add("Customer Mobile");
        col.add("Order Time");
        col.add("Staff Order");
        Vector data = new Vector();
        try {
            while (rs.next()) {
                Vector column = new Vector();
                column.add(rs.getInt(1));
                column.add(rs.getString(2));
                column.add(rs.getString(3));
                column.add(rs.getString(4));
                column.add(rs.getString(5));
                column.add(rs.getDate(6));
                column.add(rs.getString(7));
                data.add(column);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblord.setModel(new DefaultTableModel(data, col));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtproid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblord = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        txtCusName = new javax.swing.JTextField();
        txtCusAddr = new javax.swing.JTextField();
        txtCusEmail = new javax.swing.JTextField();
        txtCusMobile = new javax.swing.JTextField();
        txtOrdTime = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtOrdId = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrdDetail = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        spinNumber = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAddOrdDetail = new javax.swing.JButton();
        cbStaffOrd = new javax.swing.JComboBox<>();
        txtordIDDetail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtproname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblordMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblord);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setText("Order ID:");

        jLabel2.setText("Customer Name:");

        jLabel3.setText("Customer Address:");

        jLabel4.setText("Customer Email:");

        jLabel5.setText("Customer Mobile:");

        jLabel7.setText("Order Time:");

        jLabel8.setText("Staff Order:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        tblOrdDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pro ID", "Number", "price"
            }
        ));
        tblOrdDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrdDetailMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOrdDetail);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Order Detail");

        jLabel10.setText("Pro ID:");

        jLabel11.setText("Number:");

        jLabel12.setText("Price:");

        btnAddOrdDetail.setText("Add");
        btnAddOrdDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrdDetailActionPerformed(evt);
            }
        });

        jButton1.setText("Show Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Product Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtordIDDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(191, 191, 191)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAdd)
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnExit)
                                            .addComponent(btnEdit))
                                        .addGap(22, 22, 22)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCusName, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(txtCusAddr)
                                    .addComponent(txtCusEmail)
                                    .addComponent(txtCusMobile)
                                    .addComponent(txtOrdTime)
                                    .addComponent(txtOrdId)
                                    .addComponent(cbStaffOrd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnDel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtproid, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddOrdDetail))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtproname, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtOrdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtordIDDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtproid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(spinNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(btnAddOrdDetail))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel6)
                            .addComponent(txtproname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCusAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCusEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCusMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrdTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbStaffOrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit)
                            .addComponent(btnDel)
                            .addComponent(btnAdd))
                        .addGap(34, 34, 34)
                        .addComponent(btnExit)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void tblordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblordMouseClicked
        // TODO add your handling code here:
        int index = tblord.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblord.getModel();
        ordID = model.getValueAt(tblord.getSelectedRow(), 0).toString();
        txtordIDDetail.setText(model.getValueAt(tblord.getSelectedRow(), 0).toString());
        txtOrdId.setText(model.getValueAt(tblord.getSelectedRow(), 0).toString());
        txtCusName.setText(model.getValueAt(tblord.getSelectedRow(), 1).toString());
        txtCusAddr.setText(model.getValueAt(tblord.getSelectedRow(), 2).toString());
        txtCusEmail.setText(model.getValueAt(tblord.getSelectedRow(), 3).toString());
        txtCusMobile.setText(model.getValueAt(tblord.getSelectedRow(), 4).toString());
        txtOrdTime.setText(model.getValueAt(tblord.getSelectedRow(), 5).toString());
        cbStaffOrd.setSelectedItem(model.getValueAt(tblord.getSelectedRow(), 6).toString());

        String str = txtordIDDetail.getText();
        loadTblOrderDetail("Select Pro_ID,Number,Price from [ComputerStore].[dbo].[OrderDetail] where Ord_ID='" + str + "'");
    }//GEN-LAST:event_tblordMouseClicked

    private void btnAddOrdDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrdDetailActionPerformed
        // TODO add your handling code here:
        int num = (int) this.spinNumber.getValue();
        String str = txtordIDDetail.getText();
        if (this.txtordIDDetail.getText().length() == 0 && this.txtproid.getText().length() == 0 && this.txtPrice.getText().length() == 0
                && this.spinNumber.getValue().equals(0) || this.txtordIDDetail.getText().length() == 0 || this.txtproid.getText().length() == 0
                || this.txtPrice.getText().length() == 0 || this.spinNumber.getValue().equals(0)) {
            JOptionPane.showMessageDialog(null, "Not null", "Thông báo", 1);
        } else {
            FunctionOrder.InsertOrdDetail(this.txtordIDDetail.getText(), this.txtproid.getText(), num, this.txtPrice.getText());
            loadTblOrderDetail("Select Pro_ID,Number,Price from [ComputerStore].[dbo].[OrderDetail] where Ord_ID='" + str + "'");
            txtproid.setText("");
            txtproname.setText("");
            spinNumber.setValue(0);
            txtPrice.setText("");
        }
    }//GEN-LAST:event_btnAddOrdDetailActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (this.txtOrdId.getText().length() == 0 && this.txtCusName.getText().length() == 0 && this.txtCusAddr.getText().length() == 0 && this.txtCusEmail.getText().length() == 0
                && this.txtCusMobile.getText().length() == 0 && this.txtOrdTime.getText().length() == 0
                || this.txtOrdId.getText().length() == 0 || this.txtCusName.getText().length() == 0 || this.txtCusAddr.getText().length() == 0 || this.txtCusEmail.getText().length() == 0
                || this.txtCusMobile.getText().length() == 0 || this.txtOrdTime.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Not null", "Thông báo", 1);
        } else {
            FunctionOrder.InsertOrder(this.txtOrdId.getText(), this.txtCusName.getText(), this.txtCusAddr.getText(), this.txtCusEmail.getText(),
                    this.txtCusMobile.getText(), this.txtOrdTime.getText(), this.cbStaffOrd.getSelectedItem().toString());
            loadTbl("SelectAllOrder");
            txtordIDDetail.setText(txtOrdId.getText());
            ProcessCtr(true);            
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if (this.txtOrdId.getText().length() == 0 && this.txtCusName.getText().length() == 0 && this.txtCusAddr.getText().length() == 0 && this.txtCusEmail.getText().length() == 0
                && this.txtCusMobile.getText().length() == 0 && this.txtOrdTime.getText().length() == 0
                || this.txtOrdId.getText().length() == 0 || this.txtCusName.getText().length() == 0 || this.txtCusAddr.getText().length() == 0 || this.txtCusEmail.getText().length() == 0
                || this.txtCusMobile.getText().length() == 0 || this.txtOrdTime.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Not null", "Thông báo", 1);
        } else {
            FunctionOrder.UpdateOrd(ordID, this.txtCusName.getText(), this.txtCusAddr.getText(), this.txtCusEmail.getText().trim(),
                    this.txtCusMobile.getText(), this.txtOrdTime.getText(), this.cbStaffOrd.getSelectedItem().toString());
            loadTbl("SelectAllOrder");
            ProcessCtr(true);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Are you sure to delete " + ordID, "Notification", 2) == 0) {            
            FunctionOrder.DeleteOrdDetail(ordID);
            FunctionOrder.DeleteOrd(ordID);
            ProcessCtr(true);
            txtordIDDetail.setText("");
            loadTbl("SelectAllOrder");
            loadTblOrderDetail("Select Pro_ID,Number,Price from [ComputerStore].[dbo].[OrderDetail] where Ord_ID='" + ordID + "'");
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Product pro = new Product();
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblOrdDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdDetailMouseClicked
        // TODO add your handling code here:
        int index = tblord.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblOrdDetail.getModel();
        txtproid.setText(model.getValueAt(tblOrdDetail.getSelectedRow(), 0).toString());
        spinNumber.setValue(model.getValueAt(tblOrdDetail.getSelectedRow(), 1));
        txtPrice.setText(model.getValueAt(tblOrdDetail.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tblOrdDetailMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddOrdDetail;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cbStaffOrd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinNumber;
    private javax.swing.JTable tblOrdDetail;
    private javax.swing.JTable tblord;
    private javax.swing.JTextField txtCusAddr;
    private javax.swing.JTextField txtCusEmail;
    private javax.swing.JTextField txtCusMobile;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtOrdId;
    private javax.swing.JTextField txtOrdTime;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtordIDDetail;
    private javax.swing.JTextField txtproid;
    private javax.swing.JTextField txtproname;
    // End of variables declaration//GEN-END:variables
}
