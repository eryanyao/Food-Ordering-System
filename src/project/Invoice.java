/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.Date;
import java.text.*;
/**
 *
 * @author student
 */
public class Invoice {

    protected static int numberOfInvoice = 1000001;
    private String billNumber;
    private String date;
    
    public Invoice(){
        billNumber = numberOfInvoice + "";
        numberOfInvoice++;
    }
    
    public String date(){
        String msg;
      Date dNow = new Date( );
      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
 
      msg = "Current Time: " + ft.format(dNow);
      return msg;
    }

    public String getBillNumber() {
        return billNumber;
    }
    public String toString(){
        String msg = "Invoice\n"+
                               "Bill Number: " + getBillNumber() + "\n"+
                               date() + "\n\n";
        return msg;
    }

    
}
    

   