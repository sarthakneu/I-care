/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HospitalAdminLogin;

import BackendDB4OUtility.DB4;
import OperatingSystems.Operatesys;
import BackendEnterpriseHospital.Hospital;
import BackendEnterpriseHospital.Nurse;
import model.MainJFrameForm;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author vidishaa
 */
public class AdminPageForNurses extends javax.swing.JPanel {

    /**
     * Creates new form AdminPageForNurses
     */
    MainJFrameForm MainLPage;
    private Operatesys operatingSystem;
    private DB4 dB4OUtility;
    Hospital hospital;

    public AdminPageForNurses(MainJFrameForm mainScreen, DB4 dB4OUtility, Operatesys operatingSystem, Hospital h) {
        initComponents();
        this.MainLPage = mainScreen;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.hospital = h;
        populateNurseTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNurse = new javax.swing.JTable();
        NurseTitle = new javax.swing.JLabel();
        deletebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblNurse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "UserName", "Gender", "Address"
            }
        ));
        jScrollPane1.setViewportView(tblNurse);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 980, 240));

        NurseTitle.setBackground(new java.awt.Color(255, 255, 255));
        NurseTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        NurseTitle.setText("Manage Nurse");
        jPanel1.add(NurseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        deletebtn.setBackground(new java.awt.Color(255, 204, 204));
        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/clinical images.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, -20, 1200, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1427, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblNurse.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblNurse.getModel();
        String nurseUName = model.getValueAt(selectedRow, 1).toString();
        System.out.println(" nurse uname: " + nurseUName);
        operatingSystem.deleteNurseUser(nurseUName);
        dB4OUtility.storeSystem(operatingSystem);
        populateNurseTable();
    }//GEN-LAST:event_deletebtnActionPerformed

    private void populateNurseTable(){
    DefaultTableModel model = (DefaultTableModel) tblNurse.getModel();
    model.setRowCount(0);

    for (Nurse n : operatingSystem.getNurseDirectory()) {

        if (n.getHospiName().equals(hospital.getEnterprisename())) {
            Object[] row = new Object[5];
            row[0] = n.getPersoname();
            row[1] = n.getUseName();
            row[2] = n.getGender();
            row[3] = n.getAddress();
            model.addRow(row);

        }

    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NurseTitle;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNurse;
    // End of variables declaration//GEN-END:variables
}