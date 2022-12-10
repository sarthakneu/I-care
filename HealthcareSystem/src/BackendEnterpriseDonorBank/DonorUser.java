/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendEnterpriseDonorBank;
import BackendOrganization.User;
import java.util.Date;

/**
 *
 * @author asus
 This Class holds all the functionalities for the DonorUser User
 */
public class DonorUser extends User{
    
    private String donorbankname;
    
    
    
    public DonorUser(String uname, String user_password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dob,String donorBankName) {
        super(uname, user_password, userId, PersonName, address, gender, phoneNumber, dob);
        this.donorbankname = donorBankName;
    }

    public String getDonorbankname() {
        return donorbankname;
    }
    
    

    public void setDonorbankname(String donorbankname) {
        this.donorbankname = donorbankname;
    }
}
