/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.HotelReservation.screens;

import com.mycompany.HotelReservation.database.connectDatabase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class BillDetails extends javax.swing.JFrame {

    /**
     * Creates new form BillDetails
     */
    public BillDetails() {
        initComponents();
        this.model = (DefaultTableModel) jTable1.getModel();
        getUses();
    }

    DefaultTableModel model;
    int E_ID;
//    int rowCount;

    public BillDetails(int id) {
        E_ID = id;
        initComponents();
        this.model = (DefaultTableModel) jTable1.getModel();
        getUses();
    }
    PreparedStatement ps;
    ResultSet rs;
    String queryGetUser = "SELECT * FROM `Current User`";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backToHome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SRoomNumber = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veiw Customer");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(173, 224, 252));

        jPanel2.setBackground(new java.awt.Color(27, 40, 57));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Bill Details");

        backToHome.setBackground(new java.awt.Color(173, 224, 252));
        backToHome.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        backToHome.setForeground(new java.awt.Color(27, 40, 57));
        backToHome.setText("Back");
        backToHome.setBorder(null);
        backToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(backToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(27, 40, 57));
        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 40, 57));
        jLabel2.setText("Search by Room Number");

        SRoomNumber.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N

        Search.setBackground(new java.awt.Color(27, 40, 57));
        Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Room No.", "Name", "Contact No.", "Email", "Address", "Check In"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Byte.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(SRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search)
                .addContainerGap(226, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getUses() {
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            ps = connectDatabase.getConnection().prepareStatement(queryGetUser);
            rs = ps.executeQuery();

//           this.rowCount = rs.getRow();
            int i = 0;
            while (rs.next()) {
                model.addRow(new Object[]{"", "", "", "", "", ""});
                for (int j = 0; j < 6; j++) {
                    model.setValueAt(rs.getObject(j + 2), i, j);
                }
                i += 1;
            }

        } catch (SQLException e) {
            Logger.getLogger(ManageRooms.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String roomNumber = SRoomNumber.getText();
//        System.out.println(roomNumber);
        if (!roomNumber.trim().equals("")) {
            //       model.setRowCount(0);
            model.getDataVector().removeAllElements();

            String QueString = "SELECT * FROM `Current User` WHERE `Room Number`=?";
            try {
                ps = connectDatabase.getConnection().prepareStatement(QueString);
                ps.setString(1, roomNumber);
                rs = ps.executeQuery();
//                  int i = 0;                  
                if (rs.next()) {
                    for (int i = 0; i < rs.getRow(); i++) {
                        model.addRow(new Object[]{"", "", "", "", "", ""});
                        for (int j = 0; j < 6; j++) {
                            model.setValueAt(rs.getObject(j + 2), i, j);
                        }
                        rs.next();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "User Not Found!!. Enter Correct Room Number");
                }
            } catch (SQLException ex) {
                Logger.getLogger(BillDetails.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Opps Something went Wrong!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Room Number is Required!");
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void backToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeActionPerformed
        this.dispose();
        HomePage homePage = new HomePage(E_ID);
        homePage.setVisible(true);
        homePage.setLocationRelativeTo(null);
    }//GEN-LAST:event_backToHomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BillDetails().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SRoomNumber;
    private javax.swing.JButton Search;
    private javax.swing.JButton backToHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
