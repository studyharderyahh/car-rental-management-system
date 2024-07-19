/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Model.ReturnRecord;
import Model.StatusoftheCar;
import static Model.StatusoftheCar.InShop;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author himani.walia
 */
public class ReturnCarInternalFrame extends javax.swing.JInternalFrame {
    private ArrayList <ReturnRecord> rc = new ArrayList <ReturnRecord> ();


    /**
     * Creates new form ReturnCarInternalFrame
     */
    public ReturnCarInternalFrame() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void details(){
        //rc.add(new ReturnRecord("123","aaaa","vbb",InShop));
        
       
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CarRegisterationTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        StatusComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        CustomerIDTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CustomerNameTextField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Car Registeration Number:");

        jLabel2.setText("Car Status");

        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Customer ID:");

        jLabel4.setText("Customer Name:");

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CarRegisterationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CustomerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(SearchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CustomerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CustomerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CarRegisterationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        String customerID= CustomerIDTextField.getText();
        ReturnRecord rentedCar1 = new ReturnRecord( "C01", "John Doe","ABC123", StatusoftheCar.RentedOut);
        ReturnRecord rentedCar2 = new ReturnRecord("C02", "Jane Smith","XYZ456",  StatusoftheCar.RentedOut);
        ReturnRecord rentedCar3 = new ReturnRecord( "C03", "Bob Johnson","DEF789", StatusoftheCar.RentedOut);
        ReturnRecord rentedCar4 = new ReturnRecord( "C04", "Alice Williams","GHI012", StatusoftheCar.RentedOut);
        ReturnRecord rentedCar5 = new ReturnRecord( "C05", "Charlie Brown","JKL345", StatusoftheCar.RentedOut);
        ReturnRecord rentedCar6 = new ReturnRecord( "C06", "Eva Davis","MNO678", StatusoftheCar.RentedOut);
        ReturnRecord rentedCar7 = new ReturnRecord( "C07", "Michael White","PQR901", StatusoftheCar.RentedOut);
        ReturnRecord rentedCar8 = new ReturnRecord("C08", "Sophia Miller","STU234",  StatusoftheCar.RentedOut);
        ReturnRecord rentedCar9 = new ReturnRecord( "C09", "Ryan Wilson","VWX567", StatusoftheCar.RentedOut);
        ReturnRecord rentedCar10 = new ReturnRecord( "C10", "Olivia Davis","YZA890", StatusoftheCar.RentedOut);
        rc.add(rentedCar1);
        rc.add(rentedCar2);
        rc.add(rentedCar3);
        rc.add(rentedCar4);
        rc.add(rentedCar5);
        rc.add(rentedCar6);
        rc.add(rentedCar7);
        rc.add(rentedCar8);
        rc.add(rentedCar9);
        rc.add(rentedCar10);
        
        
        boolean found = false;
        for(ReturnRecord r:rc)
        {
            if(r.getCustomerID().equals(customerID))
        {
            found = true;
           String name = r.getCustomerName();
          CustomerNameTextField.setText(name);
         CarRegisterationTextField.setText(r.getCarRegisterationNo());
         DefaultComboBoxModel status = new DefaultComboBoxModel(StatusoftheCar.values());
            StatusComboBox.setModel(status);
            break;
         
          
        }
        
        }
      if(found==false){
          
            JOptionPane.showMessageDialog(this, "Wrong id ");
            
        }
        
        
    }//GEN-LAST:event_SearchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CarRegisterationTextField;
    private javax.swing.JTextField CustomerIDTextField;
    private javax.swing.JTextField CustomerNameTextField;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}