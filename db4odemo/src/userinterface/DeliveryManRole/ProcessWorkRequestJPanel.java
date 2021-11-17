/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Order.Order;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */


public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;

    Order order;
    EcoSystem system;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer,Order order,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.order = order;
        this.system=system;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        DeliveryStatusComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnUpdate.setBackground(new java.awt.Color(255, 255, 204));
        BtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });
        add(BtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Status:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 90, 80, 20));

        backJButton.setBackground(new java.awt.Color(255, 255, 204));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 20));

        DeliveryStatusComboBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DeliveryStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delayed", "Delivered", "Customer Unreachable" }));
        DeliveryStatusComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DeliveryStatusComboBoxItemStateChanged(evt);
            }
        });
        add(DeliveryStatusComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DeliveryManWorkAreaJPanel dwjp = (DeliveryManWorkAreaJPanel) component;
        dwjp.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
       
//        String status=TxtStatus.getText();
          String status=(String) DeliveryStatusComboBox.getSelectedItem();
//        try {
//             if(status==null || status.isEmpty()){
//                throw new Exception(" Status field is Empty");
//             }        
//        } catch(Exception e){
//            JOptionPane.showMessageDialog(null, " Status is Empty");
//            return;
//        }
        
        order.setOrderStatus(status);
         for(Customer cust:system.getCustomerDirectory().getCustList()){
            if(order.getCustomerName().equals(cust.getUserName())){
                for(Order order : cust.getOrderList()){
                    order.setOrderStatus(status);
                }
            }
        }
         
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void DeliveryStatusComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DeliveryStatusComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_DeliveryStatusComboBoxItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JComboBox<String> DeliveryStatusComboBox;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
