/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowFilter.ComparisonType;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
//import model.TableModelDataType;
import model.carDetails;
import model.carDetailsHistory;

/**
 *
 * @author patus
 */
public class searchByMinMaxPassenger extends javax.swing.JPanel {

    /**
     * Creates new form searchByMinMaxPassenger
     */
    carDetailsHistory history;
    public searchByMinMaxPassenger(carDetailsHistory history) {
        initComponents();
        
        this.history = history;
        
        getConfigFile();
        populatetable();
//        DefaultTableModel model = (DefaultTableModel) carTable.getModel();
//        carTable.setModel(model);
//        model.addColumn("Passegn Cap?");
        
    }
    
//    public class MinMax{
//        private String carModel;
//        private int minPassengerCap;
//        private int maxPassengerCap;
//        private long manufacturedYear;
//        private long carSerialNo;
//        private String manufacturedBy;
//        private String geoLocation;
//        private double modelNumber;
//        private String lastMaintenanceDate;
//        private String availability;
//        private String date;
//        
//        public MinMax(int minPassengerCap, int maxPassengerCap, long manufacturedYear, long carSerialNo, String manufacturedBy, String geoLocation, double modelNumber, String lastMaintenanceDate, String availability, String date){
//            this.minPassengerCap=minPassengerCap;
//            this.maxPassengerCap=maxPassengerCap;
//            this.manufacturedYear=manufacturedYear;
//            this.carSerialNo=carSerialNo;
//            this.manufacturedBy=manufacturedBy;
//            this.geoLocation=geoLocation;
//            this.modelNumber=modelNumber;
//            this.lastMaintenanceDate=lastMaintenanceDate;
//            this.availability=availability;
//            this.date=date;
//
//        }
//    }
//    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        TxtMax = new javax.swing.JTextField();
        TxtMin = new javax.swing.JTextField();
        lblMax = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        BtnMinMaxSearch = new javax.swing.JButton();

        carTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Model", "Manufacturer", "Availability", "Last Maintenance Date", "Min Pssgr", "Max Pssgr", "Manufd Year", "City", "Model No", "Date Modified", "Passgn Cap?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carTable);

        lblMax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMax.setText("Max:");

        lblMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMin.setText("Min:");

        BtnMinMaxSearch.setText("Search");
        BtnMinMaxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinMaxSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMax, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(BtnMinMaxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMinMaxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(341, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void carTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carTableMouseClicked
        // TODO add your handling code here:

//        buttonGroupAvailableSerialNo.clearSelection();
//        DefaultTableModel tblmodel = (DefaultTableModel)carTable.getModel();
//
//        TxtCarSerialNo.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),0).toString());
//        TxtCarModel.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),1).toString());
//        TxtManufacturedBy.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),2).toString());
//        //       TxtAvailability.setText(tblmodel.getValueAt(carTable.getSelectedRow(),3).toString());
//        String dd = tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),4).toString();
//        Date date;
//        try {
//            date = new SimpleDateFormat("yyyy-MM-dd").parse(dd);
//            LastMaintenanceDateView.setDate(date);
//        } catch (ParseException ex) {
//            java.util.logging.Logger.getLogger(viewJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//
//        TxtMinPassengerCap.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),5).toString());
//        TxtMaxPassengerCap.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),6).toString());
//        TxtManufacturedYear.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),7).toString());
//        TxtGeoLocation.setSelectedItem(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),8).toString());
//        TxtModelNumber.setText(tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),9).toString());
//        //       lblDate.setText(tblmodel.getValueAt(carTable.getSelectedRow(),10).toString());
//        //Availability
//        String availability = tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),3).toString();
//
//        if (availability.equals("Yes")) {
//            RbAvailabilityYes.setSelected(true);
//        }
//        else {
//            RbAvailabilityNo.setSelected(true);
//        }
//        //Maintenance Check
//
//        String maintenanceChk = tblmodel.getValueAt(carTable.convertRowIndexToModel(carTable.getSelectedRow()),4).toString();
//
//        //        if (maintenanceChk.equals("Yes")) {
//            //            RbMaintenanceYes.setSelected(true);
//            //        }
//        //        else {
//            //            RbMaintenanceNo.setSelected(true);
//            //        }
//        //
    }//GEN-LAST:event_carTableMouseClicked

    private void BtnMinMaxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMinMaxSearchActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) carTable.getModel();
        TableRowSorter myTableRowSorter = new TableRowSorter(model);
        carTable.setModel(model);
        carTable.setRowSorter(myTableRowSorter);
//               
        java.util.List<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(3);
////        String regex = String.format("^%s$", TxtSerialNo.getText());
            
////            filters.add(RowFilter.regexFilter("(?i)" + TxtMax,6));
//            model.getColumnClass(5);
////                int s = Integer.valueOf(TxtMin.getText());
//            filters.add(RowFilter.numberFilter(ComparisonType.AFTER, Integer.parseInt(TxtMin.getText()),5));
//            System.out.println(filters);
//            filters.add(0,RowFilter.numberFilter(ComparisonType.BEFORE, Integer.parseInt(TxtMax.getText()),6));

//            String availability = (String) DropDownAvailability.getSelectedItem();
//            filters.add(RowFilter.regexFilter("(?i)" + availability,3));
//            RowFilter.orFilter(filters);
//            
//            ArrayList<MinMax> ls = new ArrayList<>();
//            Object row[] = new Object[14];
//            model.setRowCount(0);
//            model.addColumn("Expired?");
            for(int i = 0; i<model.getRowCount();i++){
                if((Integer.parseInt((String) model.getValueAt(i, 5)) >= (Integer.parseInt(TxtMin.getText()))  && 
                        Integer.parseInt((String) model.getValueAt(i, 6)) <= (Integer.parseInt(TxtMax.getText()))) ){
                        model.setValueAt("Y", i, 11);
                    
                }
                else{
                    model.setValueAt("N",i,11);
                }
            }
            filters.add(RowFilter.regexFilter("Y",11));
            RowFilter<Object,Object> serviceFilter = RowFilter.andFilter(filters);
            myTableRowSorter.setRowFilter(serviceFilter);
            
            carTable.removeColumn(carTable.getColumnModel().getColumn(11));
            
            
            
            
        
        
        
    }//GEN-LAST:event_BtnMinMaxSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMinMaxSearch;
    private javax.swing.JTextField TxtMax;
    private javax.swing.JTextField TxtMin;
    private javax.swing.JTable carTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
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
//            JOptionPane.showMessageDialog( "File not found!");
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

////        DefaultTableModel model = (DefaultTableModel) carTable.getModel();
//        carTable.setModel(model);
        
    }
    }

