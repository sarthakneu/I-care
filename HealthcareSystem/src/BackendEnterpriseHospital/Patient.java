/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendEnterpriseHospital;

import BackendOrganization.User;
import java.util.Date;

/**
 *
 * @author asus
 */
public class Patient extends User {
    
    private String patientdiagnosis;
    private String hospiname;


    public void setPatientdiagnosis(String patientdiagnosis) {
        this.patientdiagnosis = patientdiagnosis;
    }
    
    
    public String getPatientdiagnosis() {
        return patientdiagnosis;
    }

    

    
    
    
    
    
    
    
    
    
    public void setHospiname(String hospiname) {
        this.hospiname = hospiname;
    }
    
    public String getHospiname() {
        return hospiname;
    }
    
    
    public Patient(String userName, String password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dateOfBirth, String ptnDiagnosis, String hospitalName) {
        super(userName, password, userId, PersonName, address, gender, phoneNumber, dateOfBirth);
        this.patientdiagnosis = ptnDiagnosis;
        this.hospiname = hospitalName;
    }
}
