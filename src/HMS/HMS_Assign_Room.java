/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS;

import static HMS_CODE.AssignedRoom.Seat_No;
import static HMS_CODE.AssignedRoom.Room_Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hashini
 */
public class HMS_Assign_Room extends javax.swing.JInternalFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    
    
//    public String driver = "com.microsoft.jdbc.SQLServerDriver";
//    public String url = "jdbcsqlserver://localhost::24809:databaseName=smsDB";
//    public String user = "adminK";
//    public String pw = "adminK";

    /**
     * Creates new form Assign_Room
     */
    public HMS_Assign_Room() {
        initComponents();
        
         conn = DBConnection.DBConnect.connect();
        
//        Class.forName(driver);
//        conn=DriverManger.getConnection(url,user,pw);
        
//        conn = DBConnect.connect();
        
        groupButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        A_Seat1_rad = new javax.swing.JRadioButton();
        A1_comboRno = new javax.swing.JComboBox<>();
        A_assRoom_but = new javax.swing.JButton();
        A_Luxuary_rad = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        A_Normal_rad = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        A_Seat2_rad = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        A_SHID_txt = new javax.swing.JTextField();
        A_AssDate_DateCH = new com.toedter.calendar.JDateChooser();
        A_back_but = new javax.swing.JButton();
        A_CEAR_but = new javax.swing.JButton();
        radioClear = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1200, 620));
        setMinimumSize(new java.awt.Dimension(1200, 620));
        setPreferredSize(new java.awt.Dimension(1200, 620));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");
        jPanel1.setMaximumSize(new java.awt.Dimension(1617, 592));
        jPanel1.setMinimumSize(new java.awt.Dimension(1617, 592));
        jPanel1.setPreferredSize(new java.awt.Dimension(1617, 592));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assign Room", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(0, 0, 204))); // NOI18N

        A_Seat1_rad.setText("Seat No1");
        A_Seat1_rad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_Seat1_radActionPerformed(evt);
            }
        });

        A1_comboRno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Room No", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        A_assRoom_but.setBackground(new java.awt.Color(204, 255, 255));
        A_assRoom_but.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A_assRoom_but.setText("Assign Room");
        A_assRoom_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_assRoom_butActionPerformed(evt);
            }
        });

        A_Luxuary_rad.setText("Luxury");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Student HID");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Select The Seat No");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Date Of Assigning");

        A_Normal_rad.setText("Normal");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Select The Room Type");

        A_Seat2_rad.setText("Seat No2");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Select The Room No");

        A_AssDate_DateCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                A_AssDate_DateCHKeyTyped(evt);
            }
        });

        A_back_but.setBackground(new java.awt.Color(204, 204, 255));
        A_back_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        A_back_but.setText("Back");
        A_back_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_back_butActionPerformed(evt);
            }
        });

        A_CEAR_but.setBackground(new java.awt.Color(204, 204, 255));
        A_CEAR_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        A_CEAR_but.setText("Clear");
        A_CEAR_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_CEAR_butActionPerformed(evt);
            }
        });

        radioClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A_SHID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A1_comboRno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A_Seat1_rad)
                                    .addComponent(A_Normal_rad))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(A_Luxuary_rad)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(A_Seat2_rad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                        .addComponent(radioClear))))
                            .addComponent(A_AssDate_DateCH, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(A_back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(A_CEAR_but)
                        .addGap(18, 18, 18)
                        .addComponent(A_assRoom_but, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(A_SHID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A1_comboRno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioClear, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(A_Seat1_rad)
                        .addComponent(A_Seat2_rad)))
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(A_Normal_rad)
                    .addComponent(A_Luxuary_rad))
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(A_AssDate_DateCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_back_but)
                    .addComponent(A_CEAR_but)
                    .addComponent(A_assRoom_but, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A_Seat1_radActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_Seat1_radActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A_Seat1_radActionPerformed

    private void A_assRoom_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_assRoom_butActionPerformed
       
        //Insert in to asssigned rooms table
        
        try {
            String sql = "INSERT INTO hms_assigned_room"
                    + "(SHID,Room_No,Room_Type,Seat_No,Date_Assigned)"
                    + "VALUES (?,?,?,?,?)";

            pst = conn.prepareStatement(sql);

            pst.setString(1, A_SHID_txt.getText());

            String value=A1_comboRno.getSelectedItem().toString();
            pst.setString(2, value);

            if(A_Seat1_rad.isSelected()){
            Seat_No="Seat No1";
             }
            if(A_Seat2_rad.isSelected()){
            Seat_No="Seat No2";
             }
            pst.setString(3, Seat_No);

            if(A_Normal_rad.isSelected()){
            Room_Type="Normal";
             }
            if(A_Luxuary_rad.isSelected()){
            Room_Type="Luxury";
             }
            pst.setString(4, Seat_No);

            pst.setString(5, ((JTextField) A_AssDate_DateCH.getDateEditor().getUiComponent()).getText());
            
            

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Inserted Successfully !");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_A_assRoom_butActionPerformed

    private void A_back_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_back_butActionPerformed
       
        jPanel1.removeAll();
        HMS_RoomDetails viewall =new HMS_RoomDetails ();
        jPanel1.add(viewall).setVisible(true);
    }//GEN-LAST:event_A_back_butActionPerformed

    private void A_CEAR_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_CEAR_butActionPerformed

        A_SHID_txt.setText(" ");
        A1_comboRno.setSelectedIndex(0);
        radioClear.setSelected(true);
        A_Normal_rad.setSelected(false);
        A_Luxuary_rad.setSelected(false);
        A_AssDate_DateCH.setCalendar(null);

    }//GEN-LAST:event_A_CEAR_butActionPerformed

    private void radioClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioClearActionPerformed

    private void A_AssDate_DateCHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_A_AssDate_DateCHKeyTyped
      
             char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==com.sun.glass.events.KeyEvent.VK_BACKSPACE)||(c==com.sun.glass.events.KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
            
        }     
    }//GEN-LAST:event_A_AssDate_DateCHKeyTyped

    private void groupButton( ) {

        ButtonGroup bg1 = new ButtonGroup( );

        bg1.add(A_Seat1_rad);
        bg1.add(A_Seat2_rad);
        bg1.add(radioClear);
        radioClear.setVisible(false);
        

        }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> A1_comboRno;
    private com.toedter.calendar.JDateChooser A_AssDate_DateCH;
    private javax.swing.JButton A_CEAR_but;
    private javax.swing.JRadioButton A_Luxuary_rad;
    private javax.swing.JRadioButton A_Normal_rad;
    private javax.swing.JTextField A_SHID_txt;
    private javax.swing.JRadioButton A_Seat1_rad;
    private javax.swing.JRadioButton A_Seat2_rad;
    private javax.swing.JButton A_assRoom_but;
    private javax.swing.JButton A_back_but;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton radioClear;
    // End of variables declaration//GEN-END:variables
}