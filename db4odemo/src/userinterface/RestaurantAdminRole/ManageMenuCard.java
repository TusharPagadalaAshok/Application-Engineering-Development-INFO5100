/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

/**
 *
 * @author patus
 * 
 * 
 */
import Business.EcoSystem;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageMenuCard extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenuCard
     */
    
    EcoSystem system;
     Menu menuItem;
    JPanel userProcessContainer;
    UserAccount account;
    public ManageMenuCard(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
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

        jLabel1 = new javax.swing.JLabel();
        TxtCost = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TxtItemName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txtingedients = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        BtnAddDish = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingredients:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        TxtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCostActionPerformed(evt);
            }
        });
        add(TxtCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 100, -1));

        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Ingredients", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MenuTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 830, 100));

        jLabel2.setText("Dish Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        TxtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtItemNameActionPerformed(evt);
            }
        });
        add(TxtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 100, -1));

        jLabel3.setText("Cost:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        Txtingedients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtingedientsActionPerformed(evt);
            }
        });
        add(Txtingedients, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 100, -1));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        backBtn.setText("<<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        BtnAddDish.setText("Add Item");
        BtnAddDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddDishActionPerformed(evt);
            }
        });
        add(BtnAddDish, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCostActionPerformed

    private void TxtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtItemNameActionPerformed

    private void TxtingedientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtingedientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtingedientsActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = MenuTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){

                for(Restaurant restro:system.getRestaurantDirectory().getRestaurantList()){
                    if(restro.getResName().equals(account.getUsername())){
                        system.getRestaurantDirectory().DeleteItems(restro, menuItem);
                    }
                }
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void BtnAddDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddDishActionPerformed
        // TODO add your handling code here:
        String name=TxtItemName.getText();
        String desc=Txtingedients.getText();
        String amount=TxtCost.getText();

        try {
            if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");

            }else if(name.length()<5 ){
                throw new Exception("Please enter valid  Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if(desc==null || desc.isEmpty()){
                throw new NullPointerException("Ingredients  field is Empty");

            }else if(desc.length()<5){
                throw new Exception("Please enter valid list of Ingredients ");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Description is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " Description is invalid");

            return;
        }

        try {

            if(amount==null || amount.isEmpty()){
                throw new NullPointerException("amount field is Empty");
            }else if(Pattern.matches("^[0-9]{0,3}$", amount)==false){
                throw new Exception("Invalid amount (Enter 0-3 Digits)");
            }

        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "amount is Empty");

            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "amount is of invalid pattern");

            return;
        }

        for(Restaurant restro:system.getRestaurantDirectory().getRestaurantList()){
            if(restro.getResName().equals(account.getUsername())){
                menuItem =system.getRestaurantDirectory().AddMenuItems(restro,name, desc, amount);
            }
        }

        TxtItemName.setText("");
        Txtingedients.setText("");
        TxtCost.setText("");
        System.out.println("before populate table");
        populateTable();

    }//GEN-LAST:event_BtnAddDishActionPerformed

    private void populateTable() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
        
        model.setRowCount(0);
         System.out.println("here in for loop");
       
        for (Restaurant restro:system.getRestaurantDirectory().getRestaurantList()) {
           
            if (restro.getResName().equals(account.getUsername())) {
               
               for(Menu menu:restro.getMenuItem()){
                Object[] row = new Object[3];
                row[0] = menu;
                row[1] = menu.getIngredients();
                row[2] = menu.getPrice();
                model.addRow(row);
               }
                
            }
            
        }






    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddDish;
    private javax.swing.JTable MenuTable;
    private javax.swing.JTextField TxtCost;
    private javax.swing.JTextField TxtItemName;
    private javax.swing.JTextField Txtingedients;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
