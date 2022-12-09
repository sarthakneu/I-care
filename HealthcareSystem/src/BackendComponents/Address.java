/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BackendComponents;

/**
 *
 * @author asus
 * This is the utility file used to take in inputs from the user(Organization) in ui.
 */
public class Address {
    private String addressline1;
    private String addressline2;
    private int apartmentnum;
    private String city;
    private String state;
    private int zipcode;
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    
    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public int getApartmentnum() {
        return apartmentnum;
    }

    public void setApartmentnum(int apartmentnum) {
        this.apartmentnum = apartmentnum;
    }

    public Address(String addressLine1, String addressLine2, int apartmentNo, String city, String state, int zip) {
        this.addressline1 = addressLine1;
        this.addressline2 = addressLine2;
        this.apartmentnum = apartmentNo;
        this.city = city;
        this.state = state;
        this.zipcode = zip;
    }
}
