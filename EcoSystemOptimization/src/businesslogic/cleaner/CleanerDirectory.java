/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.cleaner;

import businesslogic.ModificationInfo;
import businesslogic.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class CleanerDirectory extends ModificationInfo{
    
    private List<Cleaner> cleaners = new ArrayList<>();

    public CleanerDirectory(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }

    public CleanerDirectory() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }
    
    public List<Cleaner> getCleaners() {
        return cleaners;
    }

    public void setCleaners(List<Cleaner> cleaners) {
        this.cleaners = cleaners;
    }

    public User isUserCleaner(String userName, String password) {
        
        if(!getCleaners().isEmpty()) {
            
            for(Cleaner cleaner:getCleaners()) {
                if(cleaner.getUserName().equals(userName) && cleaner.getPassword().equals(password)) {
                    return cleaner;
                }
            }
        }
        
        return null;
    }
    
}
