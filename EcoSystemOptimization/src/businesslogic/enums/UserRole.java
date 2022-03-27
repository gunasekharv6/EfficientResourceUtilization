/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author manojreddy
 */
public enum UserRole {
    
    SystemAdmin,Donor,DeliveryVounteer,CityOfficial,OrgManager,Cleaner;
    
    public static List<String> getUserRolesList(){
       
        return Stream.of(UserRole.values()).map(UserRole::name).collect(Collectors.toList());
    }
    
    public static String[] getUserRolesArray() {
        
        return Arrays.stream(UserRole.values()).map(UserRole::name).toArray(String[]::new);
    }
}
