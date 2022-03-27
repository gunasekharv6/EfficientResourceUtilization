/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.sysAdmin;

import businesslogic.User;
import businesslogic.enums.UserRole;
import java.util.Date;

/**
 *
 * @author manojreddy
 */
public class SysAdmin extends User{
    
    public SysAdmin(String name, String phoneNo, String email, String address, String userName, String password, UserRole userRole, String profilePic, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(name, phoneNo, email, address, userName, password, userRole, profilePic, createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }
    
}
