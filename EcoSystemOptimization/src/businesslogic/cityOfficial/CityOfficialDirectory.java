/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.cityOfficial;

import businesslogic.ModificationInfo;
import businesslogic.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class CityOfficialDirectory extends ModificationInfo{
    
    private List<CityOfficial> cityOfficials = new ArrayList<>();

    public CityOfficialDirectory(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }

    public CityOfficialDirectory() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }
    
    public List<CityOfficial> getCityOfficials() {
        return cityOfficials;
    }

    public void setCityOfficials(List<CityOfficial> cityOfficials) {
        this.cityOfficials = cityOfficials;
    }

    public User isUserCityOfficial(String userName, String password) {
        
        if(!getCityOfficials().isEmpty()) {
            for(CityOfficial cityOfficial:getCityOfficials()) {
                if(cityOfficial.getUserName().equals(userName) && cityOfficial.getPassword().equals(password)) {
                    return cityOfficial;
                }
            }
        }
        
        return null;
    }
    
}
