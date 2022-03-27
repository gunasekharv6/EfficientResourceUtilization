/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.deliveryVolunteerWorkArea;

import userinterface.donarsWorkArea.*;
import businesslogic.CityNetwork;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.delivery.DeliveryVolunteer;
import businesslogic.donor.Donation;
import businesslogic.donor.Donor;
import businesslogic.enums.Category;
import businesslogic.enums.DonationStatus;
import businesslogic.enums.PickUp;
import businesslogic.organization.Organization;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manojreddy
 */
public class ManageMyDeliveriesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminHomeJPanel
     */
    
    private JPanel userProcessJPanel;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private Organization organization;
    private User userLogged;
    private DeliveryVolunteer deliveryVolunteer;
    
    public ManageMyDeliveriesJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, CityNetwork cityNetwork, Organization organization, User userLogged) {
        initComponents();
        this.userProcessJPanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.cityNetwork = cityNetwork;
        this.organization = organization;
        this.userLogged = userLogged;
        this.deliveryVolunteer = (DeliveryVolunteer) userLogged;
        
        populateData();
        lblheadercityName.setText(cityNetwork.getCityName().name());
    }
    
    public void populateData() {
        DefaultTableModel currentOrdersModel = (DefaultTableModel) currentPickUpsjTable.getModel();
        currentOrdersModel.setRowCount(0);
        int currentPickUpcount=0;
        
        DefaultTableModel delieveredOrdersModel = (DefaultTableModel) donationDeliveryHistoryjTable.getModel();
        delieveredOrdersModel.setRowCount(0);
        int donationHistoryCount=0;
        
        DeliveryVolunteer volunteer = (DeliveryVolunteer) userLogged;
        
        for(Donation donation:volunteer.getDonations()){
            if(donation.getDonationStatus().name().equalsIgnoreCase(DonationStatus.ReadyToPickup.name()) 
                    || donation.getDonationStatus().name().equalsIgnoreCase(DonationStatus.PickupAwaiting.name())
                    || donation.getDonationStatus().name().equalsIgnoreCase(DonationStatus.Accepted.name())){
                currentPickUpcount++;
                Object[] row = new Object[7];
                    row[0] = currentPickUpcount;
                    row[1] = donation;
                    row[2] = donation.getDonor().getName();
                    row[3] = donation.getCategory().name();
                    if(donation.getPickUp().name().equals(PickUp.Home.name())) {
                        row[4] = donation.getAddressToPickUp();
                    }else{
                        row[4] = donation.getFoodBank().getLocation();
                    }
                    if(donation.getDateofExpiry()!=null) {
                        row[5] = donation.getDateofExpiry();
                    }
                    row[6] = donation.getDonationStatus();
                    
                    currentOrdersModel.addRow(row);
            }
        }
        availableDonationsCountjLabel.setText(String.valueOf(currentPickUpcount));
        
        for(Donation donation:volunteer.getDonations()){
            if(donation.getDonationStatus().name().equalsIgnoreCase(DonationStatus.PickedUp.name()) 
                    || donation.getDonationStatus().name().equalsIgnoreCase(DonationStatus.Expired.name())
                    || donation.getDonationStatus().name().equalsIgnoreCase(DonationStatus.Closed.name())){
                donationHistoryCount++;
                Object[] row = new Object[7];
                    row[0] = donationHistoryCount;
                    row[1] = donation;
                    row[2] = donation.getDonor().getName();
                    row[3] = donation.getCategory().name();
                    if(donation.getPickUp().name().equals(PickUp.Home.name())) {
                        row[4] = donation.getAddressToPickUp();
                    }else{
                        row[4] = donation.getFoodBank().getLocation();
                    }
                    if(donation.getDateofExpiry()!=null) {
                        row[5] = donation.getDateofExpiry();
                    }
                    row[6] = donation.getDonationStatus();
                    
                    delieveredOrdersModel.addRow(row);
            }
        }
        totalCountjLabel.setText(String.valueOf(donationHistoryCount));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentOrdersHeaderjLabel = new javax.swing.JLabel();
        totalCountHeaderjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentPickUpsjTable = new javax.swing.JTable();
        totalCountjLabel = new javax.swing.JLabel();
        currentOrdersHeaderjLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        donationDeliveryHistoryjTable = new javax.swing.JTable();
        btnpcikedup = new javax.swing.JButton();
        pendingCountHeaderjLabel = new javax.swing.JLabel();
        availableDonationsCountjLabel = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();
        lblheadercityName = new javax.swing.JLabel();
        lblheadercityTag = new javax.swing.JLabel();

        setLayout(null);

        currentOrdersHeaderjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        currentOrdersHeaderjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentOrdersHeaderjLabel.setText("Donations Waiting for PickUp");
        add(currentOrdersHeaderjLabel);
        currentOrdersHeaderjLabel.setBounds(350, 20, 260, 24);

        totalCountHeaderjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        totalCountHeaderjLabel.setText("Total Count :");
        add(totalCountHeaderjLabel);
        totalCountHeaderjLabel.setBounds(10, 540, 110, 19);

        currentPickUpsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial-No", "Information", "Donor Name", "Category", "Pickup Address", "Expiry", "Donation Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        currentPickUpsjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(currentPickUpsjTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 980, 160);

        totalCountjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        totalCountjLabel.setText("0");
        add(totalCountjLabel);
        totalCountjLabel.setBounds(120, 540, 40, 19);

        currentOrdersHeaderjLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        currentOrdersHeaderjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentOrdersHeaderjLabel1.setText("Donation History");
        add(currentOrdersHeaderjLabel1);
        currentOrdersHeaderjLabel1.setBounds(380, 310, 202, 24);

        donationDeliveryHistoryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial-No", "Information", "Donor Name", "Category", "Pickup Address", "Expiry", "Donation Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        donationDeliveryHistoryjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(donationDeliveryHistoryjTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(10, 350, 980, 160);

        btnpcikedup.setText("Picked Up");
        btnpcikedup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpcikedupActionPerformed(evt);
            }
        });
        add(btnpcikedup);
        btnpcikedup.setBounds(850, 230, 117, 25);

        pendingCountHeaderjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        pendingCountHeaderjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pendingCountHeaderjLabel.setText("Count :");
        add(pendingCountHeaderjLabel);
        pendingCountHeaderjLabel.setBounds(10, 250, 70, 19);

        availableDonationsCountjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        availableDonationsCountjLabel.setText("0");
        add(availableDonationsCountjLabel);
        availableDonationsCountjLabel.setBounds(90, 250, 30, 19);

        backjButton.setText("< < Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        add(backjButton);
        backjButton.setBounds(10, 20, 85, 25);
        add(lblheadercityName);
        lblheadercityName.setBounds(860, 20, 120, 30);

        lblheadercityTag.setText("City:");
        add(lblheadercityTag);
        lblheadercityTag.setBounds(770, 20, 50, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnpcikedupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpcikedupActionPerformed

        int selectedRow = currentPickUpsjTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(this, "Please select a row to update delivery");
            return;
        }

        DefaultTableModel currentOrdersModel = (DefaultTableModel) currentPickUpsjTable.getModel();
        Donation dn = (Donation) currentOrdersModel.getValueAt(selectedRow, 1);
        
        dn.setDonationStatus(DonationStatus.PickedUp);
        dn.setLastUpdatedDate(new Date());
        dn.setModifiedBy(userLogged.getName());

        populateData();
    }//GEN-LAST:event_btnpcikedupActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userProcessJPanel.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        cardLayout.previous(userProcessJPanel);
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableDonationsCountjLabel;
    private javax.swing.JButton backjButton;
    private javax.swing.JButton btnpcikedup;
    private javax.swing.JLabel currentOrdersHeaderjLabel;
    private javax.swing.JLabel currentOrdersHeaderjLabel1;
    private javax.swing.JTable currentPickUpsjTable;
    private javax.swing.JTable donationDeliveryHistoryjTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblheadercityName;
    private javax.swing.JLabel lblheadercityTag;
    private javax.swing.JLabel pendingCountHeaderjLabel;
    private javax.swing.JLabel totalCountHeaderjLabel;
    private javax.swing.JLabel totalCountjLabel;
    // End of variables declaration//GEN-END:variables
}
