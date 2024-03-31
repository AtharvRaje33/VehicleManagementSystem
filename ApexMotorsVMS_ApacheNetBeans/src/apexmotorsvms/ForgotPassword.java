/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apexmotorsvms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author devvr
 */
public class ForgotPassword_Draft extends javax.swing.JFrame {
    private String foundUsername;
    /**
     * Creates new form ResetPassword_Draft
     */
    public ForgotPassword_Draft() {
        initComponents();
    }
    public static boolean checkEmailFormat(String email) {
        int atIndex = email.indexOf('@');
        int lastIndex = email.lastIndexOf('@');

        // Check if "@" is present, occurs only once, and is not at first or last index
        return atIndex != -1 && atIndex == lastIndex && atIndex != 0 && atIndex != email.length() - 1;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        forgotPasswordTitleLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        accountTypeLabel = new javax.swing.JLabel();
        accountTypeComboBox = new javax.swing.JComboBox<>();
        verifyButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        newPasswordLabel = new javax.swing.JLabel();
        reenterNewPasswordLabel = new javax.swing.JLabel();
        newPasswordjPasswordField = new javax.swing.JPasswordField();
        reenterNewPasswordjPasswordField = new javax.swing.JPasswordField();
        ResetButton = new javax.swing.JButton();
        showPasswordCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        forgotPasswordTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        forgotPasswordTitleLabel.setText("Forgot Password");

        usernameLabel.setText("Username");

        emailLabel.setText("E-Mail");

        emailField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                emailFieldCaretUpdate(evt);
            }
        });
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        accountTypeLabel.setText("Account Type");

        accountTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin", "Dealer", "Manufacturer", "Supplier" }));

        verifyButton.setText("Verify");
        verifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyButtonActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        newPasswordLabel.setText("Enter New Password:");

        reenterNewPasswordLabel.setText("Re-enter new password:");

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        showPasswordCheckBox.setText("Show Password");
        showPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountTypeLabel)
                    .addComponent(usernameLabel)
                    .addComponent(emailLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(forgotPasswordTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(accountTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(verifyButton)))
                        .addGap(79, 79, 79)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newPasswordLabel)
                                    .addComponent(reenterNewPasswordLabel))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newPasswordjPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(reenterNewPasswordjPasswordField))
                                .addGap(18, 18, 18)
                                .addComponent(showPasswordCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(ResetButton)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(forgotPasswordTitleLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accountTypeLabel)
                            .addComponent(accountTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(verifyButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newPasswordLabel)
                            .addComponent(newPasswordjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPasswordCheckBox))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reenterNewPasswordjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reenterNewPasswordLabel))
                        .addGap(48, 48, 48)
                        .addComponent(ResetButton)))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void verifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyButtonActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DatabaseCredentials.getUrl(),
                    DatabaseCredentials.getUname(), DatabaseCredentials.getPass());
            System.out.println("Connection successfully established");
            
            String accountType = String.valueOf(accountTypeComboBox.getSelectedItem());
            String username = usernameField.getText();
            String email = emailField.getText();
            String query = "SELECT username FROM accounts WHERE accounttype = ? AND username = ? AND email = ?";
            
           try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, accountType);
            pstmt.setString(2, username);
            pstmt.setString(3, email);
            
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                foundUsername = rs.getString("username");
               // new ResetPassword_Draft(foundUsername).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Invalid username, email, and/or account type!");
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_verifyButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(DatabaseCredentials.getUrl(),
                DatabaseCredentials.getUname(), DatabaseCredentials.getPass());
        System.out.println("Connection successfully established");

        String userpass1 = String.valueOf(newPasswordjPasswordField.getPassword());
        String userpass2 = String.valueOf(reenterNewPasswordjPasswordField.getPassword());
        String username = String.valueOf(foundUsername);
        if (userpass1.equals(userpass2)) {
            // SQL statement to update password
            String sql = "UPDATE accounts SET password = ? WHERE username = ?";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                // Set parameters
                statement.setString(1, userpass1);
                statement.setString(2, username); // Using the passed username

                // Execute the statement
                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Password updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update password!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error executing SQL statement!");
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Passwords do not match!");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void showPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxActionPerformed
        
        if(showPasswordCheckBox.isSelected()){
            newPasswordjPasswordField.setEchoChar((char)0);
        }
        else{
            newPasswordjPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordCheckBoxActionPerformed

    private void emailFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_emailFieldCaretUpdate
        String email = emailField.getText();
     if (checkEmailFormat(email)) {
            System.out.println("Email format is correct.");
        } else {
            System.out.println("Email format is incorrect.");
        }
    }//GEN-LAST:event_emailFieldCaretUpdate

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
            java.util.logging.Logger.getLogger(ForgotPassword_Draft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword_Draft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword_Draft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword_Draft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword_Draft().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetButton;
    private javax.swing.JComboBox<String> accountTypeComboBox;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel forgotPasswordTitleLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPasswordField newPasswordjPasswordField;
    private javax.swing.JLabel reenterNewPasswordLabel;
    private javax.swing.JPasswordField reenterNewPasswordjPasswordField;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton verifyButton;
    // End of variables declaration//GEN-END:variables
}