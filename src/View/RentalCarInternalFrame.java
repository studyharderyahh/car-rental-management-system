/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Model.CarModel;
import Model.IndividualCar;
import static Model.StatusoftheCar.InShop;
import static Model.StatusoftheCar.RentedOut;
import static Model.StatusoftheCar.UnderManintance;

/**
 *
 * @author himani.walia
 */
public class RentalCarInternalFrame extends javax.swing.JInternalFrame {

    ArrayList<CarModel> carmodel = new ArrayList<CarModel>();
    ArrayList<IndividualCar> indcar = new ArrayList<IndividualCar>();

    /**
     * Creates new form RentalCarInternalFrame
     */
    public RentalCarInternalFrame() {
        initComponents();
        //car model name, manufacturer, rental price, status, engine size, fuel type and number of seats
        carmodel.add(new CarModel(" Camry", "Toyota", "Petrol", 5, 25000));
        carmodel.add(new CarModel(" Accord", "Honda", "Hybrid", 5, 28000));
        carmodel.add(new CarModel(" Explorer", "Ford", "Gasoline", 5, 35000));
        carmodel.add(new CarModel(" Model 3", "Tesla", "Electric", 5, 50000));
        carmodel.add(new CarModel(" Silverado", "Chevrolet", "Diesel", 5, 40000));

        indcar.add(new IndividualCar("ABC123", "Red", 12000, InShop));
        indcar.add(new IndividualCar("XYZ789", "Blue", 8000, RentedOut));
        indcar.add(new IndividualCar("LMN456", "Black", 3000, UnderManintance));
        indcar.add(new IndividualCar("PQR789", "White", 2000, RentedOut));
        indcar.add(new IndividualCar("DEF321", "Silver", 1000, InShop));
        indcar.add(new IndividualCar("GHI654", "Green", 90000, UnderManintance));
        indcar.add(new IndividualCar("JKL987", "Yellow", 5000, InShop));
        indcar.add(new IndividualCar("MNO012", "Purple", 6700, UnderManintance));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        RentalCarTable = new javax.swing.JTable();
        RenatlcarButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(860, 630));

        RentalCarTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RentalCarTable.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        RentalCarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Model", "Manufacturer", "Rental Price", "Status", "Engine Size ", "Fuel type", "Number of Seats "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        RentalCarTable.setToolTipText("");
        RentalCarTable.setPreferredSize(null);
        RentalCarTable.setShowGrid(true);
        RentalCarTable.setSize(new java.awt.Dimension(1, 1));
        jScrollPane1.setViewportView(RentalCarTable);
        if (RentalCarTable.getColumnModel().getColumnCount() > 0) {
            RentalCarTable.getColumnModel().getColumn(0).setResizable(false);
            RentalCarTable.getColumnModel().getColumn(3).setResizable(false);
            RentalCarTable.getColumnModel().getColumn(4).setResizable(false);
            RentalCarTable.getColumnModel().getColumn(6).setResizable(false);
        }

        RenatlcarButton.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        RenatlcarButton.setText("RENTAL CARS");
        RenatlcarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenatlcarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(RenatlcarButton)
                .addContainerGap(410, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RenatlcarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RenatlcarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenatlcarButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) RentalCarTable.getModel();
        model.setRowCount(0);
        Object rows[] = new Object[7];
        for (int i = 0; i < carmodel.size(); i++) {
            CarModel cm = carmodel.get(i);

            rows[0] = cm.getModel();
            rows[1] = cm.getManufacturerName();
            rows[5] = cm.getFuelType();
            rows[4] = cm.getEngineSize();
            rows[6] = cm.getSeats();

            for (int j = i; j < indcar.size(); j++) {
                IndividualCar ic = indcar.get(j);

                rows[2] = ic.getRentalAmountpd();
                rows[3] = ic.getStatus();

                break;
            }

            model.addRow(rows);
        }


    }//GEN-LAST:event_RenatlcarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RenatlcarButton;
    private javax.swing.JTable RentalCarTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
