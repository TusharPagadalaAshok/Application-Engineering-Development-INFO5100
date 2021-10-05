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

        BtnSearchByCity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSearchByCity.setText("Search by City>>");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnSearchByModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSearchByModelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(BtnSearchByCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(BtnSearchByCity)
                .addGap(18, 18, 18)
                .addComponent(BtnSearchByModelNumber)
                .addGap(18, 18, 18)
                .addComponent(BtnSearchByModel)
                .addContainerGap(498, Short.MAX_VALUE))
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
    }//GEN-LAST:event_BtnSearchByModelNumberActionPerformed

    private void BtnSearchByModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchByModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSearchByModelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSearchByCity;
    private javax.swing.JButton BtnSearchByModel;
    private javax.swing.JButton BtnSearchByModelNumber;
    // End of variables declaration//GEN-END:variables
}
