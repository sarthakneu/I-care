/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperatingSystems;

import BackendEnterpriseDirectorie.HospiDirectory;
import BackendEnterpriseDonorBank.DonorUser;
import BackendEnterpriseDonorBank.DonorBank;
import BackendEnterpriseHospital.Doc;
import BackendEnterpriseHospital.Hospital;
import BackendEnterpriseHospital.Nurse;
import BackendEnterpriseHospital.Patient;
import BackendEnterpriseLab.Technician;
import BackendEnterpriseSupplyChain.Handler;
import BackendEnterpriseSupplyChain.Vehicle;
import BackendOrganization.DonationAssignment;
import BackendOrganization.User;
import java.util.ArrayList;

/**
 *
 * @author asus
 * This is class for all functional methods of the Application
 */
public class Operatesys {
    
    private static Operatesys os;
    private HospiDirectory HospiDirectory;
    private ArrayList<Doc> docDirectory;
    private ArrayList<DonorUser> donorDirectory;
    private ArrayList<DonorBank> donorBankDirectory;
    private ArrayList<Nurse> nurseDirectory;
    private ArrayList<Patient> patiDirectory;
    private ArrayList<DonationAssignment> donationAssignList;
    private ArrayList<Handler> handlerDirectory;
    private ArrayList<Vehicle> vehicleDirectory;
    private ArrayList<Technician> techDirectory;
    
    public Operatesys() {
        this.HospiDirectory = new HospiDirectory();
        this.docDirectory = new ArrayList();
        this.donorDirectory = new ArrayList();
        this.donorBankDirectory = new ArrayList();
        this.nurseDirectory = new ArrayList();
        this.patiDirectory = new ArrayList();
        this.donationAssignList = new ArrayList();
        this.handlerDirectory = new ArrayList();
        this.vehicleDirectory = new ArrayList();
        this.techDirectory = new ArrayList();
    }
    
    public static Operatesys getInstance() {
        if (os == null) {
            os = new Operatesys();
        }
        return os;
    }

    
    public ArrayList<Patient> getPatiDirectory() {
        return patiDirectory;
    }

    public void setPatiDirectory(ArrayList<Patient> patiDirectory) {
        this.patiDirectory = patiDirectory;
    }

    public HospiDirectory getHospiDirectory() {
        return HospiDirectory;
    }

    public void setHospiDirectory(HospiDirectory HospiDirectory) {
        this.HospiDirectory = HospiDirectory;
    }
    
    public void addHospital(Hospital hosp) {
        System.out.println("addHospital() in ecosystem: " + hosp.getEnterprisename());
        HospiDirectory.addHospital(hosp);
    }
    
    
    
    
    
    
    public static Operatesys getOs() {
        return os;
    }

    public static void setOs(Operatesys os) {
        Operatesys.os = os;
    }

    

    public ArrayList<DonorUser> getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(ArrayList<DonorUser> donorDirectory) {
        this.donorDirectory = donorDirectory;
    }
    
    public ArrayList<Vehicle> getVehicleDirectory() {
        return vehicleDirectory;
    }

    public void setVehicleDirectory(ArrayList<Vehicle> vehicleDirectory) {
        this.vehicleDirectory = vehicleDirectory;
    }
    
    
    public ArrayList<Doc> getDocDirectory() {
        return docDirectory;
    }

    public void setDocDirectory(ArrayList<Doc> docDirectory) {
        this.docDirectory = docDirectory;
    }
    
    
    
    
    
    
    public ArrayList<Nurse> getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(ArrayList<Nurse> nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }
    
    
    
    
    
    

    public ArrayList<DonorBank> getDonorBankDirectory() {
        return donorBankDirectory;
    }

    public void setDonorBankDirectory(ArrayList<DonorBank> donorBankDirectory) {
        this.donorBankDirectory = donorBankDirectory;
    }

    

    

    public ArrayList<DonationAssignment> getDonationAssignList() {
        return donationAssignList;
    }

    public void setDonationAssignList(ArrayList<DonationAssignment> donationAssignList) {
        this.donationAssignList = donationAssignList;
    }

    
    
    
    
    
    
    
    
    
    public ArrayList<Technician> getTechDirectory() {
        return techDirectory;
    }

    public void setTechDirectory(ArrayList<Technician> techDirectory) {
        this.techDirectory = techDirectory;
    }
    
    
    
    
    public ArrayList<Handler> getHandlerDirectory() {
        return handlerDirectory;
    }
    public void setHandlerDirectory(ArrayList<Handler> handlerDirectory) {
        this.handlerDirectory = handlerDirectory;
    }

    

    
    
    public void addDoctor(Doc doc) {
        try {
            docDirectory.add(doc);
        } catch (Exception e) {
            this.docDirectory = new ArrayList();
            docDirectory.add(doc);
            e.printStackTrace();
        }
    }

    public void addNurse(Nurse nur) {
        try {
            nurseDirectory.add(nur);
        } catch (Exception e) {
            this.nurseDirectory = new ArrayList();
            nurseDirectory.add(nur);
            e.printStackTrace();
        }
    }

    public void addPatient(Patient pat) {
        try {
            patiDirectory.add(pat);
        } catch (Exception e) {
            this.patiDirectory = new ArrayList();
            patiDirectory.add(pat);
            e.printStackTrace();
        }
    }
    
    public void addDonationAssignment(DonationAssignment newDonationAssignment) {
        try {
            donationAssignList.add(newDonationAssignment);

        } catch (Exception e) {
            this.donationAssignList = new ArrayList();
            donationAssignList.add(newDonationAssignment);
        }
    }

    public void addDonor(DonorUser newDonor) {
        try {
            donorDirectory.add(newDonor);
        } catch (Exception e) {
            this.donorDirectory = new ArrayList();
            donorDirectory.add(newDonor);

        }
    }

    public void addDonorBank(DonorBank newDonorBank) {
        try {
            donorBankDirectory.add(newDonorBank);
        } catch (Exception e) {
            this.donorBankDirectory = new ArrayList();
            donorBankDirectory.add(newDonorBank);
            e.printStackTrace();
        }
    }
    
    public void addHandler(Handler newHandler) {
        try {
            handlerDirectory.add(newHandler);
        } catch (Exception e) {
            this.handlerDirectory = new ArrayList();
            handlerDirectory.add(newHandler);

        }
    }

    public void addVehicle(Vehicle newVehicle) {
        try {
            vehicleDirectory.add(newVehicle);
        } catch (Exception e) {
            this.vehicleDirectory = new ArrayList();
            vehicleDirectory.add(newVehicle);

        }
    }

    public void addTechnician(Technician newTechnician) {
        try {
            techDirectory.add(newTechnician);
        } catch (Exception e) {
            this.techDirectory = new ArrayList();
            techDirectory.add(newTechnician);
        }
    }
    
    public Object loginAuthentication(String userId, String password) {

        for (Doc d : docDirectory) {
            System.out.println("LoginCheck(doc): " + d.getUseName() + " " + d.getPswd());
            if (d.getUseName().equals(userId) && d.getPswd().equals(password)) {
                return d;
            }
        }
        for (Hospital ho : HospiDirectory.getHospitallist()) {
            System.out.println("LoginCheck(ho): " + ho.getUsername() + " " + ho.getPasswd());
            if (ho.getUsername().equals(userId) && ho.getPasswd().equals(password)) {
                System.out.println("LoginCheck(): matched");
                return ho;
            }
        }

        for (Patient p : patiDirectory) {
            System.out.println("LoginCheck(doc): " + p.getUseName() + " " + p.getPswd());
            if (p.getUseName().equals(userId) && p.getPswd().equals(password)) {
                return p;
            }
        }

       
        for (DonorBank don : donorBankDirectory) {
            if (don.getUsername().equals(userId) && don.getPasswd().equals(password)) {
                return don;
            }
        }
        for (Handler don : handlerDirectory) {
            if (don.getUseName().equals(userId) && don.getPswd().equals(password)) {
                return don;
            }
        }

        for (Technician tech : techDirectory) {
            if (tech.getUseName().equals(userId) && tech.getPswd().equals(password)) {
                return tech;
            }
        }

        for (DonorUser don : donorDirectory) {
            if (don.getUseName().equals(userId) && don.getPswd().equals(password)) {
                return don;
            }
        }
        return null;
    }

    public void deleteDoctorUser(String doctorUserName) {
        for (Doc d : docDirectory) {
            if (d.getUseName().equals(doctorUserName)) {
                docDirectory.remove(d);
                return;
            }
        }
    }

    public void deleteNurseUser(String NurseUserName) {
        for (Nurse n : nurseDirectory) {
            if (n.getUseName().equals(NurseUserName)) {
                nurseDirectory.remove(n);
                return;
            }
        }
    }

    public void deletePatient(String PatientUserName) {
        for (Patient p : patiDirectory) {
            if (p.getUseName().equals(PatientUserName)) {
                patiDirectory.remove(p);
                return;
            }
        }
    }
    
    public void deleteDonorByUserName(String doctorUserName) {
        for (DonorUser n : donorDirectory) {
            if (n.getUseName().equals(doctorUserName)) {
                donorDirectory.remove(n);
                return;
            }
        }
    }
    
    public void deleteDonorBank(String donorBankUName) {
        for (DonorBank n : donorBankDirectory) {
            System.out.println("donorb " + n.getUsername());
            if (n.getUsername().equals(donorBankUName)) {
                System.out.println("found");
                donorBankDirectory.remove(n);
                return;
            }
        }
    }
    
    public void deleteDonor(String donorName) {
        for (DonorUser n : donorDirectory) {
            if (n.getUseName().equals(donorName)) {
                donorDirectory.remove(n);
                return;
            }
        }
    }

    public void deleteHandler(String HUname) {
        for (Handler n : handlerDirectory) {
            if (n.getUseName().equals(HUname)) {
                handlerDirectory.remove(n);
                return;
            }
        }
    }

    public void deleteVehicle(String vNumber) {
        for (Vehicle n : vehicleDirectory) {
            if (n.getVehiclenum().equals(vNumber)) {
                vehicleDirectory.remove(n);
                return;
            }
        }
    }
    
    public Doc getDoctorByUserName(String userName) {
        for (Doc d : docDirectory) {
            if (d.getUseName().equals(userName)) {
                return d;
            }
        }
        return null;
    }

    public User getPatientByUserName(String patientUserName) {
        for (Patient p : patiDirectory) {
            if (p.getUseName().equals(patientUserName)) {
                return p;
            }
        }
        for (DonorUser p : donorDirectory) {
            if (p.getUseName().equals(patientUserName)) {
                return p;
            }
        }
        return null;
    }

    public Vehicle getVehicleByNumber(String vehicleNo) {
        for (Vehicle v : vehicleDirectory) {
            if (v.getVehiclenum().matches(vehicleNo.substring(0, vehicleNo.indexOf("|")))) {
                return v;
            }
        }
        return null;
    }
    
    private Handler getHandlerByUserName(String handlerUserName) {
        for (Handler d : handlerDirectory) {
            if (d.getUseName().toLowerCase().equals(handlerUserName.toLowerCase())) {
                return d;
            }
        }
        return null;
    }

    private Technician getTechnicianByUserName(String technicianUserName) {
        for (Technician d : techDirectory) {
            if (d.getUseName().equals(technicianUserName)) {
                return d;
            }
        }
        return null;
    } 
    
    public void generateRequesting(String donateEntity, String handler, String tech, Hospital rec, String doc, String recPat) {
        Handler h = getHandlerByUserName(handler);
        Technician t = getTechnicianByUserName(tech);
        Doc d = getDoctorByUserName(doc);
        Patient p = (Patient) getPatientByUserName(recPat);
        for (DonationAssignment da : donationAssignList) {
            try {
                if (da.getId().equals(donateEntity)) {
                    da.setHandler(h);
                    da.setTechnician(t);
                    da.setRecordenterprise(rec);
                    da.setRecorddoc(d);
                    da.setRecordpatient(p);
                    da.setDonationStatus("Requested");
                    return;
                }
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }
    }
    
}
