/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DonarLogin;



import BackendDB4OUtility.DB4;
import OperatingSystems.Operatesys;
import BackendEnterpriseDonorBank.DonorUser;
import BackendEnterpriseDonorBank.DonorBank;
import BackendOrganization.DonationAssignment;
import DonarAdminBankLogin.DonarAdminOrganDonate;
import DonarAdminBankLogin.DonarAdminDonarList;
import DonarAdminBankLogin.DonarAdminTransplant;
import model.MainJFrameForm;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author vidishaa
 */
public class DonarBankAdminLogin extends javax.swing.JPanel {

    /**
     * Creates new form DonarBankAdminLogin
     */
    MainJFrameForm MainLPage;
    private Operatesys operatingSystem;
    private DB4 dB4OUtility;
    DonorBank donorBank;
    
    public DonarBankAdminLogin(MainJFrameForm MainLPage, DB4 dB4OUtility, Operatesys operatingSystem, DonorBank donbank) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.donorBank = donbank;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btn_donateOrgan = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_transplant1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btn_donateOrgan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_donateOrgan.setText("Organ Donar");
        btn_donateOrgan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_donateOrganActionPerformed(evt);
            }
        });

        btn_logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_transplant1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_transplant1.setText("Transplant");
        btn_transplant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transplant1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_donateOrgan)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btn_logout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_transplant1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btn_donateOrgan)
                .addGap(102, 102, 102)
                .addComponent(btn_transplant1)
                .addGap(119, 119, 119)
                .addComponent(btn_logout)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_donateOrganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_donateOrganActionPerformed
        // TODO add your handling code here:
        DonarAdminOrganDonate dado = new DonarAdminOrganDonate(MainLPage, dB4OUtility, operatingSystem, donorBank);
        jSplitPane1.setRightComponent(dado);
    }//GEN-LAST:event_btn_donateOrganActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_transplant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transplant1ActionPerformed
        // TODO add your handling code here:
        DonarAdminTransplant dat = new DonarAdminTransplant(MainLPage, dB4OUtility, operatingSystem, donorBank);
        jSplitPane1.setRightComponent(dat);
    }//GEN-LAST:event_btn_transplant1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_donateOrgan;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_transplant1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
