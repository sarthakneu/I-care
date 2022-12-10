/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendEnterpriseHospital;

import BackendEnterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Hospital extends Enterprise {

    private ArrayList<Doc> docdirectory;
    private ArrayList<Nurse> nursedirectory;
    private ArrayList<Patient> patientdirectory;

    public Hospital(String address, String userName, String pwd, String enterpriseName, String regNumber) {
        super(address, userName, pwd, enterpriseName, regNumber);

        this.docdirectory = new ArrayList();
        this.nursedirectory = new ArrayList();
        this.patientdirectory = new ArrayList();

    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public ArrayList<Doc> getDocdirectory() {
        return docdirectory;
    }

    public void setDocdirectory(ArrayList<Doc> docdirectory) {
        this.docdirectory = docdirectory;
    }

    public ArrayList<Nurse> getNursedirectory() {
        return nursedirectory;
    }

    public void setNursedirectory(ArrayList<Nurse> nursedirectory) {
        this.nursedirectory = nursedirectory;
    }

    public ArrayList<Patient> getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(ArrayList<Patient> patientdirectory) {
        this.patientdirectory = patientdirectory;
    }

    public void addNurse(Nurse nurse) {
        nursedirectory.add(nurse);
    }

    public void addPatient(Patient patient) {
        patientdirectory.add(patient);
    }
    
    public void addDoctor(Doc doc) {
        docdirectory.add(doc);
    }
}
