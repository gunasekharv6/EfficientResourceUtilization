/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.organization;

import businesslogic.ModificationInfo;
import businesslogic.delivery.DeliveryVolunteerDirectory;
import businesslogic.donor.Donation;
import businesslogic.enums.OrganizationType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class Organization extends ModificationInfo{
    
    private String organizationName;
    
    private OrganizationType organizationType;
    
    private String address;
    
    private String phoneNo;
    
    private String email;
    
    private String organizationImage;
    
    private OrgManagerDirectory orgManagerDirectory = new OrgManagerDirectory();
    
    private DeliveryVolunteerDirectory deliveryVolunteerDirectory = new DeliveryVolunteerDirectory();
    
    private List<Donation> donations = new ArrayList<>();

    public Organization(String organizationName, OrganizationType organizationType, String address, String phoneNo, String email, 
            String organizationImage, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.organizationName = organizationName;
        this.organizationType = organizationType;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
        this.organizationImage = organizationImage;
    }
    
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public OrganizationType getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(OrganizationType organizationType) {
        this.organizationType = organizationType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OrgManagerDirectory getOrgManagerDirectory() {
        return orgManagerDirectory;
    }

    public void setOrgManagerDirectory(OrgManagerDirectory orgManagerDirectory) {
        this.orgManagerDirectory = orgManagerDirectory;
    }

    public DeliveryVolunteerDirectory getDeliveryVolunteerDirectory() {
        return deliveryVolunteerDirectory;
    }

    public void setDeliveryVolunteerDirectory(DeliveryVolunteerDirectory deliveryVolunteerDirectory) {
        this.deliveryVolunteerDirectory = deliveryVolunteerDirectory;
    }

    public List<Donation> getDonations() {
        return donations;
    }

    public void setDonations(List<Donation> donations) {
        this.donations = donations;
    }

    public String getOrganizationImage() {
        return organizationImage;
    }

    public void setOrganizationImage(String organizationImage) {
        this.organizationImage = organizationImage;
    }

    @Override
    public String toString() {
        return organizationName;
    }
            
}
