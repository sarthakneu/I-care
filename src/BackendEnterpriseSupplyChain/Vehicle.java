/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendEnterpriseSupplyChain;

/**
 *
 * @author asus
 */
public class Vehicle {
    private String vehiclename;
    private String vehiclenum;
    private String vehicletype;
    private String vehicaldescription;

    

    public String getVehiclenum() {
        return vehiclenum;
    }

    public void setVehiclenum(String vehiclenum) {
        this.vehiclenum = vehiclenum;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
     public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

   

    public String getVehicaldescription() {
        return vehicaldescription;
    }

    public void setVehicaldescription(String vehicaldescription) {
        this.vehicaldescription = vehicaldescription;
    }
    
    
    
    
    
    
    
    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }
    
    
    
    

    public Vehicle(String vehiclename, String vehiclenum, String vehicletype, String vehicaldescription) {
        this.vehiclename = vehiclename;
        this.vehiclenum = vehiclenum;
        this.vehicletype = vehicletype;
        this.vehicaldescription = vehicaldescription;
    }
}
