
package com.mycompany.HotelReservation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckIn extends javax.swing.JFrame {
    private String room = "Normal";
    private String capacity = "Double";
    private int Amount = 0;
    
    PreparedStatement ps;
    ResultSet rs;
    public CheckIn() {
        initComponents();
    }
    int E_Id;
    public CheckIn(int id){
        initComponents();
        this.E_Id = id;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
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
        backToHome = new javax.swing.JButton();
        checkInButton = new javax.swing.JButton();
        checkAmountButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        RoomNumber = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(173, 224, 252));
        jPanel1.setFont(new java.awt.Font("Open Sans", 3, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel1.setText("Personal Data");

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        NameTextfield.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        NameTextfield.setPreferredSize(new java.awt.Dimension(13, 36));

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel4.setText("Phone No.");

        PhoneNumber.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        Email.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel6.setText("Address");

        Address.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(27, 40, 57));

        jLabel8.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Check In");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
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
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(NameTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(PhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
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

        CheckInDate.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        CheckInDate.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel2.setText("Room Data  ");

        jPanel3.setBackground(new java.awt.Color(27, 40, 57));

        backToHome.setBackground(new java.awt.Color(173, 224, 252));
        backToHome.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        backToHome.setForeground(new java.awt.Color(27, 40, 57));
        backToHome.setText("Back");
        backToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

        checkAmountButton.setBackground(new java.awt.Color(27, 40, 57));
        checkAmountButton.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        checkAmountButton.setForeground(new java.awt.Color(255, 255, 255));
        checkAmountButton.setText("Check Amount  ");
        checkAmountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAmountButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel9.setText("Per Day Amount");

        amountField.setEditable(false);
        amountField.setText("₹  ");
        amountField.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel10.setText("Room Number");

        RoomNumber.setEditable(false);
        RoomNumber.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RoomNumber)
                                    .addComponent(amountField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(RadioButtonEconomy)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RadioButtonNormal)
                                            .addComponent(RadioButtonDouble))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RadioButtonTriple)
                                            .addComponent(RadioButtonVIP)))))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(RadioButtonSingle))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addComponent(checkAmountButton)
                                .addGap(42, 42, 42)
                                .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(RadioButtonEconomy)
                    .addComponent(RadioButtonNormal)
                    .addComponent(RadioButtonVIP))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonSingle)
                    .addComponent(RadioButtonDouble)
                    .addComponent(RadioButtonTriple)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CheckInDate, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amountField, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RoomNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAmountButton)
                    .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 430, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void backToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeActionPerformed
        this.dispose();
        HomePage homePage = new HomePage(E_Id);
        homePage.setVisible(true);
        homePage.setLocationRelativeTo(null);
    }//GEN-LAST:event_backToHomeActionPerformed

    private void RadioButtonVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonVIPActionPerformed
        this.room = "VIP";
        RadioButtonNormal.setSelected(false);
        RadioButtonEconomy.setSelected(false);
        RoomNumber.setText("");
        amountField.setText("₹  ");
    }//GEN-LAST:event_RadioButtonVIPActionPerformed

    private void RadioButtonNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonNormalActionPerformed
        this.room = "Normal";
        RadioButtonVIP.setSelected(false);
        RadioButtonEconomy.setSelected(false);
        amountField.setText("₹  ");
        RoomNumber.setText("");
    }//GEN-LAST:event_RadioButtonNormalActionPerformed

    private void RadioButtonEconomyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEconomyActionPerformed
        amountField.setText("₹  ");
        RoomNumber.setText("");
        this.room = "Economy";
        RadioButtonNormal.setSelected(false);
        RadioButtonVIP.setSelected(false);
    }//GEN-LAST:event_RadioButtonEconomyActionPerformed

    private void checkAmountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAmountButtonActionPerformed

        String roomType = this.room;
        String roomCap = this.capacity;

        String queryCheck = "SELECT * FROM `rooms` WHERE `roomType` = ? AND `bed`=? AND status=0";
        try {
            ps = connectDatabase.getConnection().prepareStatement(queryCheck);
            ps.setString(1, roomType);
            ps.setString(2, roomCap);
            rs = ps.executeQuery();

            if(rs.next()){
                this.Amount = Integer.parseInt(rs.getString("price"));
                int roomNumber = Integer.parseInt(rs.getString(1));

                String amountString = amountField.getText() + "  " + Integer.toString(Amount);
                amountField.setText(amountString);
                RoomNumber.setText(Integer.toString(roomNumber));
                checkInButton.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(this, "Sorry Room Not Available", "Not Available", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkAmountButtonActionPerformed

    private void checkInButtonActionPerformed(ActionEvent evt)  {//GEN-FIRST:event_checkInButtonActionPerformed
        try{


            String name = NameTextfield.getText();
            String PhoneNumber;


            String email = Email.getText();
            String Address = this.Address.getText();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd");
            String checkInDate = formatter.format(CheckInDate.getDate());


            int roomNumber = Integer.parseInt(RoomNumber.getText());

            String Phonenum = this.PhoneNumber.getText();

            if (name.trim().equals("") ||
                    Phonenum.trim().equals("") ||
                    email.trim().equals("") ||
                    Address.trim().equals("")||
                    checkInDate.trim().equals("")
            ){
                JOptionPane.showMessageDialog(rootPane, "All the Fields are Required For Check In!", "Empty Fields", 2);
            }else {

                PhoneNumber = Phonenum;
                String QueryAdd = "INSERT INTO `Current User`(`Name`, `Phone`, `Email`, `Room Number`, `Address`, `CheckIn`, `Bill Amount`) VALUES (?,?,?,?,?,?,?)";

                ps = connectDatabase.getConnection().prepareStatement(QueryAdd);
                ps.setString(1, name);
                ps.setString(2, PhoneNumber);
                ps.setString(3, email);
                ps.setInt(4, roomNumber);
                ps.setString(5, Address);
                ps.setString(6, checkInDate);
                ps.setInt(7, Amount);
                ps.executeUpdate();

                String queryUpdateRoom = "UPDATE `rooms` SET `status`=1 WHERE roomNumber=?";

                ps = connectDatabase.getConnection().prepareStatement(queryUpdateRoom);
                ps.setInt(1, roomNumber);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "Room Booked For " + name, "Room Booked", JOptionPane.INFORMATION_MESSAGE);
                this.Address.setText("");
                Email.setText("");
                NameTextfield.setText("");
                RoomNumber.setText("");
                amountField.setText("₹  ");
                this.PhoneNumber.setText("");
            }
            
        } catch(SQLException e){
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, e);
            
        }
    }//GEN-LAST:event_checkInButtonActionPerformed

    private void RadioButtonDoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonDoubleActionPerformed
        this.capacity = "Double";
        RadioButtonSingle.setSelected(false);
        RadioButtonTriple.setSelected(false);
        RoomNumber.setText("");
        amountField.setText("₹  ");
    }//GEN-LAST:event_RadioButtonDoubleActionPerformed

    private void RadioButtonSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonSingleActionPerformed
        this.capacity = "Single";
        RadioButtonTriple.setSelected(false);
        RadioButtonDouble.setSelected(false);
        RoomNumber.setText("");
        amountField.setText("₹  ");
    }//GEN-LAST:event_RadioButtonSingleActionPerformed

    private void RadioButtonTripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonTripleActionPerformed
        this.capacity = "Triple";
        RadioButtonSingle.setSelected(false);
        RadioButtonDouble.setSelected(false);
        RoomNumber.setText("");
        amountField.setText("₹  ");
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
    private javax.swing.JTextField Email;
    private javax.swing.JTextField NameTextfield;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JRadioButton RadioButtonDouble;
    private javax.swing.JRadioButton RadioButtonEconomy;
    private javax.swing.JRadioButton RadioButtonNormal;
    private javax.swing.JRadioButton RadioButtonSingle;
    private javax.swing.JRadioButton RadioButtonTriple;
    private javax.swing.JRadioButton RadioButtonVIP;
    private javax.swing.JTextField RoomNumber;
    private javax.swing.JTextField amountField;
    private javax.swing.JButton backToHome;
    private javax.swing.JButton checkAmountButton;
    private javax.swing.JButton checkInButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
