/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendEnterpriseLab;

import BackendOrganization.User;
import java.util.Date;

/**
 *
 * @author asus
 */
public class Technician extends User {
    
    private String labName;
    
    public Technician(String userName, String password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dateOfBirth, String laboratoryName) {
        super(userName, password, userId, PersonName, address, gender, phoneNumber, dateOfBirth);
        this.labName = laboratoryName;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }
}

