/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    public Settings() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        mainpanel = new javax.swing.JPanel();
        deletuserPanel = new javax.swing.JPanel();
        DeleteUer = new javax.swing.JLabel();
        addUserPanel = new javax.swing.JPanel();
        AddUser = new javax.swing.JLabel();
        TitelPanel = new javax.swing.JPanel();
        TitelLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Settings");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 255, 255));
        setResizable(false);

        mainpanel.setBackground(new java.awt.Color(173, 224, 252));
        mainpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        deletuserPanel.setBackground(new java.awt.Color(27, 40, 57));

        DeleteUer.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        DeleteUer.setForeground(new java.awt.Color(255, 255, 255));
        DeleteUer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteUer.setText("Delete User");
        DeleteUer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteUerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout deletuserPanelLayout = new javax.swing.GroupLayout(deletuserPanel);
        deletuserPanel.setLayout(deletuserPanelLayout);
        deletuserPanelLayout.setHorizontalGroup(
            deletuserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletuserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteUer, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );
        deletuserPanelLayout.setVerticalGroup(
            deletuserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletuserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteUer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        addUserPanel.setBackground(new java.awt.Color(27, 40, 57));

        AddUser.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        AddUser.setForeground(new java.awt.Color(255, 255, 255));
        AddUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddUser.setText("Add User");
        AddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addUserPanelLayout = new javax.swing.GroupLayout(addUserPanel);
        addUserPanel.setLayout(addUserPanelLayout);
        addUserPanelLayout.setHorizontalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddUser, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        addUserPanelLayout.setVerticalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddUser, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        TitelPanel.setBackground(new java.awt.Color(27, 40, 57));

        TitelLabel.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        TitelLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitelLabel.setText("Settings");

        javax.swing.GroupLayout TitelPanelLayout = new javax.swing.GroupLayout(TitelPanel);
        TitelPanel.setLayout(TitelPanelLayout);
        TitelPanelLayout.setHorizontalGroup(
            TitelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        TitelPanelLayout.setVerticalGroup(
            TitelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(addUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(deletuserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
            .addComponent(TitelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addComponent(TitelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletuserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddUserMouseClicked
        this.dispose();
        Signup_Form sign = new Signup_Form();
        sign.setVisible(true);
        sign.setLocationRelativeTo(null);
    }//GEN-LAST:event_AddUserMouseClicked

    private void DeleteUerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteUerMouseClicked
        String E_id = JOptionPane.showInputDialog(this,"Enter Employee ID");
        JOptionPane.showMessageDialog(this, "Please Wait", "Wait", 2);
        PreparedStatement ps;
        ResultSet rs;
        String queryCheck = "SELECT * FROM `Receptionist` WHERE `E_id` = ?";
        String qudele = "DELETE FROM `Receptionist` WHERE `Receptionist`.`E_id` = ?";
        
        try {
            ps = connectDatabase.getConnection().prepareStatement(queryCheck);
            ps.setString(1, E_id);
            rs = ps.executeQuery();
            if(rs.next()){
                ps = connectDatabase.getConnection().prepareStatement(qudele);
                ps.setString(1, E_id);
                ps.executeQuery();
                JOptionPane.showMessageDialog(this, "User Deleted!", "Deleted", 2);
            }else{
                JOptionPane.showMessageDialog(this, "User Not Found!", "Not Found", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteUerMouseClicked

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddUser;
    private javax.swing.JLabel DeleteUer;
    private javax.swing.JLabel TitelLabel;
    private javax.swing.JPanel TitelPanel;
    private javax.swing.JPanel addUserPanel;
    private javax.swing.JPanel deletuserPanel;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel mainpanel;
    // End of variables declaration//GEN-END:variables
}
