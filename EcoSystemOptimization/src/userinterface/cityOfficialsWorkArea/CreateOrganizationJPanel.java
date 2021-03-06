/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.cityOfficialsWorkArea;

import businesslogic.CityNetwork;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.enums.OrganizationType;
import businesslogic.helper.Constants;
import businesslogic.organization.Organization;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author anshitaverma
 */
public class CreateOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateOrganizationJPanel
     */
    private JPanel userProcessContainer;
    private CityNetwork cityNetwork;
    private EcoSystem ecoSystem;
    private User userAccount;
    
     private String imagePath = Constants.DEFAULT_ORGANIZATION_IMAGE_PATH;
    
    public CreateOrganizationJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, User userAccount, CityNetwork cityNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.cityNetwork = cityNetwork;
        this.userAccount = userAccount;
        poupulateOrganizationTypes();
        lblheadercityName.setText(cityNetwork.getCityName().name());
        picHolderJlbl.setSize(126, 139);
        setDefaultPhoto();
        
        
    }
    
    private void setDefaultPhoto() {
        
        setPhoto(getClass().getResource(Constants.DEFAULT_PROFILE_IMAGE_PATH).getPath());
    }
    private void poupulateOrganizationTypes() {
        
        orgTypecmb.removeAllItems();
        
        String[] organizationTypes = OrganizationType.getOrganizationTypesArray();
        for(String organizationType:organizationTypes) {
            orgTypecmb.addItem(organizationType);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        orgNametxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        phoneNotxt = new javax.swing.JTextField();
        emailIdtxt = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        orgTypecmb = new javax.swing.JComboBox<>();
        picHolderJlbl = new javax.swing.JLabel();
        uploadbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblheadercityName = new javax.swing.JLabel();
        lblheadercityTag = new javax.swing.JLabel();

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Organization Name:");

        jLabel3.setText("Organization Type:");

        jLabel4.setText("Address:");

        jLabel5.setText("Phone Number:");

        jLabel6.setText("Email Id:");

        orgNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgNametxtActionPerformed(evt);
            }
        });

        phoneNotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNotxtActionPerformed(evt);
            }
        });

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        picHolderJlbl.setText("<Image>");
        picHolderJlbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uploadbtn.setText("Upload");
        uploadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Create New Organization");

        lblheadercityTag.setText("City:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(savebtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(backbtn)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(phoneNotxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addresstxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orgTypecmb, javax.swing.GroupLayout.Alignment.LEADING, 0, 133, Short.MAX_VALUE)
                                    .addComponent(orgNametxt)
                                    .addComponent(emailIdtxt))))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(picHolderJlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(uploadbtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblheadercityTag)
                                .addGap(34, 34, 34)
                                .addComponent(lblheadercityName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backbtn)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblheadercityTag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblheadercityName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orgNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orgTypecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(phoneNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(picHolderJlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(uploadbtn)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(43, 43, 43)
                .addComponent(savebtn)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addresstxt, emailIdtxt, orgNametxt, orgTypecmb, phoneNotxt});

    }// </editor-fold>//GEN-END:initComponents

    private void orgNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgNametxtActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] components = userProcessContainer.getComponents();
        ManageOrganizationJPanel manageOrgJPanel = (ManageOrganizationJPanel) components[components.length-1];
        manageOrgJPanel.populateData();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        if(isDataEnteredValid()){
            String orgName = orgNametxt.getText();
            
            String address = addresstxt.getText();
            String email = emailIdtxt.getText();
            String phoneNo = phoneNotxt.getText();
            OrganizationType organizationType = OrganizationType.valueOf((String) orgTypecmb.getSelectedItem());

              Organization organization = new Organization(orgName, organizationType, address, phoneNo, email, imagePath,
                new Date(), new Date(), userAccount.getName(), userAccount.getName());
            cityNetwork.getOrganizationDirectory().getOrganizations().add(organization);

            JOptionPane.showMessageDialog(this, "Successfully Saved");
            resetUi();
        }else{
            JOptionPane.showMessageDialog(this, "Error! Please enter valid values");
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void uploadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbtnActionPerformed
        // TODO add your handling code here:
         JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("/"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Jpeg format", "jpeg"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Jpg format", "jpg"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Png format", "png"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imagePath = selectedFile.getAbsolutePath();
            setPhoto(imagePath);
        }
    }//GEN-LAST:event_uploadbtnActionPerformed

    private void phoneNotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNotxtActionPerformed
     private void setPhoto(String imagePath) {
        ImageIcon photo = new ImageIcon(imagePath);
        Image photoResized = photo.getImage().getScaledInstance(picHolderJlbl.getWidth(), picHolderJlbl.getHeight(),4);
        picHolderJlbl.setIcon(new ImageIcon(photoResized));
    } 
    
    private boolean isDataEnteredValid() {
        
        if(!orgNametxt.getText().isEmpty() && orgNametxt.getText().matches("^[a-zA-Z0-9 ']+$") &&
                !addresstxt.getText().isEmpty() && !phoneNotxt.getText().isEmpty() && 
                phoneNotxt.getText().matches("^[0-9]+$") && phoneNotxt.getText().length()==10 &&
                emailIdtxt.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            return true;
        }
        return false;
    }
    
    private void resetUi() {
       orgNametxt.setText("");
    
       addresstxt.setText("");
       emailIdtxt.setText("");
       phoneNotxt.setText("");
       
       setDefaultPhoto();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField emailIdtxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblheadercityName;
    private javax.swing.JLabel lblheadercityTag;
    private javax.swing.JTextField orgNametxt;
    private javax.swing.JComboBox<String> orgTypecmb;
    private javax.swing.JTextField phoneNotxt;
    private javax.swing.JLabel picHolderJlbl;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton uploadbtn;
    // End of variables declaration//GEN-END:variables
}
