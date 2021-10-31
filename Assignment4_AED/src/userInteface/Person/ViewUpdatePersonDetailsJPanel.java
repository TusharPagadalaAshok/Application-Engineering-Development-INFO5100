/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInteface.Person;

import business.MyNumericVerifier;
import business.MyStringVerifier;
import business.Person;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author akshay
 */
public class ViewUpdatePersonDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatientDetailsJPanel
     */
    private Person person;
    private JPanel userProcessContainer;
    private Boolean isEdit = Boolean.FALSE;

    public ViewUpdatePersonDetailsJPanel(JPanel userProcessContainer, Person person, Boolean isEdit) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.person = person;
        this.isEdit = isEdit;
        addVerifiers();
        populatePatientDetails();
        modifyTextFields(this.isEdit);
    }

    private void addVerifiers() {
        InputVerifier integerVerifier = new MyNumericVerifier();
        personAgeJTextField.setInputVerifier(integerVerifier);
        InputVerifier stringVerifier = new MyStringVerifier();
        personNameJTextField.setInputVerifier(stringVerifier);
    }

    private void populatePatientDetails() {
        personNameJTextField.setText(person.getPersonName());
        personAgeJTextField.setText(String.valueOf(person.getAge()));
        cityJTextField.setText(person.getCity());
        HouseJTextField.setText(person.getHouse());
        CommunityJTextField.setText(person.getCommunity());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgeJLabel = new javax.swing.JLabel();
        personNameJTextField = new javax.swing.JTextField();
        personAgeJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        patientNameJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();
        HouseJTextField = new javax.swing.JTextField();
        CommunityJTextField = new javax.swing.JTextField();
        cityJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgeJLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AgeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AgeJLabel.setText("Age:");
        add(AgeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 130, -1));
        add(personNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 200, 30));
        add(personAgeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 200, 30));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Person Information");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 1010, -1));

        patientNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        patientNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        patientNameJLabel.setText("Patient Name:");
        add(patientNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 130, -1));

        backJButton.setBackground(new java.awt.Color(255, 255, 204));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        editJButton.setBackground(new java.awt.Color(255, 255, 204));
        editJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        editJButton.setText("Edit");
        editJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });
        add(editJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 100, -1));

        saveJButton.setBackground(new java.awt.Color(255, 255, 204));
        saveJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });
        add(saveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 100, -1));
        add(HouseJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 200, 30));
        add(CommunityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 200, 30));
        add(cityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("House:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Community:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("City:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        // TODO add your handling code here:
        modifyTextFields(true);
    }//GEN-LAST:event_editJButtonActionPerformed

    private void modifyTextFields(Boolean isEdit) {
        if (isEdit) {
            personNameJTextField.setEnabled(true);
            personAgeJTextField.setEnabled(true);
            cityJTextField.setEnabled(true);
            HouseJTextField.setEnabled(true);
            CommunityJTextField.setEnabled(true);
        } else {
            personNameJTextField.setEnabled(false);
            personAgeJTextField.setEnabled(false);
            cityJTextField.setEnabled(false);
            HouseJTextField.setEnabled(false);
            CommunityJTextField.setEnabled(false);
        }
    }

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:

        if (checkBlankInput()) {
            person.setAge(Integer.parseInt(personAgeJTextField.getText()));
            person.setPersonName(personNameJTextField.getText());
            cityJTextField.setText(person.getCity());
            HouseJTextField.setText(person.getHouse());
            CommunityJTextField.setText(person.getCommunity());
            JOptionPane.showMessageDialog(this, "Person updated!!",
                    "Update", JOptionPane.INFORMATION_MESSAGE);
            modifyTextFields(false);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter correct values", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_saveJButtonActionPerformed
    private Boolean checkBlankInput() {
        if (personAgeJTextField.getText().length() == 0
                || personNameJTextField.getText().length() == 0) {
            return false;
        } else {
            return true;
        }
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeJLabel;
    private javax.swing.JTextField CommunityJTextField;
    private javax.swing.JTextField HouseJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JButton editJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel patientNameJLabel;
    private javax.swing.JTextField personAgeJTextField;
    private javax.swing.JTextField personNameJTextField;
    private javax.swing.JButton saveJButton;
    // End of variables declaration//GEN-END:variables
}
