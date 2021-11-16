/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String ResName;
       private ArrayList<Menu> menuItem;
    private ArrayList<Order> orderList;
    int id=1000;
    
     public void addDishes(Menu Item){
        
        menuItem.add(Item);
    }

    public String getResName() {
        return ResName;
    }

    public void setResName(String ResName) {
        this.ResName = ResName;
    }

    public ArrayList<Menu> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(ArrayList<Menu> menuItem) {
        this.menuItem = menuItem;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addNewOrder(String restaurantName, String customerName, String deliveryMan, ArrayList<Menu> Order, String orderCost, String deliveryAddress) {
        Order order=new Order();
       
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliveryMan(deliveryMan);
        order.setOrder(Order);
        order.setOrderCost(orderCost);
        order.setDeliveryAddress(deliveryAddress);
        order.setOrderStatus("New");
        orderList.add(order);
        id++;
    }
    public void removeDishes(Menu Item){
        
        menuItem.remove(Item);
    }

    
}
