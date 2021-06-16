/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author yanyao
 */
public class Customer {
    private String userName;
    private String password;
    private String name;
   private String contact;
   private String deliveryAddress;
    private boolean discount;

    public Customer(String u, String p, String n, String c,String d ) {
        userName = u;
        password = p;
        name = n; 
        contact = c;
        deliveryAddress = d;
    }
    
    public Customer( String n, String c,String d ) {
        name = n; 
        contact = c;
        deliveryAddress = d;
    }      
   
    public void setUserName(String u) {
       userName = u;
    }
  
    public void setPassword(String p) {
        password = p;
    }    
    
    public void setName(String n) {
        name = n;
    }    
    
    public void setContact(String c) {
        contact = c;
    }
 
    public void setDeliveryAddress(String d) {
        deliveryAddress = d;
    }    
 
    public void setDiscount(boolean d) {
        discount = d;
    }
    
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
  
     public String getContact() {
        return contact;
    }
     
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean getDiscount() {
        return discount;
    }

    


}