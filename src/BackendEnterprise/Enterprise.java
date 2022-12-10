/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendEnterprise;

/**
 *
 * @author asus
 */
public class Enterprise {
    private String address;
    private String Username;
    private String Passwd;
    private String Enterprisename;
    private String Regnum;

    
    
    
    
    public String getEnterprisename() {
        return Enterprisename;
    }

    public void setEnterprisename(String Enterprisename) {
        this.Enterprisename = Enterprisename;
    }
    
    
    
    
    public String getRegnum() {
        return Regnum;
    }

    public void setRegnum(String Regnum) {
        this.Regnum = Regnum;
    }
    
    
    

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    

    
    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    public String getPasswd() {
        return Passwd;
    }

    public void setPasswd(String Passwd) {
        this.Passwd = Passwd;
    }

    

    
    public Enterprise(String address, String userName, String pwd,String enterpriseName, String regNumber) {
        this.address = address;
        this.Username = userName;
        this.Passwd = pwd;
        this.Enterprisename = enterpriseName;
        this.Regnum = regNumber;
        
    }
}
