/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendOrganization;

import java.util.Date;

/**
 *
 * @author asus
 */
public class User {

private String useName;
private String pswd;
private String userId;
private String personame;
private String address;
private String gender;
private String phoneNum;
private Date dateOfBirth;

    public User(String userName, String password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dateOfBirth) {
        this.useName = userName;
        this.pswd = password;
        this.userId = userId;
        this.personame = PersonName;
        this.address = address;
        this.gender = gender;
        this.phoneNum = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
    
    

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    
    
    
    
    
    
    
    
    
    
    
    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getPersoname() {
        return personame;
    }

    public void setPersoname(String personame) {
        this.personame = personame;
    }

    
    
    
    
    
    
    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
    
    
    
    
    
    
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    
    
    
    
    
    
    
    
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    
    
    
    
    
    
    
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
