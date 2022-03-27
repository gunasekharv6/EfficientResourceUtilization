/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.donor;

import businesslogic.ModificationInfo;
import businesslogic.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class DonorsDirectory extends ModificationInfo{
    
    private List<Donor> donors = new ArrayList<>();

    public DonorsDirectory(List<Donor> donors, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.donors = donors;
    }

    public DonorsDirectory(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }
    
    public DonorsDirectory() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }
    
    public List<Donor> getDonors() {
        return donors;
    }

    public void setDonors(List<Donor> donors) {
        this.donors = donors;
    }

    public User isUserDonor(String userName, String password) {
        
        if(!getDonors().isEmpty()) {
            
            for(Donor donor:getDonors()) {
                if(donor.getUserName().equals(userName) && donor.getPassword().equals(password)) {
                    return donor;
                }
            }
        }
        
        return null;
    }
    
}

