

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.system=system;
       
      
        greeting.setText(account.getUsername());
      
      
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnManageResData = new javax.swing.JButton();
        BtnmanageEmployee = new javax.swing.JButton();
        BtnmanageOrganization = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        greeting = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnManageResData.setBackground(new java.awt.Color(255, 255, 204));
        BtnManageResData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnManageResData.setText("Manage Restaurant Information");
        BtnManageResData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageResDataActionPerformed(evt);
            }
        });
        add(BtnManageResData, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 270, 50));

        BtnmanageEmployee.setBackground(new java.awt.Color(255, 255, 204));
        BtnmanageEmployee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnmanageEmployee.setText("Manage Menu");
        BtnmanageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnmanageEmployeeActionPerformed(evt);
            }
        });
        add(BtnmanageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 270, 50));

        BtnmanageOrganization.setBackground(new java.awt.Color(255, 255, 204));
        BtnmanageOrganization.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnmanageOrganization.setText("Manage Orders");
        BtnmanageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnmanageOrganizationActionPerformed(evt);
            }
        });
        add(BtnmanageOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 270, 50));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Welcome!");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 120, 30));

        greeting.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        greeting.setForeground(new java.awt.Color(51, 0, 153));
        greeting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(greeting, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 200, 70));

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Restuarant Administration");
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1230, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnManageResDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManageResDataActionPerformed
        // TODO add your handling code here:
        
        ManageResData manageInfo=new ManageResData(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",manageInfo);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_BtnManageResDataActionPerformed

    private void BtnmanageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnmanageEmployeeActionPerformed
          ManageMenuCard manageMenu=new ManageMenuCard(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurants",manageMenu);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnmanageEmployeeActionPerformed

    private void BtnmanageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnmanageOrganizationActionPerformed
        ManageOrders manageOrder=new ManageOrders(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurants",manageOrder);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_BtnmanageOrganizationActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnManageResData;
    private javax.swing.JButton BtnmanageEmployee;
    private javax.swing.JButton BtnmanageOrganization;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel greeting;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    
}
