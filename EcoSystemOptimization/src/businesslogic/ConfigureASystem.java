/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import businesslogic.donor.Donor;
import businesslogic.enums.UserRole;
import businesslogic.sysAdmin.SysAdmin;
import java.util.Date;

/**
 *
 * @author manojreddy
 */
public class ConfigureASystem {
    
    public static EcoSystem configure() {
        
        EcoSystem ecoSystem = EcoSystem.getInstance();
        ecoSystem.getSysAdminsDirectory().getSysAdmins().add(new SysAdmin("ManojSys", "6174351707", "manojreddya@sysadmin.com",
            "50 Evergreen St", "sysadmin", "password", UserRole.SystemAdmin, "", new Date(), new Date(), "root", "root"));
        
//        System.out.println(ecoSystem.getCityNetworkDirectory().getCityNetworks().get(0));
//        FoodBank f1 = new FoodBank("FeedThePoor-Bank1", "Mission Hill", new Date(), new Date(), "InConfigureASystem", "InConfigureASystem");
//        FoodBank f2 = new FoodBank("FeedThePoor-Bank2", "Forest Hills", new Date(), new Date(), "InConfigureASystem", "InConfigureASystem");
//        ecoSystem.getCityNetworkDirectory().getCityNetworks().get(0).getFoodBankDirectory().getFoodBanks().add(f1);
//        ecoSystem.getCityNetworkDirectory().getCityNetworks().get(0).getFoodBankDirectory().getFoodBanks().add(f2);


//        ecoSystem.getDonorsDirectory().getDonors().add(new Donor(name, phoneNo, email, address, userName, password, UserRole.Donor, profilePic, createdDate, lastUpdatedDate, createdBy, modifiedBy))
        
        return ecoSystem;
    }
    
}
