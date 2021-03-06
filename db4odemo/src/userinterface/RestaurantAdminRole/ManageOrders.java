/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patus
 */

public class ManageOrders extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrders
     */
    
      EcoSystem system;
    JPanel userProcessContainer;
    UserAccount account;
    public ManageOrders(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
         initComponents();
        this.account=account;
        this.system=system;
        this.userProcessContainer=userProcessContainer;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        BtnReadytodeliver = new javax.swing.JButton();
        AssignBtn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer Name", "Delivery Address", "Total Amount", "Status", "Comments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 690, 120));

        backBtn.setBackground(new java.awt.Color(255, 255, 204));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backBtn.setText("<<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        BtnReadytodeliver.setBackground(new java.awt.Color(255, 255, 204));
        BtnReadytodeliver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnReadytodeliver.setText("Set Status");
        BtnReadytodeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReadytodeliverActionPerformed(evt);
            }
        });
        add(BtnReadytodeliver, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 120, -1));

        AssignBtn1.setBackground(new java.awt.Color(255, 255, 204));
        AssignBtn1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AssignBtn1.setText("Assign to Delivery Person ");
        AssignBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignBtn1ActionPerformed(evt);
            }
        });
        add(AssignBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 150, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Order");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1240, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void BtnReadytodeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReadytodeliverActionPerformed
        int selectedRow = orderTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Order order  = (Order)orderTable.getValueAt(selectedRow, 0);
            if(order.getOrderStatus().equals("Ready for Delivery")){
                JOptionPane.showMessageDialog(null,"Already Ready ","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                OrderDetail viewOrder=new OrderDetail(userProcessContainer,account,order,system);
                userProcessContainer.add("View Order",viewOrder);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_BtnReadytodeliverActionPerformed

    private void AssignBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignBtn1ActionPerformed
        int selectedRow = orderTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
//        Order orderStatus  = (Order)orderTable.getValueAt(selectedRow, 6);
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select an order from the table.");
        }
//        else if(model.getValueAt(selectedRow, 6) == "Delivered")
//                {
//                   JOptionPane.showMessageDialog(null,"Order is already delivered!"); 
//                }
        else{
            Order order  = (Order)orderTable.getValueAt(selectedRow, 0);
            if(order.getOrderStatus().equals("Assigned for Delivery")){
                JOptionPane.showMessageDialog(null,"Already Assigned Order","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                AssignDeliveryMan viewOrder=new AssignDeliveryMan(userProcessContainer,account,order,system);
                userProcessContainer.add("View Order",viewOrder);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_AssignBtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignBtn1;
    private javax.swing.JButton BtnReadytodeliver;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        
        model.setRowCount(0);
        
       
        for (Restaurant restro:system.getRestaurantDirectory().getRestaurantList()) {
           
            if (restro.getResName().equals(account.getUsername())) {
                //System.out.println(restro.getOrderList());
               for(Order menu:restro.getOrderList()){
                Object[] row = new Object[6];
                row[0] = menu;
                row[1] = menu.getCustomerName();
                row[2] = menu.getDeliveryAddress();
                row[3] = menu.getOrderCost();
                row[4] = menu.getOrderStatus();
                row[5] = menu.getComments();
                model.addRow(row);
               }
                
            }
            
        }
    }
}
