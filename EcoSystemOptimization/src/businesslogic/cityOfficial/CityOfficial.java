/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.cityOfficial;

import businesslogic.User;
import businesslogic.enums.UserRole;
import java.util.Date;

/**
 *
 * @author gunav
 */
public class CityOfficial extends User{
    
    public CityOfficial(String name, String phoneNo, String email, String address, String userName, String password, UserRole userRole, String profilePic, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(name, phoneNo, email, address, userName, password, userRole, profilePic, createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }
    
}
