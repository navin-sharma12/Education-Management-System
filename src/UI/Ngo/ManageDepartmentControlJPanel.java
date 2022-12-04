/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Ngo;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pikku
 */
public class ManageDepartmentControlJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDepartmentControlJPanel
     */
     JPanel controlArea;
    JPanel workArea;
    public ManageDepartmentControlJPanel(JPanel workArea, JPanel controlArea) {
        initComponents();
        this.controlArea = controlArea;
        this.workArea = workArea;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnRead1 = new javax.swing.JButton();
        btnRead2 = new javax.swing.JButton();

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRead.setText("Read");

        btnRead1.setText("Update");

        btnRead2.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRead2)
                    .addComponent(btnRead1)
                    .addComponent(btnRead)
                    .addComponent(btnAdd))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnAdd)
                .addGap(31, 31, 31)
                .addComponent(btnRead)
                .addGap(30, 30, 30)
                .addComponent(btnRead1)
                .addGap(35, 35, 35)
                .addComponent(btnRead2)
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
          ManageDepartment_AddJPanel adjp = new ManageDepartment_AddJPanel(workArea, controlArea);
        workArea.add("ManageDepartment_AddJPanel", adjp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnRead1;
    private javax.swing.JButton btnRead2;
    // End of variables declaration//GEN-END:variables
}
