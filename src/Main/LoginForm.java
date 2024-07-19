/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Model.Customer;
import Model.Employee;
import Model.Gender;
import Model.Role;
import View.HomeForm;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import qualitycars.EmployeeAndCustomer;

/* * * * * * * * * 
 * @author Elisa *
 * @ID 220005803 * 
 * * * * * * * * */
public class LoginForm extends javax.swing.JFrame {

    public static EmployeeAndCustomer person;

    /**
     * Creates new form loginForm
     */
    public LoginForm() {
        initComponents();

        if (person == null) {
            person = new EmployeeAndCustomer();

            // Setup initial data for a few employees and customers
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            Date date1 = null;
            Date date2 = null;
            Date date3 = null;
            Date date4 = null;
            Date date5 = null;
            Date date6 = null;
            Date date7 = null;
            Date date8 = null;
            Date date9 = null;
            Date date10 = null;
            Date date11 = null;
            Date date12 = null;
            Date date13 = null;
            Date date14 = null;

            try {
                date1 = dateFormat.parse("1989-09-12");
                date2 = dateFormat.parse("1978-03-25");
                date3 = dateFormat.parse("2025-08-14");
                date4 = dateFormat.parse("1889-09-12");
                date5 = dateFormat.parse("1899-10-22");
                date6 = dateFormat.parse("1887-03-08");
                date7 = dateFormat.parse("1897-06-27");
                date8 = dateFormat.parse("1977-03-11");
                date9 = dateFormat.parse("1997-06-27");
                date10 = dateFormat.parse("1977-06-18");
                date11 = dateFormat.parse("2027-08-24");
                date12 = dateFormat.parse("2025-11-05");
                date13 = dateFormat.parse("2026-08-14");
                date14 = dateFormat.parse("2028-07-11");
            } catch (ParseException e) {
                e.printStackTrace();// Handle the parsing exception
            }

            // Add these instances to the lists
            person.addEmployee(new Employee("01", "garry", "1234", Role.ADMIN, "A01", "Garry", Gender.MALE, date1, "Auckland CBD", "2345678901"));
            person.addEmployee(new Employee("03", "stafftesting", "123456", Role.STAFF, "A02", "Jerry", Gender.MALE, date2, "Manukau Auckland", "28765433"));
            person.addEmployee(new Employee("05", "david123", "david123", Role.STAFF, "A03", "David", Gender.MALE, date4, "Takanini Auckland", "234565961"));
            person.addEmployee(new Employee("04", "linda123", "linda123", Role.ADMIN, "A04", "Linda", Gender.FEMALE, date5, "Manurewa Auckland", "2348469301"));

            person.addCustomer(new Customer("0951843", "restriced", date6, "C01", "Bolton", Gender.MALE, date3, "123 Street Papakura Auckland", "0268739465"));
            person.addCustomer(new Customer("220345", "Full License", date11, "C02", "Eden", Gender.MALE, date7, "123 Street Manurewa Auckland", "24674527472"));
            person.addCustomer(new Customer("220355", "Restrict", date12, "C03", "Eve", Gender.FEMALE, date8, "123 Street Manukau Auckland", "24234567872"));
            person.addCustomer(new Customer("220365", "Full License", date13, "C04", "Joshua", Gender.MALE, date9, "123 Street Otahuhu Auckland", "28653567832"));
            person.addCustomer(new Customer("220375", "Restrict", date14, "C05", "Marry", Gender.FEMALE, date10, "123 Street Taruanga Auckland", "28763456789"));

        }
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
        jEditorPane1 = new javax.swing.JEditorPane();
        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        forgetUsername = new javax.swing.JLabel();
        forgetPassword = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(204, 204, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(104, 104, 104)));
        mainPanel.setForeground(new java.awt.Color(51, 51, 51));

        headerPanel.setBackground(new java.awt.Color(237, 246, 245));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("LogIn");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarRental2.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(51, 51, 51));
        usernameLabel.setText("Username: ");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        passwordLabel.setText("Password:");

        usernameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));

        passwordTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));

        loginButton.setBackground(new java.awt.Color(51, 51, 255));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Log In");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        forgetUsername.setBackground(new java.awt.Color(255, 255, 255));
        forgetUsername.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        forgetUsername.setForeground(new java.awt.Color(255, 51, 51));
        forgetUsername.setText("forgotten username ?");
        forgetUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetUsernameMouseClicked(evt);
            }
        });

        forgetPassword.setBackground(new java.awt.Color(255, 255, 255));
        forgetPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        forgetPassword.setForeground(new java.awt.Color(255, 51, 51));
        forgetPassword.setText("forgotten paassword ?");
        forgetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetPasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(forgetUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(forgetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forgetUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forgetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        String username = usernameTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());

        try {
            boolean isLogin = person.login(username, password);

            if (isLogin) {
                String name = person.getEmployeeNameByUsername(username);
                JOptionPane.showMessageDialog(null, "Login successful!");
                System.out.println("User " + name + "Login successful!");
                HomeForm home = new HomeForm(name);
                HomeForm.person = person;
                home.setVisible(true);
                this.dispose();
            } else if (username.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Username field is empty!");
            } else if (password.equals("")) {
                JOptionPane.showMessageDialog(null, "Password field is empty!");
            } else {
                // Check if the username is incorrect
                boolean isUsernameCorrect = person.isUsernameExists(username);

                if (!isUsernameCorrect) {
                    JOptionPane.showMessageDialog(null, "Incorrect username!");
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect password!");
                }
            }
        } catch (Exception e) {
            // Handle the exception, either display an error to the user or log it for debugging
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }

    }//GEN-LAST:event_loginButtonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void forgetUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetUsernameMouseClicked
        // TODO add your handling code here:
        FindUsernameForm usernameForm = new FindUsernameForm();
        usernameForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_forgetUsernameMouseClicked

    private void forgetPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetPasswordMouseClicked
        // TODO add your handling code here:
        ResetPasswordForm passwordForm = new ResetPasswordForm();
        passwordForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_forgetPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgetPassword;
    private javax.swing.JLabel forgetUsername;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}