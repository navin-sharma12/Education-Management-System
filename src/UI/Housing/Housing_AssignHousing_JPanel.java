/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Housing;

import Housing.Housing;
import Schooling.Model.University;
import Student.Student;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;

/**
 *
 * @author pikku
 */
public class Housing_AssignHousing_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form Housing_AssignHousing_JPanel
     */
    Student s;
    int university_id;    
    public Housing_AssignHousing_JPanel(JPanel controlArea, JPanel workArea) {
        initComponents();
        this.s = new Student();
        this.university_id = university_id;
        populatedTable();
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
        tblStudent = new javax.swing.JTable();
        Save = new java.awt.Button();
        lblHousingType = new javax.swing.JLabel();
        ComboBoxHousingType = new javax.swing.JComboBox<>();
        lblAddress = new javax.swing.JLabel();
        ComboBoxAddress = new javax.swing.JComboBox<>();
        btnFetch = new java.awt.Button();

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Firstname", "Lastname", "Gender", "Status", "University"
            }
        ));
        jScrollPane1.setViewportView(tblStudent);

        Save.setLabel("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        lblHousingType.setText("Housing Type");

        ComboBoxHousingType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On Campus", "Off Campus" }));

        lblAddress.setText("Housing Type");

        ComboBoxAddress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnFetch.setLabel("Fetch");
        btnFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHousingType, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBoxAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxHousingType, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHousingType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxHousingType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBoxAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFetch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblStudent.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        if (!(ComboBoxAddress.getSelectedItem() != null)) {
            JOptionPane.showMessageDialog(this, "Please fetch");
        } else {
            String housing = ComboBoxAddress.getSelectedItem().toString();
            Housing h_new = new Housing();
            try {
                
                ResultSet rs_housing = h_new.getHousingDataByName(housing);
                while (rs_housing.next()) {
                    if (rs_housing.getInt(4) < 1) {
                        JOptionPane.showMessageDialog(this, "No Slots Available");
                    } else {
                        int housing_id = rs_housing.getInt(1);
                        Student s = new Student();
                        int student_id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
                        String address = rs_housing.getString(2);
                         String zipcode = rs_housing.getString(3);
                        s.updateStudentHousing(student_id, housing_id,address,zipcode);
                        h_new.updateHousingSlots(housing_id,rs_housing.getInt(2) - 1);
                        JOptionPane.showMessageDialog(this, "Housing Assign");
                        populatedTable();
                    }
                }

            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(this, e.getMessage());
            }

        }


    }//GEN-LAST:event_SaveActionPerformed

    private void btnFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblStudent.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        String university_name = model.getValueAt(selectedRowIndex, 5).toString();
        University un = new University();
        ResultSet rs = un.getUniversityIdByName(university_name);
        try {
            while (rs.next()) {
                Housing hu = new Housing();
                university_id = rs.getInt(1);
                ResultSet rs_housing = hu.getHousingByUniversityAndType(university_id, ComboBoxHousingType.getSelectedItem().toString());
                ComboBoxAddress.removeAllItems();
                while (rs_housing.next()) {
                    ComboBoxAddress.addItem(rs_housing.getString(7));
                }
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }//GEN-LAST:event_btnFetchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxAddress;
    private javax.swing.JComboBox<String> ComboBoxHousingType;
    private java.awt.Button Save;
    private java.awt.Button btnFetch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblHousingType;
    private javax.swing.JTable tblStudent;
    // End of variables declaration//GEN-END:variables

    private void populatedTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
            model.setRowCount(0);
            ResultSet rs = s.getAdmittedStudent();
            ComboBoxAddress.removeAllItems();
            while (rs.next()) {
                Object[] row = new Object[6];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

}