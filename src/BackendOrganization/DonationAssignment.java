/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendOrganization;
import BackendEnterprise.Enterprise;
import BackendEnterpriseHospital.Doc;
import BackendEnterpriseHospital.Nurse;
import BackendEnterpriseHospital.Patient;
import BackendEnterpriseLab.Technician;
import BackendEnterpriseSupplyChain.Handler;
/**
 *
 * @author asus
 
 */
public class DonationAssignment {
    
    public String id;
    public Doc Donationdoc;
    public Doc recorddoc;
    public Patient recordpatient;
    public User donationpatient;
    public Nurse nurse;
    public Enterprise donationenterprise;
    public Enterprise recordenterprise;
    public String type;
    public String bloodgroup;
    public String donationEntityName;
    public String donationStatus;
    public Handler handler;
    public Technician technician;
    private String donationReport;
    private String comm;

    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
    
    
    
    
    
    
    
    public String getBloodgroup() {
        return bloodgroup;
    }

    
    
    
    
    
    
    
    
    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    

    public Doc getRecorddoc() {
        return recorddoc;
    }

    public void setRecorddoc(Doc recorddoc) {
        this.recorddoc = recorddoc;
    }
    
    
    
    public Doc getDonationdoc() {
        return Donationdoc;
    }

    public void setDonationdoc(Doc Donationdoc) {
        this.Donationdoc = Donationdoc;
    }

    

    public User getDonationpatient() {
        return donationpatient;
    }

    public void setDonationpatient(User donationpatient) {
        this.donationpatient = donationpatient;
    }

    
    
    
    
    
    
    
    
    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
    
    
    
    
    
    public Patient getRecordpatient() {
        return recordpatient;
    }

    public void setRecordpatient(Patient recordpatient) {
        this.recordpatient = recordpatient;
    }

    
    
    
    public Enterprise getDonationenterprise() {
        return donationenterprise;
    }

    public void setDonationenterprise(Enterprise donationenterprise) {
        this.donationenterprise = donationenterprise;
    }

    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public String getDonationEntityName() {
        return donationEntityName;
    }

    public void setDonationEntityName(String donationEntityName) {
        this.donationEntityName = donationEntityName;
    }
    
    
    
    
    
    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }
    
    
    
    
    
    
    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
    
    

    public String getDonationStatus() {
        return donationStatus;
    }

    public void setDonationStatus(String donationStatus) {
        this.donationStatus = donationStatus;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    

    
    
    
    
    public String getDonationReport() {
        return donationReport;
    }

    public void setDonationReport(String donationReport) {
        this.donationReport = donationReport;
    }

    
    
    public Enterprise getRecordenterprise() {
        return recordenterprise;
    }

    public void setRecordenterprise(Enterprise recordenterprise) {
        this.recordenterprise = recordenterprise;
    }
}
