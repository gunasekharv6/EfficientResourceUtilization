/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.aboutme;

import java.awt.Desktop;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author manojreddy
 */
public class AboutMeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AboutMeJPanel
     */
    public AboutMeJPanel() {
        initComponents();
        setImages();
    }

    private void setImages() {
        
        manojImagejLabel.setSize(132, 132);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icons/manojreddya.jpeg"));
        Image resized = imageIcon.getImage().getScaledInstance(manojImagejLabel.getWidth(), manojImagejLabel.getHeight(), 4);
        manojImagejLabel.setIcon(new ImageIcon(resized));
        
        anshitaImagejLabel.setSize(132, 132);
        ImageIcon imageIconAnshita = new ImageIcon(getClass().getResource("/icons/anshita.jpeg"));
        Image resizedAnshita = imageIconAnshita.getImage().getScaledInstance(anshitaImagejLabel.getWidth(), anshitaImagejLabel.getHeight(), 4);
        anshitaImagejLabel.setIcon(new ImageIcon(resizedAnshita));
        
        gunashekarImagejLabel.setSize(132, 132);
        ImageIcon imageIconGuna = new ImageIcon(getClass().getResource("/icons/guna.png"));
        Image resizedGuna = imageIconGuna.getImage().getScaledInstance(gunashekarImagejLabel.getWidth(), gunashekarImagejLabel.getHeight(), 4);
        gunashekarImagejLabel.setIcon(new ImageIcon(resizedGuna));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        projectjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        developerjLabel = new javax.swing.JLabel();
        anshitaImagejLabel = new javax.swing.JLabel();
        gunashekarImagejLabel = new javax.swing.JLabel();
        manojImagejLabel = new javax.swing.JLabel();
        anshitaNamejLabel = new javax.swing.JLabel();
        manojNamejLabel = new javax.swing.JLabel();
        gunaNamejLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        githubLinkedInjButton = new javax.swing.JButton();
        githubManojjButton = new javax.swing.JButton();
        anshitaLinkedInjButton = new javax.swing.JButton();
        anshitaGithubjButton = new javax.swing.JButton();
        gunaLinkedInjButton = new javax.swing.JButton();
        gunaGithubjButton = new javax.swing.JButton();

        projectjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        projectjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectjLabel.setText("Project Description");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Eco System Optimization is a NetBeans Application which provides a platform for people across several cities to come\ntogether with Government, Private and Religious Organizations to help people in need.  \n\nEco System Optimization's Mission is to contribute towards the welfare of society by optimizing the use of resources and\nFocus on Reusing any resource varying from electronics, food, clothes and any unused or extra products by donating them\nto the needy.");
        jScrollPane1.setViewportView(jTextArea1);

        developerjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        developerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        developerjLabel.setText("Developers");

        anshitaImagejLabel.setSize(new java.awt.Dimension(45, 45));

        anshitaNamejLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        anshitaNamejLabel.setText("Anshita Verma");

        manojNamejLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        manojNamejLabel.setText("Manoj Reddy Amireddy");

        gunaNamejLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        gunaNamejLabel.setText("Gunashekar Vinugolu");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel1.setText("001007320");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel2.setText("002196218");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel3.setText("001586178");

        githubLinkedInjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/linkedin-2.png"))); // NOI18N
        githubLinkedInjButton.setText("LinkedIn");
        githubLinkedInjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                githubLinkedInjButtonActionPerformed(evt);
            }
        });

        githubManojjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/github-2.png"))); // NOI18N
        githubManojjButton.setText("Github");
        githubManojjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                githubManojjButtonActionPerformed(evt);
            }
        });

        anshitaLinkedInjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/linkedin-2.png"))); // NOI18N
        anshitaLinkedInjButton.setText("LinkedIn");
        anshitaLinkedInjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anshitaLinkedInjButtonActionPerformed(evt);
            }
        });

        anshitaGithubjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/github-2.png"))); // NOI18N
        anshitaGithubjButton.setText("Github");
        anshitaGithubjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anshitaGithubjButtonActionPerformed(evt);
            }
        });

        gunaLinkedInjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/linkedin-2.png"))); // NOI18N
        gunaLinkedInjButton.setText("LinkedIn");
        gunaLinkedInjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gunaLinkedInjButtonActionPerformed(evt);
            }
        });

        gunaGithubjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/github-2.png"))); // NOI18N
        gunaGithubjButton.setText("Github");
        gunaGithubjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gunaGithubjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(projectjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(developerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(anshitaNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(anshitaImagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(anshitaLinkedInjButton)
                                    .addComponent(anshitaGithubjButton))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manojNamejLabel)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(manojImagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(githubLinkedInjButton)
                                    .addComponent(githubManojjButton))))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gunaNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gunashekarImagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gunaLinkedInjButton)
                                    .addComponent(gunaGithubjButton)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {githubLinkedInjButton, githubManojjButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {anshitaGithubjButton, anshitaLinkedInjButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {gunaGithubjButton, gunaLinkedInjButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(projectjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(developerjLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gunashekarImagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anshitaImagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manojImagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(githubLinkedInjButton)
                        .addGap(10, 10, 10)
                        .addComponent(githubManojjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(anshitaLinkedInjButton)
                        .addGap(7, 7, 7)
                        .addComponent(anshitaGithubjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(gunaLinkedInjButton)
                        .addGap(9, 9, 9)
                        .addComponent(gunaGithubjButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manojNamejLabel)
                    .addComponent(anshitaNamejLabel)
                    .addComponent(gunaNamejLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void githubManojjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_githubManojjButtonActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/amireddym").toURI());
        } catch (Exception e) {}
    }//GEN-LAST:event_githubManojjButtonActionPerformed

    private void githubLinkedInjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_githubLinkedInjButtonActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URL("https://www.linkedin.com/in/manojreddyamireddy/").toURI());
        } catch (Exception e) {}
    }//GEN-LAST:event_githubLinkedInjButtonActionPerformed

    private void anshitaGithubjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anshitaGithubjButtonActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/verma-anshita").toURI());
        } catch (Exception e) {}
    }//GEN-LAST:event_anshitaGithubjButtonActionPerformed

    private void anshitaLinkedInjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anshitaLinkedInjButtonActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URL("https://www.linkedin.com/in/anshita-verma2/").toURI());
        } catch (Exception e) {}
    }//GEN-LAST:event_anshitaLinkedInjButtonActionPerformed

    private void gunaLinkedInjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gunaLinkedInjButtonActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URL("https://www.linkedin.com/in/gunasekharvinugolu/").toURI());
        } catch (Exception e) {}
    }//GEN-LAST:event_gunaLinkedInjButtonActionPerformed

    private void gunaGithubjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gunaGithubjButtonActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/gunasekharv6").toURI());
        } catch (Exception e) {}
    }//GEN-LAST:event_gunaGithubjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anshitaGithubjButton;
    private javax.swing.JLabel anshitaImagejLabel;
    private javax.swing.JButton anshitaLinkedInjButton;
    private javax.swing.JLabel anshitaNamejLabel;
    private javax.swing.JLabel developerjLabel;
    private javax.swing.JButton githubLinkedInjButton;
    private javax.swing.JButton githubManojjButton;
    private javax.swing.JButton gunaGithubjButton;
    private javax.swing.JButton gunaLinkedInjButton;
    private javax.swing.JLabel gunaNamejLabel;
    private javax.swing.JLabel gunashekarImagejLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel manojImagejLabel;
    private javax.swing.JLabel manojNamejLabel;
    private javax.swing.JLabel projectjLabel;
    // End of variables declaration//GEN-END:variables
}
