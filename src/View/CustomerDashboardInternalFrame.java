/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;


/* * * * * * * * * 
 * @author Elisa *
 * @ID 220005803 * 
 * * * * * * * * */

public class CustomerDashboardInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form DashboardInternalFrame
     */
    public CustomerDashboardInternalFrame() {
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

        CustomerDesktopPane = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        CustomerDesktopPane1 = new javax.swing.JDesktopPane();
        ShowCustomerBetweenSelectedDateButton = new javax.swing.JButton();
        UpdateCustomerButton = new javax.swing.JButton();
        SearchCustomerButton = new javax.swing.JButton();
        AddCustomerButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        ShowCustomerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        CustomerDesktopPane.setPreferredSize(new java.awt.Dimension(640, 510));

        javax.swing.GroupLayout CustomerDesktopPane1Layout = new javax.swing.GroupLayout(CustomerDesktopPane1);
        CustomerDesktopPane1.setLayout(CustomerDesktopPane1Layout);
        CustomerDesktopPane1Layout.setHorizontalGroup(
            CustomerDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        CustomerDesktopPane1Layout.setVerticalGroup(
            CustomerDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(CustomerDesktopPane1)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(CustomerDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ShowCustomerBetweenSelectedDateButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ShowCustomerBetweenSelectedDateButton.setForeground(new java.awt.Color(51, 102, 255));
        ShowCustomerBetweenSelectedDateButton.setText("SHOW CUSTOMER DETAILS BETWEEN TWO SELECTED DATE");
        ShowCustomerBetweenSelectedDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowCustomerBetweenSelectedDateButtonActionPerformed(evt);
            }
        });

        UpdateCustomerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        UpdateCustomerButton.setForeground(new java.awt.Color(51, 102, 255));
        UpdateCustomerButton.setText("UPDATE CUSTOMER DETAILS");
        UpdateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCustomerButtonActionPerformed(evt);
            }
        });

        SearchCustomerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        SearchCustomerButton.setForeground(new java.awt.Color(51, 102, 255));
        SearchCustomerButton.setText("SEARCH CUSTOMER DETAILS");
        SearchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCustomerButtonActionPerformed(evt);
            }
        });

        AddCustomerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        AddCustomerButton.setForeground(new java.awt.Color(51, 102, 255));
        AddCustomerButton.setText("ADD NEW CUSTOMER ");
        AddCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(153, 204, 255));
        backButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 51, 255));
        backButton.setText("GO BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        ShowCustomerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ShowCustomerButton.setForeground(new java.awt.Color(51, 102, 255));
        ShowCustomerButton.setText("SHOW CUSTOMER DETAILS");
        ShowCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowCustomerButtonActionPerformed(evt);
            }
        });

        CustomerDesktopPane.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        CustomerDesktopPane.setLayer(ShowCustomerBetweenSelectedDateButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        CustomerDesktopPane.setLayer(UpdateCustomerButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        CustomerDesktopPane.setLayer(SearchCustomerButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        CustomerDesktopPane.setLayer(AddCustomerButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        CustomerDesktopPane.setLayer(backButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        CustomerDesktopPane.setLayer(ShowCustomerButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout CustomerDesktopPaneLayout = new javax.swing.GroupLayout(CustomerDesktopPane);
        CustomerDesktopPane.setLayout(CustomerDesktopPaneLayout);
        CustomerDesktopPaneLayout.setHorizontalGroup(
            CustomerDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerDesktopPaneLayout.createSequentialGroup()
                .addGroup(CustomerDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomerDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(UpdateCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ShowCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(CustomerDesktopPaneLayout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(AddCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CustomerDesktopPaneLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(ShowCustomerBetweenSelectedDateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CustomerDesktopPaneLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(CustomerDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CustomerDesktopPaneLayout.createSequentialGroup()
                    .addGap(0, 348, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 348, Short.MAX_VALUE)))
        );
        CustomerDesktopPaneLayout.setVerticalGroup(
            CustomerDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerDesktopPaneLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(AddCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ShowCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(SearchCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(UpdateCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(ShowCustomerBetweenSelectedDateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(CustomerDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CustomerDesktopPaneLayout.createSequentialGroup()
                    .addGap(0, 272, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 272, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Customer Management ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(525, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CustomerDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustomerDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowCustomerBetweenSelectedDateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowCustomerBetweenSelectedDateButtonActionPerformed
        // TODO add your handling code here:
        CustomerDesktopPane.removeAll();
        ShowCustomerBetweenTwoSelectedDateIFrame iframe = new ShowCustomerBetweenTwoSelectedDateIFrame();
        iframe.setVisible(true);
        CustomerDesktopPane.add(iframe);
        
    }//GEN-LAST:event_ShowCustomerBetweenSelectedDateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        HomeForm form = new HomeForm();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void UpdateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCustomerButtonActionPerformed
        // TODO add your handling code here:
        CustomerDesktopPane.removeAll();
        UpdateCustomerIFrame iframe = new UpdateCustomerIFrame();
        iframe.setVisible(true);
        CustomerDesktopPane.add(iframe);
    }//GEN-LAST:event_UpdateCustomerButtonActionPerformed

    private void SearchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCustomerButtonActionPerformed
        // TODO add your handling code here:
        CustomerDesktopPane.removeAll();
        SearchCustomerIFrame iframe = new SearchCustomerIFrame();
        iframe.setVisible(true);
        CustomerDesktopPane.add(iframe);
    }//GEN-LAST:event_SearchCustomerButtonActionPerformed

    private void AddCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerButtonActionPerformed
        // TODO add your handling code here:
        CustomerDesktopPane.removeAll();
        AddCustomerIFrame iframe = new AddCustomerIFrame();
        iframe.setVisible(true);
        CustomerDesktopPane.add(iframe);
        
    }//GEN-LAST:event_AddCustomerButtonActionPerformed

    private void ShowCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowCustomerButtonActionPerformed
        // TODO add your handling code here:
        CustomerDesktopPane.removeAll();
        ShowCustomerIFrame iframe = new ShowCustomerIFrame();
        iframe.setVisible(true);
        CustomerDesktopPane.add(iframe);
    }//GEN-LAST:event_ShowCustomerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomerButton;
    private javax.swing.JDesktopPane CustomerDesktopPane;
    private javax.swing.JDesktopPane CustomerDesktopPane1;
    private javax.swing.JButton SearchCustomerButton;
    private javax.swing.JButton ShowCustomerBetweenSelectedDateButton;
    private javax.swing.JButton ShowCustomerButton;
    private javax.swing.JButton UpdateCustomerButton;
    private javax.swing.JButton backButton;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
