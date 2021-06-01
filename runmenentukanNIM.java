package com.company;

import javax.swing.*;

public class runmenentukanNIM {
    public static void main(String[] args) {
        JFrame jFrame= new JFrame(" masukandata");
        jFrame.setContentPane( new menentukanNIM().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(600, 500 );
        jFrame.setVisible(true);

    }
}
