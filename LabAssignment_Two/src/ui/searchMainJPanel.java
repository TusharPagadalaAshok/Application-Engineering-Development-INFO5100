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

        BtnSearchByCity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSearchByCity.setText("Search by City & Availability>>");
        BtnSearchByCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BtnSearchByCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchByCityActionPerformed(evt);
            }
        });

        BtnSearchByModelNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSearchByModelNumber.setText("Search by Model No.>>");
        BtnSearchByModelNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BtnSearchByModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchByModelNumberActionPerformed(evt);
            }
        });

        BtnSearchByModel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSearchByModel.setText("Search by Model>>");
        BtnSearchByModel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BtnSearchByModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchByModelActionPerformed(evt);
            }
        });

        BtnListManufacturers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnListManufacturers.setText("List all Manufacturers>>");
        BtnListManufacturers.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BtnListManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListManufacturersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSearchByCity, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(BtnSearchByModelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSearchByModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnListManufacturers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(BtnSearchByCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnSearchByModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnSearchByModel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnListManufacturers, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSearchByCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchByCityActionPerformed
        // TODO add your handling code here:
        searchByCityJPanel citySearchPanel = new searchByCityJPanel(history, getConfig);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnListManufacturers;
    private javax.swing.JButton BtnSearchByCity;
    private javax.swing.JButton BtnSearchByModel;
    private javax.swing.JButton BtnSearchByModelNumber;
    // End of variables declaration//GEN-END:variables
}
