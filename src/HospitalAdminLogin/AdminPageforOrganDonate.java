/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HospitalAdminLogin;

import BackendDB4OUtility.DB4;
import OperatingSystems.Operatesys;
import BackendEnterpriseHospital.Hospital;
import BackendEnterpriseHospital.Doc;
import BackendEnterpriseHospital.Patient;
import BackendOrganization.DonationAssignment;
import BackendEnterpriseHospital.Nurse;
import model.MainJFrameForm;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author vidishaa
 */
public class AdminPageforOrganDonate extends javax.swing.JPanel {

    /**
     * Creates new form AdminPageforOrganDonate
     */
    MainJFrameForm MainLPage;
    private Operatesys operatingSystem;
    private DB4 dB4OUtility;
    Hospital hospital;

    public AdminPageforOrganDonate(MainJFrameForm MainLPage, DB4 dB4OUtility, Operatesys operatingSystem, Hospital h) {
        initComponents();
        System.out.println("AdminDonateOrg() init");
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.hospital = h;
        
        for (Doc d : operatingSystem.getDocDirectory()) {

            if (d.getHospiName().equals(hospital.getEnterprisename())) {
                doctorList.addItem(d.getUseName());
            }

        }
        
        for(Patient pa : operatingSystem.getPatiDirectory() ){
            if( pa.getHospiName().equals(hospital.getEnterprisename())){
                patList.addItem(pa.getUseName());
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
        doctorlbl = new javax.swing.JLabel();
        doctorList = new javax.swing.JComboBox<>();
        patientlbl = new javax.swing.JLabel();
        patList = new javax.swing.JComboBox<>();
        typelbl = new javax.swing.JLabel();
        Bldgrp_lbl = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        entitylbl = new javax.swing.JLabel();
        Bldgrp_txt = new javax.swing.JTextField();
        entityTxt = new javax.swing.JTextField();
        AddDntbtn = new javax.swing.JButton();
        DonateTitle = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctorlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctorlbl.setText("Doctor:");
        jPanel1.add(doctorlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        doctorList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jPanel1.add(doctorList, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 190, -1));

        patientlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patientlbl.setText("Patient:");
        jPanel1.add(patientlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        patList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jPanel1.add(patList, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 190, -1));

        typelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        typelbl.setText("Type:");
        jPanel1.add(typelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        Bldgrp_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Bldgrp_lbl.setText("Blood Group:");
        jPanel1.add(Bldgrp_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));
        jPanel1.add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 190, -1));

        entitylbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        entitylbl.setText("Entity Name:");
        jPanel1.add(entitylbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, 20));
        jPanel1.add(Bldgrp_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 190, -1));
        jPanel1.add(entityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 190, -1));

        AddDntbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddDntbtn.setText("Add Donation Entity");
        AddDntbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDntbtnActionPerformed(evt);
            }
        });
        jPanel1.add(AddDntbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 188, 40));

        DonateTitle.setBackground(new java.awt.Color(255, 255, 255));
        DonateTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DonateTitle.setText("Addition to Organ Donation");
        jPanel1.add(DonateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/donarimg.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddDntbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDntbtnActionPerformed
        // TODO add your handling code here:

        DonationAssignment de = new DonationAssignment();
        de.setDonationEntityName(entityTxt.getText().toString());
        Random rand = new Random();
        de.setId( String.format("%04d", rand.nextInt(10000)));
        de.setDonationenterprise(hospital);
        de.setBloodgroup(Bldgrp_txt.getText().toString());
        de.setType(txtType.getText().toString());
        de.setDonationdoc(operatingSystem.getDoctorByUserName(doctorList.getSelectedItem().toString()));
        de.setDonationpatient(operatingSystem.getPatientByUserName(patList.getSelectedItem().toString()));
        de.setDonationStatus("available");
        //        System.out.println("dede: "+de.getDonorDoctor().getName());
        operatingSystem.addDonationAssignment(de);

        dB4OUtility.storeSystem(operatingSystem);
        JOptionPane.showMessageDialog(this, "Entity added!");

    }//GEN-LAST:event_AddDntbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDntbtn;
    private javax.swing.JLabel Bldgrp_lbl;
    private javax.swing.JTextField Bldgrp_txt;
    private javax.swing.JLabel DonateTitle;
    private javax.swing.JComboBox<String> doctorList;
    private javax.swing.JLabel doctorlbl;
    private javax.swing.JTextField entityTxt;
    private javax.swing.JLabel entitylbl;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> patList;
    private javax.swing.JLabel patientlbl;
    private javax.swing.JTextField txtType;
    private javax.swing.JLabel typelbl;
    // End of variables declaration//GEN-END:variables
}
