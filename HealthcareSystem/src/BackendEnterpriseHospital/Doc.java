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

private String SpecialityDoc;
private String Hospiname;

    public Doc(String userName, String password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dateOfBirth, String docSpeciality,String hospitalName) {
        super(userName, password, userId, PersonName, address, gender, phoneNumber, dateOfBirth);
        this.SpecialityDoc = docSpeciality;
        this.Hospiname = hospitalName;
    }

   

    public void setHospiname(String Hospiname) {
        this.Hospiname = Hospiname;
    }
    
     public String getHospiname() {
        return Hospiname;
    }

    
    
    public void setSpecialityDoc(String SpecialityDoc) {
        this.SpecialityDoc = SpecialityDoc;
    }
    
    public String getSpecialityDoc() {
        return SpecialityDoc;
    }

}
