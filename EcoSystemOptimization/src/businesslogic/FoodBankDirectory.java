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
public class FoodBankDirectory extends ModificationInfo{
    
    private List<FoodBank> foodBanks = new ArrayList<>();

    public FoodBankDirectory(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }
    
    public FoodBankDirectory(List<FoodBank> foodBanks, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.foodBanks = foodBanks;
    }

    public FoodBankDirectory() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }
    
    public List<FoodBank> getFoodBanks() {
        return foodBanks;
    }

    public void setFoodBanks(List<FoodBank> foodBanks) {
        this.foodBanks = foodBanks;
    }
    
}
