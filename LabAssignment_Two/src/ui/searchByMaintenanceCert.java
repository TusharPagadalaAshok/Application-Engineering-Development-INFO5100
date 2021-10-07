/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.carDetails;
import model.carDetailsHistory;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author patus
 */
public class searchByMaintenanceCert extends javax.swing.JPanel {

    /**
     * Creates new form searchByMaintenanceCert
     */
    carDetailsHistory history;
    public searchByMaintenanceCert(carDetailsHistory history) {
        initComponents();
        this.history = history;
        
        getConfigFile();
        populatetable();
        DefaultTableModel model = (DefaultTableModel) carTableCity.getModel();
        carTableCity.setModel(model);
        model.addColumn("Expired?");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        carTableCity = new javax.swing.JTable();
        BtnExpiry = new javax.swing.JButton();

        carTableCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Model", "Manufacturer", "Availability", "Maintenance?", "Min Pssgr", "Max Pssgr", "Manufd Year", "City", "Model No", "Date Modified"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carTableCity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carTableCityMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(carTableCity);

        BtnExpiry.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnExpiry.setText("Check for Expiry");
        BtnExpiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExpiryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(473, 473, 473))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(BtnExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void carTableCityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carTableCityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carTableCityMouseClicked

    private void BtnExpiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExpiryActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) carTableCity.getModel();
        carTableCity.setModel(model);
        
        ArrayList<String> cd = new ArrayList<>();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyy-MM-dd");
        
//        JOptionPane.showMessageDialog(this,getDayCount((String) model.getValueAt(1, 4),df.format(LocalDateTime.now())));
        for(int i = 0;i<model.getRowCount();i++){
            if(getDayCount((String) model.getValueAt(i, 4),df.format(LocalDateTime.now()))>180){
                model.setValueAt("Yes",i,11);
//                System.out.println(getDayCount((String) model.getValueAt(i, 4),df.format(currentdate)));
            }else{
                model.setValueAt("No",i,11);
            }
        }
    }//GEN-LAST:event_BtnExpiryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExpiry;
    private javax.swing.JTable carTableCity;
    private javax.swing.JScrollPane jScrollPane2;
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
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)carTableCity.getModel();
            model.setColumnIdentifiers(columnsName);
            
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
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

    private int getDayCount(String start, String end) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        LocalDate dateBefore = LocalDate.parse(start);
	LocalDate dateAfter = LocalDate.parse(end);
        int noOfDaysBetween = (int) ChronoUnit.DAYS.between(dateBefore, dateAfter);
        
        return noOfDaysBetween;
       
       
    }
}

