/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantList;
    private Restaurant restaurant;
    private Menu menu;
    public RestaurantDirectory(){
        this.restaurantList=new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public Restaurant createRestaurantInfo(String uName){
        restaurant= new Restaurant(uName);
        restaurantList.add(restaurant);
        
        return restaurant;
    }
    
    public void deleteRestaurent(String username){
        for(int i=0;i<restaurantList.size();i++){
            if(restaurantList.get(i).getResName().equals(username)){
                restaurantList.remove(i);
            }
        }
    }
    
    public void updateRestaurantInfo(Restaurant restname,String name,String number,String address){
        restname.setName(name);
        restname.setAddress(address);
        restname.setNumber(number);
    }
    
    public Menu AddMenuItems(Restaurant restname,String name,String desc,String amount){
        menu=new Menu(name, desc, amount);
        restname.addDishes(menu);
        return menu;
    }
    
    public void DeleteItems(Restaurant restname,Menu menu){
        restname.removeDishes(menu);
        
    }
    
    
}
