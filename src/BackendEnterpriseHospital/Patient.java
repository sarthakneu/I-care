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
    
    private String ptnDiagnosis;
    private String hospiName;

    

    public String getHospiName() {
        return hospiName;
    }

    public void setHospiName(String hospiName) {
        this.hospiName = hospiName;
    }
    
    
    public String getPtnDiagnosis() {
        return ptnDiagnosis;
    }

    public void setPtnDiagnosis(String ptnDiagnosis) {
        this.ptnDiagnosis = ptnDiagnosis;
    }
    
    
    
    public Patient(String userName, String password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dateOfBirth, String ptnDiagnosis, String hospitalName) {
        super(userName, password, userId, PersonName, address, gender, phoneNumber, dateOfBirth);
        this.ptnDiagnosis = ptnDiagnosis;
        this.hospiName = hospitalName;
    }
}
