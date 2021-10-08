/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.carDetailsHistory;


/**
 *
 * @author patus
 */
public class searchMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form searchMainJPanel
     */
    
    carDetailsHistory history;
    carDetailsHistory getConfig;
    JPanel rightSplitPane;
    
    public searchMainJPanel(carDetailsHistory history,JPanel rightSplitPane) {
        initComponents();
        
        this.history = history;
        this.rightSplitPane = rightSplitPane;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnSearchByCity = new javax.swing.JButton();
        BtnSearchByModelNumber = new javax.swing.JButton();
        BtnSearchByModel = new javax.swing.JButton();
        BtnListManufacturers = new javax.swing.JButton();
        BtnExpiredMaintenanceCert = new javax.swing.JButton();
        BtnSerialNumber = new javax.swing.JButton();
        BtnMinMax = new javax.swing.JButton();
        BtnFirstAvailableCab = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSearchByCity.setBackground(new java.awt.Color(255, 153, 153));
        BtnSearchByCity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSearchByCity.setText("Search by City & Availability>>");
        BtnSearchByCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BtnSearchByCity.setOpaque(false);
        BtnSearchByCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchByCityActionPerformed(evt);
            }
        });
        add(BtnSearchByCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 80, 350, 30));

        BtnSearchByModelNumber.setBackground(new java.awt.Color(255, 153, 153));
        BtnSearchByModelNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSearchByModelNumber.setText("Search by Model No.>>");
        BtnSearchByModelNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BtnSearchByModelNumber.setOpaque(false);
        BtnSearchByModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchByModelNumberActionPerformed(evt);
            }
        });
        add(BtnSearchByModelNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 140, 350, 30));

        BtnSearchByModel.setBackground(new java.awt.Color(255, 153, 153));
        BtnSearchByModel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSearchByModel.setText("Search by Model>>");
        BtnSearchByModel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BtnSearchByModel.setOpaque(false);
        BtnSearchByModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchByModelActionPerformed(evt);
            }
        });
        add(BtnSearchByModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 200, 350, 30));

        BtnListManufacturers.setBackground(new java.awt.Color(255, 153, 153));
        BtnListManufacturers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnListManufacturers.setText("List all Manufacturers>>");
        BtnListManufacturers.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BtnListManufacturers.setOpaque(false);
        BtnListManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListManufacturersActionPerformed(evt);
            }
        });
        add(BtnListManufacturers, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 260, 350, 30));

        BtnExpiredMaintenanceCert.setBackground(new java.awt.Color(255, 153, 153));
        BtnExpiredMaintenanceCert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnExpiredMaintenanceCert.setText("Check for Maintenance Certificate Expiry>>");
        BtnExpiredMaintenanceCert.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BtnExpiredMaintenanceCert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExpiredMaintenanceCertActionPerformed(evt);
            }
        });
        add(BtnExpiredMaintenanceCert, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 350, 30));

        BtnSerialNumber.setBackground(new java.awt.Color(255, 153, 153));
        BtnSerialNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSerialNumber.setText("List Attributes by Serial Number>>");
        BtnSerialNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BtnSerialNumber.setOpaque(false);
        BtnSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSerialNumberActionPerformed(evt);
            }
        });
        add(BtnSerialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 350, 32));

        BtnMinMax.setBackground(new java.awt.Color(255, 153, 153));
        BtnMinMax.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnMinMax.setText("Search Cars by Min and Max Passengers Capacity>>");
        BtnMinMax.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BtnMinMax.setOpaque(false);
        BtnMinMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinMaxActionPerformed(evt);
            }
        });
        add(BtnMinMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 350, 32));

        BtnFirstAvailableCab.setBackground(new java.awt.Color(255, 153, 153));
        BtnFirstAvailableCab.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnFirstAvailableCab.setText("Get the First Available Cab>>");
        BtnFirstAvailableCab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BtnFirstAvailableCab.setOpaque(false);
        BtnFirstAvailableCab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFirstAvailableCabActionPerformed(evt);
            }
        });
        add(BtnFirstAvailableCab, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 349, 32));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMages/320px-Taxi_picture.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 340, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSearchByCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchByCityActionPerformed
        // TODO add your handling code here:
        searchByCityJPanel citySearchPanel = new searchByCityJPanel(history, getConfig, rightSplitPane);
        rightSplitPane.add("Search by City",citySearchPanel);
        CardLayout layout = (CardLayout)rightSplitPane.getLayout();
        layout.next(rightSplitPane);
        
      
    }//GEN-LAST:event_BtnSearchByCityActionPerformed

    private void BtnSearchByModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchByModelNumberActionPerformed
        // TODO add your handling code here:
        
        SearchByModelNo ModelNoSearchPanel = new SearchByModelNo(history, getConfig);
        rightSplitPane.add("Search by Model Number",ModelNoSearchPanel);
        CardLayout layout = (CardLayout)rightSplitPane.getLayout();
        layout.next(rightSplitPane);
    }//GEN-LAST:event_BtnSearchByModelNumberActionPerformed

    private void BtnSearchByModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchByModelActionPerformed
        // TODO add your handling code here:
        searchByModel ModelSearchPanel = new searchByModel(history, getConfig);
        rightSplitPane.add("Search by Model",ModelSearchPanel);
        CardLayout layout = (CardLayout)rightSplitPane.getLayout();
        layout.next(rightSplitPane);
        
        
    }//GEN-LAST:event_BtnSearchByModelActionPerformed

    private void BtnListManufacturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListManufacturersActionPerformed
        // TODO add your handling code here:
        listManufacturers listmanu = new listManufacturers(history);
        rightSplitPane.add("Search by Model",listmanu);
        CardLayout layout = (CardLayout)rightSplitPane.getLayout();
        layout.next(rightSplitPane);
        
        
        
    }//GEN-LAST:event_BtnListManufacturersActionPerformed

    private void BtnExpiredMaintenanceCertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExpiredMaintenanceCertActionPerformed
        // TODO add your handling code here:
        
        searchByMaintenanceCert expCert = new searchByMaintenanceCert(history,rightSplitPane);
        rightSplitPane.add("Search by Certificate Expiry",expCert);
        CardLayout layout = (CardLayout)rightSplitPane.getLayout();
        layout.next(rightSplitPane);
    }//GEN-LAST:event_BtnExpiredMaintenanceCertActionPerformed

    private void BtnSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSerialNumberActionPerformed
        // TODO add your handling code here:
        searchBySerialNumber serialnumber = new searchBySerialNumber(history);
        rightSplitPane.add("Search by Serial Number",serialnumber);
        CardLayout layout = (CardLayout)rightSplitPane.getLayout();
        layout.next(rightSplitPane);
        
    }//GEN-LAST:event_BtnSerialNumberActionPerformed

    private void BtnMinMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMinMaxActionPerformed
        // TODO add your handling code here:
        
        searchByMinMaxPassenger minmaxpassenger = new searchByMinMaxPassenger(history,rightSplitPane);
        rightSplitPane.add("Search by Min/Max Passenger",minmaxpassenger);
        CardLayout layout = (CardLayout)rightSplitPane.getLayout();
        layout.next(rightSplitPane);
                
    }//GEN-LAST:event_BtnMinMaxActionPerformed

    private void BtnFirstAvailableCabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFirstAvailableCabActionPerformed
        // TODO add your handling code here:
        FirstAvailableCar firstcar = new FirstAvailableCar(history);
        rightSplitPane.add("Search by First Available Cab",firstcar);
        CardLayout layout = (CardLayout)rightSplitPane.getLayout();
        layout.next(rightSplitPane);
        
        
    }//GEN-LAST:event_BtnFirstAvailableCabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExpiredMaintenanceCert;
    private javax.swing.JButton BtnFirstAvailableCab;
    private javax.swing.JButton BtnListManufacturers;
    private javax.swing.JButton BtnMinMax;
    private javax.swing.JButton BtnSearchByCity;
    private javax.swing.JButton BtnSearchByModel;
    private javax.swing.JButton BtnSearchByModelNumber;
    private javax.swing.JButton BtnSerialNumber;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
