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
public class Doc extends User{

private String docSpecial;
private String hospiName;

    public Doc(String userName, String password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dateOfBirth, String docSpeciality,String hospitalName) {
        super(userName, password, userId, PersonName, address, gender, phoneNumber, dateOfBirth);
        this.docSpecial = docSpeciality;
        this.hospiName = hospitalName;
    }

    
    
    
    
    public String getHospiName() {
        return hospiName;
    }

    public void setHospiName(String hospiName) {
        this.hospiName = hospiName;
    }

    
    
    
    
    
    public String getDocSpecial() {
        return docSpecial;
    }

    public void setDocSpecial(String docSpecial) {
        this.docSpecial = docSpecial;
    }
}
