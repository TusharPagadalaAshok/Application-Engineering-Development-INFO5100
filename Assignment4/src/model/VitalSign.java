/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author patus
 */
public class VitalSign {
    private int respiratoryRate;
    private int hearbeatRate;
    private int Bp;
    private int weight;
    private Date timestamp;
    
    public int getRespiratoryRate() {
        return respiratoryRate;
    }
    
    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }
    
    public int getHeartRate() {
        return hearbeatRate;
    }
    
    public void setHeartRate(int hearbeatRate) {
        this.hearbeatRate = hearbeatRate;
    }
    
    public int getBloodPressure() {
        return Bp;
    }
    
    public void setBloodPressure(int Bp) {
        this.Bp = Bp;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public Date getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(timestamp);
    }
    
}
