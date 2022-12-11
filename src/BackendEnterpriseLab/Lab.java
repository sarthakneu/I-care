/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendEnterpriseLab;

import BackendEnterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Lab extends Enterprise{
    
    private ArrayList<Technician> technicia;
    
    public Lab(String address, String userName, String pwd, String enterpriseName, String regNumber) {
        super(address, userName, pwd, enterpriseName, regNumber);
        this.technicia = new ArrayList();
    }

    
    
    public ArrayList<Technician> getTechnicia() {
        return technicia;
    }

    
    
    
    
    
    public void setTechnicia(ArrayList<Technician> technicia) {
        this.technicia = technicia;
    }
}

