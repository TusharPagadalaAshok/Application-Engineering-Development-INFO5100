/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.carDetails;
import model.carDetailsHistory;

/**
 *
 * @author patus
 */
public class searchBySerialNumber extends javax.swing.JPanel {

    /** Creates new form searchBySerialNumber */
    carDetailsHistory history;
    JPanel rightSplitPane;
    public searchBySerialNumber(carDetailsHistory history,JPanel rightSplitPane) {
        initComponents();
        this.history = history;
        this.rightSplitPane = rightSplitPane;
         getConfigFile();
        populatetable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAvailableSerialNo = new javax.swing.ButtonGroup();
        lblMaxPassengerCap = new javax.swing.JLabel();
        TxtGeoLocation = new javax.swing.JComboBox<>();
        lblModelNumber = new javax.swing.JLabel();
        TxtMaxPassengerCap = new javax.swing.JTextField();
        TxtManufacturedYear = new javax.swing.JTextField();
        TxtMinPassengerCap = new javax.swing.JTextField();
        lblCarModel = new javax.swing.JLabel();
        TxtModelNumber = new javax.swing.JTextField();
        TxtCarModel = new javax.swing.JTextField();
        lblLastMaintenanceDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        lblManufacturedDate = new javax.swing.JLabel();
        lblCarSerialNo = new javax.swing.JLabel();
        RbAvailabilityNo = new javax.swing.JRadioButton();
        TxtManufacturedBy = new javax.swing.JTextField();
        lblGeoLocation = new javax.swing.JLabel();
        LastMaintenanceDateView = new com.toedter.calendar.JDateChooser();
        RbAvailabilityYes = new javax.swing.JRadioButton();
        lblMinPassengerCap = new javax.swing.JLabel();
        lblLastMaintenanceDate1 = new javax.swing.JLabel();
        TxtCarSerialNo = new javax.swing.JTextField();
        lblManufacturedBy = new javax.swing.JLabel();
        TxtSerialNo = new javax.swing.JTextField();
        lblSerialNumber = new javax.swing.JLabel();
        BtnSearchSerialNumber = new javax.swing.JButton();
        TitleCity = new javax.swing.JLabel();
        BackHome = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMaxPassengerCap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMaxPassengerCap.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMaxPassengerCap.setText("Max Passenger Capacity:");
        add(lblMaxPassengerCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 157, -1));

        TxtGeoLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "New York City", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "Austin", "San Jose", "Fort Worth", "Jacksonville", "Columbus", "Charlotte", "Indianapolis", "San Francisco", "Seattle", "Denver", "Washington", "Boston", "El Paso", "Nashville", "Oklahoma City", "Las Vegas", "Detroit", "Portland", "Memphis", "Louisville", "Milwaukee", "Baltimore", "Albuquerque", "Tucson", "Mesa", "Fresno", "Sacramento", "Atlanta", "Kansas City", "Colorado Springs", "Raleigh", "Omaha", "Miami", "Long Beach", "Virginia Beach", "Oakland", "Minneapolis", "Tampa", "Tulsa", "Arlington", "Wichita", "Bakersfield", "Aurora", "New Orleans", "Cleveland", "Anaheim", "Henderson", "Honolulu", "Riverside", "Santa Ana", "Corpus Christi", "Lexington", "San Juan", "Stockton", "St. Paul", "Cincinnati", "Greensboro", "Pittsburgh", "Irvine", "St. Louis", "Lincoln", "Orlando", "Durham", "Plano", "Anchorage", "Newark", "Chula Vista", "Fort Wayne", "Chandler", "Toledo", "St. Petersburg", "Reno", "Laredo", "Scottsdale", "North Las Vegas", "Lubbock", "Madison", "Gilbert", "Jersey City", "Glendale", "Buffalo", "Winston-Salem", "Chesapeake", "Fremont", "Norfolk", "Irving", "Garland", "Paradise", "Arlington", "Richmond", "Hialeah", "Boise", "Spokane", "Frisco", "Moreno Valley", "Tacoma", "Fontana", "Modesto", "Baton Rouge", "Port St. Lucie", "San Bernardino", "McKinney", "Fayetteville", "Santa Clarita", "Des Moines", "Oxnard", "Birmingham", "Spring Valley", "Huntsville", "Rochester", "Cape Coral", "Tempe", "Grand Rapids", "Yonkers", "Overland Park", "Salt Lake City", "Amarillo", "Augusta", "Columbus", "Tallahassee", "Montgomery", "Huntington Beach", "Akron", "Little Rock", "Glendale", "Grand Prairie", "Aurora", "Sunrise Manor", "Ontario", "Sioux Falls", "Knoxville", "Vancouver", "Mobile", "Worcester", "Chattanooga", "Brownsville", "Peoria", "Fort Lauderdale", "Shreveport", "Newport News", "Providence", "Elk Grove", "Rancho Cucamonga", "Salem", "Pembroke Pines", "Santa Rosa", "Eugene", "Oceanside", "Cary", "Fort Collins", "Corona", "Enterprise", "Garden Grove", "Springfield", "Clarksville", "Bayamon", "Lakewood", "Alexandria", "Hayward", "Murfreesboro", "Killeen", "Hollywood", "Lancaster", "Salinas", "Jackson", "Midland", "Macon County", "Kansas City", "Palmdale", "Sunnyvale", "Springfield", "Escondido", "Pomona", "Bellevue", "Surprise", "Naperville", "Pasadena", "Denton", "Roseville", "Joliet", "Thornton", "McAllen", "Paterson", "Rockford", "Carrollton", "Bridgeport", "Miramar", "Round Rock", "Metairie", "Olathe", "Waco" }));
        add(TxtGeoLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 174, 30));

        lblModelNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblModelNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblModelNumber.setText("Model Number:");
        add(lblModelNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 157, 21));
        add(TxtMaxPassengerCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 174, -1));
        add(TxtManufacturedYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 174, -1));
        add(TxtMinPassengerCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 174, -1));

        lblCarModel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCarModel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCarModel.setText("Car Model:");
        add(lblCarModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 157, -1));
        add(TxtModelNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 174, 30));
        add(TxtCarModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 174, -1));

        lblLastMaintenanceDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLastMaintenanceDate.setText("Last Maintenance Date:");
        add(lblLastMaintenanceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 148, 20));

        carTable.setBackground(new java.awt.Color(153, 255, 153));
        carTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Model", "Manufacturer", "Availability", "Last Maintenance Date", "Min Pssgr", "Max Pssgr", "Manufd Year", "City", "Model No", "Date Modified"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carTable.setGridColor(new java.awt.Color(0, 0, 0));
        carTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        carTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        carTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 930, 139));

        lblManufacturedDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblManufacturedDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblManufacturedDate.setText("Manufactured Year:");
        add(lblManufacturedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 157, -1));

        lblCarSerialNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCarSerialNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCarSerialNo.setText("Car Serial Number:");
        add(lblCarSerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 157, -1));

        buttonGroupAvailableSerialNo.add(RbAvailabilityNo);
        RbAvailabilityNo.setText("No");
        RbAvailabilityNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbAvailabilityNoActionPerformed(evt);
            }
        });
        add(RbAvailabilityNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, -1, 20));
        add(TxtManufacturedBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 174, 30));

        lblGeoLocation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGeoLocation.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGeoLocation.setText("Geo Location:");
        add(lblGeoLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 157, 21));
        add(LastMaintenanceDateView, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 148, 30));

        buttonGroupAvailableSerialNo.add(RbAvailabilityYes);
        RbAvailabilityYes.setText("Yes");
        add(RbAvailabilityYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, -1, 20));

        lblMinPassengerCap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMinPassengerCap.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMinPassengerCap.setText("Min Passenger Capacity:");
        add(lblMinPassengerCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 157, -1));

        lblLastMaintenanceDate1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLastMaintenanceDate1.setText("Available?:");
        add(lblLastMaintenanceDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 193, 20));
        add(TxtCarSerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 174, 30));

        lblManufacturedBy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblManufacturedBy.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblManufacturedBy.setText("Manufacturer By:");
        add(lblManufacturedBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 157, -1));

        TxtSerialNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TxtSerialNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtSerialNoKeyPressed(evt);
            }
        });
        add(TxtSerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 170, 35));

        lblSerialNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSerialNumber.setText("Enter the Serial Number:");
        add(lblSerialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, 35));

        BtnSearchSerialNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSearchSerialNumber.setText("Search");
        BtnSearchSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchSerialNumberActionPerformed(evt);
            }
        });
        add(BtnSearchSerialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 120, 30));

        TitleCity.setBackground(new java.awt.Color(255, 102, 51));
        TitleCity.setFont(new java.awt.Font("Rockwell", 1, 25)); // NOI18N
        TitleCity.setForeground(new java.awt.Color(255, 255, 255));
        TitleCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleCity.setText("Search by Serial Number");
        TitleCity.setOpaque(true);
        add(TitleCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1060, 40));

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
    }// </editor-fold>//GEN-END:initComponents

    private void carTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carTableMouseClicked
        // TODO add your handling code here:

        
        buttonGroupAvailableSerialNo.clearSelection();
        DefaultTableModel tblmodel = (DefaultTableModel)carTable.getModel();

        TxtCarSerialNo.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),0).toString());
        TxtCarModel.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),1).toString());
        TxtManufacturedBy.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),2).toString());
        //       TxtAvailability.setText(tblmodel.getValueAt(carTable.getSelectedRow(),3).toString());
        String dd = tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),4).toString();
        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dd);
            LastMaintenanceDateView.setDate(date);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(viewJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        TxtMinPassengerCap.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),5).toString());
        TxtMaxPassengerCap.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),6).toString());
        TxtManufacturedYear.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),7).toString());
        TxtGeoLocation.setSelectedItem(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),8).toString());
        TxtModelNumber.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),9).toString());
        //       lblDate.setText(tblmodel.getValueAt(carTable.getSelectedRow(),10).toString());
        //Availability
        String availability = tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),3).toString();

        if (availability.equals("Yes")) {
            RbAvailabilityYes.setSelected(true);
        }
        else {
            RbAvailabilityNo.setSelected(true);
        }
        //Maintenance Check

        String maintenanceChk = tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),4).toString();

        //        if (maintenanceChk.equals("Yes")) {
            //            RbMaintenanceYes.setSelected(true);
            //        }
        //        else {
            //            RbMaintenanceNo.setSelected(true);
            //        }
        //

    }//GEN-LAST:event_carTableMouseClicked

    private void RbAvailabilityNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbAvailabilityNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbAvailabilityNoActionPerformed

    private void TxtSerialNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSerialNoKeyPressed
        // TODO add your handling code here:
        
        
        
        
        
        
    }//GEN-LAST:event_TxtSerialNoKeyPressed

    private void BtnSearchSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchSerialNumberActionPerformed
        // TODO add your handling code here:
      
        DefaultTableModel model = (DefaultTableModel) carTable.getModel();
        TableRowSorter myTableRowSorter = new TableRowSorter(model);
        carTable.setModel(model);
        carTable.setRowSorter(myTableRowSorter);
               
        java.util.List<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(3);
        String regex = String.format("^%s$", TxtSerialNo.getText());
            filters.add(RowFilter.regexFilter("(?i)" + regex,0));
//            String availability = (String) DropDownAvailability.getSelectedItem();
//            filters.add(RowFilter.regexFilter("(?i)" + availability,3));
            
            RowFilter<Object,Object> serviceFilter = RowFilter.andFilter(filters);
            myTableRowSorter.setRowFilter(serviceFilter);
            ArrayList<String> ls = new ArrayList<String>();
            for(int i = 0;i<model.getRowCount();i++){
                ls.add((String) model.getValueAt(i, 0));
//                if(model.getValueAt(i, 0)!= TxtSerialNo.getText()){
            }
            if(!ls.contains(TxtSerialNo.getText())){
                JOptionPane.showMessageDialog(this,"This Serial Number doesn't exist!");
            }
        
       
            
        
    }//GEN-LAST:event_BtnSearchSerialNumberActionPerformed

    private void BackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackHomeActionPerformed
        // TODO add your handling code here:
        searchMainJPanel BackHome5 = new searchMainJPanel(history, rightSplitPane);
        rightSplitPane.add("Back to Main Menu",BackHome5);
        CardLayout layout = (CardLayout)rightSplitPane.getLayout();
        layout.next(rightSplitPane);
    }//GEN-LAST:event_BackHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackHome;
    private javax.swing.JButton BtnSearchSerialNumber;
    private com.toedter.calendar.JDateChooser LastMaintenanceDateView;
    private javax.swing.JRadioButton RbAvailabilityNo;
    private javax.swing.JRadioButton RbAvailabilityYes;
    private javax.swing.JLabel TitleCity;
    private javax.swing.JTextField TxtCarModel;
    private javax.swing.JTextField TxtCarSerialNo;
    private javax.swing.JComboBox<String> TxtGeoLocation;
    private javax.swing.JTextField TxtManufacturedBy;
    private javax.swing.JTextField TxtManufacturedYear;
    private javax.swing.JTextField TxtMaxPassengerCap;
    private javax.swing.JTextField TxtMinPassengerCap;
    private javax.swing.JTextField TxtModelNumber;
    private javax.swing.JTextField TxtSerialNo;
    private javax.swing.ButtonGroup buttonGroupAvailableSerialNo;
    private javax.swing.JTable carTable;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JLabel lblSerialNumber;
    // End of variables declaration//GEN-END:variables

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
            DefaultTableModel model = (DefaultTableModel)carTable.getModel();
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

    private void populatetable() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         DefaultTableModel model = (DefaultTableModel) carTable.getModel();
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

}
