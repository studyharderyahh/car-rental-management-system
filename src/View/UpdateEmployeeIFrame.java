/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Model.Employee;
import Model.Role;
import javax.swing.JOptionPane;

/* * * * * * * * * 
 * @author Elisa *
 * @ID 220005803 * 
 * * * * * * * * */
public class UpdateEmployeeIFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdateEmployeeIFrame
     */
    public UpdateEmployeeIFrame() {
        initComponents();
        EmployeePanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchButton = new javax.swing.JButton();
        EmployeePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        dateOfBirthTextField = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        phoneExtnNoTextField = new javax.swing.JTextField();
        roleComboBox = new javax.swing.JComboBox<>();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        DOBDatePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        employeeIDTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UPDATE EMPLOYEE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(102, 102, 255))); // NOI18N

        searchButton.setBackground(new java.awt.Color(51, 0, 255));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 204));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        EmployeePanel.setBackground(new java.awt.Color(204, 204, 255));
        EmployeePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 0, 204))); // NOI18N

        jLabel2.setText("Name: ");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Address:");

        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Role:");

        jLabel6.setText("Username:");

        usernameTextField.setEditable(false);

        jLabel7.setText("Password:");

        jLabel8.setText("Phone:");

        updateButton.setBackground(new java.awt.Color(51, 51, 255));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 204));
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        dateOfBirthTextField.setText("Date of Birth:");

        jLabel10.setText("Phone Extn No:");

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "ADMIN", "STAFF" }));
        roleComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roleComboBoxItemStateChanged(evt);
            }
        });

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "MALE", "FEMALE", "OTHERS" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setText("Gender:");

        DOBDatePicker.setEditable(false);

        javax.swing.GroupLayout EmployeePanelLayout = new javax.swing.GroupLayout(EmployeePanel);
        EmployeePanel.setLayout(EmployeePanelLayout);
        EmployeePanelLayout.setHorizontalGroup(
            EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeePanelLayout.createSequentialGroup()
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployeePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(EmployeePanelLayout.createSequentialGroup()
                                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(dateOfBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(EmployeePanelLayout.createSequentialGroup()
                                        .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addressTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phoneTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(genderComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 135, Short.MAX_VALUE))
                                        .addGap(29, 29, 29)
                                        .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(EmployeePanelLayout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(phoneExtnNoTextField))
                                            .addGroup(EmployeePanelLayout.createSequentialGroup()
                                                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(39, 39, 39)
                                                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(passwordTextField)
                                                    .addComponent(usernameTextField)
                                                    .addComponent(roleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addComponent(DOBDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(EmployeePanelLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(updateButton)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        EmployeePanelLayout.setVerticalGroup(
            EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneExtnNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOBDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setText("Enter Employee ID:");

        employeeIDTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        employeeIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 255));
        jLabel4.setText("Enter Employee ID to Update: ");

        goBackButton.setBackground(new java.awt.Color(255, 102, 51));
        goBackButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(255, 255, 204));
        goBackButton.setText("Go Back");
        goBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackButtonMouseClicked(evt);
            }
        });
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(employeeIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(searchButton))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(goBackButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EmployeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(EmployeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployeeIFrame().setVisible(true);
            }
        });
    }

    private boolean areAllFieldsFilled() {
        if (nameTextField.getText().isEmpty()
                || addressTextField.getText().isEmpty()
                || phoneTextField.getText().isEmpty()
                || DOBDatePicker.getDate() == null
                || "Select Gender".equals(genderComboBox.getSelectedItem())
                || usernameTextField.getText().isEmpty()
                || passwordTextField.getText().isEmpty()
                || phoneExtnNoTextField.getText().isEmpty()
                || "Select Role".equals(roleComboBox.getSelectedItem())) {

            JOptionPane.showMessageDialog(rootPane, "Please fill in all the required fields.");
            return false;
        }
        return true;
    }

    private void resetFields() {
        // Reset or clear all input fields
        nameTextField.setText("");
        addressTextField.setText("");
        phoneTextField.setText("");
        DOBDatePicker.setDate(null);
        genderComboBox.setSelectedItem("Select Gender");
        usernameTextField.setText("");
        passwordTextField.setText("");
        roleComboBox.setSelectedItem("Select Role");
        phoneExtnNoTextField.setText("");
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if (!areAllFieldsFilled()) {
            return;
        }
        // Search for the customer by ID
        String id = employeeIDTextField.getText();
        Employee empUpdatedValue = HomeForm.person.searchEmployeeByID(id);

        if (empUpdatedValue == null) {
            JOptionPane.showMessageDialog(rootPane, "Sorry, No Employee not found with ID: " + id);
            return;
        }
        // Get the updated values from the input fields
        employeeIDTextField.enable(false);
        String newName = nameTextField.getText();
        String newAddress = addressTextField.getText();
        String newPhone = phoneTextField.getText();
        String newRole = roleComboBox.getSelectedItem().toString();
        Role role = Role.valueOf(newRole);
        String newPassword = passwordTextField.getText();
        String newExtnNo = phoneExtnNoTextField.getText();

        // Set the updated values for the customer
        empUpdatedValue.setName(newName);
        empUpdatedValue.setAddress(newAddress);
        empUpdatedValue.setRole(role);
        empUpdatedValue.setPhone(newPhone);
        empUpdatedValue.setPassword(newPassword);
        empUpdatedValue.setPhoneExtensionNumber(newExtnNo);

        JOptionPane.showMessageDialog(rootPane, "Updated Successfully!");
        resetFields();
        EmployeePanel.setVisible(false);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void employeeIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeIDTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void roleComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roleComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_roleComboBoxItemStateChanged

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String id = employeeIDTextField.getText();
        Employee emp = HomeForm.person.searchEmployeeByID(id);
        if (emp == null) {
            JOptionPane.showMessageDialog(rootPane, "Sorry, No Employee not found with ID: " + id);
        } else {
            nameTextField.setText(emp.getName());
            phoneTextField.setText(emp.getPhone());
            addressTextField.setText(emp.getAddress());
            DOBDatePicker.setDate(emp.getDateOfBirth());
            genderComboBox.setSelectedItem(emp.getGender().toString());
            roleComboBox.setSelectedItem(emp.getRole().toString());
            usernameTextField.setText(emp.getUsername());
            passwordTextField.setText(emp.getPassword());
            phoneExtnNoTextField.setText(emp.getPhoneExtensionNumber());
            EmployeePanel.setVisible(true);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void goBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_goBackButtonMouseClicked

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:
        EmployeeDashboardInternalFrame dashBoard = new EmployeeDashboardInternalFrame();
        dashBoard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DOBDatePicker;
    private javax.swing.JPanel EmployeePanel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel dateOfBirthTextField;
    private javax.swing.JTextField employeeIDTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField phoneExtnNoTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

}