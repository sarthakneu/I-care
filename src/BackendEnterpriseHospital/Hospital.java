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

    private ArrayList<Doc> docDirectory;
    private ArrayList<Nurse> nurDirectory;
    private ArrayList<Patient> patDirectory;

    public Hospital(String address, String userName, String pwd, String enterpriseName, String regNumber) {
        super(address, userName, pwd, enterpriseName, regNumber);

        this.docDirectory = new ArrayList();
        this.nurDirectory = new ArrayList();
        this.patDirectory = new ArrayList();

    }

    public ArrayList<Doc> getDocDirectory() {
        return docDirectory;
    }

    public void setDocDirectory(ArrayList<Doc> docDirectory) {
        this.docDirectory = docDirectory;
    }

    

    public ArrayList<Patient> getPatDirectory() {
        return patDirectory;
    }

    public void setPatDirectory(ArrayList<Patient> patDirectory) {
        this.patDirectory = patDirectory;
    }
    
    
    
    public ArrayList<Nurse> getNurDirectory() {
        return nurDirectory;
    }

    public void setNurDirectory(ArrayList<Nurse> nurDirectory) {
        this.nurDirectory = nurDirectory;
    }
    
    

    public void addNurse(Nurse nurse) {
        nurDirectory.add(nurse);
    }

    
    
    
    
    
    public void addPatient(Patient patient) {
        patDirectory.add(patient);
    }
    
    public void addDoctor(Doc doc) {
        docDirectory.add(doc);
    }
}
