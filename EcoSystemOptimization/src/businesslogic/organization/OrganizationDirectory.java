/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.organization;

import businesslogic.ModificationInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class OrganizationDirectory extends ModificationInfo{
    
    private List<Organization> organizations = new ArrayList<>();

    public OrganizationDirectory(List<Organization> organizations, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.organizations = organizations;
    }

    public OrganizationDirectory(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }
    
    public OrganizationDirectory() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }
    
}
