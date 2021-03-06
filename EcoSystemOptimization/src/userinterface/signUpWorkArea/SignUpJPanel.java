/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.signUpWorkArea;

import businesslogic.DB4OUtil.DB4OUtil;
import businesslogic.EcoSystem;
import businesslogic.donor.Donor;
import businesslogic.enums.UserRole;
import businesslogic.helper.Constants;
import businesslogic.helper.EmailHelper;
import businesslogic.helper.PhoneNoHelper;
import businesslogic.helper.UserNameHelper;
import businesslogic.helper.ValidateInputs;
import businesslogic.mailer.JavaMailUtil;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import userinterface.MainJFrame;



/**
 *
 * @author manojreddy
 */
public class SignUpJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessJPanel;
    private EcoSystem ecoSystem;
    private ImageIcon iconPic;
    private DB4OUtil dB4OUtil;
    private String photoPath = Constants.DEFAULT_PROFILE_IMAGE_PATH;
    private static final Logger logger = Logger.getLogger(SignUpJPanel.class.getName());
    /**
     * Creates new form SignUpJPanel
     */
    public SignUpJPanel(JPanel userProcessJPanel, EcoSystem ecoSystem, DB4OUtil dB4OUtil) {
        initComponents();
        this.userProcessJPanel = userProcessJPanel;
        this.ecoSystem = ecoSystem;
        this.dB4OUtil = dB4OUtil;
        lblpicpreview.setSize(126, 139);
        setDefaultPhoto();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitle = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        lblphoneno = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtphoneno = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        btncreatenewuser = new javax.swing.JButton();
        btnattachpic = new javax.swing.JButton();
        lblpicpreview = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();

        lbltitle.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Create New User");

        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lblname.setText("Name");

        lblphoneno.setText("Phone Number");

        lblemail.setText("Email");

        lblusername.setText("User Name");

        lblpassword.setText("Password");

        btncreatenewuser.setText("Create");
        btncreatenewuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreatenewuserActionPerformed(evt);
            }
        });

        btnattachpic.setText("Attach Pic");
        btnattachpic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnattachpicActionPerformed(evt);
            }
        });

        lblpicpreview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbladdress.setText("Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname)
                    .addComponent(lbladdress)
                    .addComponent(lblphoneno)
                    .addComponent(lblusername)
                    .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpassword))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btncreatenewuser)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnattachpic)
                                .addGap(43, 43, 43)
                                .addComponent(lblpicpreview, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(47, 47, 47))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbladdress, lblemail, lblname, lblpassword, lblphoneno, lblusername});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtaddress, txtemail, txtname, txtpassword, txtphoneno, txtusername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnback)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbltitle)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnattachpic))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbladdress)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblphoneno)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblpicpreview, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusername))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncreatenewuser)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbladdress, lblemail, lblname, lblpassword, lblphoneno, lblusername, txtaddress, txtemail, txtname, txtpassword, txtphoneno, txtusername});

    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "Back button pressed");
        CardLayout layout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.remove(this);
        layout.previous(userProcessJPanel);
        
        dB4OUtil.storeSystem(ecoSystem);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnattachpicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnattachpicActionPerformed
        JFileChooser image = new JFileChooser();
        FileNameExtensionFilter nameFilter = new FileNameExtensionFilter("jpeg", "jpg", "png");
        image.addChoosableFileFilter(nameFilter);
        int dlgBox = image.showOpenDialog(null);
        
        if(dlgBox == JFileChooser.APPROVE_OPTION){
            File f = image.getSelectedFile();
            this.photoPath = f.getAbsolutePath();
            ImageIcon icon = new ImageIcon(photoPath);
            this.iconPic = icon;        
        }
        
        if(iconPic !=null){
            Image resizedImage = iconPic.getImage().getScaledInstance(lblpicpreview.getWidth(), lblpicpreview.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon resizedIconPic = new ImageIcon(resizedImage);
            lblpicpreview.setIcon(resizedIconPic);
            JOptionPane.showMessageDialog(this, "Image Successfully Uploaded");
        }
    }//GEN-LAST:event_btnattachpicActionPerformed

    private void resetFields(){
        txtname.setText("");
        txtusername.setText("");
        txtpassword.setText("");
        txtemail.setText("");
        txtphoneno.setText("");
        txtaddress.setText("");
        
        setDefaultPhoto();
    }
    
    private void setDefaultPhoto() {
        
        setPhoto(getClass().getResource(Constants.DEFAULT_PROFILE_IMAGE_PATH).getPath());
    }
    
    private void setPhoto(String imagePath) {
        ImageIcon photo = new ImageIcon(imagePath);
        Image photoResized = photo.getImage().getScaledInstance(lblpicpreview.getWidth(), lblpicpreview.getHeight(),4);
        lblpicpreview.setIcon(new ImageIcon(photoResized));
    }
    
    private void btncreatenewuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreatenewuserActionPerformed
        if (UserNameHelper.isUserNameAlreadyExisted(ecoSystem, txtusername.getText())){
            JOptionPane.showMessageDialog(this, "UserName already registered. Please try with a different UserName");
            return;
        }
        
        if (EmailHelper.isEmailAlreadyExisted(ecoSystem, txtemail.getText())){
            JOptionPane.showMessageDialog(this, "Email already registered. Please try with a different Email");
            return;
        }
        
        if (PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, txtphoneno.getText())){
            JOptionPane.showMessageDialog(this, "PhoneNo already registered. Please try with a different PhoneNo");
            return;
        }
        
        if (ValidateInputs.isNameValid(txtname.getText()) && ValidateInputs.isPhoneNumberValid(txtphoneno.getText()) 
                && ValidateInputs.isEmailValid(txtemail.getText()) && ValidateInputs.isUsernameValid(txtusername.getText()) 
                && ValidateInputs.isPasswordValid(txtpassword.getText()) && ValidateInputs.isAddressValid(txtaddress.getText())){
            
                
            Donor donor = new Donor(txtname.getText(), txtphoneno.getText(), txtemail.getText(), txtaddress.getText(), txtusername.getText(),
                txtpassword.getText(), UserRole.Donor, photoPath, new Date(), new Date(), txtname.getText(), txtname.getText());

            ecoSystem.getDonorsDirectory().getDonors().add(donor);
            
            try {
                logger.log(Level.INFO, "Sending email to new user");
                JavaMailUtil.sendMail(txtemail.getText(), txtname.getText());
            } catch (Exception ex) {
            }
            
            JOptionPane.showMessageDialog(this, "User successfully added and a confirmation Mail is sent to the user");
            resetFields();     
        }
        else{
            JOptionPane.showMessageDialog(this, "!Error! Please verify all the data types");
        }
    }//GEN-LAST:event_btncreatenewuserActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnattachpic;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncreatenewuser;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblphoneno;
    private javax.swing.JLabel lblpicpreview;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtphoneno;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
