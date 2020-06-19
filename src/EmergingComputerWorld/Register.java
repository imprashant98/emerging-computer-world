/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmergingComputerWorld;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Prashant
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewAccountLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        ShopDetailsPannel = new javax.swing.JPanel();
        ShopNameLabel = new javax.swing.JLabel();
        ShopPh1Label = new javax.swing.JLabel();
        txtUserid = new javax.swing.JTextField();
        ShopPh2Label = new javax.swing.JLabel();
        ConfirmPWLabel = new javax.swing.JLabel();
        txtShopAddress = new javax.swing.JTextField();
        PWlabel = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        emailLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        UserIdLabel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtShopPhone1 = new javax.swing.JTextField();
        txtShopName = new javax.swing.JTextField();
        txtShopphone2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        StockDetailPannel = new javax.swing.JPanel();
        laplabel = new javax.swing.JLabel();
        LapNum = new javax.swing.JSpinner();
        CAlabel = new javax.swing.JLabel();
        CAnum = new javax.swing.JSpinner();
        CCnum = new javax.swing.JSpinner();
        CClabel = new javax.swing.JLabel();
        DSlabel = new javax.swing.JLabel();
        DSnum = new javax.swing.JSpinner();
        Desklabel = new javax.swing.JLabel();
        desktopnum = new javax.swing.JSpinner();
        PrinterLabel = new javax.swing.JLabel();
        PrinterNum = new javax.swing.JSpinner();
        NetworkingLabel = new javax.swing.JLabel();
        NetworkingNum = new javax.swing.JSpinner();
        Notebooknum = new javax.swing.JSpinner();
        Notebooklabel = new javax.swing.JLabel();
        CreateAccountButton = new javax.swing.JButton();

        setUndecorated(true);

        NewAccountLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NewAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewAccountLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmergingComputerWorld/3DMouse.png"))); // NOI18N
        NewAccountLabel.setText("New Account");

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmergingComputerWorld/Knob-Fast-Rewind-icon.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ShopDetailsPannel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Shop Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        ShopNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShopNameLabel.setText("Shop Name :");

        ShopPh1Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShopPh1Label.setText("Shop phone No.1");

        ShopPh2Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShopPh2Label.setText("Shop phone No.2");

        ConfirmPWLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ConfirmPWLabel.setText("Confirm Password :");

        PWlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PWlabel.setText("Password :");

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailLabel.setText("Shop eMail-ID : ");

        AddressLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddressLabel.setText("Shop Address :");

        UserIdLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserIdLabel.setText("User ID :");

        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShopDetailsPannelLayout = new javax.swing.GroupLayout(ShopDetailsPannel);
        ShopDetailsPannel.setLayout(ShopDetailsPannelLayout);
        ShopDetailsPannelLayout.setHorizontalGroup(
            ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShopDetailsPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShopDetailsPannelLayout.createSequentialGroup()
                        .addGroup(ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel)
                            .addComponent(PWlabel)
                            .addComponent(ConfirmPWLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpassword)
                            .addComponent(txtEmail)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShopDetailsPannelLayout.createSequentialGroup()
                        .addComponent(ShopPh2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtShopphone2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShopDetailsPannelLayout.createSequentialGroup()
                        .addComponent(UserIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShopDetailsPannelLayout.createSequentialGroup()
                        .addComponent(ShopNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShopDetailsPannelLayout.createSequentialGroup()
                        .addComponent(AddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtShopAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShopDetailsPannelLayout.createSequentialGroup()
                        .addComponent(ShopPh1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtShopPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        ShopDetailsPannelLayout.setVerticalGroup(
            ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShopDetailsPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserIdLabel)
                    .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShopNameLabel)
                    .addComponent(txtShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressLabel)
                    .addComponent(txtShopAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShopPh1Label)
                    .addComponent(txtShopPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShopPh2Label)
                    .addComponent(txtShopphone2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PWlabel)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(ShopDetailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmPWLabel)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        StockDetailPannel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        laplabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        laplabel.setText("Laptop");

        LapNum.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        CAlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CAlabel.setText("Computer Accessories");

        CAnum.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        CCnum.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        CClabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CClabel.setText("Computer Components");

        DSlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DSlabel.setText("Drives and Storages");

        DSnum.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        Desklabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Desklabel.setText("Desktops");

        desktopnum.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        PrinterLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrinterLabel.setText("Printers");

        PrinterNum.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        NetworkingLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NetworkingLabel.setText("Networking");

        NetworkingNum.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        Notebooknum.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        Notebooklabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Notebooklabel.setText("Notebook");

        javax.swing.GroupLayout StockDetailPannelLayout = new javax.swing.GroupLayout(StockDetailPannel);
        StockDetailPannel.setLayout(StockDetailPannelLayout);
        StockDetailPannelLayout.setHorizontalGroup(
            StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockDetailPannelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StockDetailPannelLayout.createSequentialGroup()
                        .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StockDetailPannelLayout.createSequentialGroup()
                                .addComponent(CAlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23))
                            .addGroup(StockDetailPannelLayout.createSequentialGroup()
                                .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(laplabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DSlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CClabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LapNum)
                            .addComponent(CAnum)
                            .addComponent(DSnum)
                            .addComponent(CCnum)))
                    .addGroup(StockDetailPannelLayout.createSequentialGroup()
                        .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NetworkingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrinterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Notebooklabel)
                            .addComponent(Desklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117)
                        .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desktopnum, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(Notebooknum)
                            .addComponent(PrinterNum)
                            .addComponent(NetworkingNum))))
                .addContainerGap())
        );
        StockDetailPannelLayout.setVerticalGroup(
            StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockDetailPannelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laplabel)
                    .addComponent(LapNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAlabel)
                    .addComponent(CAnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CClabel)
                    .addComponent(CCnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DSlabel)
                    .addComponent(DSnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrinterLabel)
                    .addComponent(PrinterNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkingLabel)
                    .addComponent(NetworkingNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Notebooklabel)
                    .addComponent(Notebooknum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(StockDetailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Desklabel)
                    .addComponent(desktopnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CreateAccountButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CreateAccountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmergingComputerWorld/Create-New-icon.png"))); // NOI18N
        CreateAccountButton.setText("Create Account");
        CreateAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountButtonActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(NewAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ShopDetailsPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(StockDetailPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CreateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShopDetailsPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StockDetailPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(CreateAccountButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to EXIT?");
        switch (confirm) {
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Then, Click on Create Button");
                break;
            case JOptionPane.YES_OPTION:
          
                Manager.getInstance().loginFrame.setVisible(true);
                setVisible(false);
                break;
        }

    }//GEN-LAST:event_BackButtonActionPerformed

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void CreateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountButtonActionPerformed
        // TODO add your handling code here:
        if (txtUserid.getText().equals("") || txtShopName.getText().equals("") || 
                txtShopAddress.getText().equals("") || txtShopPhone1.getText().equals("") || 
                txtShopphone2.getText().equals("") || txtEmail.getText().equals("") || 
                txtpassword.getPassword() == null || txtConfirmPassword.getPassword() == null) {
            JOptionPane.showMessageDialog(null, "Fill all the details of form");
        } else if (txtpassword.getPassword() != txtConfirmPassword.getPassword()) {
            JOptionPane.showMessageDialog(null, "Passwords Don`t Match");
        } else {
            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmanagement?&serverTimezone=UTC", "root", "");
                int sid, q[] = new int[8];
                String pass, sql, sql1, sql2, name, add, email, contact1, contact2;
                
                sid = Integer.parseInt(txtUserid.getText());
                name = txtShopName.getText();
                add = txtShopAddress.getText();
                contact1 = txtShopphone2.getText();
                contact2 = txtShopphone2.getText();
                email = txtEmail.getText();
                pass = new String(txtpassword.getPassword());
                
                sql = "insert into shop values(" + sid + ",'" + name + "','" + add + "','" + contact1 + "','" + contact2 + "','" + email + "');";
                Statement st = con.createStatement();
                st.executeUpdate(sql);
                
                q[0] = (int) LapNum.getValue();
                q[1] = (int) CAnum.getValue();
                q[2] = (int) CCnum.getValue();
                q[3] = (int) DSnum.getValue();
                q[4] = (int) desktopnum.getValue();
                q[5] = (int) PrinterNum.getValue();
                q[6] = (int) NetworkingNum.getValue();
                q[7] = (int) Notebooknum.getValue();
                sql2 = "insert into credentials values(" + sid + ",'" + pass + "');";
                Statement st2 = con.createStatement();
                st2.executeUpdate(sql2);
                for (int i = 0, hd = 311; i < 8 && hd <= 318; hd++, i++) {
                    sql1 = "insert into hwstock values(" + sid + "," + hd + "," + q[i] + ");";
                    Statement st1 = con.createStatement();
                    st1.executeUpdate(sql1);
                }
                Manager.getInstance().loginFrame.setVisible(true);
                setVisible(false);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "ID must be NUMERIC");
            } catch (ClassNotFoundException | SQLException e1) {
                JOptionPane.showMessageDialog(null, e1.getMessage());
            }
        }

    }//GEN-LAST:event_CreateAccountButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel CAlabel;
    private javax.swing.JSpinner CAnum;
    private javax.swing.JLabel CClabel;
    private javax.swing.JSpinner CCnum;
    private javax.swing.JLabel ConfirmPWLabel;
    private javax.swing.JButton CreateAccountButton;
    private javax.swing.JLabel DSlabel;
    private javax.swing.JSpinner DSnum;
    private javax.swing.JLabel Desklabel;
    private javax.swing.JSpinner LapNum;
    private javax.swing.JLabel NetworkingLabel;
    private javax.swing.JSpinner NetworkingNum;
    private javax.swing.JLabel NewAccountLabel;
    private javax.swing.JLabel Notebooklabel;
    private javax.swing.JSpinner Notebooknum;
    private javax.swing.JLabel PWlabel;
    private javax.swing.JLabel PrinterLabel;
    private javax.swing.JSpinner PrinterNum;
    private javax.swing.JPanel ShopDetailsPannel;
    private javax.swing.JLabel ShopNameLabel;
    private javax.swing.JLabel ShopPh1Label;
    private javax.swing.JLabel ShopPh2Label;
    private javax.swing.JPanel StockDetailPannel;
    private javax.swing.JLabel UserIdLabel;
    private javax.swing.JSpinner desktopnum;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel laplabel;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtShopAddress;
    private javax.swing.JTextField txtShopName;
    private javax.swing.JTextField txtShopPhone1;
    private javax.swing.JTextField txtShopphone2;
    private javax.swing.JTextField txtUserid;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
