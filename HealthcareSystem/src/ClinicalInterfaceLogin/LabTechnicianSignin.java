/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ClinicalInterfaceLogin;

import BackendDB4OUtility.DB4OUtility;
import OperatingSystems.OperatingSystem;
import BackendOrganization.DonationAssignment;
import BackendEnterpriseLab.Technician;

import model.MainJFrameForm;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vidishaa
 */
public class LabTechnicianSignin extends javax.swing.JPanel {

    /**
     * Creates new form LabTechnicianSignin
     */
    MainJFrameForm MainLPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    Technician t;
    
    public LabTechnicianSignin(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, Technician t) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.t = t;
        populateTable(t.getUserName());
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
        LabTitle = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        bloodtxt = new javax.swing.JTextField();
        reporttxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        Reportlbl = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        Bloodlbl = new javax.swing.JLabel();
        reportbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        commbtn = new javax.swing.JButton();
        bldgrpbtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        LabTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LabTitle.setText("Lab Technician Login");

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        bloodtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodtxtActionPerformed(evt);
            }
        });

        reporttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporttxtActionPerformed(evt);
            }
        });

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Blood group", "Entity name", "Status", "Donor Enterprise", "Receiver Enterprise", "Patient Name", "Donor name", "Report", "ID"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        Reportlbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        Reportlbl.setText("Report:");

        namelbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namelbl.setText("Name:");

        Bloodlbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        Bloodlbl.setText("Blood:");

        reportbtn.setBackground(new java.awt.Color(255, 255, 102));
        reportbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reportbtn.setText("Add Report");
        reportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportbtnActionPerformed(evt);
            }
        });

        logoutbtn.setBackground(new java.awt.Color(255, 204, 204));
        logoutbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        commbtn.setBackground(new java.awt.Color(255, 255, 102));
        commbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        commbtn.setText("Search by Entity Name");
        commbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commbtnActionPerformed(evt);
            }
        });

        bldgrpbtn.setBackground(new java.awt.Color(255, 255, 102));
        bldgrpbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bldgrpbtn.setText("Search by Blood Group");
        bldgrpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bldgrpbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namelbl)
                            .addComponent(Reportlbl)
                            .addComponent(Bloodlbl))
                        .addGap(347, 347, 347)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bldgrpbtn)
                            .addComponent(commbtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reporttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloodtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(reportbtn)))
                .addContainerGap(491, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(209, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LabTitle)
                .addGap(226, 226, 226)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reporttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reportlbl)
                    .addComponent(reportbtn))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(commbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namelbl))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bloodlbl)
                    .addComponent(bldgrpbtn))
                .addGap(46, 46, 46)
                .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(430, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void bloodtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodtxtActionPerformed

    private void reporttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reporttxtActionPerformed

    private void reportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tb1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to add comment");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        String id = model.getValueAt(selectedRow, 9).toString();
        //System.out.println("column count " + selectedRow);

        for (DonationAssignment c : operatingSystem.getDonationAssignmentList()) {
            try {
                if (c.getId().equals(id)) {
                    c.setDonationReport(reporttxt.getText().toString());
                }
            } catch (Exception e) {

            }
        }

        dB4OUtility.storeSystem(operatingSystem);
        populateTable(t.getUserName());
    }//GEN-LAST:event_reportbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void commbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commbtnActionPerformed
        // TODO add your handling code here:
        populateTableName(nametxt.getText().toLowerCase().toString());
    }//GEN-LAST:event_commbtnActionPerformed

    private void bldgrpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bldgrpbtnActionPerformed
        // TODO add your handling code here:
        populateTableBlood(bloodtxt.getText().toLowerCase().toString());
    }//GEN-LAST:event_bldgrpbtnActionPerformed

  
    private void populateTable(String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonationAssignment d : operatingSystem.getDonationAssignmentList()) {
            
            try{
            if (d.getTechnician().getUserName().matches(name)) {
                Object[] row = new Object[10];
                row[0] = d.getType();
                row[1] = d.getbGroup();
                row[2] = d.getDonationEntityName();
                row[3] = d.getDonationStatus();
                try {
                    row[4] = d.getDonEnterprise().getEnterprisename();
                } catch (Exception e) {

                }

                try {
                    row[5] = d.getRecEnterprise().getEnterprisename();
                } catch (Exception e) {

                }
                try {
                    row[6] = d.getRecPatient().getPersonName();
                } catch (Exception e) {

                }
                try {
                    row[7] = d.getDonPatient().getPersonName();
                } catch (Exception e) {

                }
                row[8] = d.getDonationReport();
                row[9] = d.getId();

                model.addRow(row);
            }
            }catch(Exception e){
                
            }

        }

    }
      
    private void populateTableBlood(String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonationAssignment d : operatingSystem.getDonationAssignmentList()) {

            if (d.getbGroup().toLowerCase().contains(name)) {
                Object[] row = new Object[10];
                row[0] = d.getType();
                row[1] = d.getbGroup();
                row[2] = d.getDonationEntityName();
                row[3] = d.getDonationStatus();
                try {
                    row[4] = d.getDonEnterprise().getEnterprisename();
                } catch (Exception e) {

                }

                try {
                    row[5] = d.getRecEnterprise().getEnterprisename();
                } catch (Exception e) {

                }
                try {
                    row[6] = d.getRecPatient().getPersonName();
                } catch (Exception e) {

                }
                try {
                    row[7] = d.getDonPatient().getPersonName();
                } catch (Exception e) {

                }
                row[8] = d.getDonationReport();
                row[9] = d.getId();
                model.addRow(row);
            }

        }

    }

    private void populateTableName(String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonationAssignment d : operatingSystem.getDonationAssignmentList()) {

            if (d.getDonationEntityName().toLowerCase().contains(name)) {
                Object[] row = new Object[10];
                row[0] = d.getType();
                row[1] = d.getbGroup();
                row[2] = d.getDonationEntityName();
                row[3] = d.getDonationStatus();
                try {
                    row[4] = d.getDonEnterprise().getEnterprisename();
                } catch (Exception e) {

                }

                try {
                    row[5] = d.getRecEnterprise().getEnterprisename();
                } catch (Exception e) {

                }
                try {
                    row[6] = d.getRecPatient().getPersonName();
                } catch (Exception e) {

                }
                try {
                    row[7] = d.getDonPatient().getPersonName();
                } catch (Exception e) {

                }

                row[8] = d.getDonationReport();
                row[9] = d.getId();
                model.addRow(row);
            }

        }

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bloodlbl;
    private javax.swing.JLabel LabTitle;
    private javax.swing.JLabel Reportlbl;
    private javax.swing.JButton bldgrpbtn;
    private javax.swing.JTextField bloodtxt;
    private javax.swing.JButton commbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton reportbtn;
    private javax.swing.JTextField reporttxt;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
