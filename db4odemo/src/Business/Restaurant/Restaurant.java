/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String ResName;
       private ArrayList<Menu> menuItem;
    private ArrayList<Order> orderList;
    int id=100;
    private String name;
    private String address;
    private String number;
    private String comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
        public Restaurant(String UName) {
        this.ResName=UName;
        menuItem = new ArrayList<Menu>();
        orderList=new ArrayList<Order>();
    }
    
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
    
//    public void addNewOrder(String restaurantName, String customerName, String deliveryMan, ArrayList<Menu> Order, String orderCost, String deliveryAddress, String comments) {
//        Order order=new Order();
//        Customer Cust = new Customer(customerName);
//        order.setOrderId(String.valueOf(id));
////        order.setOrderId(String.valueOf());
//        order.setCustomerName(customerName);
//        order.setRestaurantName(restaurantName);
//        order.setDeliveryMan(deliveryMan);
//        order.setOrder(Order);
//        order.setOrderCost(orderCost);
//        order.setDeliveryAddress(deliveryAddress);
//        order.setComments(comments);
//        order.setOrderStatus("New");
//        orderList.add(order);
//        id++;
//    }
    public void removeDishes(Menu Item){
        
        menuItem.remove(Item);
    }
    
    
     @Override
    public String toString() {
        return name;
    }
    

    
}
