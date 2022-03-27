/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.helper;

import businesslogic.CityNetwork;
import businesslogic.EcoSystem;
import businesslogic.cityOfficial.CityOfficial;
import businesslogic.cleaner.Cleaner;
import businesslogic.delivery.DeliveryVolunteer;
import businesslogic.donor.Donor;
import businesslogic.organization.OrgManager;
import businesslogic.organization.Organization;
import businesslogic.sysAdmin.SysAdmin;

/**
 *
 * @author manojreddy
 */
public class UserNameHelper {
    
    public static boolean isUserNameAlreadyExisted(EcoSystem ecoSystem, String userName) {
        //Checking donors directory
        if(!ecoSystem.getDonorsDirectory().getDonors().isEmpty()) {
            for(Donor donor:ecoSystem.getDonorsDirectory().getDonors()) {
                if(donor.getUserName().equals(userName)) {
                    return true;
                }
            }
        }
        
        //Checkng syadmins directory
        if(!ecoSystem.getSysAdminsDirectory().getSysAdmins().isEmpty()) {
            for(SysAdmin sysAdmin:ecoSystem.getSysAdminsDirectory().getSysAdmins()) {
                if(sysAdmin.getUserName().equals(userName)) {
                    return true;
                }
            }
        }
        
        //Checking cityNetwork
        if(!ecoSystem.getCityNetworkDirectory().getCityNetworks().isEmpty()) {
            for(CityNetwork cityNetwork:ecoSystem.getCityNetworkDirectory().getCityNetworks()) {
                
                //Checking cityOfficials directory
                if(!cityNetwork.getCityOfficialsDirectory().getCityOfficials().isEmpty()) {
                    for(CityOfficial cityOfficial:cityNetwork.getCityOfficialsDirectory().getCityOfficials()) {
                        if(cityOfficial.getUserName().equals(userName)) {
                            return true;
                        }
                    }
                }
                
                //Checking cleaners directory
                if(!cityNetwork.getCleanersDirectory().getCleaners().isEmpty()) {
                    for(Cleaner cleaner:cityNetwork.getCleanersDirectory().getCleaners()) {
                        if(cleaner.getUserName().equals(userName)) {
                            return true;
                        }
                    }
                }
                
                //Checking organization
                if(!cityNetwork.getOrganizationDirectory().getOrganizations().isEmpty()) {
                    for(Organization organization:cityNetwork.getOrganizationDirectory().getOrganizations()) {
                        
                        //Checking orgmanagers directory
                        if(!organization.getOrgManagerDirectory().getOrgManagers().isEmpty()) {
                            for(OrgManager orgManager:organization.getOrgManagerDirectory().getOrgManagers()) {
                                if(orgManager.getUserName().equals(userName)) {
                                    return true;
                                }
                            }
                        }
                        
                        //Checking deliveryvolunteers directory
                        if(!organization.getDeliveryVolunteerDirectory().getDeliveryVolunteers().isEmpty()) {
                            for(DeliveryVolunteer deliveryVolunteer:organization.getDeliveryVolunteerDirectory().getDeliveryVolunteers()) {
                                if(deliveryVolunteer.getUserName().equals(userName)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        
        return false;
        
    }
    
}
