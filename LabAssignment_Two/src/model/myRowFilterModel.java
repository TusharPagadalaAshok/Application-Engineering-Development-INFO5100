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
public class myRowFilterModel extends RowFilter{
    private String searchText;
    
    public myRowFilterModel(String searchText){
        this.searchText = searchText; 
    }

    @Override
    public boolean include(RowFilter.Entry Model) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    return Model.getStringValue(1).indexOf(searchText) >=0;
        
    }
}
