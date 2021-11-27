
package com.mycompany.mavenproject1;

import java.awt.*;

public class CheckIn extends javax.swing.JFrame {

    public CheckIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NameTextfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        City = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        backToHome = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        RadioButtonEconomy = new javax.swing.JRadioButton();
        RadioButtonNormal = new javax.swing.JRadioButton();
        RadioButtonVIP = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        RadioButtonSingle = new javax.swing.JRadioButton();
        RadioButtonDouble = new javax.swing.JRadioButton();
        RadioButtonTriple = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        CheckInDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        checkInButton = new javax.swing.JButton();
        checkAmounButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/4-this.getSize().width/4, dim.height/4-this.getSize().height/4);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(173, 224, 252));
        jPanel1.setFont(new java.awt.Font("Open Sans", 3, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel1.setText("Personal Data");

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        NameTextfield.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel4.setText("Phone No.");

        PhoneNumber.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        Email.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel6.setText("Address");

        Address.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel7.setText("City");

        City.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(27, 40, 57));

        backToHome.setBackground(new java.awt.Color(173, 224, 252));
        backToHome.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        backToHome.setForeground(new java.awt.Color(27, 40, 57));
        backToHome.setText("Back");
        backToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 460));

        jPanel11.setBackground(new java.awt.Color(173, 224, 252));

        jLabel21.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel21.setText("Room type");

        RadioButtonEconomy.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        RadioButtonEconomy.setText("Economy");
        RadioButtonEconomy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonEconomyActionPerformed(evt);
            }
        });

        RadioButtonNormal.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        RadioButtonNormal.setSelected(true);
        RadioButtonNormal.setText("Normal");
        RadioButtonNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonNormalActionPerformed(evt);
            }
        });

        RadioButtonVIP.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        RadioButtonVIP.setText("VIP");
        RadioButtonVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonVIPActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel22.setText("Room capacity");

        RadioButtonSingle.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        RadioButtonSingle.setText("Single");
        RadioButtonSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonSingleActionPerformed(evt);
            }
        });

        RadioButtonDouble.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        RadioButtonDouble.setSelected(true);
        RadioButtonDouble.setText("Double");
        RadioButtonDouble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonDoubleActionPerformed(evt);
            }
        });

        RadioButtonTriple.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        RadioButtonTriple.setText("Triple");
        RadioButtonTriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonTripleActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel23.setText("Checkin date");

        CheckInDate.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel2.setText("Room Data  ");

        jPanel3.setBackground(new java.awt.Color(27, 40, 57));

        jLabel8.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Check In");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(126, 126, 126))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        checkInButton.setBackground(new java.awt.Color(27, 40, 57));
        checkInButton.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        checkInButton.setForeground(new java.awt.Color(255, 255, 255));
        checkInButton.setText("Check In");
        checkInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkInButton.setEnabled(false);
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtonActionPerformed(evt);
            }
        });

        checkAmounButton.setBackground(new java.awt.Color(27, 40, 57));
        checkAmounButton.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        checkAmounButton.setForeground(new java.awt.Color(255, 255, 255));
        checkAmounButton.setText("Check Amount  ");
        checkAmounButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAmounButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel9.setText("Per Day Amount");

        amountField.setEditable(false);
        amountField.setText("₹  ");
        amountField.setToolTipText("");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(RadioButtonSingle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonDouble)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonTriple))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkAmounButton)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21))
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(CheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                    .addComponent(RadioButtonEconomy)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(RadioButtonNormal)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(RadioButtonVIP))))
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(RadioButtonEconomy)
                    .addComponent(RadioButtonNormal)
                    .addComponent(RadioButtonVIP))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButtonSingle)
                            .addComponent(RadioButtonDouble)
                            .addComponent(RadioButtonTriple)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addComponent(CheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkAmounButton))
                .addGap(66, 66, 66))
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 430, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTestifiedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTestifiedActionPerformed

    private void backToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeActionPerformed
        this.dispose();
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        homePage.setLocationRelativeTo(null);
    }//GEN-LAST:event_backToHomeActionPerformed

    private void RadioButtonVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonVIPActionPerformed
        RadioButtonNormal.setSelected(false);
        RadioButtonEconomy.setSelected(false);
    }//GEN-LAST:event_RadioButtonVIPActionPerformed

    private void RadioButtonNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonNormalActionPerformed
        RadioButtonVIP.setSelected(false);
        RadioButtonEconomy.setSelected(false);
    }//GEN-LAST:event_RadioButtonNormalActionPerformed

    private void RadioButtonEconomyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEconomyActionPerformed
        RadioButtonNormal.setSelected(false);
        RadioButtonVIP.setSelected(false);
    }//GEN-LAST:event_RadioButtonEconomyActionPerformed

    private void checkAmounButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAmounButtonActionPerformed
        checkInButton.setEnabled(true);
        
    }//GEN-LAST:event_checkAmounButtonActionPerformed

    private void checkInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInButtonActionPerformed

    private void RadioButtonDoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonDoubleActionPerformed
        RadioButtonSingle.setSelected(false);
        RadioButtonTriple.setSelected(false);
    }//GEN-LAST:event_RadioButtonDoubleActionPerformed

    private void RadioButtonSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonSingleActionPerformed
        RadioButtonTriple.setSelected(false);
        RadioButtonDouble.setSelected(false);
    }//GEN-LAST:event_RadioButtonSingleActionPerformed

    private void RadioButtonTripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonTripleActionPerformed
        RadioButtonSingle.setSelected(false);
        RadioButtonDouble.setSelected(false);      
    }//GEN-LAST:event_RadioButtonTripleActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private com.toedter.calendar.JDateChooser CheckInDate;
    private javax.swing.JTextField City;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField NameTextfield;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JRadioButton RadioButtonDouble;
    private javax.swing.JRadioButton RadioButtonEconomy;
    private javax.swing.JRadioButton RadioButtonNormal;
    private javax.swing.JRadioButton RadioButtonSingle;
    private javax.swing.JRadioButton RadioButtonTriple;
    private javax.swing.JRadioButton RadioButtonVIP;
    private javax.swing.JTextField amountField;
    private javax.swing.JButton backToHome;
    private javax.swing.JButton checkAmounButton;
    private javax.swing.JButton checkInButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
