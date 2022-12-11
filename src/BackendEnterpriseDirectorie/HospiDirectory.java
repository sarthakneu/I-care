/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendEnterpriseDirectorie;

import BackendEnterpriseHospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class HospiDirectory {
    
    private ArrayList<Hospital> Hospitallist;
 
    public HospiDirectory(){
        Hospitallist = new ArrayList();
    }

    public void addHospital(Hospital hospital) {
        Hospitallist.add(hospital);
    }

    public void removeHospital(String hosId) {

        for (Hospital hos : Hospitallist) {
            if (hos.getRegnum() == hosId) {
                Hospitallist.remove(hos);
            }
        }
    }
    
    public Hospital findHospital(String hosName) {
        System.out.println("SearchHospital() "+hosName);
        for (Hospital Hos : Hospitallist) {
            if (Hos.getEnterprisename() == hosName) {
                return Hos;
            }
        }
        return null;
    } 
    
    
    
    
    
    
    
    
    
    
    public ArrayList<Hospital> getHospitallist() {
        return Hospitallist;
    }

    public void setHospitallist(ArrayList<Hospital> Hospitallist) {
        this.Hospitallist = Hospitallist;
    }
  
    
    
    
    
    
}
