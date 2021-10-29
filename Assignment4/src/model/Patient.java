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
public class Patient {
    private int patientID;
    private String attendingPhysicianName;
    private String listAllergies;
    private VitalSignHistory vitalSignHistory;
    
    public Patient() {
        this.vitalSignHistory = new VitalSignHistory();
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getAttendingPhysicianName() {
        return attendingPhysicianName;
    }

    public void setAttendingPhysicianName(String attendingPhysicianName) {
        this.attendingPhysicianName = attendingPhysicianName;
    }

    public String getListAllergies() {
        return listAllergies;
    }

    public void setListAllergies(String listAllergies) {
        this.listAllergies = listAllergies;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

   
}
