/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HospitalAdminLogin;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import BackendDB4OUtility.DB4;
import OperatingSystems.Operatesys;
import BackendEnterpriseHospital.Hospital;
import BackendEnterpriseHospital.Doc;
import BackendEnterpriseHospital.Patient;
import BackendEnterpriseLab.Technician;
import BackendEnterpriseSupplyChain.Handler;
import BackendEnterpriseSupplyChain.Vehicle;
import BackendOrganization.DonationAssignment;
import model.MainJFrameForm;




/**
 *
 * @author vidishaa
 */
public class AdminReceiveOrgan extends javax.swing.JPanel {

    /**
     * Creates new form AdminReceiveOrgan
     */
    MainJFrameForm MainLPage;
    private Operatesys operatingSystem;
    private DB4 dB4OUtility;
    Hospital hospital;

    public AdminReceiveOrgan(MainJFrameForm MainLPage, DB4 dB4OUtility, Operatesys operatingSystem, Hospital h) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.hospital = h;

        populateTable();
        populateVehicleTable();
        populateLabTable();

        for (Doc d : operatingSystem.getDocDirectory()) {

            if (d.getHospiName().equals(hospital.getEnterprisename())) {
                DocCmb.addItem(d.getUseName());
            }

        }

        for (Patient pa : operatingSystem.getPatiDirectory()) {
            if (pa.getHospiName().equals(hospital.getEnterprisename())) {
                Patcmb.addItem(pa.getUseName());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        titlelbl = new javax.swing.JLabel();
        reqbtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        blood = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        DocCmb = new javax.swing.JComboBox<>();
        Doclbl = new javax.swing.JLabel();
        Patcmb = new javax.swing.JComboBox<>();
        patlbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Type", "Blood group", "Entity name", "Status", "id"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 83, 593, 138));

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Handler Name", "Vehicle Name", "Vehicle Type", "Vehicle Number", "Description"
            }
        ));
        jScrollPane2.setViewportView(tb2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 333, 585, 126));

        titlelbl.setBackground(new java.awt.Color(255, 255, 255));
        titlelbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titlelbl.setText("Search and Receive organ");
        add(titlelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        reqbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reqbtn.setText("Generate request");
        reqbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqbtnActionPerformed(evt);
            }
        });
        add(reqbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 659, -1, 40));

        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Technician Name", "Lab Name"
            }
        ));
        jScrollPane3.setViewportView(tb3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 477, 585, 126));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Blood:");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Dual Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Entity:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blood, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 239, -1, -1));

        add(DocCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 649, 118, -1));

        Doclbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Doclbl.setText("Doctor:");
        add(Doclbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 653, -1, -1));

        add(Patcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 689, 118, -1));

        patlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patlbl.setText("Patient:");
        add(patlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 693, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/hospitalimg.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 870, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void reqbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow1 = tb1.getSelectedRow();
        int selectedRow2 = tb2.getSelectedRow();
        int selectedRow3 = tb3.getSelectedRow();

        if (selectedRow1 < 0 || selectedRow2 < 0 || selectedRow3 < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to generate a request.");
            return;
        }
        DefaultTableModel organAvailable = (DefaultTableModel) tb1.getModel();
        String donateEntity = organAvailable.getValueAt(selectedRow1, 4).toString();

        DefaultTableModel handlerList = (DefaultTableModel) tb2.getModel();
        String handler = handlerList.getValueAt(selectedRow2, 0).toString();
        System.out.println("print: " + handler);

        DefaultTableModel technicianList = (DefaultTableModel) tb3.getModel();
        String tech = technicianList.getValueAt(selectedRow3, 0).toString();
        System.out.println(" " + donateEntity + " " + handler + " " + tech);

        operatingSystem.generateRequesting(donateEntity, handler, tech, hospital, DocCmb.getSelectedItem().toString(), Patcmb.getSelectedItem().toString());
        dB4OUtility.storeSystem(operatingSystem);
        JOptionPane.showMessageDialog(this, "Request generated");
    }//GEN-LAST:event_reqbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTableName(name.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        populateTableBlood(blood.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        populateTableDual(blood.getText(),name.getText() );
    }//GEN-LAST:event_jButton4ActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable" + operatingSystem.getDonationAssignList().toString());
        for (DonationAssignment d : operatingSystem.getDonationAssignList()) {
            System.out.println("populatetable " + d.getDonationEntityName());

            Object[] row = new Object[5];
            row[0] = d.getType();
            row[1] = d.getBloodgroup();
            row[2] = d.getDonationEntityName();
            row[3] = d.getDonationStatus();
            row[4] = d.getId();
            model.addRow(row);

        }

    }

    private void populateTableDual(String blood, String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonationAssignment d : operatingSystem.getDonationAssignList()) {

            if (d.getBloodgroup().contains(blood) && d.getDonationEntityName().contains(name)) {
                Object[] row = new Object[5];
                row[0] = d.getType();
                row[1] = d.getBloodgroup();
                row[2] = d.getDonationEntityName();
                row[3] = d.getDonationStatus();
                row[4] = d.getId();
                model.addRow(row);
            }

        }

    }

    private void populateVehicleTable() {
        DefaultTableModel model = (DefaultTableModel) tb2.getModel();
        model.setRowCount(0);
        System.out.println("populatetable" + operatingSystem.getDonationAssignList().toString());
        for (Handler h : operatingSystem.getHandlerDirectory()) {

            Object[] row = new Object[5];
            try {
                row[0] = h.getUseName();
                row[1] = h.getVehicle().getVehiclename();
                row[2] = h.getVehicle().getVehicletype();
                row[3] = h.getVehicle().getVehiclenum();
                row[4] = h.getVehicle().getVehicaldescription();
            } catch (Exception e) {
            }
            model.addRow(row);

        }

    }

    private void populateLabTable() {
        DefaultTableModel model = (DefaultTableModel) tb3.getModel();
        model.setRowCount(0);
        System.out.println("populatetable" + operatingSystem.getDonationAssignList().toString());
        for (Technician h : operatingSystem.getTechDirectory()) {

            Object[] row = new Object[5];
            row[0] = h.getUseName();
            row[1] = h.getLabName();

            model.addRow(row);

        }

    }

    private void populateTableBlood(String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonationAssignment d : operatingSystem.getDonationAssignList()) {

            if (d.getBloodgroup().contains(name)) {
                Object[] row = new Object[5];
                row[0] = d.getType();
                try {
                    row[1] = d.getBloodgroup();
                    row[2] = d.getDonationEntityName();
                    row[3] = d.getDonationStatus();
                    row[4] = d.getId();
                } catch (Exception e) {

                }
                model.addRow(row);
            }

        }

    }

    private void populateTableName(String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonationAssignment d : operatingSystem.getDonationAssignList()) {
//            System.log.println(d.getDonationEntityName().toLowerCase());
            if (d.getDonationEntityName().contains(name)) {
                Object[] row = new Object[5];
                row[0] = d.getType();
                row[1] = d.getBloodgroup();
                row[2] = d.getDonationEntityName();
                row[3] = d.getDonationStatus();
                row[4] = d.getId();
                model.addRow(row);
            }

        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DocCmb;
    private javax.swing.JLabel Doclbl;
    private javax.swing.JComboBox<String> Patcmb;
    private javax.swing.JTextField blood;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField name;
    private javax.swing.JLabel patlbl;
    private javax.swing.JButton reqbtn;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTable tb3;
    private javax.swing.JLabel titlelbl;
    // End of variables declaration//GEN-END:variables
}
