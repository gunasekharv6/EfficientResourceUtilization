/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import businesslogic.organization.Organization;
import javax.swing.JPanel;
import userinterface.cityOfficialsWorkArea.CityOfficialHomeJPanel;
import userinterface.cleanersWorkArea.CleanerHomeJPanel;
import userinterface.deliveryVolunteerWorkArea.DeliveryVolunteerHomeJPanel;
import userinterface.donarsWorkArea.DonorHomeJPanel;
import userinterface.orgManagersWorkArea.OrgManagerHomeJPanel;
import userinterface.systemAdminsWorkArea.SysAdminHomeJPanel;

/**
 *
 * @author manojreddy
 */
public class JPanelManager {
    
    public static JPanel getSysAdminHomePanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        
        return new SysAdminHomeJPanel(userProcessJpanel, ecoSystem, userLogged);
    }
    
    public static JPanel getCityOfficialHomePanel(JPanel userProcessContainer, EcoSystem ecoSystem, User userLogged,CityNetwork cityNetwork) {
        
        return new CityOfficialHomeJPanel(userProcessContainer, ecoSystem, userLogged,cityNetwork);
    }
        
    public static JPanel getOrgManagerHomePanel(JPanel userProcessJPanel, EcoSystem ecoSystem, CityNetwork cityNetwork,
            Organization organization, User userLogged) {
        
        return new OrgManagerHomeJPanel(userProcessJPanel, ecoSystem, cityNetwork, organization, userLogged);
    }
    
    public static JPanel getDonorHomePanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        
        return new DonorHomeJPanel(userProcessJpanel, ecoSystem, userLogged);
    }
    
    public static JPanel getDeliveryVolunteerHomePanel(JPanel userProcessJPanel, EcoSystem ecoSystem, CityNetwork cityNetwork, Organization organization, User userLogged) {
        
        return new DeliveryVolunteerHomeJPanel(userProcessJPanel, ecoSystem, cityNetwork, organization, userLogged);
    }
    
    public static JPanel getCleanerHomePanel(JPanel userProcessJPanel, EcoSystem ecoSystem, CityNetwork cityNetwork,
            User userLogged) {
        
        return new CleanerHomeJPanel(userProcessJPanel, ecoSystem, cityNetwork, userLogged);
    }
    
}
