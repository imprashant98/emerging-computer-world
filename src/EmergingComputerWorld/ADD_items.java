/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmergingComputerWorld;

import java.awt.HeadlessException;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Prashant
 */
public class ADD_items extends javax.swing.JFrame {

    Connection con;
    Statement st;
    PreparedStatement pst = null;
    ResultSet rs;

    /**
     * Creates new form ADD_items
     */
    public ADD_items() {
        initComponents();
        setLocationRelativeTo(null);
        UserIdlabel.setText("User id:" + Manager.userId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        UpdateItemLabel = new javax.swing.JLabel();
        AddRemovePannel = new javax.swing.JPanel();
        addRadioButton = new javax.swing.JRadioButton();
        deleteRadioButton = new javax.swing.JRadioButton();
        SelectItemCombobox = new javax.swing.JComboBox<>();
        itemNum = new javax.swing.JSpinner();
        ResetButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        Back2InventoryButton = new javax.swing.JButton();
        UserIdlabel = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);

        UpdateItemLabel.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        UpdateItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateItemLabel.setText("UPDATE ITEMS");

        AddRemovePannel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choose to Add/Remove", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        AddRemovePannel.setToolTipText("");
        AddRemovePannel.setName(""); // NOI18N

        buttonGroup1.add(addRadioButton);
        addRadioButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addRadioButton.setSelected(true);
        addRadioButton.setText("Add");

        buttonGroup1.add(deleteRadioButton);
        deleteRadioButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deleteRadioButton.setText("Delete");

        javax.swing.GroupLayout AddRemovePannelLayout = new javax.swing.GroupLayout(AddRemovePannel);
        AddRemovePannel.setLayout(AddRemovePannelLayout);
        AddRemovePannelLayout.setHorizontalGroup(
            AddRemovePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddRemovePannelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(addRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(deleteRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        AddRemovePannelLayout.setVerticalGroup(
            AddRemovePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddRemovePannelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(AddRemovePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        SelectItemCombobox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SelectItemCombobox.setForeground(new java.awt.Color(255, 255, 255));
        SelectItemCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Select Item----", "Laptop", "Computer Accessories", "Computer Components", "Drives and Storage", "Printer", "Networking", "Notebook", "Desktops" }));
        SelectItemCombobox.setAutoscrolls(true);
       

        itemNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ResetButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmergingComputerWorld/Knob-Red-icon.png"))); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmergingComputerWorld/Knob-Refresh-icon.png"))); // NOI18N
        UpdateButton.setText("Update Data");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        Back2InventoryButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back2InventoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmergingComputerWorld/Knob-Fast-Rewind-icon.png"))); // NOI18N
        Back2InventoryButton.setText("Back To Inventory");
        Back2InventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2InventoryButtonActionPerformed(evt);
            }
        });

        UserIdlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmergingComputerWorld/guard.png"))); // NOI18N
        UserIdlabel.setText("UserId");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateItemLabel)
                .addGap(67, 67, 67)
                .addComponent(Back2InventoryButton))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UserIdlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(AddRemovePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(SelectItemCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(itemNum, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back2InventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateItemLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(AddRemovePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserIdlabel)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectItemCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemNum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        int hw = 0, qty = (Integer) itemNum.getValue();
        if (SelectItemCombobox.getSelectedItem() == "Laptop") {
            hw = 311;
        } else if (SelectItemCombobox.getSelectedItem() == "Computer Accessories") {
            hw = 312;
        } else if (SelectItemCombobox.getSelectedItem() == "Computer Components") {
            hw = 313;
        } else if (SelectItemCombobox.getSelectedItem() == "Drives and Storages") {
            hw = 314;
        } else if (SelectItemCombobox.getSelectedItem() == "Printers") {
            hw = 315;
        } else if (SelectItemCombobox.getSelectedItem() == "Networking") {
            hw = 316;
        } else if (SelectItemCombobox.getSelectedItem() == "Notebook") {
            hw = 317;
        } else if (SelectItemCombobox.getSelectedItem() == "Desktops") {
            hw = 318;
        }

        if (SelectItemCombobox.getSelectedItem() == "--Select Item--") {
            JOptionPane.showMessageDialog(null, "Select an item from list");
        } else {
            try {
                Class.forName("java.sql.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmanagement?&serverTimezone=UTC", "root", "");
                String sql;
                if (addRadioButton.isSelected()) {
                    sql = "update hwstock set quantity=quantity+" + qty + " where shopid=" + Manager.userId + " and hid=" + hw + ";";
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "Changes are made to the inventory");
                    new Inventory().setVisible(true);
                    setVisible(false);
                } else if (deleteRadioButton.isSelected()) {
                    sql = "select * from hwstock where shopid=" + Manager.userId + ";";
                    st = con.createStatement();
                    rs = st.executeQuery(sql);
                    rs.next();
                    int x = Integer.parseInt(rs.getString("quantity"));
                    if (x < qty) {
                        JOptionPane.showMessageDialog(this, "There are not enough items to be removed from stock");
                    } else {
                        sql = "update hwstock set quantity=quantity-" + qty + " where shopid=" + Manager.userId + " and hid=" + hw + ";";
                        Statement st1 = con.createStatement();
                        st1.executeUpdate(sql);
                        JOptionPane.showMessageDialog(this, "Changes are made to the inventory");
                        new Inventory().setVisible(true);
                        setVisible(false);
                    }
                }
            } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            // use popup menu instead of JOptionPane for button action/ any other successful actions
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void Back2InventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2InventoryButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "This will discard all chnages to inventory,Sure ?");
        switch (confirm) {
            case JOptionPane.YES_OPTION:
                new Inventory().setVisible(true);
                setVisible(false);
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(this, "Click on Update Button to see the changes in inventory");
                break;
        }
    }//GEN-LAST:event_Back2InventoryButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
        addRadioButton.setSelected(true);
        SelectItemCombobox.setSelectedIndex(0);
        itemNum.setValue(0);
    }//GEN-LAST:event_ResetButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddRemovePannel;
    private javax.swing.JButton Back2InventoryButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JComboBox<String> SelectItemCombobox;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel UpdateItemLabel;
    private javax.swing.JLabel UserIdlabel;
    private javax.swing.JRadioButton addRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton deleteRadioButton;
    private javax.swing.JSpinner itemNum;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
