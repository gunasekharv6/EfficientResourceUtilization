/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.orgManagersWorkArea;

import businesslogic.CityNetwork;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.delivery.DeliveryVolunteer;
import businesslogic.donor.Donation;
import businesslogic.donor.Donor;
import businesslogic.enums.DonationStatus;
import businesslogic.enums.PickUp;
import businesslogic.organization.OrgManager;
import businesslogic.organization.Organization;
import java.awt.CardLayout;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manojreddy
 */
public class ManageDonationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDonationsJPanel
     */
    
    private JPanel userProcessJPanel;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private Organization organization;
    private User userLogged;
    private static final Logger logger = Logger.getLogger(ManageDonationsJPanel.class.getName());
    
    public ManageDonationsJPanel(JPanel userProcessJPanel, EcoSystem ecoSystem, CityNetwork cityNetwork, Organization organization, User userLogged) {
        initComponents();
        
        this.userProcessJPanel = userProcessJPanel;
        this.ecoSystem = ecoSystem;
        this.cityNetwork = cityNetwork;
        this.organization = organization;
        this.userLogged = userLogged;
        
        populateData();
        lblheadercityName.setText(cityNetwork.getCityName().name());
        
    }
    
    private void populateData() {
        
        deliveryVolunteerjComboBox.removeAllItems();
        for(DeliveryVolunteer deliveryVolunteer:organization.getDeliveryVolunteerDirectory().getDeliveryVolunteers()) {
            deliveryVolunteerjComboBox.addItem(deliveryVolunteer.getName());
        }
        
        DefaultTableModel currentOrdersModel = (DefaultTableModel) availableDonationsjTable.getModel();
        currentOrdersModel.setRowCount(0);
        int currentOrderCount=0;
        
        DefaultTableModel successOrderModel = (DefaultTableModel) acceptedDonationsjTable.getModel();
        successOrderModel.setRowCount(0);
        int successOrderCount=0;
        
        for(Donor donor:ecoSystem.getDonorsDirectory().getDonors()) {
            
            for(Donation donation:donor.getDonations()) {
                if(donation.getDateofExpiry()!=null && donation.getDateofExpiry().before(new Date())){
                    continue;
                }
                if(donation.getDonationStatus().name().equals(DonationStatus.ReadyToPickup.name()) && 
                        donation.getCityNetwork().getCityName().name().equals(cityNetwork.getCityName().name())) {
                    
                    currentOrderCount++;
                    Object[] row = new Object[8];
                    row[0] = currentOrderCount;
                    row[1] = donation;
                    row[2] = donation.getDonor().getName();
                    row[3] = donation.getCategory().name();
                    row[4] = donation.getUsageStatus().name();
                    if(donation.getPickUp().name().equals(PickUp.Home.name())) {
                        row[5] = donation.getAddressToPickUp();
                    }else{
                        row[5] = donation.getFoodBank().getLocation();
                    }
                    if(donation.getDateofExpiry()!=null) {
                        row[6] = donation.getDateofExpiry();
                    }
                    row[7] = donation.getDonationStatus().name();
                    
                    currentOrdersModel.addRow(row);
                }
                
            }
            
        }
        
        availableDonationsCountjLabel.setText(String.valueOf(currentOrderCount));
        
        for(Donation donation:organization.getDonations()) {
            
            successOrderCount++;
            Object[] row = new Object[8];
            row[0] = successOrderCount;
            row[1] = donation;
            row[2] = donation.getDonor().getName();
            row[3] = donation.getCategory().name();
            row[4] = donation.getUsageStatus().name();
            if(donation.getPickUp().name().equals(PickUp.Home.name())) {
                row[5] = donation.getAddressToPickUp();
            }else{
                row[5] = donation.getFoodBank().getLocation();
            }
            if(donation.getDateofExpiry()!=null) {
                row[6] = donation.getDateofExpiry();
            }
            row[7] = donation.getDonationStatus().name();
            
            successOrderModel.addRow(row);
        }
        
        totalDonationsAcceptedCountjLabel.setText(String.valueOf(successOrderCount));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentOrdersHeaderjLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        acceptedDonationsjTable = new javax.swing.JTable();
        backButtonjButton = new javax.swing.JButton();
        deliveryVolunteerjComboBox = new javax.swing.JComboBox<>();
        currentDonationsHeaderjLabel = new javax.swing.JLabel();
        deliveryPersonjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableDonationsjTable = new javax.swing.JTable();
        acceptjButton = new javax.swing.JButton();
        totalCountHeaderjLabel = new javax.swing.JLabel();
        totalDonationsAcceptedCountjLabel = new javax.swing.JLabel();
        pendingCountHeaderjLabel = new javax.swing.JLabel();
        availableDonationsCountjLabel = new javax.swing.JLabel();
        receivedjButton = new javax.swing.JButton();
        lblheadercityTag = new javax.swing.JLabel();
        lblheadercityName = new javax.swing.JLabel();

        currentOrdersHeaderjLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        currentOrdersHeaderjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentOrdersHeaderjLabel1.setText("Donations Accepted");

        acceptedDonationsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial-No", "Information", "Donor Name", "Category", "UsageStatus", "PickUp Address", "Expiry", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        acceptedDonationsjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(acceptedDonationsjTable);

        backButtonjButton.setText("< < Back");
        backButtonjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonjButtonActionPerformed(evt);
            }
        });

        currentDonationsHeaderjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        currentDonationsHeaderjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentDonationsHeaderjLabel.setText("Donations Available in the City");

        deliveryPersonjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deliveryPersonjLabel.setText("Choose Delivery Volunteer :");

        availableDonationsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial-No", "Information", "Donor Name", "Category", "UsageStatus", "PickUp Address", "Expiry", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        availableDonationsjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(availableDonationsjTable);

        acceptjButton.setText("Accept and Assign Order");
        acceptjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptjButtonActionPerformed(evt);
            }
        });

        totalCountHeaderjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        totalCountHeaderjLabel.setText("Total Count :");

        totalDonationsAcceptedCountjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        totalDonationsAcceptedCountjLabel.setText("0");

        pendingCountHeaderjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        pendingCountHeaderjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pendingCountHeaderjLabel.setText("Count :");

        availableDonationsCountjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        availableDonationsCountjLabel.setText("0");

        receivedjButton.setText("Delivery Received");
        receivedjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receivedjButtonActionPerformed(evt);
            }
        });

        lblheadercityTag.setText("City:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(currentOrdersHeaderjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pendingCountHeaderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(availableDonationsCountjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(deliveryPersonjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(deliveryVolunteerjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(acceptjButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backButtonjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(188, 188, 188)
                                    .addComponent(currentDonationsHeaderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblheadercityTag)
                                    .addGap(34, 34, 34)
                                    .addComponent(lblheadercityName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(totalCountHeaderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(totalDonationsAcceptedCountjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(receivedjButton))
                                .addComponent(jScrollPane3)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backButtonjButton)
                        .addComponent(currentDonationsHeaderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblheadercityTag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblheadercityName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryVolunteerjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveryPersonjLabel)
                    .addComponent(acceptjButton)
                    .addComponent(pendingCountHeaderjLabel)
                    .addComponent(availableDonationsCountjLabel))
                .addGap(22, 22, 22)
                .addComponent(currentOrdersHeaderjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalCountHeaderjLabel)
                    .addComponent(totalDonationsAcceptedCountjLabel)
                    .addComponent(receivedjButton))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonjButtonActionPerformed
        // TODO add your handling code here:

        userProcessJPanel.remove(this);
        CardLayout layout = (CardLayout) userProcessJPanel.getLayout();
        layout.previous(userProcessJPanel);
    }//GEN-LAST:event_backButtonjButtonActionPerformed

    private void acceptjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptjButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = availableDonationsjTable.getSelectedRow();
        if(selectedIndex<0 || deliveryVolunteerjComboBox.getSelectedIndex()<0) {
            JOptionPane.showMessageDialog(this, "Please select a row or make sure you assign a delivery volunteer");
            return;
        }
        DefaultTableModel currentDonationsModel = (DefaultTableModel) availableDonationsjTable.getModel();
        Donation donation = (Donation) currentDonationsModel.getValueAt(selectedIndex, 1);

        donation.setOrgManager((OrgManager) userLogged);
        donation.setDeliveryVolunteer(organization.getDeliveryVolunteerDirectory().getDeliveryVolunteers().get(deliveryVolunteerjComboBox.getSelectedIndex()));
        donation.setLastUpdatedDate(new Date());
        donation.setModifiedBy(userLogged.getName());
        donation.setDonationStatus(DonationStatus.PickupAwaiting);
        donation.setOrganization(organization);
        
        organization.getDonations().add(donation);
        organization.getDeliveryVolunteerDirectory().getDeliveryVolunteers().get(deliveryVolunteerjComboBox.getSelectedIndex()).getDonations().add(donation);
        
        populateData();
        logger.log(Level.INFO, "Donation request accepted");
    }//GEN-LAST:event_acceptjButtonActionPerformed

    private void receivedjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receivedjButtonActionPerformed
        int selectedIndex = acceptedDonationsjTable.getSelectedRow();
        if(selectedIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to close the donation delivery");
            return;
        }
        DefaultTableModel acceptedDonationsModel = (DefaultTableModel) acceptedDonationsjTable.getModel();
        Donation donation = (Donation) acceptedDonationsModel.getValueAt(selectedIndex, 1);
        
        if (donation.getDonationStatus().equals(DonationStatus.Closed)){
            JOptionPane.showMessageDialog(this, "!Error! This Donation request is already closed");
            return;
        }
        
        if (donation.getDonationStatus().equals(DonationStatus.PickedUp) || donation.getDonationStatus().equals(DonationStatus.Expired)){
            donation.setLastUpdatedDate(new Date());
            donation.setModifiedBy(userLogged.getName());
            donation.setDonationStatus(DonationStatus.Closed);
        }else{
            JOptionPane.showMessageDialog(this, "!Error! This Donation is not yet picked up by delivery volunteer");
            return;
        }
        
        populateData();
    }//GEN-LAST:event_receivedjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable acceptedDonationsjTable;
    private javax.swing.JButton acceptjButton;
    private javax.swing.JLabel availableDonationsCountjLabel;
    private javax.swing.JTable availableDonationsjTable;
    private javax.swing.JButton backButtonjButton;
    private javax.swing.JLabel currentDonationsHeaderjLabel;
    private javax.swing.JLabel currentOrdersHeaderjLabel1;
    private javax.swing.JLabel deliveryPersonjLabel;
    private javax.swing.JComboBox<String> deliveryVolunteerjComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblheadercityName;
    private javax.swing.JLabel lblheadercityTag;
    private javax.swing.JLabel pendingCountHeaderjLabel;
    private javax.swing.JButton receivedjButton;
    private javax.swing.JLabel totalCountHeaderjLabel;
    private javax.swing.JLabel totalDonationsAcceptedCountjLabel;
    // End of variables declaration//GEN-END:variables
}
