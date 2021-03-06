/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.Menu;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author patus
 */
public class Order {
    private String orderId;
    private String restaurantName;
    private String customerName;
    private String deliveryMan;
    private String orderCost;
    public String orderStatus;
    private String deliveryAddress;
    private String comments;
    int id=100;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    private ArrayList<Menu> Order;

    public ArrayList<Menu> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<Menu> Order) {
        this.Order = Order;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        int int_random = ThreadLocalRandom.current().nextInt(100, 999);
        orderId = String.valueOf(int_random);
        this.orderId = orderId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(String orderCost) {
        this.orderCost = orderCost;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    
    @Override
    public String toString() {
        return orderId;
    }
    
    public Order(String restaurantName, String customerName, String deliveryMan, ArrayList<Menu> items, String cost, String status, String deliveryAddress, String comments) {
        int id = ThreadLocalRandom.current().nextInt(100, 9999);
       orderId = String.valueOf(id);
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.customerName = customerName;
        this.deliveryMan = deliveryMan;
        this.Order = items;
        this.orderCost = cost;
        this.orderStatus = status;
        this.deliveryAddress = deliveryAddress;
        this.comments = comments;
      
    }
}
