/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author patus
 */
public class carDetails {
    
    private String carModel;
    private int minPassengerCap;
    private int maxPassengerCap;
    private String manufacturedYear;

    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }
    private long carSerialNo;
    private String manufacturedBy;
    private String geoLocation;
    private double modelNumber;
    private String lastMaintenanceDate;
    private String availability;

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getMinPassengerCap() {
        return minPassengerCap;
    }

    public void setMinPassengerCap(int minPassengerCap) {
        this.minPassengerCap = minPassengerCap;
    }

    public int getMaxPassengerCap() {
        return maxPassengerCap;
    }

    public void setMaxPassengerCap(int maxPassengerCap) {
        this.maxPassengerCap = maxPassengerCap;
    }


    

    public long getCarSerialNo() {
        return carSerialNo;
    }

    public void setCarSerialNo(long carSerialNo) {
        this.carSerialNo = carSerialNo;
    }

    public String getManufacturedBy() {
        return manufacturedBy;
    }

    public void setManufacturedBy(String manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    public String getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(String geoLocation) {
        this.geoLocation = geoLocation;
    }

    public double getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(double modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(String lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }
         
   
}
