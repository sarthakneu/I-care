/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package OrganBankInterface;

import BackendDB4OUtility.DB4OUtility;
import OperatingSystems.OperatingSystem;
import BackendEnterpriseDonorBank.DonorUser;
import BackendEnterpriseDonorBank.DonorBank;
import model.MainJFrameForm;
import java.awt.Color;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author vidishaa
 */
public class DonarBankSignUp extends javax.swing.JPanel {

    /**
     * Creates new form DonarBankSignUp
     */
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    
    MainJFrameForm MainLPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    
    public DonarBankSignUp(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        
        for(DonorBank db: operatingSystem.getDonorBankDirectory()){
            donorbnknamecmb.addItem(db.getEnterprisename());
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

        lbl_admintitle = new javax.swing.JLabel();
        Name_lbl = new javax.swing.JLabel();
        FullNametxt = new javax.swing.JTextField();
        uname_lbl = new javax.swing.JLabel();
        Usernametxt = new javax.swing.JTextField();
        pswd_lbl = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        addrlbl = new javax.swing.JLabel();
        Addtxt = new javax.swing.JTextField();
        Citylbl = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        Statelbl = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        Ziplbl = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        signupbtn = new javax.swing.JButton();
        genderlbl = new javax.swing.JLabel();
        gendercmb = new javax.swing.JComboBox<>();
        telenumlbl = new javax.swing.JLabel();
        telenumtxt = new javax.swing.JTextField();
        doblbl = new javax.swing.JLabel();
        dobtxt = new javax.swing.JTextField();
        donorbnknamelbl = new javax.swing.JLabel();
        donorbnknamecmb = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 204, 204));

        lbl_admintitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_admintitle.setText("Create Donor Profile");

        Name_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Name_lbl.setText("Name:");

        FullNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNametxtActionPerformed(evt);
            }
        });
        FullNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FullNametxtKeyReleased(evt);
            }
        });

        uname_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        uname_lbl.setText("Username:");

        Usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernametxtActionPerformed(evt);
            }
        });

        pswd_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pswd_lbl.setText("Password:");

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        addrlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addrlbl.setText("Address:");

        Addtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtxtActionPerformed(evt);
            }
        });
        Addtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AddtxtKeyReleased(evt);
            }
        });

        Citylbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Citylbl.setText("City:");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });

        Statelbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Statelbl.setText("State:");

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });
        txtState.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStateKeyReleased(evt);
            }
        });

        Ziplbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ziplbl.setText("Zip Code:");

        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });
        txtZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipKeyReleased(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        signupbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signupbtn.setText("Sign Up");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        genderlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        genderlbl.setText("Gender:");

        gendercmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gendercmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        telenumlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        telenumlbl.setText("Phone no.:");

        telenumtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telenumtxtActionPerformed(evt);
            }
        });
        telenumtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telenumtxtKeyReleased(evt);
            }
        });

        doblbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        doblbl.setText("Date of Birth:");

        dobtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobtxtActionPerformed(evt);
            }
        });
        dobtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dobtxtKeyReleased(evt);
            }
        });

        donorbnknamelbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        donorbnknamelbl.setText("Donor Bank:");

        donorbnknamecmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        donorbnknamecmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorbnknamecmbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(Name_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FullNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(uname_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(pswd_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(addrlbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Addtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(Citylbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(Statelbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(telenumlbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telenumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(signupbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(lbl_admintitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genderlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gendercmb, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ziplbl)
                                .addGap(10, 10, 10)
                                .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(donorbnknamelbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(donorbnknamecmb, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doblbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(311, 311, 311))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbl_admintitle)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FullNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uname_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pswd_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addrlbl))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Citylbl))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Statelbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(Ziplbl))
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderlbl)
                    .addComponent(gendercmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telenumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telenumlbl))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doblbl)
                    .addComponent(dobtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorbnknamelbl)
                    .addComponent(donorbnknamecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FullNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNametxtActionPerformed
    }//GEN-LAST:event_FullNametxtActionPerformed

    private void FullNametxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FullNametxtKeyReleased
    }//GEN-LAST:event_FullNametxtKeyReleased

    private void UsernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernametxtActionPerformed
    }//GEN-LAST:event_UsernametxtActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
    }//GEN-LAST:event_txtPassActionPerformed

    private void AddtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtxtActionPerformed
    }//GEN-LAST:event_AddtxtActionPerformed

    private void AddtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddtxtKeyReleased
    }//GEN-LAST:event_AddtxtKeyReleased

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtStateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateKeyReleased
    }//GEN-LAST:event_txtStateKeyReleased

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
    }//GEN-LAST:event_txtZipActionPerformed

    private void txtZipKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyReleased
    }//GEN-LAST:event_txtZipKeyReleased

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        // TODO add your handling code here:
        try {
            if(EmpytyFieldValidation())
            {
                if(RegexValidation())
                {
                    String address = Addtxt.getText() + "," + txtCity.getText() + "," + txtState.getText() + "," + txtZip.getText();

                    DonorUser donor = new DonorUser(Usernametxt.getText(), txtPass.getText(), "idid", FullNametxt.getText(), address, gendercmb.getSelectedItem().toString(), telenumtxt.getText(), new Date(),donorbnknamecmb.getSelectedItem().toString());

                    operatingSystem.addDonor(donor);
                    dB4OUtility.storeSystem(operatingSystem);

                    MainJFrameForm suc = new MainJFrameForm();
                    ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
                    suc.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Some Error in entered data.Please check over the red fields to know more.");
                    validationCheck=true;
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Data Cant be empty. Please check over the red fields to know more.");
                emptyValidationStatus=true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Donor not registered, Try again");
            emptyValidationStatus=true;
        }
        
    }//GEN-LAST:event_signupbtnActionPerformed

    private void telenumtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telenumtxtActionPerformed
    }//GEN-LAST:event_telenumtxtActionPerformed

    private void telenumtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telenumtxtKeyReleased
    }//GEN-LAST:event_telenumtxtKeyReleased

    private void dobtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobtxtActionPerformed
    }//GEN-LAST:event_dobtxtActionPerformed

    private void dobtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobtxtKeyReleased
    }//GEN-LAST:event_dobtxtKeyReleased

    private void donorbnknamecmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorbnknamecmbActionPerformed
    }//GEN-LAST:event_donorbnknamecmbActionPerformed

    private boolean RegexValidation() {
    if(!FullNametxt.getText().matches("^[a-zA-Z ]+$"))
        {
            FullNametxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            FullNametxt.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(!telenumtxt.getText().matches("^[0-9]{10}$"))
        {
            telenumtxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            telenumtxt.setToolTipText("Please enter a 10 digit number");
            validationCheck=false;
        }


        if(!txtZip.getText().matches("^[0-9]{5}$"))
        {
            txtZip.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtZip.setToolTipText("Please enter a 5 digit number");
            validationCheck=false;
        }

        // if(!gendercmb.getText().matches("^[0-9]{5}$"))
        // {
        //     gendercmb.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        //     gendercmb.setToolTipText("Please enter a 5 digit number");
        //     validationCheck=false;
        // }

        return validationCheck;


    }   


    private boolean EmpytyFieldValidation() {
        if(Addtxt.getText().equals(null) || Addtxt.getText().trim().isEmpty() )
        {
            Addtxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            Addtxt.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!Addtxt.getText().equals(null) && !Addtxt.getText().trim().isEmpty() )
        {
            Addtxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(txtCity.getText().equals(null) || txtCity.getText().trim().isEmpty() )
        {
            txtCity.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCity.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtCity.getText().equals(null) && !txtCity.getText().trim().isEmpty() )
        {
            txtCity.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(FullNametxt.getText().equals(null) || FullNametxt.getText().trim().isEmpty() )
        {
            FullNametxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            FullNametxt.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!FullNametxt.getText().equals(null) && !FullNametxt.getText().trim().isEmpty() )
        {
            FullNametxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(txtPass.getText().equals(null) || txtPass.getText().trim().isEmpty() )
        {
            txtPass.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPass.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtPass.getText().equals(null) && !txtPass.getText().trim().isEmpty() )
        {
            txtPass.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(txtState.getText().equals(null) || txtState.getText().trim().isEmpty() )
        {
            txtState.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtState.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtState.getText().equals(null) && !txtState.getText().trim().isEmpty() )
        {
            txtState.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(Usernametxt.getText().equals(null) || Usernametxt.getText().trim().isEmpty() )
            {
                Usernametxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                Usernametxt.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!Usernametxt.getText().equals(null) && !Usernametxt.getText().trim().isEmpty() )
        {
            Usernametxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(txtZip.getText().equals(null) || txtZip.getText().trim().isEmpty() )
            {
                txtZip.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                txtZip.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!txtZip.getText().equals(null) && !txtZip.getText().trim().isEmpty() )
        {
            txtZip.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        // if(gendercmb.getText().equals(null) || gendercmb.getText().trim().isEmpty() )
        //     {
        //         gendercmb.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        //         gendercmb.setToolTipText("This Field Cannot be empty");
        //         emptyValidationStatus= false;
        //     }
        // if(!gendercmb.getText().equals(null) && !gendercmb.getText().trim().isEmpty() )
        // {
        //     gendercmb.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        // }

        if(telenumtxt.getText().equals(null) || telenumtxt.getText().trim().isEmpty() )
            {
                telenumtxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                telenumtxt.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!telenumtxt.getText().equals(null) && !telenumtxt.getText().trim().isEmpty() )
        {
            telenumtxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(dobtxt.getText().equals(null) || dobtxt.getText().trim().isEmpty() )
            {
                dobtxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                dobtxt.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!dobtxt.getText().equals(null) && !dobtxt.getText().trim().isEmpty() )
        {
            dobtxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        return emptyValidationStatus;
    }

    
    /*
        try {
            if(EmpytyFieldValidation())
            {
                if(RegexValidation())
                {
                    String address = addresstxt.getText() + citytxt.getText() + state_txt.getText() + lblzip.getText();
                    //uname, pswd, id, name, add, gender, telenum, dob
                    //(txtFullName.getText(), txtNo.getText(), address, txtUsrName.getText(), txtPass.getText());

                    Technician tech = new Technician(usrnametxt.getText(), passtxt.getText(), "idid", fullname_txt.getText(), address, gender_cmb.getSelectedItem().toString(), telenum_txt.getText(), new Date(),labname_txt.getText());

                    operatingSystem.addTechnician(tech);
                    dB4OUtility.storeSystem(operatingSystem);

                    MainJFrameForm suc = new MainJFrameForm();
                    ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
                    suc.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Some Error in entered data.Please check over the red fields to know more.");
                    validationCheck=true;
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Data Cant be empty. Please check over the red fields to know more.");
                emptyValidationStatus=true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Patient not registered, Try again");
            emptyValidationStatus=true;
        }
        */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Addtxt;
    private javax.swing.JLabel Citylbl;
    private javax.swing.JTextField FullNametxt;
    private javax.swing.JLabel Name_lbl;
    private javax.swing.JLabel Statelbl;
    private javax.swing.JTextField Usernametxt;
    private javax.swing.JLabel Ziplbl;
    private javax.swing.JLabel addrlbl;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel doblbl;
    private javax.swing.JTextField dobtxt;
    private javax.swing.JComboBox<String> donorbnknamecmb;
    private javax.swing.JLabel donorbnknamelbl;
    private javax.swing.JComboBox<String> gendercmb;
    private javax.swing.JLabel genderlbl;
    private javax.swing.JLabel lbl_admintitle;
    private javax.swing.JLabel pswd_lbl;
    private javax.swing.JButton signupbtn;
    private javax.swing.JLabel telenumlbl;
    private javax.swing.JTextField telenumtxt;
    private javax.swing.JTextField txtCity;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZip;
    private javax.swing.JLabel uname_lbl;
    // End of variables declaration//GEN-END:variables
}
