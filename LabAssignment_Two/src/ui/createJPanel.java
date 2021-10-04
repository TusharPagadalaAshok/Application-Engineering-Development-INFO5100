/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.carDetails;
import model.carDetailsHistory;

/**
 *
 * @author patus
 */
public class createJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createJPanel
     */
    carDetailsHistory history;
    public createJPanel(carDetailsHistory history) {
        initComponents();
        this.history = history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Title = new javax.swing.JLabel();
        lblCarModel = new javax.swing.JLabel();
        lblMinPassengerCap = new javax.swing.JLabel();
        lblMaxPassengerCap = new javax.swing.JLabel();
        lblManufacturedDate = new javax.swing.JLabel();
        lblCarSerialNo = new javax.swing.JLabel();
        lblManufacturedBy = new javax.swing.JLabel();
        lblGeoLocation = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        lblLastMaintenanceDate = new javax.swing.JLabel();
        TxtCarModel = new javax.swing.JTextField();
        TxtMinPassengerCap = new javax.swing.JTextField();
        TxtMaxPassengerCap = new javax.swing.JTextField();
        TxtCarSerialNo = new javax.swing.JTextField();
        TxtManufacturedBy = new javax.swing.JTextField();
        TxtGeoLocation = new javax.swing.JTextField();
        TxtModelNumber = new javax.swing.JTextField();
        BtnSave = new javax.swing.JButton();
        TxtManufacturedYear = new javax.swing.JTextField();
        lblLastMaintenanceDate1 = new javax.swing.JLabel();
        RbMaintenanceYes = new javax.swing.JRadioButton();
        RbMaintenanceNo = new javax.swing.JRadioButton();
        RbAvailabilityYes = new javax.swing.JRadioButton();
        RbAvailabilityNo = new javax.swing.JRadioButton();

        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Add Car");

        lblCarModel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCarModel.setText("Car Model:");

        lblMinPassengerCap.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMinPassengerCap.setText("Min Passenger Capacity:");

        lblMaxPassengerCap.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMaxPassengerCap.setText("Max Passenger Capacity:");

        lblManufacturedDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblManufacturedDate.setText("Manufactured Year:");

        lblCarSerialNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCarSerialNo.setText("Car Serial Number:");

        lblManufacturedBy.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblManufacturedBy.setText("Manufacturer By:");

        lblGeoLocation.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGeoLocation.setText("Geo Location:");

        lblModelNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblModelNumber.setText("Model Number:");

        lblLastMaintenanceDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLastMaintenanceDate.setText("Maintenance Check since last 30 days:");

        BtnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        lblLastMaintenanceDate1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLastMaintenanceDate1.setText("Available?");

        buttonGroup1.add(RbMaintenanceYes);
        RbMaintenanceYes.setText("Yes");

        buttonGroup1.add(RbMaintenanceNo);
        RbMaintenanceNo.setText("No");
        RbMaintenanceNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbMaintenanceNoActionPerformed(evt);
            }
        });

        buttonGroup2.add(RbAvailabilityYes);
        RbAvailabilityYes.setText("Yes");

        buttonGroup2.add(RbAvailabilityNo);
        RbAvailabilityNo.setText("No");
        RbAvailabilityNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbAvailabilityNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblMinPassengerCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCarModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMaxPassengerCap, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(lblManufacturedDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCarSerialNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblManufacturedBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGeoLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblModelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblLastMaintenanceDate, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(lblLastMaintenanceDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TxtCarModel)
                        .addComponent(TxtMinPassengerCap, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addComponent(TxtMaxPassengerCap, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addComponent(TxtCarSerialNo, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addComponent(TxtManufacturedBy, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addComponent(TxtGeoLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addComponent(TxtModelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addComponent(TxtManufacturedYear, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                    .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RbMaintenanceYes)
                        .addGap(18, 18, 18)
                        .addComponent(RbMaintenanceNo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RbAvailabilityYes)
                        .addGap(18, 18, 18)
                        .addComponent(RbAvailabilityNo)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarModel)
                    .addComponent(TxtCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinPassengerCap)
                    .addComponent(TxtMinPassengerCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaxPassengerCap)
                    .addComponent(TxtMaxPassengerCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturedDate)
                    .addComponent(TxtManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarSerialNo)
                    .addComponent(TxtCarSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturedBy)
                    .addComponent(TxtManufacturedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeoLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtGeoLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastMaintenanceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RbMaintenanceYes)
                    .addComponent(RbMaintenanceNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLastMaintenanceDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RbAvailabilityYes)
                        .addComponent(RbAvailabilityNo)))
                .addGap(19, 19, 19)
                .addComponent(BtnSave)
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
        
        String carModel = TxtCarModel.getText();
        int minPassengerCap = Integer.parseInt(TxtMinPassengerCap.getText());
        int maxPassengerCap = Integer.parseInt(TxtMaxPassengerCap.getText());
        String  manufacturedYear = TxtManufacturedYear.getText();
        long carSerialNumber = Long.parseLong(TxtCarSerialNo.getText());
        String manufacturedBy = TxtManufacturedBy.getText();
        String geoLocation = TxtGeoLocation.getText();
        int modelNumber = Integer.parseInt(TxtModelNumber.getText());
        String maintenanceCheck="";
        String availability="";
      
        Enumeration<AbstractButton> bg = buttonGroup1.getElements();
        while(bg.hasMoreElements()){
                JRadioButton jrd = (JRadioButton) bg.nextElement();
                if(jrd.isSelected())
                    maintenanceCheck = jrd.getText();
        }
        
        Enumeration<AbstractButton> bg1 = buttonGroup2.getElements();
        while(bg.hasMoreElements()){
                JRadioButton jrd1 = (JRadioButton) bg1.nextElement();
                if(jrd1.isSelected())
                     availability = jrd1.getText();
        }
        
        carDetails cd = history.addNewCarDetails();
         
        
        cd.setCarModel(carModel); 
        cd.setMinPassengerCap(minPassengerCap);
        cd.setMaxPassengerCap(maxPassengerCap);
        cd.setManufacturedYear(manufacturedYear);
        cd.setCarSerialNo(carSerialNumber);
        cd.setManufacturedBy(manufacturedBy);
        cd.setGeoLocation(geoLocation);
        cd.setModelNumber(modelNumber);
        cd.setAvailability(availability);
        cd.setLastMaintenanceDate(maintenanceCheck);
      
        
        JOptionPane.showMessageDialog(this,"Car added!");
             
        TxtCarModel.setText("");
        TxtMinPassengerCap.setText("");
        TxtMaxPassengerCap.setText("");
        TxtManufacturedYear.setText("");
        TxtCarSerialNo.setText("");
        TxtManufacturedBy.setText("");
        TxtGeoLocation.setText("");
        TxtModelNumber.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        
        
        
        
        
               
        
        
        
        
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void RbMaintenanceNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbMaintenanceNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbMaintenanceNoActionPerformed

    private void RbAvailabilityNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbAvailabilityNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbAvailabilityNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSave;
    private javax.swing.JRadioButton RbAvailabilityNo;
    private javax.swing.JRadioButton RbAvailabilityYes;
    private javax.swing.JRadioButton RbMaintenanceNo;
    private javax.swing.JRadioButton RbMaintenanceYes;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField TxtCarModel;
    private javax.swing.JTextField TxtCarSerialNo;
    private javax.swing.JTextField TxtGeoLocation;
    private javax.swing.JTextField TxtManufacturedBy;
    private javax.swing.JTextField TxtManufacturedYear;
    private javax.swing.JTextField TxtMaxPassengerCap;
    private javax.swing.JTextField TxtMinPassengerCap;
    private javax.swing.JTextField TxtModelNumber;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel lblCarModel;
    private javax.swing.JLabel lblCarSerialNo;
    private javax.swing.JLabel lblGeoLocation;
    private javax.swing.JLabel lblLastMaintenanceDate;
    private javax.swing.JLabel lblLastMaintenanceDate1;
    private javax.swing.JLabel lblManufacturedBy;
    private javax.swing.JLabel lblManufacturedDate;
    private javax.swing.JLabel lblMaxPassengerCap;
    private javax.swing.JLabel lblMinPassengerCap;
    private javax.swing.JLabel lblModelNumber;
    // End of variables declaration//GEN-END:variables
}
