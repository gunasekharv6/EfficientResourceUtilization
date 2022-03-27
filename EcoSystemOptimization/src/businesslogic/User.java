/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import businesslogic.enums.UserRole;
import java.util.Date;

/**
 *
 * @author manojreddy
 */
public class User extends ModificationInfo{
    
    private String name;

    private String phoneNo;
    
    private String email;
    
    private String address;
    
    private String userName;
    
    private String password;
    
    private UserRole userRole;
    
    private String profilePic;

    public User(String name, String phoneNo, String email, String address, String userName, String password, UserRole userRole, String profilePic, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.userName = userName;
        this.password = password;
        this.userRole = userRole;
        this.profilePic = profilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
