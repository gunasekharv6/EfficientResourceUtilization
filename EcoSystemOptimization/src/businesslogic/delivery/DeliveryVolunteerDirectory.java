/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.delivery;

import businesslogic.ModificationInfo;
import businesslogic.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class DeliveryVolunteerDirectory extends ModificationInfo{
    
    private List<DeliveryVolunteer> deliveryVolunteers = new ArrayList<>();

    public DeliveryVolunteerDirectory(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }

    public DeliveryVolunteerDirectory(List<DeliveryVolunteer> deliveryVolunteers, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.deliveryVolunteers = deliveryVolunteers;
    }

    public DeliveryVolunteerDirectory() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }
    
    public List<DeliveryVolunteer> getDeliveryVolunteers() {
        return deliveryVolunteers;
    }

    public void setDeliveryVolunteers(List<DeliveryVolunteer> deliveryVolunteers) {
        this.deliveryVolunteers = deliveryVolunteers;
    }

    public User isUserDeliveryVolunteer(String userName, String password) {
        
        if(!getDeliveryVolunteers().isEmpty()) {
            
            for(DeliveryVolunteer deliveryVolunteer:getDeliveryVolunteers()) {
                if(deliveryVolunteer.getUserName().equals(userName) && deliveryVolunteer.getPassword().equals(password)) {
                    return deliveryVolunteer;
                }
            }
        }
        
        return null;
    }
    
}
