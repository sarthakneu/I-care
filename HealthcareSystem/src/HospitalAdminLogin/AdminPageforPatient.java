/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HospitalAdminLogin;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import BackendDB4OUtility.DB4OUtility;
import OperatingSystems.OperatingSystem;
import BackendEnterpriseHospital.Hospital;
import BackendEnterpriseHospital.Nurse;
import BackendEnterpriseHospital.Patient;
import model.MainJFrameForm;
/**
 *
 * @author vidishaa
 */
public class AdminPageforPatient extends javax.swing.JPanel {

    /**
     * Creates new form AdminPageforPatient
     */
    MainJFrameForm MainLPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    Hospital hospital;

    public AdminPageforPatient(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, Hospital h) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.hospital = h;
        populatePatientTable();
    }

    public void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        model.setRowCount(0);

        for (Patient p : operatingSystem.getPatientDirectory()) {

            if (p.getHospiname().equals(hospital.getEnterprisename())) {
                Object[] row = new Object[5];
                row[0] = p.getPersonName();
                row[1] = p.getUserName();
                row[2] = p.getPatientdiagnosis();
                row[3] = p.getHospiname();
                model.addRow(row);

            }

        }
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
        tblPatient = new javax.swing.JTable();
        PatientTitle = new javax.swing.JLabel();
        deletebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "User Name", "Diagnosis", "Hospital Name"
            }
        ));
        jScrollPane1.setViewportView(tblPatient);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 190, 780, 160));

        PatientTitle.setBackground(new java.awt.Color(255, 255, 255));
        PatientTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PatientTitle.setText("Manage Patient Records");
        jPanel1.add(PatientTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        deletebtn.setBackground(new java.awt.Color(255, 204, 204));
        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 130, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/413051.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, -4, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1361, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatient.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        String patientUName = model.getValueAt(selectedRow, 1).toString();
        System.out.println(" nurse uname: " + patientUName);
        operatingSystem.deletePatient(patientUName);
        dB4OUtility.storeSystem(operatingSystem);
        populatePatientTable();
    }//GEN-LAST:event_deletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PatientTitle;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatient;
    // End of variables declaration//GEN-END:variables
}
