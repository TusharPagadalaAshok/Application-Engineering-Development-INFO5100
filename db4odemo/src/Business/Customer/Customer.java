/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Menu;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    int id=100;
    private String Name;
     private String UserName;
      private ArrayList<Order> orderList;
//     public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Menu> Order, String cost, String deliveryAddress, String comments) {
//        Order order=new Order();
//        order.setOrderId(String.valueOf(id));
//        order.setCustomerName(customerName);
//        order.setRestaurantName(restaurentName);
//        order.setDeliveryMan(deliverMan);
//        order.setOrder(Order);
//        order.setOrderCost(cost);
//        order.setDeliveryAddress(deliveryAddress);
//        order.setComments(comments);
//        order.setOrderStatus("New Order");
//        orderList.add(order);
//        id++;
//    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    private String address;
    private String number;

    public Customer(String UserName){
        this.UserName=UserName;
        orderList=new ArrayList<Order>();
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> order) {
        this.orderList = order;
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

}
