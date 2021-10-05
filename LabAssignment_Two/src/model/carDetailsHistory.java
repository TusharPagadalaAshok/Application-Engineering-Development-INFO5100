/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
/**
 *
 * @author patus
 */
public class carDetailsHistory {
    private ArrayList<carDetails> history;
    private ArrayList<carDetails> getConfig;

    public ArrayList<carDetails> getGetConfig() {
        return getConfig;
    }

    public void setGetConfig(ArrayList<carDetails> getConfig) {
        this.getConfig = getConfig;
    }
    
    public carDetailsHistory(){
        this.history = new ArrayList<carDetails>();
    }

    public ArrayList<carDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<carDetails> history) {
        this.history = history;
    }
public carDetails addNewCarDetails() {
        carDetails newCar = new carDetails();
        history.add(newCar);
        return newCar;
    }
public carDetails addNewCarDetailsConfig() {
        carDetails newCar = new carDetails();
        getConfig.add(newCar);
        return newCar;
    }
      
    
    
}
