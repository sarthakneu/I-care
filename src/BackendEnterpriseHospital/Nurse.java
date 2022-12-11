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
public class Nurse extends User{
    
    private String hospiName;
    
    
    
    
    
    public String getHospiName() {
        return hospiName;
    }

    public void setHospiName(String hospiName) {
        this.hospiName = hospiName;
    }
    
    
    
    
    
    
    
    public Nurse(String userName, String password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dateOfBirth, String hospitalName) {
        super(userName, password, userId, PersonName, address, gender, phoneNumber, dateOfBirth);
        this.hospiName = hospitalName;
    }

}
