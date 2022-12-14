/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HealthcareInterfaceLogin;

import BackendDB4OUtility.DB4;
import OperatingSystems.Operatesys;
import BackendEnterpriseHospital.Hospital;
import BackendEnterpriseHospital.Patient;

import HospitalAdminLogin.AdminPageForDoctor;
import HospitalAdminLogin.AdminPageForNurses;
import HospitalAdminLogin.AdminPageforOrganDonate;
import HospitalAdminLogin.AdminPageforPatient;
import HospitalAdminLogin.AdminReceiveOrgan;
import HospitalAdminLogin.AdminTransplant;
import model.MainJFrameForm;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author vidishaa
 */
public class AdminLogin extends javax.swing.JPanel {

    /**
     * Creates new form AdminLogin
     */
    
    MainJFrameForm MainLPage;
    private Operatesys operatingSystem;
    private DB4 dB4OUtility;
    Hospital hospital;
    

        public AdminLogin(MainJFrameForm MainLPage, DB4 dB4OUtility, Operatesys operatingSystem, Hospital h) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.hospital = h;
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
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        DocBtn = new javax.swing.JButton();
        PatentBtn = new javax.swing.JButton();
        DonOrgBtn = new javax.swing.JButton();
        NursesBtn = new javax.swing.JButton();
        ReceiveBtn = new javax.swing.JButton();
        TransplantBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelArea2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DocBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DocBtn.setText("Doctors");
        DocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DocBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 121, -1));

        PatentBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PatentBtn.setText("Patients");
        PatentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatentBtnActionPerformed(evt);
            }
        });
        jPanel2.add(PatentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 121, -1));

        DonOrgBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DonOrgBtn.setText("Donate Organ");
        DonOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonOrgBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DonOrgBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 121, -1));

        NursesBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NursesBtn.setText("Nurses");
        NursesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NursesBtnActionPerformed(evt);
            }
        });
        jPanel2.add(NursesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 121, -1));

        ReceiveBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ReceiveBtn.setText("Receive Organ");
        ReceiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiveBtnActionPerformed(evt);
            }
        });
        jPanel2.add(ReceiveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 121, -1));

        TransplantBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TransplantBtn.setText("Transplants");
        TransplantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransplantBtnActionPerformed(evt);
            }
        });
        jPanel2.add(TransplantBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 121, -1));

        LogOutBtn.setBackground(new java.awt.Color(0, 204, 255));
        LogOutBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LogOutBtn.setText("Logout");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        jPanel2.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 121, 80));

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelArea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/hospital ambience_1.jpg"))); // NOI18N
        jPanel3.add(jLabelArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2020, 1020));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Hospital Admin Login");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 31, -1, -1));

        jSplitPane1.setRightComponent(jPanel3);

        jPanel1.add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2454, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocBtnActionPerformed
        // TODO add your handling code here:
        AdminPageForDoctor ad = new AdminPageForDoctor(MainLPage, dB4OUtility, operatingSystem, hospital);
        jSplitPane1.setRightComponent(ad);
    }//GEN-LAST:event_DocBtnActionPerformed

    private void PatentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatentBtnActionPerformed
        // TODO add your handling code here:
        AdminPageforPatient ap = new AdminPageforPatient(MainLPage, dB4OUtility, operatingSystem, hospital);
        jSplitPane1.setRightComponent(ap);
    }//GEN-LAST:event_PatentBtnActionPerformed

    private void DonOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonOrgBtnActionPerformed
        // TODO add your handling code here:
        AdminPageforOrganDonate ado = new AdminPageforOrganDonate(MainLPage, dB4OUtility, operatingSystem, hospital);
        System.out.println("AdminDonateOrg()");
        jSplitPane1.setRightComponent(ado);
    }//GEN-LAST:event_DonOrgBtnActionPerformed

    private void NursesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NursesBtnActionPerformed
        // TODO add your handling code here:
        AdminPageForNurses an = new AdminPageForNurses(MainLPage, dB4OUtility, operatingSystem, hospital);
        jSplitPane1.setRightComponent(an);
    }//GEN-LAST:event_NursesBtnActionPerformed

    private void ReceiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiveBtnActionPerformed
        // TODO add your handling code here:
        AdminReceiveOrgan aro = new AdminReceiveOrgan(MainLPage, dB4OUtility, operatingSystem, hospital);
        jSplitPane1.setRightComponent(aro);
    }//GEN-LAST:event_ReceiveBtnActionPerformed

    private void TransplantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransplantBtnActionPerformed
        // TODO add your handling code here:
        AdminTransplant at = new AdminTransplant(MainLPage, dB4OUtility, operatingSystem, hospital);
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_TransplantBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        // TODO add your handling code here:
        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_LogOutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DocBtn;
    private javax.swing.JButton DonOrgBtn;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton NursesBtn;
    private javax.swing.JButton PatentBtn;
    private javax.swing.JButton ReceiveBtn;
    private javax.swing.JButton TransplantBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelArea2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
