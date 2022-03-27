/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.donor;

import businesslogic.CityNetwork;
import businesslogic.FoodBank;
import businesslogic.ModificationInfo;
import businesslogic.cleaner.Cleaner;
import businesslogic.delivery.DeliveryVolunteer;
import businesslogic.enums.Category;
import businesslogic.enums.DonationStatus;
import businesslogic.enums.PickUp;
import businesslogic.enums.UsageStatus;
import businesslogic.organization.OrgManager;
import businesslogic.organization.Organization;
import java.util.Date;

/**
 *
 * @author manojreddy
 */
public class Donation extends ModificationInfo{
    
    private String information;
    
    private Category category;
    
    private UsageStatus usageStatus;
    
    private PickUp pickUp;
    
    private FoodBank foodBank;
    
    private String addressToPickUp;
    
    private Date dateofExpiry;
    
    private String picture;
    
    private Donor donor;
    
    private CityNetwork cityNetwork;
    
    private Organization organization;
    
    private OrgManager orgManager;
    
    private DeliveryVolunteer deliveryVolunteer;
    
    private DonationStatus donationStatus;
    
    private Cleaner cleaner;

    public Donation(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }

    public Donation(String information, Category category, UsageStatus usageStatus, PickUp pickUp, FoodBank foodBank, String addressToPickUp, Date dateofExpiry, String picture, Donor donor, CityNetwork cityNetwork, Organization organization, OrgManager orgManager, DeliveryVolunteer deliveryVolunteer, DonationStatus donationStatus, Cleaner cleaner, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.information = information;
        this.category = category;
        this.usageStatus = usageStatus;
        this.pickUp = pickUp;
        this.foodBank = foodBank;
        this.addressToPickUp = addressToPickUp;
        this.dateofExpiry = dateofExpiry;
        this.picture = picture;
        this.donor = donor;
        this.cityNetwork = cityNetwork;
        this.organization = organization;
        this.orgManager = orgManager;
        this.deliveryVolunteer = deliveryVolunteer;
        this.donationStatus = donationStatus;
        this.cleaner = cleaner;
        
        this.donor.getDonations().add(this);
    }    
    
    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public UsageStatus getUsageStatus() {
        return usageStatus;
    }

    public void setUsageStatus(UsageStatus usageStatus) {
        this.usageStatus = usageStatus;
    }

    public PickUp getPickUp() {
        return pickUp;
    }

    public void setPickUp(PickUp pickUp) {
        this.pickUp = pickUp;
    }

    public FoodBank getFoodBank() {
        return foodBank;
    }

    public void setFoodBank(FoodBank foodBank) {
        this.foodBank = foodBank;
    }

    public String getAddressToPickUp() {
        return addressToPickUp;
    }

    public void setAddressToPickUp(String addressToPickUp) {
        this.addressToPickUp = addressToPickUp;
    }

    public Date getDateofExpiry() {
        return dateofExpiry;
    }

    public void setDateofExpiry(Date dateofExpiry) {
        this.dateofExpiry = dateofExpiry;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public CityNetwork getCityNetwork() {
        return cityNetwork;
    }

    public void setCityNetwork(CityNetwork cityNetwork) {
        this.cityNetwork = cityNetwork;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public OrgManager getOrgManager() {
        return orgManager;
    }

    public void setOrgManager(OrgManager orgManager) {
        this.orgManager = orgManager;
    }

    public DeliveryVolunteer getDeliveryVolunteer() {
        return deliveryVolunteer;
    }

    public void setDeliveryVolunteer(DeliveryVolunteer deliveryVolunteer) {
        this.deliveryVolunteer = deliveryVolunteer;
    }

    public DonationStatus getDonationStatus() {
        return donationStatus;
    }

    public void setDonationStatus(DonationStatus donationStatus) {
        this.donationStatus = donationStatus;
    }

    public Cleaner getCleaner() {
        return cleaner;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    @Override
    public String toString() {
        return information;
    }    
}
