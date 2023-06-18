/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sudoku_solver;

import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import static java.awt.Color.white;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;


/**
 *
 * @author HP
 */
public class sudokufile extends javax.swing.JFrame {

    private String turn="1";
    private boolean globalflag=true;
    private String solvedBoard [][]={
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"}
    };
    
    private void AssignTurn(JButton btn){
        SB1.setBackground(black);
        SB2.setBackground(black);
        SB3.setBackground(black);
        SB4.setBackground(black);
        SB5.setBackground(black);
        SB6.setBackground(black);
        SB7.setBackground(black);
        SB8.setBackground(black);
        SB9.setBackground(black);
        
        btn.setBackground(blue);     
    }
    
    private void ResetGame(){
        JButton predefinedbtns[] = {R2C2,R3C1,R3C3,R1C4,R2C5,R3C5,R1C7,R1C8,R1C9,R2C7,R5C3,R6C2,R4C5,R4C6,R6C4,R6C5,
                                    R4C8,R5C8,R5C7,R7C2,R8C1,R9C1,R9C2,R9C3,R7C5,R8C5,R9C6,R8C4,R7C7,R7C9,R8C9};
        
        JButton btns[][]={
            {R1C1,R1C2,R1C3,R1C4,R1C5,R1C6,R1C7,R1C8,R1C9},
            {R2C1,R2C2,R2C3,R2C4,R2C5,R2C6,R2C7,R2C8,R2C9},
            {R3C1,R3C2,R3C3,R3C4,R3C5,R3C6,R3C7,R3C8,R3C9},
            {R4C1,R4C2,R4C3,R4C4,R4C5,R4C6,R4C7,R4C8,R4C9},
            {R5C1,R5C2,R5C3,R5C4,R5C5,R5C6,R5C7,R5C8,R5C9},
            {R6C1,R6C2,R6C3,R6C4,R6C5,R6C6,R6C7,R6C8,R6C9},
            {R7C1,R7C2,R7C3,R7C4,R7C5,R7C6,R7C7,R7C8,R7C9},
            {R8C1,R8C2,R8C3,R8C4,R8C5,R8C6,R8C7,R8C8,R8C9},
            {R9C1,R9C2,R9C3,R9C4,R9C5,R9C6,R9C7,R9C8,R9C9},
        };
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                boolean flag=true;
                for(int k=0;k<predefinedbtns.length;k++){
                    if(btns[i][j]==predefinedbtns[k]) flag=false;
                }
                if(flag==true){
                    btns[i][j].setText("");
                    btns[i][j].setForeground(black);
                    btns[i][j].setBackground(white);
                    
                }
            }
        }
    }
    
    private void seeSolution(){
    JButton predefinedbtns[] = {R2C2,R3C1,R3C3,R1C4,R2C5,R3C5,R1C7,R1C8,R1C9,R2C7,R5C3,R6C2,R4C5,R4C6,R6C4,R6C5,
                                    R4C8,R5C8,R5C7,R7C2,R8C1,R9C1,R9C2,R9C3,R7C5,R8C5,R9C6,R8C4,R7C7,R7C9,R8C9};
        
        JButton btns[][]={
            {R1C1,R1C2,R1C3,R1C4,R1C5,R1C6,R1C7,R1C8,R1C9},
            {R2C1,R2C2,R2C3,R2C4,R2C5,R2C6,R2C7,R2C8,R2C9},
            {R3C1,R3C2,R3C3,R3C4,R3C5,R3C6,R3C7,R3C8,R3C9},
            {R4C1,R4C2,R4C3,R4C4,R4C5,R4C6,R4C7,R4C8,R4C9},
            {R5C1,R5C2,R5C3,R5C4,R5C5,R5C6,R5C7,R5C8,R5C9},
            {R6C1,R6C2,R6C3,R6C4,R6C5,R6C6,R6C7,R6C8,R6C9},
            {R7C1,R7C2,R7C3,R7C4,R7C5,R7C6,R7C7,R7C8,R7C9},
            {R8C1,R8C2,R8C3,R8C4,R8C5,R8C6,R8C7,R8C8,R8C9},
            {R9C1,R9C2,R9C3,R9C4,R9C5,R9C6,R9C7,R9C8,R9C9},
        };
        
       if(globalflag==true){
           globalflag=false;
           SOLUTIONB.setText("Hide Solution");
            for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                boolean flag=true;
                for(int k=0;k<predefinedbtns.length;k++){
                    if(btns[i][j]==predefinedbtns[k]) flag=false;
                }
                if(flag==true){
                    btns[i][j].setText(solvedBoard[i][j]);
                    btns[i][j].setForeground(black);
                    btns[i][j].setBackground(white);
                    
                }
            }
        }
       }
       else{
           SOLUTIONB.setText("Solution");
           globalflag=true;
           ResetGame();
       }
}
    
    private void checkmoves(){
        JButton btns[][]={
            {R1C1,R1C2,R1C3,R1C4,R1C5,R1C6,R1C7,R1C8,R1C9},
            {R2C1,R2C2,R2C3,R2C4,R2C5,R2C6,R2C7,R2C8,R2C9},
            {R3C1,R3C2,R3C3,R3C4,R3C5,R3C6,R3C7,R3C8,R3C9},
            {R4C1,R4C2,R4C3,R4C4,R4C5,R4C6,R4C7,R4C8,R4C9},
            {R5C1,R5C2,R5C3,R5C4,R5C5,R5C6,R5C7,R5C8,R5C9},
            {R6C1,R6C2,R6C3,R6C4,R6C5,R6C6,R6C7,R6C8,R6C9},
            {R7C1,R7C2,R7C3,R7C4,R7C5,R7C6,R7C7,R7C8,R7C9},
            {R8C1,R8C2,R8C3,R8C4,R8C5,R8C6,R8C7,R8C8,R8C9},
            {R9C1,R9C2,R9C3,R9C4,R9C5,R9C6,R9C7,R9C8,R9C9},
        };
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(btns[i][j].getText()!=solvedBoard[i][j] && btns[i][j].getText()!=""){
                    btns[i][j].setBackground(red);
                }
            }
        }
    }
    
    public sudokufile() {
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

        jPanel1 = new javax.swing.JPanel();
        R3C1 = new javax.swing.JButton();
        R3C3 = new javax.swing.JButton();
        R3C2 = new javax.swing.JButton();
        R2C1 = new javax.swing.JButton();
        R2C2 = new javax.swing.JButton();
        R2C3 = new javax.swing.JButton();
        R1C1 = new javax.swing.JButton();
        R1C2 = new javax.swing.JButton();
        R1C3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        R3C7 = new javax.swing.JButton();
        R3C9 = new javax.swing.JButton();
        R3C8 = new javax.swing.JButton();
        R2C7 = new javax.swing.JButton();
        R2C8 = new javax.swing.JButton();
        R2C9 = new javax.swing.JButton();
        R1C7 = new javax.swing.JButton();
        R1C8 = new javax.swing.JButton();
        R1C9 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        R3C4 = new javax.swing.JButton();
        R3C6 = new javax.swing.JButton();
        R3C5 = new javax.swing.JButton();
        R2C4 = new javax.swing.JButton();
        R2C5 = new javax.swing.JButton();
        R2C6 = new javax.swing.JButton();
        R1C4 = new javax.swing.JButton();
        R1C5 = new javax.swing.JButton();
        R1C6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        R6C1 = new javax.swing.JButton();
        R6C3 = new javax.swing.JButton();
        R6C2 = new javax.swing.JButton();
        R5C1 = new javax.swing.JButton();
        R5C2 = new javax.swing.JButton();
        R5C3 = new javax.swing.JButton();
        R4C1 = new javax.swing.JButton();
        R4C2 = new javax.swing.JButton();
        R4C3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        R6C4 = new javax.swing.JButton();
        R6C6 = new javax.swing.JButton();
        R6C5 = new javax.swing.JButton();
        R5C4 = new javax.swing.JButton();
        R5C5 = new javax.swing.JButton();
        R5C6 = new javax.swing.JButton();
        R4C4 = new javax.swing.JButton();
        R4C5 = new javax.swing.JButton();
        R4C6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        R6C7 = new javax.swing.JButton();
        R6C9 = new javax.swing.JButton();
        R6C8 = new javax.swing.JButton();
        R5C7 = new javax.swing.JButton();
        R5C8 = new javax.swing.JButton();
        R5C9 = new javax.swing.JButton();
        R4C7 = new javax.swing.JButton();
        R4C8 = new javax.swing.JButton();
        R4C9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        R9C1 = new javax.swing.JButton();
        R9C3 = new javax.swing.JButton();
        R9C2 = new javax.swing.JButton();
        R8C1 = new javax.swing.JButton();
        R8C2 = new javax.swing.JButton();
        R8C3 = new javax.swing.JButton();
        R7C1 = new javax.swing.JButton();
        R7C2 = new javax.swing.JButton();
        R7C3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        R9C4 = new javax.swing.JButton();
        R9C6 = new javax.swing.JButton();
        R9C5 = new javax.swing.JButton();
        R8C4 = new javax.swing.JButton();
        R8C5 = new javax.swing.JButton();
        R8C6 = new javax.swing.JButton();
        R7C4 = new javax.swing.JButton();
        R7C5 = new javax.swing.JButton();
        R7C6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        R9C7 = new javax.swing.JButton();
        R9C9 = new javax.swing.JButton();
        R9C8 = new javax.swing.JButton();
        R8C7 = new javax.swing.JButton();
        R8C8 = new javax.swing.JButton();
        R8C9 = new javax.swing.JButton();
        R7C7 = new javax.swing.JButton();
        R7C8 = new javax.swing.JButton();
        R7C9 = new javax.swing.JButton();
        SB1 = new javax.swing.JButton();
        SB2 = new javax.swing.JButton();
        SB3 = new javax.swing.JButton();
        SB4 = new javax.swing.JButton();
        SB5 = new javax.swing.JButton();
        SB6 = new javax.swing.JButton();
        SB7 = new javax.swing.JButton();
        SB8 = new javax.swing.JButton();
        SB9 = new javax.swing.JButton();
        RESETB = new javax.swing.JButton();
        EXITB = new javax.swing.JButton();
        SOLUTIONB = new javax.swing.JButton();
        CHECKMOVESB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R3C1.setBackground(new java.awt.Color(204, 204, 255));
        R3C1.setText("7");
        R3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C1(evt);
            }
        });

        R3C3.setBackground(new java.awt.Color(204, 204, 255));
        R3C3.setText("6");
        R3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C3(evt);
            }
        });

        R3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C2(evt);
            }
        });

        R2C1.setBackground(new java.awt.Color(204, 204, 255));
        R2C1.setText("4");
        R2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C1(evt);
            }
        });

        R2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C2(evt);
            }
        });

        R2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C3(evt);
            }
        });

        R1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C1(evt);
            }
        });

        R1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C2(evt);
            }
        });

        R1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C3(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(R1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(R2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(R3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R3C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C7(evt);
            }
        });

        R3C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C9(evt);
            }
        });

        R3C8.setBackground(new java.awt.Color(204, 204, 255));
        R3C8.setText("2");
        R3C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C8(evt);
            }
        });

        R2C7.setBackground(new java.awt.Color(204, 204, 255));
        R2C7.setText("5");
        R2C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C7(evt);
            }
        });

        R2C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C8(evt);
            }
        });

        R2C9.setBackground(new java.awt.Color(204, 204, 255));
        R2C9.setText("9");
        R2C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C9(evt);
            }
        });

        R1C7.setBackground(new java.awt.Color(204, 204, 255));
        R1C7.setText("7");
        R1C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C7(evt);
            }
        });

        R1C8.setBackground(new java.awt.Color(204, 204, 255));
        R1C8.setText("3");
        R1C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C8(evt);
            }
        });

        R1C9.setBackground(new java.awt.Color(204, 204, 255));
        R1C9.setText("4");
        R1C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C9(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(R1C7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R1C8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R1C9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(R2C7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R2C8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R2C9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(R3C7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R3C8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R3C9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R1C8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R1C9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(R1C7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2C7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3C7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R3C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C4(evt);
            }
        });

        R3C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C6(evt);
            }
        });

        R3C5.setBackground(new java.awt.Color(204, 204, 255));
        R3C5.setText("4");
        R3C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C5(evt);
            }
        });

        R2C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C4(evt);
            }
        });

        R2C5.setBackground(new java.awt.Color(204, 204, 255));
        R2C5.setText("7");
        R2C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C5(evt);
            }
        });

        R2C6.setBackground(new java.awt.Color(204, 204, 255));
        R2C6.setText("8");
        R2C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C6(evt);
            }
        });

        R1C4.setBackground(new java.awt.Color(204, 204, 255));
        R1C4.setText("5");
        R1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C4(evt);
            }
        });

        R1C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C5(evt);
            }
        });

        R1C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C6(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(R1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R1C6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(R2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R2C6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(R3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R3C6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R6C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C1(evt);
            }
        });

        R6C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C3(evt);
            }
        });

        R6C2.setBackground(new java.awt.Color(204, 204, 255));
        R6C2.setText("6");
        R6C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C2(evt);
            }
        });

        R5C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C1(evt);
            }
        });

        R5C2.setBackground(new java.awt.Color(204, 204, 255));
        R5C2.setText("3");
        R5C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C2(evt);
            }
        });

        R5C3.setBackground(new java.awt.Color(204, 204, 255));
        R5C3.setText("4");
        R5C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C3(evt);
            }
        });

        R4C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C1(evt);
            }
        });

        R4C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C2(evt);
            }
        });

        R4C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C3(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(R4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(R5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(R6C1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6C2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6C3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R6C1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R6C4.setBackground(new java.awt.Color(204, 204, 255));
        R6C4.setText("1");
        R6C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C4(evt);
            }
        });

        R6C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C6(evt);
            }
        });

        R6C5.setBackground(new java.awt.Color(204, 204, 255));
        R6C5.setText("8");
        R6C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C5(evt);
            }
        });

        R5C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C4(evt);
            }
        });

        R5C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C5(evt);
            }
        });

        R5C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C6(evt);
            }
        });

        R4C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C4(evt);
            }
        });

        R4C5.setBackground(new java.awt.Color(204, 204, 255));
        R4C5.setText("3");
        R4C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C5(evt);
            }
        });

        R4C6.setBackground(new java.awt.Color(204, 204, 255));
        R4C6.setText("5");
        R4C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C6(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(R4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R4C6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(R5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R5C6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(R6C4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6C5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6C6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R6C4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R6C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C7(evt);
            }
        });

        R6C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C9(evt);
            }
        });

        R6C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C8(evt);
            }
        });

        R5C7.setBackground(new java.awt.Color(204, 204, 255));
        R5C7.setText("2");
        R5C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C7(evt);
            }
        });

        R5C8.setBackground(new java.awt.Color(204, 204, 255));
        R5C8.setText("8");
        R5C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C8(evt);
            }
        });

        R5C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C9(evt);
            }
        });

        R4C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C7(evt);
            }
        });

        R4C8.setBackground(new java.awt.Color(204, 204, 255));
        R4C8.setText("9");
        R4C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C8(evt);
            }
        });

        R4C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C9(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(R4C7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R4C8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R4C9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(R5C7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R5C8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R5C9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(R6C7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6C8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6C9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5C7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R6C7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R9C1.setBackground(new java.awt.Color(204, 204, 255));
        R9C1.setText("6");
        R9C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C1(evt);
            }
        });

        R9C3.setBackground(new java.awt.Color(204, 204, 255));
        R9C3.setText("9");
        R9C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C3(evt);
            }
        });

        R9C2.setBackground(new java.awt.Color(204, 204, 255));
        R9C2.setText("8");
        R9C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C2(evt);
            }
        });

        R8C1.setBackground(new java.awt.Color(204, 204, 255));
        R8C1.setText("3");
        R8C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C1(evt);
            }
        });

        R8C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C2(evt);
            }
        });

        R8C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C3(evt);
            }
        });

        R7C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C1(evt);
            }
        });

        R7C2.setBackground(new java.awt.Color(204, 204, 255));
        R7C2.setText("4");
        R7C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C2(evt);
            }
        });

        R7C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C3(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(R7C1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R7C2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R7C3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(R8C1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R8C2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R8C3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(R9C1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R9C2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R9C3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R8C1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R9C1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R9C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C4(evt);
            }
        });

        R9C6.setBackground(new java.awt.Color(204, 204, 255));
        R9C6.setText("1");
        R9C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C6(evt);
            }
        });

        R9C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C5(evt);
            }
        });

        R8C4.setBackground(new java.awt.Color(204, 204, 255));
        R8C4.setText("9");
        R8C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C4(evt);
            }
        });

        R8C5.setBackground(new java.awt.Color(204, 204, 255));
        R8C5.setText("6");
        R8C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C5(evt);
            }
        });

        R8C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C6(evt);
            }
        });

        R7C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C4(evt);
            }
        });

        R7C5.setBackground(new java.awt.Color(204, 204, 255));
        R7C5.setText("5");
        R7C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C5(evt);
            }
        });

        R7C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C6(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(R7C4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R7C5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R7C6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(R8C4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R8C5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R8C6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(R9C4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R9C5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R9C6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R8C4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R9C4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R9C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C7(evt);
            }
        });

        R9C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C9(evt);
            }
        });

        R9C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C8(evt);
            }
        });

        R8C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C7(evt);
            }
        });

        R8C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C8(evt);
            }
        });

        R8C9.setBackground(new java.awt.Color(204, 204, 255));
        R8C9.setText("2");
        R8C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C9(evt);
            }
        });

        R7C7.setBackground(new java.awt.Color(204, 204, 255));
        R7C7.setText("9");
        R7C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C7(evt);
            }
        });

        R7C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C8(evt);
            }
        });

        R7C9.setBackground(new java.awt.Color(204, 204, 255));
        R7C9.setText("6");
        R7C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C9(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(R7C7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R7C8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R7C9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(R8C7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R8C8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R8C9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(R9C7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R9C8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R9C9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R8C7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R9C7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SB1.setBackground(new java.awt.Color(51, 51, 255));
        SB1.setForeground(new java.awt.Color(255, 255, 255));
        SB1.setText("1");
        SB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SB1(evt);
            }
        });

        SB2.setBackground(new java.awt.Color(0, 0, 0));
        SB2.setForeground(new java.awt.Color(255, 255, 255));
        SB2.setText("2");
        SB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SB2(evt);
            }
        });

        SB3.setBackground(new java.awt.Color(0, 0, 0));
        SB3.setForeground(new java.awt.Color(255, 255, 255));
        SB3.setText("3");
        SB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SB3(evt);
            }
        });

        SB4.setBackground(new java.awt.Color(0, 0, 0));
        SB4.setForeground(new java.awt.Color(255, 255, 255));
        SB4.setText("4");
        SB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SB4(evt);
            }
        });

        SB5.setBackground(new java.awt.Color(0, 0, 0));
        SB5.setForeground(new java.awt.Color(255, 255, 255));
        SB5.setText("5");
        SB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SB5(evt);
            }
        });

        SB6.setBackground(new java.awt.Color(0, 0, 0));
        SB6.setForeground(new java.awt.Color(255, 255, 255));
        SB6.setText("6");
        SB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SB6(evt);
            }
        });

        SB7.setBackground(new java.awt.Color(0, 0, 0));
        SB7.setForeground(new java.awt.Color(255, 255, 255));
        SB7.setText("7");
        SB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SB7(evt);
            }
        });

        SB8.setBackground(new java.awt.Color(0, 0, 0));
        SB8.setForeground(new java.awt.Color(255, 255, 255));
        SB8.setText("8");
        SB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SB8(evt);
            }
        });

        SB9.setBackground(new java.awt.Color(0, 0, 0));
        SB9.setForeground(new java.awt.Color(255, 255, 255));
        SB9.setText("9");
        SB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SB9(evt);
            }
        });

        RESETB.setBackground(new java.awt.Color(204, 204, 255));
        RESETB.setText("RESET");
        RESETB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETBActionPerformed(evt);
            }
        });

        EXITB.setBackground(new java.awt.Color(255, 51, 51));
        EXITB.setText("EXIT");
        EXITB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBActionPerformed(evt);
            }
        });

        SOLUTIONB.setBackground(new java.awt.Color(0, 255, 0));
        SOLUTIONB.setText("SOLUTION");
        SOLUTIONB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOLUTIONB(evt);
            }
        });

        CHECKMOVESB.setBackground(new java.awt.Color(255, 255, 0));
        CHECKMOVESB.setText("CHECK MOVES");
        CHECKMOVESB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKMOVES(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(SB1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SB2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SB3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(EXITB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(SOLUTIONB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(RESETB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(SB4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SB5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SB6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(CHECKMOVESB, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(SB7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(SB8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(SB9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SB1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SB2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SB3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SB4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SB5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SB6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SB7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SB8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SB9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RESETB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EXITB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SOLUTIONB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHECKMOVESB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    private void RESETBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETBActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Reset");
        if(JOptionPane.showConfirmDialog(frame, "Cinfirm if you want to reset the game", "sudoku puzzle", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
        ResetGame();
    }//GEN-LAST:event_RESETBActionPerformed

    private void EXITBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Reset");
        if(JOptionPane.showConfirmDialog(frame, "Cinfirm if you want to Exit the game", "sudoku puzzle", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
        System.exit(0);
    }//GEN-LAST:event_EXITBActionPerformed

    private void SB1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SB1
        // TODO add your handling code here:
        AssignTurn(SB1);
       turn="1";
    }//GEN-LAST:event_SB1

    private void SB2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SB2
        // TODO add your handling code here:
         AssignTurn(SB2);
       turn="2";
    }//GEN-LAST:event_SB2

    private void SB3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SB3
        // TODO add your handling code here:
        AssignTurn(SB3);
       turn="3";
    }//GEN-LAST:event_SB3

    private void SB4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SB4
        // TODO add your handling code here:
        AssignTurn(SB4);
       turn="4";
    }//GEN-LAST:event_SB4

    private void SB5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SB5
        // TODO add your handling code here:
        AssignTurn(SB5);
       turn="5";
    }//GEN-LAST:event_SB5

    private void SB6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SB6
        // TODO add your handling code here:
        AssignTurn(SB6);
       turn="6";
    }//GEN-LAST:event_SB6

    private void SB7(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SB7
        // TODO add your handling code here:
        AssignTurn(SB7);
       turn="7";
    }//GEN-LAST:event_SB7

    private void SB8(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SB8
        // TODO add your handling code here:
        AssignTurn(SB8);
       turn="8";
    }//GEN-LAST:event_SB8

    private void SB9(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SB9
        // TODO add your handling code here:
        AssignTurn(SB9);
       turn="9";
    }//GEN-LAST:event_SB9

    private void R1C1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C1
        // TODO add your handling code here:
         R1C1.setText(turn);
        R1C1.setBackground(white);
    }//GEN-LAST:event_R1C1

    private void R1C2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C2
        // TODO add your handling code here:
         R1C2.setText(turn);
        R1C2.setBackground(white);
    }//GEN-LAST:event_R1C2

    private void R1C3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C3
        // TODO add your handling code here:
         R1C3.setText(turn);
        R1C3.setBackground(white);
    }//GEN-LAST:event_R1C3

    private void R1C4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C4
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C4

    private void R1C5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C5
        // TODO add your handling code here:
         R1C5.setText(turn);
        R1C5.setBackground(white);
    }//GEN-LAST:event_R1C5

    private void R1C6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C6
        // TODO add your handling code here:
         R1C6.setText(turn);
        R1C6.setBackground(white);
    }//GEN-LAST:event_R1C6

    private void R1C7(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C7
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C7

    private void R1C8(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C8
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C8

    private void R1C9(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C9
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C9

    private void R2C1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C1
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C1

    private void R2C2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C2
        // TODO add your handling code here:
         R2C2.setText(turn);
        R2C2.setBackground(white);
    }//GEN-LAST:event_R2C2

    private void R2C3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C3
        // TODO add your handling code here:
        R2C3.setText(turn);
        R2C3.setBackground(white);
    }//GEN-LAST:event_R2C3

    private void R2C4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C4
        // TODO add your handling code here:
        R2C4.setText(turn);
        R2C4.setBackground(white);
    }//GEN-LAST:event_R2C4

    private void R2C5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C5
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C5

    private void R2C6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C6
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C6

    private void R2C7(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C7
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C7

    private void R2C8(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C8
        // TODO add your handling code here:
        R2C8.setText(turn);
        R2C8.setBackground(white);
    }//GEN-LAST:event_R2C8

    private void R2C9(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C9
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C9

    private void R3C1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C1
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C1

    private void R3C2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C2
        // TODO add your handling code here:
        R3C2.setText(turn);
        R3C2.setBackground(white);
    }//GEN-LAST:event_R3C2

    private void R3C3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C3
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C3

    private void R3C4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C4
        // TODO add your handling code here:
        R3C4.setText(turn);
        R3C4.setBackground(white);
    }//GEN-LAST:event_R3C4

    private void R3C5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C5
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C5

    private void R3C6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C6
        // TODO add your handling code here:
        R3C6.setText(turn);
        R3C6.setBackground(white);
    }//GEN-LAST:event_R3C6

    private void R3C7(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C7
        // TODO add your handling code here:
        R3C7.setText(turn);
        R3C7.setBackground(white);
    }//GEN-LAST:event_R3C7

    private void R3C8(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C8
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C8

    private void R3C9(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C9
        // TODO add your handling code here:
        R3C9.setText(turn);
        R3C9.setBackground(white);
    }//GEN-LAST:event_R3C9

    private void R4C1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C1
        // TODO add your handling code here:
        R4C1.setText(turn);
        R4C1.setBackground(white);
    }//GEN-LAST:event_R4C1

    private void R4C2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C2
        // TODO add your handling code here:
        R4C2.setText(turn);
        R4C2.setBackground(white);
    }//GEN-LAST:event_R4C2

    private void R4C3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C3
        // TODO add your handling code here:
        R4C3.setText(turn);
        R4C3.setBackground(white);
    }//GEN-LAST:event_R4C3

    private void R4C4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C4
        // TODO add your handling code here:
        R4C4.setText(turn);
        R4C4.setBackground(white);
    }//GEN-LAST:event_R4C4

    private void R4C5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C5
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R4C5

    private void R4C6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C6
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R4C6

    private void R4C7(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C7
        // TODO add your handling code here:
        R4C7.setText(turn);
        R4C7.setBackground(white);
    }//GEN-LAST:event_R4C7

    private void R4C8(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C8
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R4C8

    private void R4C9(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C9
        // TODO add your handling code here:
        R4C9.setText(turn);
        R4C9.setBackground(white);
    }//GEN-LAST:event_R4C9

    private void R5C1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C1
        // TODO add your handling code here:
        R5C1.setText(turn);
        R5C1.setBackground(white);
    }//GEN-LAST:event_R5C1

    private void R5C2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C2
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C2

    private void R5C3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C3
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C3

    private void R5C4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C4
        // TODO add your handling code here:
        R5C4.setText(turn);
        R5C4.setBackground(white);
    }//GEN-LAST:event_R5C4

    private void R5C5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C5
        // TODO add your handling code here:
        R5C5.setText(turn);
        R5C5.setBackground(white);
    }//GEN-LAST:event_R5C5

    private void R5C6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C6
        // TODO add your handling code here:
        R5C6.setText(turn);
        R5C6.setBackground(white);
    }//GEN-LAST:event_R5C6

    private void R5C7(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C7
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C7

    private void R5C8(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C8
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C8

    private void R5C9(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C9
        // TODO add your handling code here:
        R5C9.setText(turn);
        R5C9.setBackground(white);
    }//GEN-LAST:event_R5C9

    private void R6C1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C1
        // TODO add your handling code here:
        R6C1.setText(turn);
        R6C1.setBackground(white);
    }//GEN-LAST:event_R6C1

    private void R6C2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C2
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R6C2

    private void R6C3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C3
        // TODO add your handling code here:
        R6C3.setText(turn);
        R6C3.setBackground(white);
    }//GEN-LAST:event_R6C3

    private void R6C4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C4
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R6C4

    private void R6C5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C5
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R6C5

    private void R6C6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C6
        // TODO add your handling code here:
        R6C6.setText(turn);
        R6C6.setBackground(white);
    }//GEN-LAST:event_R6C6

    private void R6C7(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C7
        // TODO add your handling code here:
        R6C7.setText(turn);
        R6C7.setBackground(white);
    }//GEN-LAST:event_R6C7

    private void R6C8(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C8
        // TODO add your handling code here:
        R6C8.setText(turn);
        R6C8.setBackground(white);
    }//GEN-LAST:event_R6C8

    private void R6C9(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C9
        // TODO add your handling code here:
        R6C9.setText(turn);
        R6C9.setBackground(white);
    }//GEN-LAST:event_R6C9

    private void R7C1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C1
        // TODO add your handling code here:
        R7C1.setText(turn);
        R7C1.setBackground(white);
    }//GEN-LAST:event_R7C1

    private void R7C2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C2
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C2

    private void R7C3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C3
        // TODO add your handling code here:
        R7C3.setText(turn);
        R7C3.setBackground(white);
    }//GEN-LAST:event_R7C3

    private void R7C4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C4
        // TODO add your handling code here:
        R7C4.setText(turn);
        R7C4.setBackground(white);
    }//GEN-LAST:event_R7C4

    private void R7C5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C5
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C5

    private void R7C6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C6
        // TODO add your handling code here:
        R7C6.setText(turn);
        R7C6.setBackground(white);
    }//GEN-LAST:event_R7C6

    private void R7C7(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C7
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C7

    private void R7C8(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C8
        // TODO add your handling code here:
        R7C8.setText(turn);
        R7C8.setBackground(white);
    }//GEN-LAST:event_R7C8

    private void R7C9(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C9
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C9

    private void R8C1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C1
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C1

    private void R8C2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C2
        // TODO add your handling code here:
        R8C2.setText(turn);
        R8C2.setBackground(white);
    }//GEN-LAST:event_R8C2

    private void R8C3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C3
        // TODO add your handling code here:
        R8C3.setText(turn);
        R8C3.setBackground(white);
    }//GEN-LAST:event_R8C3

    private void R8C4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C4
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C4

    private void R8C5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C5
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C5

    private void R8C6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C6
        // TODO add your handling code here:
        R8C6.setText(turn);
        R8C6.setBackground(white);
    }//GEN-LAST:event_R8C6

    private void R8C7(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C7
        // TODO add your handling code here:
        R8C7.setText(turn);
        R8C7.setBackground(white);
    }//GEN-LAST:event_R8C7

    private void R8C8(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C8
        // TODO add your handling code here:
        R8C8.setText(turn);
        R8C8.setBackground(white);
    }//GEN-LAST:event_R8C8

    private void R8C9(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C9
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C9

    private void R9C1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C1
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C1

    private void R9C2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C2
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C2

    private void R9C3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C3
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C3

    private void R9C4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C4
        // TODO add your handling code here:
        R9C4.setText(turn);
        R9C4.setBackground(white);
    }//GEN-LAST:event_R9C4

    private void R9C5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C5
        // TODO add your handling code here:
        R9C5.setText(turn);
        R9C5.setBackground(white);
    }//GEN-LAST:event_R9C5

    private void R9C6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C6
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C6

    private void R9C7(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C7
        // TODO add your handling code here:
        R9C7.setText(turn);
        R9C7.setBackground(white);
    }//GEN-LAST:event_R9C7

    private void R9C8(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C8
        // TODO add your handling code here:
        R9C8.setText(turn);
        R9C8.setBackground(white);
    }//GEN-LAST:event_R9C8

    private void R9C9(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C9
        // TODO add your handling code here:
        R9C9.setText(turn);
        R9C9.setBackground(white);
    }//GEN-LAST:event_R9C9

    private void SOLUTIONB(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOLUTIONB
        // TODO add your handling code here:
        seeSolution();
    }//GEN-LAST:event_SOLUTIONB

    private void CHECKMOVES(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKMOVES
        // TODO add your handling code here:
        checkmoves();
    }//GEN-LAST:event_CHECKMOVES

    
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
            java.util.logging.Logger.getLogger(sudokufile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sudokufile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sudokufile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sudokufile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sudokufile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHECKMOVESB;
    private javax.swing.JButton EXITB;
    private javax.swing.JButton R1C1;
    private javax.swing.JButton R1C2;
    private javax.swing.JButton R1C3;
    private javax.swing.JButton R1C4;
    private javax.swing.JButton R1C5;
    private javax.swing.JButton R1C6;
    private javax.swing.JButton R1C7;
    private javax.swing.JButton R1C8;
    private javax.swing.JButton R1C9;
    private javax.swing.JButton R2C1;
    private javax.swing.JButton R2C2;
    private javax.swing.JButton R2C3;
    private javax.swing.JButton R2C4;
    private javax.swing.JButton R2C5;
    private javax.swing.JButton R2C6;
    private javax.swing.JButton R2C7;
    private javax.swing.JButton R2C8;
    private javax.swing.JButton R2C9;
    private javax.swing.JButton R3C1;
    private javax.swing.JButton R3C2;
    private javax.swing.JButton R3C3;
    private javax.swing.JButton R3C4;
    private javax.swing.JButton R3C5;
    private javax.swing.JButton R3C6;
    private javax.swing.JButton R3C7;
    private javax.swing.JButton R3C8;
    private javax.swing.JButton R3C9;
    private javax.swing.JButton R4C1;
    private javax.swing.JButton R4C2;
    private javax.swing.JButton R4C3;
    private javax.swing.JButton R4C4;
    private javax.swing.JButton R4C5;
    private javax.swing.JButton R4C6;
    private javax.swing.JButton R4C7;
    private javax.swing.JButton R4C8;
    private javax.swing.JButton R4C9;
    private javax.swing.JButton R5C1;
    private javax.swing.JButton R5C2;
    private javax.swing.JButton R5C3;
    private javax.swing.JButton R5C4;
    private javax.swing.JButton R5C5;
    private javax.swing.JButton R5C6;
    private javax.swing.JButton R5C7;
    private javax.swing.JButton R5C8;
    private javax.swing.JButton R5C9;
    private javax.swing.JButton R6C1;
    private javax.swing.JButton R6C2;
    private javax.swing.JButton R6C3;
    private javax.swing.JButton R6C4;
    private javax.swing.JButton R6C5;
    private javax.swing.JButton R6C6;
    private javax.swing.JButton R6C7;
    private javax.swing.JButton R6C8;
    private javax.swing.JButton R6C9;
    private javax.swing.JButton R7C1;
    private javax.swing.JButton R7C2;
    private javax.swing.JButton R7C3;
    private javax.swing.JButton R7C4;
    private javax.swing.JButton R7C5;
    private javax.swing.JButton R7C6;
    private javax.swing.JButton R7C7;
    private javax.swing.JButton R7C8;
    private javax.swing.JButton R7C9;
    private javax.swing.JButton R8C1;
    private javax.swing.JButton R8C2;
    private javax.swing.JButton R8C3;
    private javax.swing.JButton R8C4;
    private javax.swing.JButton R8C5;
    private javax.swing.JButton R8C6;
    private javax.swing.JButton R8C7;
    private javax.swing.JButton R8C8;
    private javax.swing.JButton R8C9;
    private javax.swing.JButton R9C1;
    private javax.swing.JButton R9C2;
    private javax.swing.JButton R9C3;
    private javax.swing.JButton R9C4;
    private javax.swing.JButton R9C5;
    private javax.swing.JButton R9C6;
    private javax.swing.JButton R9C7;
    private javax.swing.JButton R9C8;
    private javax.swing.JButton R9C9;
    private javax.swing.JButton RESETB;
    private javax.swing.JButton SB1;
    private javax.swing.JButton SB2;
    private javax.swing.JButton SB3;
    private javax.swing.JButton SB4;
    private javax.swing.JButton SB5;
    private javax.swing.JButton SB6;
    private javax.swing.JButton SB7;
    private javax.swing.JButton SB8;
    private javax.swing.JButton SB9;
    private javax.swing.JButton SOLUTIONB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
