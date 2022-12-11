/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import DataConnection.db;
import UI.Funding.Funding_ManageInvestor_Delete;
import UI.Funding.Funding_ManageInvestor_Update;
import UI.Funding.Funding_ManageInvestors_Add;
import UI.Funding.Funding_ManageInvestors_Read;
import Schooling.UI.Schooling_Admin;
import UI.CollegeDept.CollegeDeptAddJPanel;
import UI.Funding.Funding_AddGovernmentInvestor;
import UI.Funding.Funding_AddLocalInvestor;
import UI.Funding.Funding_AssignFunds_JPanel;
import UI.Funding.Funding_DeleteLocalInvestor_JPanel;
import UI.Funding.Funding_LocalInvestor;
import UI.Funding.Funding_Login;
import UI.Funding.Funding_ReadLocalInvestor_JPanel;
import UI.Funding.Funding_UpdateGovernmentInvestor_JPanel;
import UI.Funding.Funding_UpdateLocalInvestor_JPanel;
import UI.Housing.Housing_AssignHousing_JPanel;
import UI.Housing.Housing_OffCampus_AddJPanel;
import UI.Housing.Housing_OnCampus_AddJPanel;
import UI.student.StudentAddJPanel;
import UI.student.StudentDeleteJPanel;
import UI.student.StudentUpdateJPanel;
import UI.student.StudentViewJPanel;

import java.awt.CardLayout;
import java.awt.Dimension;
/**
 *
 * @author pikku
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
   
    public MainJFrame() {
        initComponents();
        db.connection();
         setSize(1000, 1000);
       setPreferredSize(new Dimension(1000,1000));
       setLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        controlArea = new javax.swing.JPanel();
        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlArea.setLayout(new java.awt.CardLayout());
        jSplitPane2.setLeftComponent(controlArea);

        workArea.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlArea;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables

    private void setLayout() {
        //Admin_Login admin_login = new Admin_Login(controlArea, workArea);
        //workArea.add("Admin_Login",admin_login);
        //CardLayout layout = (CardLayout)workArea.getLayout();
        //layout.next(workArea); 
        
        ControlAreaJPanel cajp = new ControlAreaJPanel(controlArea, workArea);
        controlArea.add("ControlAreaJPanel",cajp);
        CardLayout layout2 = (CardLayout)controlArea.getLayout();
        layout2.next(controlArea); 

        Funding_Login frijp = new Funding_Login(controlArea, workArea);
        workArea.add("Funding_Login",frijp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);

        
      

        

        
    
    }
    
}
