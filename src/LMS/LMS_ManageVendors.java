/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;


import DBConnection.DBConnect;
import LMS.code.Vendor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import SPMS.dbConnection;

/**
 *
 * @author sanjalee
 */
public class LMS_ManageVendors extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public LMS_ManageVendors() {
        initComponents();
        
        conn = DBConnect.connect();
        
        tableload();
    }

    
    public void tableload(){
    
        String sql_viewVendors = "SELECT id, name, address, email, contact FROM lms_vendor";
        try {
            pst = conn.prepareStatement(sql_viewVendors);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(LMS_ManageVendors.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
        jTableVendors.setModel(DbUtils.resultSetToTableModel(rs));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchvendor = new javax.swing.JPanel();
        labelsearchname = new javax.swing.JLabel();
        searchNameText = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableVendors = new javax.swing.JTable();
        btnSearchVendor = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        vendornamebox = new javax.swing.JTextField();
        vendoremailbox = new javax.swing.JTextField();
        vendorcontactbox = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        vendoraddressbox = new javax.swing.JTextArea();
        btn_addvendor = new javax.swing.JButton();
        labelContactForm = new javax.swing.JLabel();
        labelEmailForm = new javax.swing.JLabel();
        labelAddressForm = new javax.swing.JLabel();
        labelNameForm = new javax.swing.JLabel();
        btn_updateVendor = new javax.swing.JButton();
        btn_deleteVendor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelid = new javax.swing.JLabel();
        btnSearchReset = new javax.swing.JButton();

        searchvendor.setBackground(new java.awt.Color(255, 255, 230));

        labelsearchname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelsearchname.setForeground(new java.awt.Color(0, 26, 77));
        labelsearchname.setText("Name");

        searchNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameTextActionPerformed(evt);
            }
        });

        jTableVendors.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableVendors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendorsMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTableVendors);

        btnSearchVendor.setBackground(new java.awt.Color(255, 173, 51));
        btnSearchVendor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchVendor.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchVendor.setText("search");
        btnSearchVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchVendorActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 230));

        vendoraddressbox.setColumns(20);
        vendoraddressbox.setRows(5);
        jScrollPane13.setViewportView(vendoraddressbox);

        btn_addvendor.setBackground(new java.awt.Color(0, 179, 60));
        btn_addvendor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_addvendor.setForeground(new java.awt.Color(255, 255, 255));
        btn_addvendor.setText("Insert");
        btn_addvendor.setPreferredSize(new java.awt.Dimension(83, 25));
        btn_addvendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addvendorActionPerformed(evt);
            }
        });

        labelContactForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelContactForm.setForeground(new java.awt.Color(0, 26, 77));
        labelContactForm.setText("Contact");

        labelEmailForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEmailForm.setForeground(new java.awt.Color(0, 26, 77));
        labelEmailForm.setText("E-mail");

        labelAddressForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAddressForm.setForeground(new java.awt.Color(0, 26, 77));
        labelAddressForm.setText("Address");

        labelNameForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNameForm.setForeground(new java.awt.Color(0, 26, 77));
        labelNameForm.setText("Name");

        btn_updateVendor.setBackground(new java.awt.Color(0, 77, 153));
        btn_updateVendor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_updateVendor.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateVendor.setText("Update");
        btn_updateVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateVendorActionPerformed(evt);
            }
        });

        btn_deleteVendor.setBackground(new java.awt.Color(255, 26, 26));
        btn_deleteVendor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_deleteVendor.setForeground(new java.awt.Color(255, 255, 255));
        btn_deleteVendor.setText("Delete");
        btn_deleteVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteVendorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 26, 77));
        jLabel1.setText("ID");

        labelid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelid.setForeground(new java.awt.Color(0, 26, 77));
        labelid.setText("ID");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(btn_addvendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_updateVendor)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteVendor))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addComponent(labelEmailForm)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vendoremailbox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addComponent(labelContactForm)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                            .addComponent(vendorcontactbox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addComponent(labelAddressForm)
                            .addGap(93, 93, 93)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelNameForm)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelid)
                                .addComponent(vendornamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelid))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNameForm)
                            .addComponent(vendornamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEmailForm)
                            .addComponent(vendoremailbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelContactForm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorcontactbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(labelAddressForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addvendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_updateVendor)
                    .addComponent(btn_deleteVendor))
                .addGap(121, 121, 121))
        );

        btnSearchReset.setBackground(new java.awt.Color(255, 173, 51));
        btnSearchReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchReset.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchReset.setText("Reset");
        btnSearchReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchvendorLayout = new javax.swing.GroupLayout(searchvendor);
        searchvendor.setLayout(searchvendorLayout);
        searchvendorLayout.setHorizontalGroup(
            searchvendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchvendorLayout.createSequentialGroup()
                .addGroup(searchvendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchvendorLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchvendorLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(labelsearchname)
                        .addGap(32, 32, 32)
                        .addComponent(searchNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchVendor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchReset)))
                .addGap(14, 14, 14)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(530, Short.MAX_VALUE))
        );
        searchvendorLayout.setVerticalGroup(
            searchvendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchvendorLayout.createSequentialGroup()
                .addGroup(searchvendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchvendorLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(searchvendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelsearchname)
                            .addComponent(searchNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchVendor)
                            .addComponent(btnSearchReset))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchvendorLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1429, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(searchvendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 842, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(searchvendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNameTextActionPerformed

    private void btn_addvendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addvendorActionPerformed
        
        String name = vendornamebox.getText();
        String email = vendoremailbox.getText();
        String contact = vendorcontactbox.getText();
        String address = vendoraddressbox.getText();
        
        Vendor vendor = new Vendor();
        
        try {
            vendor.addVendor(name, address, email, contact);
        } catch (SQLException ex) {
            Logger.getLogger(LMS_ManageVendors.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        vendornamebox.setText(null);
        vendoremailbox.setText(null);
        vendorcontactbox.setText(null);
        vendoraddressbox.setText(null);
        
        tableload();
    }//GEN-LAST:event_btn_addvendorActionPerformed

    private void btn_updateVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateVendorActionPerformed
        
        int isConfirmed = JOptionPane.showConfirmDialog(null, "Do you really want to update this information?");
        
        if(isConfirmed == 0){
            
            int id = Integer.parseInt(labelid.getText());
            String name = vendornamebox.getText();
            String email = vendoremailbox.getText();
            String contact = vendorcontactbox.getText();
            String address = vendoraddressbox.getText();
            
            String sql_updateVendor = "UPDATE lms_vendor "
                                      + "SET name = '"+ name +"', email = '"+ email +"', contact = '"+ contact +"', address = '"+ address +"' "
                                      + "WHERE id ='"+ id +"'";
            
            try {
                pst = conn.prepareStatement(sql_updateVendor);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Successfully Updated!!");
            } catch (SQLException ex) {
                Logger.getLogger(LMS_ManageMember.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            labelid.setText("ID");
            vendornamebox.setText(null);
            vendoremailbox.setText(null);
            vendorcontactbox.setText(null);
            vendoraddressbox.setText(null);
            
            tableload();
        
        }
    }//GEN-LAST:event_btn_updateVendorActionPerformed

    private void jTableVendorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendorsMouseClicked
        
        int raw = jTableVendors.getSelectedRow();
        
        String id = jTableVendors.getValueAt(raw, 0).toString();
        String name = jTableVendors.getValueAt(raw, 1).toString();
        String email = jTableVendors.getValueAt(raw, 3).toString();
        String contact = jTableVendors.getValueAt(raw, 4).toString();
        String address = jTableVendors.getValueAt(raw, 2).toString();
        
        labelid.setText(id);
        vendornamebox.setText(name);
        vendoremailbox.setText(email);
        vendorcontactbox.setText(contact);
        vendoraddressbox.setText(address);
    }//GEN-LAST:event_jTableVendorsMouseClicked

    private void btn_deleteVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteVendorActionPerformed
        
        int isConfirmed = JOptionPane.showConfirmDialog(null, "Do you really want to delete this information?");
        
        if(isConfirmed == 0){
        
            int id = Integer.parseInt(labelid.getText());
            
            String sql_DeleteVendor = "DELETE FROM lms_vendor WHERE id = '"+ id +"'";
            try {
                pst = conn.prepareStatement(sql_DeleteVendor);
                pst.execute();
            } catch (SQLException ex) {
                Logger.getLogger(LMS_ManageMember.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            
            labelid.setText("ID");
            vendornamebox.setText(null);
            vendoremailbox.setText(null);
            vendorcontactbox.setText(null);
            vendoraddressbox.setText(null);
            
            tableload();
        }
    }//GEN-LAST:event_btn_deleteVendorActionPerformed

    private void btnSearchVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchVendorActionPerformed
       
        String name = searchNameText.getText();
        
        String sql_searchVendors = "SELECT id, name, address, email, contact FROM lms_vendor WHERE name LIKE '%"+ name +"%'";
         
        try {
            pst = conn.prepareStatement(sql_searchVendors);
            
            rs = pst.executeQuery();
    
            jTableVendors.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(LMS_ManageVendors.class.getName()).log(Level.SEVERE, null, ex);
        }
            
         
    }//GEN-LAST:event_btnSearchVendorActionPerformed

    private void btnSearchResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchResetActionPerformed
        
        tableload();
    }//GEN-LAST:event_btnSearchResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchReset;
    private javax.swing.JButton btnSearchVendor;
    private javax.swing.JButton btn_addvendor;
    private javax.swing.JButton btn_deleteVendor;
    private javax.swing.JButton btn_updateVendor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableVendors;
    private javax.swing.JLabel labelAddressForm;
    private javax.swing.JLabel labelContactForm;
    private javax.swing.JLabel labelEmailForm;
    private javax.swing.JLabel labelNameForm;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labelsearchname;
    private javax.swing.JTextField searchNameText;
    private javax.swing.JPanel searchvendor;
    private javax.swing.JTextArea vendoraddressbox;
    private javax.swing.JTextField vendorcontactbox;
    private javax.swing.JTextField vendoremailbox;
    private javax.swing.JTextField vendornamebox;
    // End of variables declaration//GEN-END:variables
}