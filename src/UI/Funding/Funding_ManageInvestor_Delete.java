/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Funding;

import Users.Users;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author richapatel
 */
public class Funding_ManageInvestor_Delete extends javax.swing.JPanel {

    /**
     * Creates new form Funding_ManageInvestor_Delete
     */
     Users user;
     int id;
     JPanel controlArea;
    JPanel workArea;
    public Funding_ManageInvestor_Delete(JPanel controlArea, JPanel workArea) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartment = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblDepartment.setBackground(new java.awt.Color(102, 102, 102));
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
        jScrollPane1.setBounds(60, 110, 598, 239);

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font(".AppleSystemUIFont", 3, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(60, 360, 80, 30);

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 3, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(50, 30, 72, 30);
        add(jLabel2);
        jLabel2.setBounds(50, 50, 0, 0);

        jLabel1.setText(" ");
        add(jLabel1);
        jLabel1.setBounds(10, 30, 40, 50);

        jLabel3.setText("⏎");
        add(jLabel3);
        jLabel3.setBounds(30, 30, 40, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Funding/main logo .jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(450, 360, 210, 116);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel5.setText("Manage Investors - Delete :");
        add(jLabel5);
        jLabel5.setBounds(210, 20, 380, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDepartment.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDepartment.getModel();

        id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
        try {
            user.deleteUser(id);
            populateTable(2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Funding_Admin fa = new Funding_Admin(controlArea, workArea);
        controlArea.add("Funding_Admin", fa);
        CardLayout layout = (CardLayout) controlArea.getLayout();
        layout.next(controlArea);
        workArea.remove(this);
    }//GEN-LAST:event_btnBackActionPerformed

 private void populateTable(int id)  {
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDepartment;
    // End of variables declaration//GEN-END:variables
}
