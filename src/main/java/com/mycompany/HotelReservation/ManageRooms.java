/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.HotelReservation;



import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ManageRooms extends javax.swing.JFrame {

    /**
     * Creates new form ManageRooms_
     */
    public ManageRooms() {
        initComponents();
        getroomsdetails();
    }
    int E_Id;
    public ManageRooms(int id) {
        this.E_Id = id;
        initComponents();
        getroomsdetails();
    }
    PreparedStatement ps;
    ResultSet rs;
    String QueryGetRooms = "SELECT * FROM `rooms`";
    String QueryAddRoom = "INSERT INTO `rooms`(`roomNumber`, `roomType`, `bed`, `price`) VALUES (?,?,?,?)";
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
        BackToHome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        roomNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        roomType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        bedType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        PriceText = new javax.swing.JTextField();
        AddRoom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Manage Rooms");

        jPanel1.setBackground(new java.awt.Color(173, 224, 252));

        jPanel2.setBackground(new java.awt.Color(27, 40, 57));

        jLabel1.setBackground(new java.awt.Color(51, 0, 204));
        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Rooms");

        BackToHome.setBackground(new java.awt.Color(173, 224, 252));
        BackToHome.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        BackToHome.setForeground(new java.awt.Color(27, 40, 57));
        BackToHome.setText("Back");
        BackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(BackToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(BackToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Room Number ", "Room Type", "Bed", "Price", "Status"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setRowMargin(2);
        jTable1.setShowGrid(false);
        jTable1.setShowVerticalLines(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel2.setText("Room Number");

        roomNumber.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel3.setText("Room Type");

        roomType.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        roomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Economy", "VIP" }));

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel4.setText("Bed");

        bedType.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        bedType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple" }));

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel5.setText("Price");

        PriceText.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N

        AddRoom.setBackground(new java.awt.Color(27, 40, 57));
        AddRoom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddRoom.setForeground(new java.awt.Color(255, 255, 255));
        AddRoom.setText("Add Rooms");
        AddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bedType, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomType, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(AddRoom)))))
                .addGap(61, 61, 61))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roomType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bedType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToHomeActionPerformed
        HomePage homePage = new HomePage(E_Id);
        homePage.setVisible(true);
        homePage.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BackToHomeActionPerformed

    private void AddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRoomActionPerformed
        int roomnumber = Integer.parseInt(roomNumber.getText());
        String roomtype = (String) roomType.getSelectedItem();
        String bedtype = (String) bedType.getSelectedItem();
        int price = Integer.parseInt(PriceText.getText());
        
        try{
            ps = connectDatabase.getConnection().prepareStatement(QueryAddRoom);
            ps.setInt(1, roomnumber);
            ps.setString(2, roomtype);
            ps.setString(3, bedtype);
            ps.setInt(4, price);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Room added");
            getroomsdetails();

        }catch(SQLException e){
            Logger.getLogger(ManageRooms.class.getName()).log(Level.SEVERE, null, e);
            
        }
        
    }//GEN-LAST:event_AddRoomActionPerformed
    
    private void getroomsdetails(){
        try {
            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            ps = connectDatabase.getConnection().prepareStatement(QueryGetRooms);
            rs = ps.executeQuery();
            ResultSetMetaData RSD = rs.getMetaData();
            final int columnCount = RSD.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                int i=0;
                while(rs.next()){
                    model.addRow(new Object[]{"","","","",""});
                    for(int j=0;j<columnCount;j++){
                        model.setValueAt(rs.getObject(j+1), i, j);   
                    }
                    
                    i+=1;
                }
        } catch (SQLException ex) {
            Logger.getLogger(ManageRooms.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ArrayIndexOutOfBoundsException E){
            JOptionPane.showMessageDialog(rootPane, "Can't add Room!!");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(ManageRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRoom;
    private javax.swing.JButton BackToHome;
    private javax.swing.JTextField PriceText;
    private javax.swing.JComboBox<String> bedType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField roomNumber;
    private javax.swing.JComboBox<String> roomType;
    // End of variables declaration//GEN-END:variables
}
