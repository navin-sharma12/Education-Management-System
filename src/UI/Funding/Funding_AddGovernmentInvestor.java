/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Funding;

import Investor.Investor;
import java.awt.Dimension;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JPanel;

/**
 *
 * @author richapatel
 */
public class Funding_AddGovernmentInvestor extends javax.swing.JPanel {

    /**
     * Creates new form Funding_AddGovernmentInvestor
     */
    public Funding_AddGovernmentInvestor(JPanel controlArea, JPanel workArea) {
        initComponents();
         setPreferredSize(new Dimension(769, 515)); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblFunds = new java.awt.Label();
        lblContact = new java.awt.Label();
        lblEmail = new java.awt.Label();
        txtEmail = new javax.swing.JTextField();
        lblOrganization = new java.awt.Label();
        txtFunds = new javax.swing.JTextField();
        txtOrganization = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(null);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(600, 410, 100, 30);

        lblFunds.setText("Funds");
        add(lblFunds);
        lblFunds.setBounds(480, 280, 50, 20);

        lblContact.setText("Contact No");
        add(lblContact);
        lblContact.setBounds(470, 340, 70, 20);

        lblEmail.setText("Email");
        add(lblEmail);
        lblEmail.setBounds(470, 220, 70, 20);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail);
        txtEmail.setBounds(580, 220, 180, 23);

        lblOrganization.setText("Organization");
        add(lblOrganization);
        lblOrganization.setBounds(470, 160, 80, 20);

        txtFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFundsActionPerformed(evt);
            }
        });
        add(txtFunds);
        txtFunds.setBounds(580, 280, 180, 23);

        txtOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrganizationActionPerformed(evt);
            }
        });
        add(txtOrganization);
        txtOrganization.setBounds(580, 160, 180, 23);

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        add(txtContact);
        txtContact.setBounds(580, 340, 180, 23);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel1.setText("                                     Goverment-Investor : Add");
        add(jLabel1);
        jLabel1.setBounds(50, 30, 480, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/govt 4.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(10, 140, 450, 280);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/govt icon 3.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(670, 0, 100, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          if (txtOrganization.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Last name cannot be null.");
        } else if (!getEmail(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Email address");
        } else if (!getContact(txtContact.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Contact No");
        } else if (txtFunds.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Funds cannot be null.");
        } else if (Pattern.matches("[a-zA-Z]+", txtFunds.getText())) {
            JOptionPane.showMessageDialog(this, "Age should be in digits.");
        } else{
            String organization = txtOrganization.getText();
            String email = txtEmail.getText();
            long contact_no = Long.parseLong(txtContact.getText());
            int funds = Integer.parseInt(txtFunds.getText());
            String username = organization.toLowerCase();
            String password = organization.toLowerCase();
            try{
                Investor in = new Investor(organization, email, password, username, 1, funds, contact_no);
                in.addGovernmentInvestors(in);
                JOptionPane.showMessageDialog(this, "Investor added");
                txtOrganization.setText("");
                txtEmail.setText("");
                txtContact.setText("");
                txtFunds.setText("");
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundsActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrganizationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrganizationActionPerformed

 public boolean getContact(String no) {
        String regex = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(no);
        return matcher.matches();
    }

    public boolean getEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label lblContact;
    private java.awt.Label lblEmail;
    private java.awt.Label lblFunds;
    private java.awt.Label lblOrganization;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFunds;
    private javax.swing.JTextField txtOrganization;
    // End of variables declaration//GEN-END:variables
}
