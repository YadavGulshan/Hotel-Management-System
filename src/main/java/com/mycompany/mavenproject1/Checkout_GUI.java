package com.mycompany.mavenproject1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Checkout_GUI extends JFrame {


    public Checkout_GUI(String title){
        super(title);
        initComponents();

    }

    private void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        mainPanel.setPreferredSize(new Dimension(900,540));

        backToHome.addActionListener((ActionEvent actionEvent) -> {
            dispose();
            Login_Form loginForm = new Login_Form();
            loginForm.setVisible(true);
            loginForm.setLocationRelativeTo(null);
        });

    }

    private JPanel mainPanel;
    private JButton backToHome;

    public static void main(String[] args) {
        JFrame frame = new Checkout_GUI("Check Out");
        frame.setVisible(true);
    }
}
