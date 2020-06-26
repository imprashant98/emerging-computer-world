/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmergingComputerWorld;

import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author Prashant Karna
 */
public class Bill extends javax.swing.JFrame {

    //int userid;
     Connection con;
    Statement st;
    PreparedStatement pst = null;
    ResultSet rs;

    /**
     * Creates new form Bill
     */
    public Bill() {
        initComponents();
        setLocationRelativeTo(null);
          txtShopId.setText("" + Manager.userId);
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
        jLabel1 = new javax.swing.JLabel();
        GenerateButton = new javax.swing.JButton();
        DiscardButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CAcheckbox = new javax.swing.JCheckBox();
        laptopcheckbox = new javax.swing.JCheckBox();
        DScheckbox = new javax.swing.JCheckBox();
        jSpinner3 = new javax.swing.JSpinner();
        CCcheckbox = new javax.swing.JCheckBox();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        Printercheckbox = new javax.swing.JCheckBox();
        jSpinner4 = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        Networkingcheckbox = new javax.swing.JCheckBox();
        jSpinner6 = new javax.swing.JSpinner();
        Notebookcheckbox = new javax.swing.JCheckBox();
        jSpinner7 = new javax.swing.JSpinner();
        Desktopcheckbox = new javax.swing.JCheckBox();
        jSpinner8 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        ShopIdLabel = new javax.swing.JLabel();
        txtShopId = new javax.swing.JTextField();
        CustumerNameLabel = new javax.swing.JLabel();
        txtCustomerAddress = new javax.swing.JTextField();
        CustomerAddressLabel = new javax.swing.JLabel();
        txtAlternateContact = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        ContactNoLabel = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        AltContactLabel = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        BillingDateLabel = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmergingComputerWorld/invoice-icon.png"))); // NOI18N
        jLabel1.setText("Billing");

        GenerateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GenerateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmergingComputerWorld/Knob-Play-icon.png"))); // NOI18N
        GenerateButton.setText("Generate Bill");
        GenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateButtonActionPerformed(evt);
            }
        });

        DiscardButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DiscardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmergingComputerWorld/Knob-Cancel-icon.png"))); // NOI18N
        DiscardButton.setText("Discard Bill");
        DiscardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscardButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List of Items", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        CAcheckbox.setText("Computer Accessories");
        CAcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAcheckboxActionPerformed(evt);
            }
        });

        laptopcheckbox.setText("Laptop");
        laptopcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laptopcheckboxActionPerformed(evt);
            }
        });

        DScheckbox.setText("Drives and Storages");
        DScheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DScheckboxActionPerformed(evt);
            }
        });

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner3.setEnabled(false);

        CCcheckbox.setText("Computer Components");
        CCcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCcheckboxActionPerformed(evt);
            }
        });

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner2.setEnabled(false);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner1.setEnabled(false);

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner5.setEnabled(false);

        Printercheckbox.setText("Printers");
        Printercheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintercheckboxActionPerformed(evt);
            }
        });

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner4.setEnabled(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Networkingcheckbox.setText("Networking");
        Networkingcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkingcheckboxActionPerformed(evt);
            }
        });

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner6.setEnabled(false);

        Notebookcheckbox.setText("Notebook");
        Notebookcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotebookcheckboxActionPerformed(evt);
            }
        });

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner7.setEnabled(false);

        Desktopcheckbox.setText("Desktops");
        Desktopcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesktopcheckboxActionPerformed(evt);
            }
        });

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner8.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laptopcheckbox)
                    .addComponent(CAcheckbox)
                    .addComponent(CCcheckbox)
                    .addComponent(DScheckbox))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Printercheckbox)
                    .addComponent(Networkingcheckbox)
                    .addComponent(Notebookcheckbox)
                    .addComponent(Desktopcheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jSpinner6)
                    .addComponent(jSpinner5)
                    .addComponent(jSpinner8))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(laptopcheckbox)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Printercheckbox)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CAcheckbox)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CCcheckbox)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DScheckbox)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Networkingcheckbox)
                            .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Notebookcheckbox)
                            .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Desktopcheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
            .addComponent(jSeparator1)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        ShopIdLabel.setText("Shop ID:");

        txtShopId.setEditable(false);

        CustumerNameLabel.setText("Customer Name:");

        CustomerAddressLabel.setText("Customer Address:");

        EmailLabel.setText("Customer e-Mail ID:");

        ContactNoLabel.setText("Contact No.:");

        AltContactLabel.setText("Alternate Contact No.:");

        BillingDateLabel.setText("Billing Date");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AltContactLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ShopIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustumerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BillingDateLabel))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCustomerAddress)
                    .addComponent(txtCustomerName)
                    .addComponent(txtContactNo)
                    .addComponent(txtAlternateContact)
                    .addComponent(txtEmailId)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtShopId, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustumerNameLabel)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerAddressLabel))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactNoLabel))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlternateContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltContactLabel))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BillingDateLabel)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShopIdLabel)
                    .addComponent(txtShopId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(DiscardButton)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GenerateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DiscardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GenerateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateButtonActionPerformed
        // TODO add your handling code here:
        int[] quantityArray = new int[8], stkq = new int[8];
        int m = 1;
        String sql;
        if (dateChooser.getDate() == null
                || txtCustomerName.getText().equals("")
                || txtCustomerAddress.getText().equals("")
                || txtContactNo.getText().equals("")
                || txtAlternateContact.getText().equals("")
                || txtEmailId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill all Customer Details in Form");
        } else {

            try {
                Class.forName("java.sql.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmanagement?&serverTimezone=UTC", "root", "");
                sql = "select * from hwstock where shopid=" + Manager.userId + ";";
               st = con.createStatement();
                rs = st.executeQuery(sql);
                rs.next();
                for (int i = 0; i < 8; i++) {
                    stkq[i] = Integer.parseInt(rs.getString("quantity"));
                    rs.next();
                }
            } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            if (laptopcheckbox.isSelected() == true) {
                if (stkq[0] < (int) jSpinner1.getValue()) {
                    JOptionPane.showMessageDialog(null, "Only " + stkq[0] + " Laptops are present in stock");
                    jSpinner1.setValue(0);
                    m = 0;
                } else {
                    quantityArray[0] = (int) jSpinner1.getValue();
                    m = 1;
                }
            }
            if (CAcheckbox.isSelected() == true) {
                if (stkq[1] < (int) jSpinner2.getValue()) {
                    JOptionPane.showMessageDialog(null, "Only " + stkq[1] + " Computer Accessories are present in stock");
                    jSpinner2.setValue(0);
                    m = 0;
                } else {
                    quantityArray[1] = (int) jSpinner2.getValue();
                    m = 1;
                }
            }
            if (CCcheckbox.isSelected() == true) {
                if (stkq[2] < (int) jSpinner3.getValue()) {
                    JOptionPane.showMessageDialog(null, "Only " + stkq[2] + " Computer Components are present in stock");
                    jSpinner3.setValue(0);
                    m = 0;
                } else {
                    quantityArray[2] = (int) jSpinner3.getValue();
                    m = 1;
                }
            }
            if (DScheckbox.isSelected() == true) {
                if (stkq[3] < (int) jSpinner4.getValue()) {
                    JOptionPane.showMessageDialog(null, "Only " + stkq[3] + " Drives and Storages are present in stock");
                    jSpinner4.setValue(0);
                    m = 0;
                } else {
                    quantityArray[3] = (int) jSpinner4.getValue();
                    m = 1;
                }
            }
            if (Printercheckbox.isSelected() == true) {
                if (stkq[4] < (int) jSpinner5.getValue()) {
                    JOptionPane.showMessageDialog(null, "Only " + stkq[4] + " Printers are present in stock");
                    jSpinner5.setValue(0);
                    m = 0;
                } else {
                    quantityArray[4] = (int) jSpinner5.getValue();
                    m = 1;
                }
            }
            if (Networkingcheckbox.isSelected() == true) {
                if (stkq[5] < (int) jSpinner6.getValue()) {
                    JOptionPane.showMessageDialog(null, "Only " + stkq[5] + " Networking are present in stock");
                    jSpinner6.setValue(0);
                    m = 0;
                } else {
                    quantityArray[5] = (int) jSpinner6.getValue();
                    m = 1;
                }
            }
            if (Notebookcheckbox.isSelected() == true) {
                if (stkq[6] < (int) jSpinner7.getValue()) {
                    JOptionPane.showMessageDialog(null, "Only " + stkq[6] + " Notebooks are present in stock");
                    jSpinner7.setValue(0);
                    m = 0;
                } else {
                    quantityArray[6] = (int) jSpinner7.getValue();
                    m = 1;
                }
            }
            if (Desktopcheckbox.isSelected() == true) {
                if (stkq[7] < (int) jSpinner8.getValue()) {
                    JOptionPane.showMessageDialog(null, "Only " + stkq[7] + " Desktops are present in stock");
                    jSpinner8.setValue(0);
                    m = 0;
                } else {
                    quantityArray[7] = (int) jSpinner8.getValue();
                    m = 1;
                }
            }

            if (!(laptopcheckbox.isSelected() || CAcheckbox.isSelected()
                    || CCcheckbox.isSelected() || DScheckbox.isSelected()
                    || Printercheckbox.isSelected() || Networkingcheckbox.isSelected()
                    || Notebookcheckbox.isSelected() || Desktopcheckbox.isSelected())) {
                JOptionPane.showMessageDialog(null, "Select Items");
            } else if (m == 0) {
                JOptionPane.showMessageDialog(null, "Recheck Bill form");
            } else {
                String id, name, add, email, contact1, contact2, billdate;
                //  pst.setString(1,String.valueOf(user_id));
                name = txtCustomerName.getText();
                add = txtCustomerAddress.getText();
                contact1 = txtContactNo.getText();
                contact2 = txtAlternateContact.getText();
                email = txtEmailId.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                billdate = sdf.format(dateChooser.getDate());
                Receipt r = new Receipt(quantityArray, name, add, contact1, contact2, email, billdate);
                r.setVisible(true);
                setVisible(false);
            }
        }
    }//GEN-LAST:event_GenerateButtonActionPerformed

    private void laptopcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laptopcheckboxActionPerformed
        // TODO add your handling code here:
        if (laptopcheckbox.isSelected() == true) {
            jSpinner1.setEnabled(true);
        } else {
            jSpinner1.setEnabled(false);
            jSpinner1.setValue(0);
        }
    }//GEN-LAST:event_laptopcheckboxActionPerformed

    private void CAcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAcheckboxActionPerformed
        // TODO add your handling code here:
        if (CAcheckbox.isSelected() == true) {
            jSpinner2.setEnabled(true);
            jSpinner2.setValue(0);
        } else {
            jSpinner2.setEnabled(false);
            jSpinner2.setValue(0);
        }
    }//GEN-LAST:event_CAcheckboxActionPerformed

    private void CCcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCcheckboxActionPerformed
        // TODO add your handling code here:
        if (CCcheckbox.isSelected() == true) {
            jSpinner3.setEnabled(true);
        } else {
            jSpinner3.setEnabled(false);
            jSpinner3.setValue(0);
        }
    }//GEN-LAST:event_CCcheckboxActionPerformed

    private void PrintercheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintercheckboxActionPerformed
        // TODO add your handling code here:
        if (Printercheckbox.isSelected() == true) {
            jSpinner5.setEnabled(true);
        } else {
            jSpinner5.setEnabled(false);
            jSpinner5.setValue(0);
        }
    }//GEN-LAST:event_PrintercheckboxActionPerformed

    private void DScheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DScheckboxActionPerformed
        // TODO add your handling code here:
        if (DScheckbox.isSelected() == true) {
            jSpinner4.setEnabled(true);
        } else {
            jSpinner4.setEnabled(false);
            jSpinner4.setValue(0);
        }
    }//GEN-LAST:event_DScheckboxActionPerformed

    private void DiscardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscardButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure,you wan to discard this bill ?");
        switch (confirm) {
            case JOptionPane.YES_OPTION:
                Manager.getInstance().homeFrame.setVisible(true);
                setVisible(false);
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(this, "No changes is made to the bill details");
                break;
            //do nothing
            default:
                break;
        }

    }//GEN-LAST:event_DiscardButtonActionPerformed

    private void NotebookcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotebookcheckboxActionPerformed
        // TODO add your handling code here:
        if (Notebookcheckbox.isSelected() == true) {
            jSpinner7.setEnabled(true);
        } else {
            jSpinner7.setEnabled(false);
            jSpinner7.setValue(0);
        }
    }//GEN-LAST:event_NotebookcheckboxActionPerformed

    private void NetworkingcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkingcheckboxActionPerformed
        // TODO add your handling code here:
        if (Networkingcheckbox.isSelected() == true) {
            jSpinner6.setEnabled(true);
        } else {
            jSpinner6.setEnabled(false);
            jSpinner6.setValue(0);
        }
    }//GEN-LAST:event_NetworkingcheckboxActionPerformed

    private void DesktopcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesktopcheckboxActionPerformed
        // TODO add your handling code here:
        if (Desktopcheckbox.isSelected() == true) {
            jSpinner8.setEnabled(true);
        } else {
            jSpinner8.setEnabled(false);
            jSpinner8.setValue(0);
        }
    }//GEN-LAST:event_DesktopcheckboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AltContactLabel;
    private javax.swing.JLabel BillingDateLabel;
    private javax.swing.JCheckBox CAcheckbox;
    private javax.swing.JCheckBox CCcheckbox;
    private javax.swing.JLabel ContactNoLabel;
    private javax.swing.JLabel CustomerAddressLabel;
    private javax.swing.JLabel CustumerNameLabel;
    private javax.swing.JCheckBox DScheckbox;
    private javax.swing.JCheckBox Desktopcheckbox;
    private javax.swing.JButton DiscardButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JButton GenerateButton;
    private javax.swing.JCheckBox Networkingcheckbox;
    private javax.swing.JCheckBox Notebookcheckbox;
    private javax.swing.JCheckBox Printercheckbox;
    private javax.swing.JLabel ShopIdLabel;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JCheckBox laptopcheckbox;
    private javax.swing.JTextField txtAlternateContact;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtShopId;
    // End of variables declaration//GEN-END:variables
}
