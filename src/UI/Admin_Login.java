/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Admin.Admin;
import UI.Funding.Funding_Admin;
import UI.Funding.Funding_ManageInvestors;
import Schooling.UI.Schooling_Admin;
import UI.Housing.Housing_AdminControlArea_JPanel;
import UI.Ngo.NgoContolAreaJPanel;
import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author navinsharma
 */
public class Admin_Login extends javax.swing.JPanel {

    /**
     * Creates new form Admin_Login
     */
    JPanel controlArea;
    JPanel workArea;
    Admin admin;

    public Admin_Login(JPanel controlArea, JPanel workArea) {
        initComponents();
        this.controlArea = controlArea;
        this.workArea = workArea;
        this.admin = new Admin();
//        getAdmin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabelTitile = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jComboBoxCategory = new javax.swing.JComboBox<>();

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabelTitile.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitile.setText("Admin Login");

        jLabelUsername.setText("Username:");

        jLabelPassword.setText("Password:");

        jLabelCategory.setText("Category:");

        jComboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NGO", "Schooling", "Funding", "Housing" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelUsername)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelCategory)
                        .addComponent(jLabelPassword)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldUsername)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jComboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jButtonLogin)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelTitile)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategory)
                    .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonLogin)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:

        String username = jTextFieldUsername.getText();
        String password = jPasswordFieldPassword.getText();
        String department = String.valueOf(jComboBoxCategory.getSelectedItem());

        try {
            ResultSet res = admin.checkLogin(username, password, department.toLowerCase());
            if(res.next())
            {
                System.out.println(res.getString(2));
                if ("Schooling".equals(department)) 
                {
                    Schooling_Admin cajp = new Schooling_Admin(controlArea, workArea);
                    controlArea.add("ControlAreaJPanel", cajp);
                    CardLayout layout2 = (CardLayout) controlArea.getLayout();
                    layout2.next(controlArea);
                }
                if(res.getString(2).equals("ngo"))
                {
                    workArea.remove(this);
                    
                    NgoContolAreaJPanel ngap = new NgoContolAreaJPanel(controlArea, workArea);
                    controlArea.add("NgoContolAreaJPanel", ngap);
                    CardLayout layout = (CardLayout) controlArea.getLayout();
                    layout.next(controlArea);
                }
                 if(res.getString(2).equals("funding"))
                {
                    workArea.remove(this);
                     Funding_Admin fa = new Funding_Admin(controlArea, workArea);
                    controlArea.add("Funding_Admin", fa);
                    CardLayout layout3 = (CardLayout) controlArea.getLayout();
                    layout3.next(controlArea);
                   
                }
                  if(res.getString(2).equals("housing"))
                {
                    workArea.remove(this);
                    Housing_AdminControlArea_JPanel hacap = new Housing_AdminControlArea_JPanel(controlArea, workArea);
                    controlArea.add("Housing_AdminControlArea_JPanel", hacap);
                    CardLayout layout4 = (CardLayout) controlArea.getLayout();
                    layout4.next(controlArea);
                   
                }
            }
            else{
                 JOptionPane.showMessageDialog(this, "Invalid Input");
            }
           
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(this, e.getMessage());
        }

//        Schooling_Admin cajp = new Schooling_Admin(controlArea, workArea);
//        controlArea.add("ControlAreaJPanel", cajp);
//        CardLayout layout2 = (CardLayout) controlArea.getLayout();
//        layout2.next(controlArea);
    }//GEN-LAST:event_jButtonLoginActionPerformed
//private void setLayout() {
////        Admin_Login admin_login = new Admin_Login(workArea);
////        workArea.add("Admin_Login",admin_login);
////        CardLayout layout = (CardLayout)workArea.getLayout();
////        layout.next(workArea); 
//        
//        Schooling_Admin cajp = new Schooling_Admin(controlArea, workArea);
//        controlArea.add("ControlAreaJPanel",cajp);
//        CardLayout layout2 = (CardLayout)controlArea.getLayout();
//        layout2.next(controlArea); 
//
////         StudentAddJPanel sajp = new StudentAddJPanel(workArea);
////        workArea.add("StudentAddJPanel",sajp);
////        CardLayout layout = (CardLayout)workArea.getLayout();
////        layout.next(workArea); 
//    
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JComboBox<String> jComboBoxCategory;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitile;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables

//    private void getAdmin() {
//        try {
//            .getAdmin_directory().getAdminList();
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//    }
}
