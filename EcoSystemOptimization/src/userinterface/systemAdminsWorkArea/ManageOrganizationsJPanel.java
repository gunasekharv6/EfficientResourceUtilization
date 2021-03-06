/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemAdminsWorkArea;

import businesslogic.CityNetwork;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.organization.OrgManager;
import businesslogic.organization.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manojreddy
 */
public class ManageOrganizationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationsJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private User userLogged;
    
    public ManageOrganizationsJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, CityNetwork cityNetwork, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.cityNetwork = cityNetwork;
        this.userLogged = userLogged;
        
        populateOrganizations();
    }

    public void populateOrganizations() {
        
        DefaultTableModel model = (DefaultTableModel) tblOrganizationsList.getModel();
        model.setRowCount(0);
        int count=0;
        for(Organization organization:cityNetwork.getOrganizationDirectory().getOrganizations()) {
            
            count++;
            Object[] row = new Object[7];
            row[0]=count;
            row[1]=organization;
            row[2]=organization.getOrganizationType().name();
            row[3]=organization.getAddress();
            row[4]=organization.getPhoneNo();
            row[5]=organization.getEmail();
            row[6]=organization.getCreatedBy();
                    
            model.addRow(row);
        }
        organzationCountjLabel.setText(String.valueOf(cityNetwork.getOrganizationDirectory().getOrganizations().size()));
        DefaultTableModel managersModel = (DefaultTableModel) tblOrganizationManagersJtable.getModel();
        managersModel.setRowCount(0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        organizationManagerCountjLabel = new javax.swing.JLabel();
        btnManageOrganizationManagers = new javax.swing.JButton();
        headerManagersjLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrganizationManagersJtable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdateManagers = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDeleteManagers = new javax.swing.JButton();
        backButtonjButton = new javax.swing.JButton();
        btnCreateManagers = new javax.swing.JButton();
        headerjLabel = new javax.swing.JLabel();
        organizationheaderjLabel = new javax.swing.JLabel();
        organizationsjLabel = new javax.swing.JLabel();
        organzationCountjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganizationsList = new javax.swing.JTable();
        organizationManagerheaderjLabel = new javax.swing.JLabel();

        organizationManagerCountjLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        organizationManagerCountjLabel.setText("0");

        btnManageOrganizationManagers.setText("Manage Organization Managers");
        btnManageOrganizationManagers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationManagersActionPerformed(evt);
            }
        });

        headerManagersjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerManagersjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerManagersjLabel.setText("Manage Organization Managers");

        tblOrganizationManagersJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S-No", "Manager Name", "UserName", "Password", "Phone No", "Email", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrganizationManagersJtable);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCreate.setText("Create >");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdateManagers.setText("Update");
        btnUpdateManagers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateManagersActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDeleteManagers.setText("Delete");
        btnDeleteManagers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteManagersActionPerformed(evt);
            }
        });

        backButtonjButton.setText("< < Back");
        backButtonjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonjButtonActionPerformed(evt);
            }
        });

        btnCreateManagers.setText("Create >");
        btnCreateManagers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateManagersActionPerformed(evt);
            }
        });

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Manage Organizations");

        organizationheaderjLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        organizationheaderjLabel.setText("Count :");

        organizationsjLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        organizationsjLabel.setText("Organizations List");

        organzationCountjLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        organzationCountjLabel.setText("0");

        tblOrganizationsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S-No", "Organization Name", "OrganizationType", "Address", "MobileNo", "Email", "Created By"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrganizationsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrganizationsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrganizationsList);

        organizationManagerheaderjLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        organizationManagerheaderjLabel.setText("Count :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backButtonjButton)
                        .addGap(90, 90, 90)
                        .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(organizationManagerheaderjLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(organizationManagerCountjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpdateManagers, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(organizationsjLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnManageOrganizationManagers)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnDeleteManagers, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnCreateManagers, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(organizationheaderjLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(organzationCountjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(headerManagersjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButtonjButton)
                    .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationsjLabel)
                    .addComponent(organizationheaderjLabel)
                    .addComponent(organzationCountjLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnManageOrganizationManagers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(headerManagersjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteManagers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateManagers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateManagers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationManagerheaderjLabel)
                    .addComponent(organizationManagerCountjLabel))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationManagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationManagersActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrganizationsList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        } else {
            Organization selectedOrganization = (Organization) tblOrganizationsList.getValueAt(selectedRow, 1);
            DefaultTableModel managersModel = (DefaultTableModel) tblOrganizationManagersJtable.getModel();
            managersModel.setRowCount(0);
            int employeeCount=0;
            for(OrgManager orgManager:selectedOrganization.getOrgManagerDirectory().getOrgManagers()) {
                employeeCount++;
                Object[] row = new Object[7];
                row[0] = employeeCount;
                row[1] = orgManager;
                row[2] = orgManager.getUserName();
                row[3] = orgManager.getPassword();
                row[4] = orgManager.getPhoneNo();
                row[5] = orgManager.getEmail();
                row[6] = orgManager.getAddress();

                managersModel.addRow(row);
            }
            organizationManagerCountjLabel.setText(String.valueOf(selectedOrganization.getOrgManagerDirectory().getOrgManagers().size()));
        }
    }//GEN-LAST:event_btnManageOrganizationManagersActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrganizationsList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        } else {
            Organization selectedOrganization = (Organization) tblOrganizationsList.getValueAt(selectedRow, 1);
            cityNetwork.getOrganizationDirectory().getOrganizations().remove(selectedOrganization);
            JOptionPane.showMessageDialog(null, "Organization deleted successfully");

            populateOrganizations();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateNewOrganizationJPanel panel = new CreateNewOrganizationJPanel(userProcessJpanel, ecoSystem, cityNetwork, userLogged);
        //          userProcessContainer.remove(this);
        userProcessJpanel.add("CreateNewOrganizationJPanel", panel);
        CardLayout layout = (CardLayout) userProcessJpanel.getLayout();
        layout.next(userProcessJpanel);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateManagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateManagersActionPerformed
        // TODO add your handling code here:
        int selectedManager = tblOrganizationManagersJtable.getSelectedRow();
        if(selectedManager < 0) {
            JOptionPane.showMessageDialog(this, "Please select a manager to Update");
            return;
        }
        DefaultTableModel organizationManagerModel = (DefaultTableModel) tblOrganizationManagersJtable.getModel();
        OrgManager orgManager = (OrgManager) organizationManagerModel.getValueAt(selectedManager, 1);

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        userProcessJpanel.add("UpdateOrganizationManagerPanel", new UpdateOrganizationManagerJPanel(userProcessJpanel, ecoSystem, orgManager, userLogged));
        cardLayout.next(userProcessJpanel);

    }//GEN-LAST:event_btnUpdateManagersActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrganizationsList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        } else {
            Organization selectedOrganization = (Organization) tblOrganizationsList.getValueAt(selectedRow, 1);
            UpdateOrganizationJPanel updateOrganizationJPanel = new UpdateOrganizationJPanel(userProcessJpanel, ecoSystem, selectedOrganization, userLogged);
            userProcessJpanel.add("UpdateOrganizationPanel", updateOrganizationJPanel);
            CardLayout layout = (CardLayout) userProcessJpanel.getLayout();
            layout.next(userProcessJpanel);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteManagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteManagersActionPerformed
        // TODO add your handling code here:
        int selectedManager = tblOrganizationManagersJtable.getSelectedRow();
        if(selectedManager < 0) {
            JOptionPane.showMessageDialog(this, "Please select a manager to delete");
            return;
        }
        DefaultTableModel organizationManagerModel = (DefaultTableModel) tblOrganizationManagersJtable.getModel();
        OrgManager orgManager = (OrgManager) organizationManagerModel.getValueAt(selectedManager, 1);

        int selectedRow = tblOrganizationsList.getSelectedRow();
        DefaultTableModel organizationsModel = (DefaultTableModel) tblOrganizationsList.getModel();
        Organization selectedOrganization = (Organization) organizationsModel.getValueAt(selectedRow, 1);
        selectedOrganization.getOrgManagerDirectory().getOrgManagers().remove(orgManager);
        JOptionPane.showMessageDialog(this, "Successfully deleted Manager");
        populateOrganizations();
    }//GEN-LAST:event_btnDeleteManagersActionPerformed

    
    private void backButtonjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonjButtonActionPerformed
        // TODO add your handling code here:

        userProcessJpanel.remove(this);
        CardLayout layout = (CardLayout) userProcessJpanel.getLayout();
        layout.previous(userProcessJpanel);
    }//GEN-LAST:event_backButtonjButtonActionPerformed

    private void btnCreateManagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateManagersActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrganizationsList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select an Organization to add Managers");
            return;
        } else {
            DefaultTableModel organizationsModel = (DefaultTableModel) tblOrganizationsList.getModel();
            Organization selectedOrganization = (Organization) organizationsModel.getValueAt(selectedRow, 1);
            CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
            userProcessJpanel.add("SysAdminCreateManagerPanel", new CreateOrganizationManagerJPanel(userProcessJpanel, ecoSystem, selectedOrganization, userLogged));
            cardLayout.next(userProcessJpanel);

        }
    }//GEN-LAST:event_btnCreateManagersActionPerformed

    private void tblOrganizationsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrganizationsListMouseClicked
        // TODO add your handling code here:
        btnManageOrganizationManagersActionPerformed(null);
    }//GEN-LAST:event_tblOrganizationsListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtonjButton;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCreateManagers;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteManagers;
    private javax.swing.JButton btnManageOrganizationManagers;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateManagers;
    private javax.swing.JLabel headerManagersjLabel;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel organizationManagerCountjLabel;
    private javax.swing.JLabel organizationManagerheaderjLabel;
    private javax.swing.JLabel organizationheaderjLabel;
    private javax.swing.JLabel organizationsjLabel;
    private javax.swing.JLabel organzationCountjLabel;
    private javax.swing.JTable tblOrganizationManagersJtable;
    private javax.swing.JTable tblOrganizationsList;
    // End of variables declaration//GEN-END:variables
}
