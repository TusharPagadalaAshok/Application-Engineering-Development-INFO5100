/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JFrame;
import model.carDetailsHistory;

/**
 *
 * @author patus
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    carDetailsHistory history;
    
    public MainJFrame() {
        initComponents();
        
        this.history = new carDetailsHistory();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftSplitPane = new javax.swing.JPanel();
        BtnHome = new javax.swing.JButton();
        rightSplitPane = new javax.swing.JPanel();
        MainTitle = new javax.swing.JLabel();
        btnViewModify = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnHome.setText("Home");
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftSplitPaneLayout = new javax.swing.GroupLayout(leftSplitPane);
        leftSplitPane.setLayout(leftSplitPaneLayout);
        leftSplitPaneLayout.setHorizontalGroup(
            leftSplitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSplitPaneLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(BtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        leftSplitPaneLayout.setVerticalGroup(
            leftSplitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSplitPaneLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(BtnHome)
                .addContainerGap(524, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftSplitPane);

        MainTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        MainTitle.setForeground(new java.awt.Color(51, 51, 255));
        MainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainTitle.setText("Welcome to Cab Mangement Tool!");

        btnViewModify.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewModify.setText("View/Modify");
        btnViewModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewModifyActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Search");

        javax.swing.GroupLayout rightSplitPaneLayout = new javax.swing.GroupLayout(rightSplitPane);
        rightSplitPane.setLayout(rightSplitPaneLayout);
        rightSplitPaneLayout.setHorizontalGroup(
            rightSplitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSplitPaneLayout.createSequentialGroup()
                .addGroup(rightSplitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightSplitPaneLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(MainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightSplitPaneLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnViewModify, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        rightSplitPaneLayout.setVerticalGroup(
            rightSplitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSplitPaneLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(MainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(rightSplitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewModify, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(306, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(rightSplitPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        createJPanel createpanel = new createJPanel(history);
        splitPane.setRightComponent(createpanel);
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewModifyActionPerformed
        // TODO add your handling code here:
        viewJPanel viewpanel = new viewJPanel(history);
        splitPane.setRightComponent(viewpanel);
        
    }//GEN-LAST:event_btnViewModifyActionPerformed

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(rightSplitPane);
        
    }//GEN-LAST:event_BtnHomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHome;
    private javax.swing.JLabel MainTitle;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnViewModify;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel leftSplitPane;
    private javax.swing.JPanel rightSplitPane;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
