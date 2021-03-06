/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.cityOfficialsWorkArea;

import businesslogic.CityNetwork;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.cleaner.Cleaner;
import businesslogic.enums.UserRole;
import businesslogic.helper.Constants;
import businesslogic.helper.ValidateInputs;
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
public class CreateNewCleanerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewCleanerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private User userAccount;
    private CityNetwork cityNetwork;
    //add default image
    private String imagepath = Constants.DEFAULT_PROFILE_IMAGE_PATH;
    
    public CreateNewCleanerJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, User userAccount, CityNetwork cityNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount  = userAccount;
        this.cityNetwork = cityNetwork;
        picHolderjLabel.setSize(126, 139);
        setDefaultPhoto();
        lblheadercityName.setText(cityNetwork.getCityName().name());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        picHolderjLabel = new javax.swing.JLabel();
        uploadbtn = new javax.swing.JButton();
        nametxt = new javax.swing.JTextField();
        phoneNumbertxt = new javax.swing.JTextField();
        emailIdtxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        usernametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        lblheadercityName = new javax.swing.JLabel();
        lblheadercityTag = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New Cleaner");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Address:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email Id:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Phone Number:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("UserName:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Password:");

        picHolderjLabel.setText("     <Image>");
        picHolderjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uploadbtn.setText("Upload");
        uploadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtnActionPerformed(evt);
            }
        });

        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        backbtn.setText("< < Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        lblheadercityTag.setText("City:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(backbtn)
                    .addGap(151, 151, 151)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblheadercityTag)
                    .addGap(34, 34, 34)
                    .addComponent(lblheadercityName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addGap(239, 239, 239)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(phoneNumbertxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(77, 77, 77)
                                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel2))
                    .addGap(92, 92, 92)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(uploadbtn))
                        .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(savebtn)
                .addGap(319, 319, 319))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addresstxt, emailIdtxt, nametxt, passwordtxt, phoneNumbertxt, usernametxt});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backbtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblheadercityTag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblheadercityName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(phoneNumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(emailIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernametxt)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uploadbtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(savebtn)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addresstxt, emailIdtxt, nametxt, passwordtxt, phoneNumbertxt, usernametxt});

    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
           if(isDataEnteredValid()) {
            String name = nametxt.getText();
            String userName = usernametxt.getText();
            String address=addresstxt.getText();
            
            String password = passwordtxt.getText();
            String email = emailIdtxt.getText();
            String phoneNo = phoneNumbertxt.getText();

            Cleaner cleaner = new Cleaner(name, phoneNo, email, address,userName, password, UserRole.Cleaner,imagepath,
                new Date(), new Date(), userAccount.getName(), userAccount.getName());
            cityNetwork.getCleanersDirectory().getCleaners().add(cleaner);

            JOptionPane.showMessageDialog(this, "Successfully Saved ");
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
            imagepath = selectedFile.getAbsolutePath();
            setPhoto(imagepath);
        }
    }//GEN-LAST:event_uploadbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] components = userProcessContainer.getComponents();
        ManageCleanersJPanel manageCleanersJPanel = (ManageCleanersJPanel) components[components.length-1];
        manageCleanersJPanel.populateData();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed
   
    private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(nametxt.getText()) && ValidateInputs.isUsernameValid(usernametxt.getText()) && 
                ValidateInputs.isEmailValid(emailIdtxt.getText()) && ValidateInputs.isPhoneNumberValid(phoneNumbertxt.getText())
                && ValidateInputs.isPasswordValid(passwordtxt.getText()) && ValidateInputs.isAddressValid(addresstxt.getText()))  {
         return true; 
        }
        return false;
    } 
    
    
    private void resetUi() {
        
        nametxt.setText("");
        usernametxt.setText("");
        addresstxt.setText("");
        passwordtxt.setText("");
        emailIdtxt.setText("");
        phoneNumbertxt.setText("");
        setDefaultPhoto();
        
    }
    
    //have to make changes
     private void setDefaultPhoto() {
        
        setPhoto(getClass().getResource(Constants.DEFAULT_PROFILE_IMAGE_PATH).getPath());
    }

    private void setPhoto(String imagePath) {
        ImageIcon photo = new ImageIcon(imagePath);
        Image photoResized = photo.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(),4);
        picHolderjLabel.setIcon(new ImageIcon(photoResized));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField emailIdtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblheadercityName;
    private javax.swing.JLabel lblheadercityTag;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTextField phoneNumbertxt;
    private javax.swing.JLabel picHolderjLabel;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton uploadbtn;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
