/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.*;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import model.carDetails;
import model.carDetailsHistory;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author patus
 */
public class viewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewJPanel
     */
    
    carDetailsHistory history;
    
    public viewJPanel(carDetailsHistory history) {
        initComponents();
        this.history = history;
        populateTable();
        DefaultTableModel tblmodel = (DefaultTableModel)carTable.getModel();
         carTable.setModel(tblmodel);
        
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
//            carDetails cdf = history.addNewCarDetails();
            // extratct data from lines
            // set data to jtable model
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
//                JOptionPane.showMessageDialog(this,dataRow);
                model.addRow(dataRow);
                
//                cdf.setCarModel(model.getValueAt(i, 1).toString()); 
//                cdf.setMinPassengerCap((int) model.getValueAt(i, 5));
//                cdf.setMaxPassengerCap((int) model.getValueAt(i,6));
//                cdf.setManufacturedYear((long) model.getValueAt(i, 7));
//                cdf.setCarSerialNo((long) model.getValueAt(i, 0));
//                cdf.setManufacturedBy(model.getValueAt(i, 2).toString());
//                cdf.setGeoLocation(model.getValueAt(i, 8).toString());
//                cdf.setModelNumber((double) model.getValueAt(i, 9));
//                cdf.setAvailability(model.getValueAt(i, 3).toString());
//                cdf.setLastMaintenanceDate(model.getValueAt(i, 4).toString());
//                cdf.setDate(model.getValueAt(i, 10).toString());
                
            }
            
            
            
            
            
        } catch (Exception ex) {
//            Logger.getLogger(TextFileDataToJTable.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "File not found!");
        }
        
//        for(int i=0;i<tblmodel.getRowCount()-1;i++){    
//            if (tblmodel.getValueAt(i, 0)== null) {
////                JOptionPane.showMessageDialog(this,"row"+i);
//                tblmodel.removeRow(i);
//            }
//        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupMaintenanceCheckView = new javax.swing.ButtonGroup();
        buttonGroupAvailableView = new javax.swing.ButtonGroup();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        TxtManufacturedBy = new javax.swing.JTextField();
        TxtManufacturedYear = new javax.swing.JTextField();
        TxtModelNumber = new javax.swing.JTextField();
        lblCarModel = new javax.swing.JLabel();
        lblMinPassengerCap = new javax.swing.JLabel();
        TxtCarModel = new javax.swing.JTextField();
        lblMaxPassengerCap = new javax.swing.JLabel();
        TxtMinPassengerCap = new javax.swing.JTextField();
        lblManufacturedDate = new javax.swing.JLabel();
        TxtMaxPassengerCap = new javax.swing.JTextField();
        lblCarSerialNo = new javax.swing.JLabel();
        lblManufacturedBy = new javax.swing.JLabel();
        TxtCarSerialNo = new javax.swing.JTextField();
        lblGeoLocation = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        lblLastMaintenanceDate1 = new javax.swing.JLabel();
        lblLastMaintenanceDate = new javax.swing.JLabel();
        RbAvailabilityYes = new javax.swing.JRadioButton();
        RbAvailabilityNo = new javax.swing.JRadioButton();
        lblModifiedDateView = new javax.swing.JLabel();
        TxtGeoLocation = new javax.swing.JComboBox<>();
        LastMaintenanceDateView = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(255, 102, 51));
        Title.setFont(new java.awt.Font("Rockwell", 1, 25)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("View and Update Car Availability");
        Title.setOpaque(true);
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 1078, 27));

        carTable.setAutoCreateRowSorter(true);
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
        carTable.setGridColor(new java.awt.Color(0, 0, 51));
        carTable.setSelectionBackground(new java.awt.Color(255, 102, 102));
        carTable.setShowGrid(true);
        carTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1010, 139));

        btnUpdate.setBackground(new java.awt.Color(255, 153, 153));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setOpaque(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 180, 50));
        add(TxtManufacturedBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 174, 30));
        add(TxtManufacturedYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 174, 30));
        add(TxtModelNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 174, 30));

        lblCarModel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCarModel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCarModel.setText("Car Model:");
        add(lblCarModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 157, -1));

        lblMinPassengerCap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMinPassengerCap.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMinPassengerCap.setText("Min Passenger Capacity:");
        add(lblMinPassengerCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 157, -1));
        add(TxtCarModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 174, 30));

        lblMaxPassengerCap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMaxPassengerCap.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMaxPassengerCap.setText("Max Passenger Capacity:");
        add(lblMaxPassengerCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 157, -1));
        add(TxtMinPassengerCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 174, 30));

        lblManufacturedDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblManufacturedDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblManufacturedDate.setText("Manufactured Year:");
        add(lblManufacturedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 157, -1));
        add(TxtMaxPassengerCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 174, 30));

        lblCarSerialNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCarSerialNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCarSerialNo.setText("Car Serial Number:");
        add(lblCarSerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 157, -1));

        lblManufacturedBy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblManufacturedBy.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblManufacturedBy.setText("Manufacturer By:");
        add(lblManufacturedBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 157, -1));
        add(TxtCarSerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 174, 30));

        lblGeoLocation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGeoLocation.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGeoLocation.setText("Geo Location:");
        add(lblGeoLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 157, 21));

        lblModelNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblModelNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblModelNumber.setText("Model Number:");
        add(lblModelNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 157, 21));

        lblLastMaintenanceDate1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblLastMaintenanceDate1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLastMaintenanceDate1.setText("Available?:");
        add(lblLastMaintenanceDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 210, 20));

        lblLastMaintenanceDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLastMaintenanceDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLastMaintenanceDate.setText("Last Maintenance Date:");
        lblLastMaintenanceDate.setVerifyInputWhenFocusTarget(false);
        lblLastMaintenanceDate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(lblLastMaintenanceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 148, 30));

        buttonGroupAvailableView.add(RbAvailabilityYes);
        RbAvailabilityYes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RbAvailabilityYes.setText("Yes");
        add(RbAvailabilityYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, 20));

        buttonGroupAvailableView.add(RbAvailabilityNo);
        RbAvailabilityNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RbAvailabilityNo.setText("No");
        RbAvailabilityNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbAvailabilityNoActionPerformed(evt);
            }
        });
        add(RbAvailabilityNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, 20));

        lblModifiedDateView.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblModifiedDateView.setForeground(new java.awt.Color(255, 0, 51));
        lblModifiedDateView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblModifiedDateView, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 980, 22));

        TxtGeoLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "New York City", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "Austin", "San Jose", "Fort Worth", "Jacksonville", "Columbus", "Charlotte", "Indianapolis", "San Francisco", "Seattle", "Denver", "Washington", "Boston", "El Paso", "Nashville", "Oklahoma City", "Las Vegas", "Detroit", "Portland", "Memphis", "Louisville", "Milwaukee", "Baltimore", "Albuquerque", "Tucson", "Mesa", "Fresno", "Sacramento", "Atlanta", "Kansas City", "Colorado Springs", "Raleigh", "Omaha", "Miami", "Long Beach", "Virginia Beach", "Oakland", "Minneapolis", "Tampa", "Tulsa", "Arlington", "Wichita", "Bakersfield", "Aurora", "New Orleans", "Cleveland", "Anaheim", "Henderson", "Honolulu", "Riverside", "Santa Ana", "Corpus Christi", "Lexington", "San Juan", "Stockton", "St. Paul", "Cincinnati", "Greensboro", "Pittsburgh", "Irvine", "St. Louis", "Lincoln", "Orlando", "Durham", "Plano", "Anchorage", "Newark", "Chula Vista", "Fort Wayne", "Chandler", "Toledo", "St. Petersburg", "Reno", "Laredo", "Scottsdale", "North Las Vegas", "Lubbock", "Madison", "Gilbert", "Jersey City", "Glendale", "Buffalo", "Winston-Salem", "Chesapeake", "Fremont", "Norfolk", "Irving", "Garland", "Paradise", "Arlington", "Richmond", "Hialeah", "Boise", "Spokane", "Frisco", "Moreno Valley", "Tacoma", "Fontana", "Modesto", "Baton Rouge", "Port St. Lucie", "San Bernardino", "McKinney", "Fayetteville", "Santa Clarita", "Des Moines", "Oxnard", "Birmingham", "Spring Valley", "Huntsville", "Rochester", "Cape Coral", "Tempe", "Grand Rapids", "Yonkers", "Overland Park", "Salt Lake City", "Amarillo", "Augusta", "Columbus", "Tallahassee", "Montgomery", "Huntington Beach", "Akron", "Little Rock", "Glendale", "Grand Prairie", "Aurora", "Sunrise Manor", "Ontario", "Sioux Falls", "Knoxville", "Vancouver", "Mobile", "Worcester", "Chattanooga", "Brownsville", "Peoria", "Fort Lauderdale", "Shreveport", "Newport News", "Providence", "Elk Grove", "Rancho Cucamonga", "Salem", "Pembroke Pines", "Santa Rosa", "Eugene", "Oceanside", "Cary", "Fort Collins", "Corona", "Enterprise", "Garden Grove", "Springfield", "Clarksville", "Bayamon", "Lakewood", "Alexandria", "Hayward", "Murfreesboro", "Killeen", "Hollywood", "Lancaster", "Salinas", "Jackson", "Midland", "Macon County", "Kansas City", "Palmdale", "Sunnyvale", "Springfield", "Escondido", "Pomona", "Bellevue", "Surprise", "Naperville", "Pasadena", "Denton", "Roseville", "Joliet", "Thornton", "McAllen", "Paterson", "Rockford", "Carrollton", "Bridgeport", "Miramar", "Round Rock", "Metairie", "Olathe", "Waco" }));
        add(TxtGeoLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 174, 30));
        add(LastMaintenanceDateView, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 180, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void RbAvailabilityNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbAvailabilityNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbAvailabilityNoActionPerformed

    private void carTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carTableMouseClicked
        // TODO add your handling code here:
        
        buttonGroupMaintenanceCheckView.clearSelection();
        buttonGroupAvailableView.clearSelection();
        DefaultTableModel tblmodel = (DefaultTableModel)carTable.getModel();
        
       TxtCarSerialNo.setText(tblmodel.getValueAt(carTable.getSelectedRow(),0).toString());
       TxtCarModel.setText(tblmodel.getValueAt(carTable.getSelectedRow(),1).toString());
       TxtManufacturedBy.setText(tblmodel.getValueAt(carTable.getSelectedRow(),2).toString());
//       TxtAvailability.setText(tblmodel.getValueAt(carTable.getSelectedRow(),3).toString());
        String dd = tblmodel.getValueAt(carTable.getSelectedRow(),4).toString();
        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dd);
            LastMaintenanceDateView.setDate(date);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(viewJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
       
       TxtMinPassengerCap.setText(tblmodel.getValueAt(carTable.getSelectedRow(),5).toString());
       TxtMaxPassengerCap.setText(tblmodel.getValueAt(carTable.getSelectedRow(),6).toString());
       TxtManufacturedYear.setText(tblmodel.getValueAt(carTable.getSelectedRow(),7).toString());
       TxtGeoLocation.setSelectedItem(tblmodel.getValueAt(carTable.getSelectedRow(),8).toString());
       TxtModelNumber.setText(tblmodel.getValueAt(carTable.getSelectedRow(),9).toString());
//       lblDate.setText(tblmodel.getValueAt(carTable.getSelectedRow(),10).toString());
        //Availability
       String availability = tblmodel.getValueAt(carTable.getSelectedRow(),3).toString();
       
        if (availability.equals("Yes")) {
            RbAvailabilityYes.setSelected(true);
        }
        else {
            RbAvailabilityNo.setSelected(true);
        }
       //Maintenance Check
       
       String maintenanceChk = tblmodel.getValueAt(carTable.getSelectedRow(),4).toString();
       
//        if (maintenanceChk.equals("Yes")) {
//            RbMaintenanceYes.setSelected(true);
//        }
//        else {
//            RbMaintenanceNo.setSelected(true);
//        } 
//        
        
        
       
       
       
       
       
       
       
               
        
    }//GEN-LAST:event_carTableMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
                DefaultTableModel tblmodel = (DefaultTableModel)carTable.getModel();
                    
                if(carTable.getSelectedRowCount() == 1){
                    
                    String carSerialNum = TxtCarSerialNo.getText();
                    String carModel = TxtCarModel.getText();
                    String manufacturedBy = TxtManufacturedBy.getText();
                    String minPassengerCap = TxtMinPassengerCap.getText();
                    String maxPassengerCap = TxtMaxPassengerCap.getText();
                    String manufacturedYear = TxtManufacturedYear.getText();
                    String geoLocation = (String) TxtGeoLocation.getSelectedItem();
                    String modelNumber = TxtModelNumber.getText();
                    String availability = "";
                    
                      //date
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd");
                    LocalDateTime now = LocalDateTime.now();
                    String Date = df.format(now);
                     String maintenanceDate = dfs.format(LastMaintenanceDateView.getDate());
//                    Enumeration<AbstractButton> bg = buttonGroupMaintenanceCheckView.getElements();
//                    while(bg.hasMoreElements()){
//                            JRadioButton jrd = (JRadioButton) bg.nextElement();
//                            if(jrd.isSelected())
//                                maintenanceCheck = jrd.getText();
//                       }
        
                    Enumeration<AbstractButton> bg1 = buttonGroupAvailableView.getElements();
                    while(bg1.hasMoreElements()){
                            JRadioButton jrd1 = (JRadioButton) bg1.nextElement();
                            if(jrd1.isSelected())
                                 availability = jrd1.getText();
                    }
                    
                    //setting value of the "View"
                    
                    tblmodel.setValueAt(carSerialNum,carTable.getSelectedRow(),0);
                    
                    tblmodel.setValueAt(carModel,carTable.getSelectedRow(),1);
                    tblmodel.setValueAt(manufacturedBy,carTable.getSelectedRow(),2);
                    tblmodel.setValueAt(availability,carTable.getSelectedRow(),3);
                    tblmodel.setValueAt(maintenanceDate,carTable.getSelectedRow(),4);
                    tblmodel.setValueAt(minPassengerCap,carTable.getSelectedRow(),5);
                    tblmodel.setValueAt(maxPassengerCap,carTable.getSelectedRow(),6);
                    tblmodel.setValueAt(manufacturedYear,carTable.getSelectedRow(),7);
                    tblmodel.setValueAt(geoLocation,carTable.getSelectedRow(),8);
                    tblmodel.setValueAt(modelNumber,carTable.getSelectedRow(),9);
                    tblmodel.setValueAt(Date,carTable.getSelectedRow(),10);
                    try {
                        ExporttoFile();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(viewJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                            
                   JOptionPane.showMessageDialog(this,"Updated Successfully at "+Date);
                   lblModifiedDateView.setText("Fleet Database was last updated on: "+Date);
                
                }
                else{
                    if(carTable.getRowCount()== 0)
                        JOptionPane.showMessageDialog(this,"Table is empty!");
                    else
                        JOptionPane.showMessageDialog(this,"Select just one row!");
                                         
                    }
                
    
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser LastMaintenanceDateView;
    private javax.swing.JRadioButton RbAvailabilityNo;
    private javax.swing.JRadioButton RbAvailabilityYes;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField TxtCarModel;
    private javax.swing.JTextField TxtCarSerialNo;
    private javax.swing.JComboBox<String> TxtGeoLocation;
    private javax.swing.JTextField TxtManufacturedBy;
    private javax.swing.JTextField TxtManufacturedYear;
    private javax.swing.JTextField TxtMaxPassengerCap;
    private javax.swing.JTextField TxtMinPassengerCap;
    private javax.swing.JTextField TxtModelNumber;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroupAvailableView;
    private javax.swing.ButtonGroup buttonGroupMaintenanceCheckView;
    public javax.swing.JTable carTable;
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
    private javax.swing.JLabel lblModifiedDateView;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
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
             lblModifiedDateView.setText("Fleet Database was last updated on: "+cdh.getDate());
             model.addRow(row);
             
            
        }
//        for(int i=0;i<model.getRowCount();i++){    
//            if (model.getValueAt(i, 0)== "") {
//                model.removeRow(i);
//    }
//            
//        }
        
    }

    private void ExporttoFile() throws IOException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        File file = new File("C:\\Users\\patus\\Documents\\git\\PagadalaAshok_Tushar_002130680\\LabAssignment_Two\\CarData.txt");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
               BufferedWriter bw = new BufferedWriter(fw);
               
               //loop for jtable rows
               for(int i = 0; i < carTable.getRowCount(); i++){
                   //loop for jtable column
                   for(int j = 0; j < carTable.getColumnCount(); j++){
                       bw.write(carTable.getModel().getValueAt(i, j)+"/");
                   }
                   //break line at the begin 
                   //break line at the end 
                   bw.write("\n");
               }
               //close BufferedWriter
               bw.close();
               //close FileWriter 
               fw.close();



    }
}
        



    

