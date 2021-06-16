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
public class Guest extends Customer {
    
    private boolean Discount;
    
    public Guest(String name, String contact,String deliveryAddress)
    {
        super(name,contact,deliveryAddress);
    }
    
    public void setDiscount(boolean d){
        Discount = d; 
    }
    
    public boolean getDiscount(){
        
        return Discount;
    }
    
    
    public String toString(){
        String msg = "Customer: Guest " +
                               "\nName: " + super.getName() +
                               "\nContact Number: " + super.getContact() +
                               "\nDelivery Address:\n " + super.getDeliveryAddress() +
                               "\n\n";
        return msg;
    }
    
}
