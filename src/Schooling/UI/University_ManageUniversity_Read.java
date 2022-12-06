/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;

/**
 *
 * @author navinsharma
 */
public class University_ManageUniversity_Read extends javax.swing.JPanel {

    /**
     * Creates new form Schooling_ManageUniversity_Read
     */
    public University_ManageUniversity_Read() {
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

        jTextFieldSeatInCourse = new javax.swing.JTextField();
        jLabelSeatsInCourse = new javax.swing.JLabel();
        jTextFieldUniversityName = new javax.swing.JTextField();
        jLabelUniversityName = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelCoursename = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonFetch = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jTextFieldCategory = new javax.swing.JTextField();
        jTextFieldCourseName = new javax.swing.JTextField();

        jTextFieldSeatInCourse.setToolTipText("");

        jLabelSeatsInCourse.setText("Seats in course:");

        jLabelUniversityName.setText("University name:");

        jLabelCategory.setText("Category:");

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Read University");
        jLabelTitle.setToolTipText("");

        jLabelCoursename.setText("Course name:");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "University name", "Category", "Course name", "Seats in course"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jButtonFetch.setText("Fetch");

        jButtonView.setText("View");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCoursename)
                            .addComponent(jLabelCategory)
                            .addComponent(jLabelUniversityName)
                            .addComponent(jLabelSeatsInCourse))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldSeatInCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(jTextFieldUniversityName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCategory)
                            .addComponent(jTextFieldCourseName)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(jButtonFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelTitle)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFetch)
                    .addComponent(jButtonView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUniversityName)
                    .addComponent(jTextFieldUniversityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategory)
                    .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoursename)
                    .addComponent(jTextFieldCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSeatsInCourse)
                    .addComponent(jTextFieldSeatInCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFetch;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelCoursename;
    private javax.swing.JLabel jLabelSeatsInCourse;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUniversityName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldCourseName;
    private javax.swing.JTextField jTextFieldSeatInCourse;
    private javax.swing.JTextField jTextFieldUniversityName;
    // End of variables declaration//GEN-END:variables
}
