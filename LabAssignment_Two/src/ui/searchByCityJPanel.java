/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.carDetails;
import model.carDetailsHistory;
import model.myRowFilterCity;
import model.myRowFilterCityAvailability;


/**
 *
 * @author patus
 */
public class searchByCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form searchByCityJPanel
     */
    carDetailsHistory history;
    carDetailsHistory getConfig;
    JPanel rightSplitPane;
  
//    JPanel createJPanel;
    public searchByCityJPanel(carDetailsHistory history, carDetailsHistory getConfig, JPanel rightSplitPane) {
        initComponents();
       // ls = new ArrayList<carDetails>();
        this.history = history;
        this.getConfig  = getConfig;
        this.rightSplitPane = rightSplitPane;
//        this.createJPanel = createJPanel;
        getConfigFile();
//        populatetable();
//        sortTable();
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendarTheme1 = new com.toedter.plaf.JCalendarTheme();
        TitleCity = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carTableCity = new javax.swing.JTable();
        CitySearch = new javax.swing.JTextField();
        BtnSearch = new javax.swing.JButton();
        lblEnterCity = new javax.swing.JLabel();
        DropDownAvailability = new javax.swing.JComboBox<>();
        lblAvailability = new javax.swing.JLabel();
        BackHome = new javax.swing.JButton();
        AvailableCount = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleCity.setBackground(new java.awt.Color(255, 102, 51));
        TitleCity.setFont(new java.awt.Font("Rockwell", 1, 25)); // NOI18N
        TitleCity.setForeground(new java.awt.Color(255, 255, 255));
        TitleCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleCity.setText("Search By City");
        TitleCity.setOpaque(true);
        add(TitleCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 1060, 31));

        carTableCity.setBackground(new java.awt.Color(153, 255, 153));
        carTableCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Model", "Manufacturer", "Availability", "Maintenance?", "Min Pssgr", "Max Pssgr", "Manufd Year", "City", "Model No", "Date Modified", "AvailCount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carTableCity.setSelectionBackground(new java.awt.Color(204, 255, 102));
        carTableCity.setSelectionForeground(new java.awt.Color(51, 51, 51));
        carTableCity.setShowGrid(true);
        carTableCity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carTableCityMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carTableCity);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 970, 270));
        add(CitySearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 185, 32));

        BtnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnSearch.setText("Search");
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });
        add(BtnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 98, 35));

        lblEnterCity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEnterCity.setText("Enter the City:");
        add(lblEnterCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 90, 32));

        DropDownAvailability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        DropDownAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropDownAvailabilityActionPerformed(evt);
            }
        });
        add(DropDownAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 73, -1));

        lblAvailability.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAvailability.setText("Availability:");
        add(lblAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 80, 32));

        BackHome.setBackground(new java.awt.Color(255, 204, 153));
        BackHome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BackHome.setText("<<Back");
        BackHome.setOpaque(false);
        BackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackHomeActionPerformed(evt);
            }
        });
        add(BackHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 116, 32));

        AvailableCount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AvailableCount.setForeground(new java.awt.Color(0, 255, 255));
        add(AvailableCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 340, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void carTableCityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carTableCityMouseClicked
        // TODO add your handling code here:



    }//GEN-LAST:event_carTableCityMouseClicked

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) carTableCity.getModel();
            
            TableRowSorter myTableRowSorter = new TableRowSorter(model);
//            DefaultTableModel model = (DefaultTableModel) carTableCity.getModel();
        
        carTableCity.setModel(model);
        int count=0;
            for(int i = 0; i< carTableCity.getRowCount();i++){
                if(carTableCity.getValueAt(i,3).equals((String) DropDownAvailability.getSelectedItem())){
                    count++;
                }
            }
//            String s = String.valueOf(count);
            AvailableCount.setText("Total Available Cars: " + count);
            
        
        carTableCity.setRowSorter(myTableRowSorter);
               
        java.util.List<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(3);
            filters.add(RowFilter.regexFilter("(?i)" + CitySearch.getText(),8));
            String availability = (String) DropDownAvailability.getSelectedItem();
            filters.add(RowFilter.regexFilter("(?i)" + availability,3));
            
            RowFilter<Object,Object> serviceFilter = RowFilter.andFilter(filters);
            myTableRowSorter.setRowFilter(serviceFilter);
            
       




            
         
            
            
            
            
           
            
            
            
   
    
    }//GEN-LAST:event_BtnSearchActionPerformed

    private void DropDownAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropDownAvailabilityActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_DropDownAvailabilityActionPerformed

    private void BackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackHomeActionPerformed
        // TODO add your handling code here:
        searchMainJPanel BackHome = new searchMainJPanel(history, rightSplitPane);
        rightSplitPane.add("Back to Main Menu",BackHome);
        CardLayout layout = (CardLayout)rightSplitPane.getLayout();
        layout.next(rightSplitPane);
    }//GEN-LAST:event_BackHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvailableCount;
    private javax.swing.JButton BackHome;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JTextField CitySearch;
    private javax.swing.JComboBox<String> DropDownAvailability;
    private javax.swing.JLabel TitleCity;
    private javax.swing.JTable carTableCity;
    private com.toedter.plaf.JCalendarTheme jCalendarTheme1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblEnterCity;
    // End of variables declaration//GEN-END:variables
//
    private void populatetable() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        DefaultTableModel model = (DefaultTableModel) carTableCity.getModel();
//        model.setRowCount(0);
        
        for(carDetails cdh: history.getHistory()){
             Object[] row = new Object[11];
             row[0] = cdh.getCarSerialNo();
             row[1] = cdh.getCarModel();
             row[2] = cdh.getManufacturedBy();
             row[3] = cdh.getAvailability();
             row[4] = cdh.getLastMaintenanceDate();
             row[5] = cdh.getMinPassengerCap();
             row[6] = cdh.getMaxPassengerCap();
             row[7] = cdh.getManufacturedYear();
             row[8] = cdh.getGeoLocation();
             row[9] = cdh.getModelNumber();
             row[10] = cdh.getDate();
//             lblModifiedDateView.setText("Fleet Database was last updated on: "+cdh.getDate());
             model.addRow(row);
             
            
        }
        
    }
    
    
        private void getConfigFile() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        

        String FilePath = "C:\\Users\\patus\\Documents\\git\\PagadalaAshok_Tushar_002130680\\LabAssignment_Two\\CarData.txt";
        File file = new File(FilePath);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            String firstLine = br.readLine().trim();
//            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)carTableCity.getModel();
//            model.setColumnIdentifiers(columnsName);
            
            // get lines from txt file
            Object[] tableLines = br.lines().toArray();
            
            // extratct data from lines
            // set data to jtable model
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                
                    model.addRow(dataRow);
                
                
                
//                carDetails cdf = getConfig.addNewCarDetailsConfig();
//                cdf.setCarModel(dataRow[i]);
//                cdf.setMinPassengerCap(Integer.parseInt(dataRow[i]));
//                cdf.setMaxPassengerCap(Integer.parseInt(dataRow[i]));
//                cdf.setManufacturedYear(Long.parseLong(dataRow[i]));
//                cdf.setCarSerialNo(Long.parseLong(dataRow[i]));
//                cdf.setManufacturedBy(dataRow[i]);
//                cdf.setGeoLocation(dataRow[i]);
//                cdf.setModelNumber(Double.parseDouble(dataRow[i]));
//                cdf.setAvailability(dataRow[i]);
//                cdf.setLastMaintenanceDate(dataRow[i]);
//                cdf.setDate(dataRow[i]);
            
            }
            
            
             
             
            
 
            
        } catch (Exception ex) {
//            Logger.getLogger(TextFileDataToJTable.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "File not found!");
        }
    }

}    




    

    


    


