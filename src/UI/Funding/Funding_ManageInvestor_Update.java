/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Funding;

import UI.ControlAreaJPanel;
import Users.Users;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author richapatel
 */
public class Funding_ManageInvestor_Update extends javax.swing.JPanel {

    /**
     * Creates new form Funding_ManageInvestor_Update
     */
    Users user;
    int id;
    JPanel controlArea;
    JPanel workArea;

    public Funding_ManageInvestor_Update(JPanel controlArea, JPanel workArea) {
        initComponents();
        this.user = new Users();
        this.id = id;
        populateTable(2);
        this.controlArea = controlArea;
        this.workArea = workArea;
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

        jTextFieldEmailID = new javax.swing.JTextField();
        jLabelDepartment = new javax.swing.JLabel();
        jComboBoxDepartment = new javax.swing.JComboBox<>();
        jButtonAdd = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelEmailID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartment = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(204, 204, 204));
        setLayout(null);
        add(jTextFieldEmailID);
        jTextFieldEmailID.setBounds(200, 420, 207, 23);

        jLabelDepartment.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 12)); // NOI18N
        jLabelDepartment.setText("Department:");
        add(jLabelDepartment);
        jLabelDepartment.setBounds(80, 460, 90, 15);

        jComboBoxDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local Investor", "Government Organization" }));
        add(jComboBoxDepartment);
        jComboBoxDepartment.setBounds(200, 450, 210, 23);

        jButtonAdd.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAdd.setFont(new java.awt.Font(".AppleSystemUIFont", 3, 14)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setText("Save");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        add(jButtonAdd);
        jButtonAdd.setBounds(200, 480, 72, 23);

        jLabelName.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 12)); // NOI18N
        jLabelName.setText("First name:");
        add(jLabelName);
        jLabelName.setBounds(80, 350, 90, 15);

        jTextFieldName.setToolTipText("");
        add(jTextFieldName);
        jTextFieldName.setBounds(200, 350, 207, 23);

        jLabelLastName.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 12)); // NOI18N
        jLabelLastName.setText("Last name:");
        add(jLabelLastName);
        jLabelLastName.setBounds(80, 390, 80, 15);

        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastNameActionPerformed(evt);
            }
        });
        add(jTextFieldLastName);
        jTextFieldLastName.setBounds(200, 380, 207, 23);

        jLabelEmailID.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 12)); // NOI18N
        jLabelEmailID.setText("Email ID:");
        add(jLabelEmailID);
        jLabelEmailID.setBounds(80, 420, 70, 15);

        tblDepartment.setBackground(new java.awt.Color(102, 102, 102));
        tblDepartment.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 12)); // NOI18N
        tblDepartment.setForeground(new java.awt.Color(255, 255, 255));
        tblDepartment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Firstname", "Lastname", "Email", "Organization", "Username"
            }
        ));
        jScrollPane1.setViewportView(tblDepartment);

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 70, 630, 239);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font(".AppleSystemUIFont", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(590, 320, 85, 23);

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(60, 20, 80, 30);

        jLabel1.setText("⏎");
        add(jLabel1);
        jLabel1.setBounds(40, 20, 20, 30);

        jLabel2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel2.setText("          Manage Investor : Update");
        add(jLabel2);
        jLabel2.setBounds(180, 10, 410, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Funding/main logo .jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(480, 350, 200, 130);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        String first_name, last_name, emailId, department, username, password;
        int department_id = 2;

        first_name = jTextFieldName.getText();
        last_name = jTextFieldLastName.getText();
        emailId = jTextFieldEmailID.getText();
        department = jComboBoxDepartment.getSelectedItem().toString();
        if (first_name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "First name cannot be null.");
        } else if (last_name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Last name cannot be null.");
        } else if (!getEmail(emailId)) {
            JOptionPane.showMessageDialog(this, "Invalid Email address");
        } else if (department.isEmpty()) {
            JOptionPane.showMessageDialog(this, "department cannot be null.");
        } else {
            username = last_name.toLowerCase() + "." + first_name.toLowerCase();
            password = last_name.toLowerCase() + "." + first_name.toLowerCase();
            try {

                Users us_new = new Users(id, department_id, first_name, last_name, emailId, department, username, password);
                us_new.updateUser(us_new);
                jTextFieldName.setText("");
                jTextFieldLastName.setText("");
                jTextFieldEmailID.setText("");
                jComboBoxDepartment.setSelectedIndex(0);
                populateTable(1);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblDepartment.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDepartment.getModel();

        id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
        jTextFieldName.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jTextFieldLastName.setText(model.getValueAt(selectedRowIndex, 2).toString());
        jTextFieldEmailID.setText(model.getValueAt(selectedRowIndex, 3).toString());
        jComboBoxDepartment.setSelectedItem(model.getValueAt(selectedRowIndex, 4).toString());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       ControlAreaJPanel cajp = new ControlAreaJPanel(controlArea, workArea);
        controlArea.add("ControlAreaJPanel", cajp);
        CardLayout layout = (CardLayout) controlArea.getLayout();
        layout.next(controlArea);
        workArea.remove(this);
    }//GEN-LAST:event_btnBackActionPerformed

    private void populateTable(int id) {
        try {
            DefaultTableModel model = (DefaultTableModel) tblDepartment.getModel();
            model.setRowCount(0);

            ResultSet resultset = user.getAllDepartmentUser(id);
            System.out.println(resultset);
            while (resultset.next()) {
                Object[] row = new Object[6];

                row[0] = resultset.getInt(1);
                row[1] = resultset.getString(3);
                row[2] = resultset.getString(4);
                row[3] = resultset.getString(5);
                row[4] = resultset.getString(6);
                row[5] = resultset.getString(7);
                model.addRow(row);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public boolean getEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JComboBox<String> jComboBoxDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDepartment;
    private javax.swing.JLabel jLabelEmailID;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldEmailID;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTable tblDepartment;
    // End of variables declaration//GEN-END:variables
}
