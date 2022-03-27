/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author manojreddy
 */
public class CityNetworkDirectory extends ModificationInfo{
    
    private List<CityNetwork> cityNetworks = new ArrayList<>();

    public CityNetworkDirectory(List<CityNetwork> cityNetworks, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.cityNetworks=cityNetworks;
    }
    
    public CityNetworkDirectory() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }

    public CityNetworkDirectory(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }
    
    public List<CityNetwork> getCityNetworks() {
        return cityNetworks;
    }

    public void setCityNetworks(List<CityNetwork> cityNetworks) {
        this.cityNetworks = cityNetworks;
    }
    
}
