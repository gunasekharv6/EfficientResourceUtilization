/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import businesslogic.donor.DonorsDirectory;
import businesslogic.sysAdmin.SysAdminsDirectory;

/**
 *
 * @author manojreddy
 */
public class EcoSystem {
    
    private static EcoSystem ecoSystem;
    
    private CityNetworkDirectory cityNetworkDirectory = new CityNetworkDirectory();
    
    private DonorsDirectory donorsDirectory = new DonorsDirectory();
    
    private SysAdminsDirectory sysAdminsDirectory = new SysAdminsDirectory();
    
    private EcoSystem() {
        
    }

    public static EcoSystem getInstance() {
        if(ecoSystem==null){
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    public CityNetworkDirectory getCityNetworkDirectory() {
        return cityNetworkDirectory;
    }

    public void setCityNetworkDirectory(CityNetworkDirectory cityNetworkDirectory) {
        this.cityNetworkDirectory = cityNetworkDirectory;
    }

    public DonorsDirectory getDonorsDirectory() {
        return donorsDirectory;
    }

    public void setDonorsDirectory(DonorsDirectory donorsDirectory) {
        this.donorsDirectory = donorsDirectory;
    }

    public SysAdminsDirectory getSysAdminsDirectory() {
        return sysAdminsDirectory;
    }

    public void setSysAdminsDirectory(SysAdminsDirectory sysAdminsDirectory) {
        this.sysAdminsDirectory = sysAdminsDirectory;
    }    
    
}
