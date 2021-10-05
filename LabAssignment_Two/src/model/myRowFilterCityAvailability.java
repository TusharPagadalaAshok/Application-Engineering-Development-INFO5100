/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.RowFilter;

/**
 *
 * @author patus
 */
public class myRowFilterCityAvailability extends RowFilter{
    private String searchText;
    
    public myRowFilterCityAvailability(String searchText){
        this.searchText = searchText; 
    }

    @Override
    public boolean include(RowFilter.Entry Available) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    return Available.getStringValue(3).indexOf(searchText) >=0;
        
    }
}

