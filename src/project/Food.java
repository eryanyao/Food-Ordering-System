
package project;

/**
 *
 * @author yanyao
 */
public class Food {
    private String food;
    private double price;
    private int quantity;


    public Food(String f, double p) {
        food = f;
        price = p;
        quantity = 0;
    }

    public void setFood(String f) {
        food = f;
    }

    public void setPrice(double p) {
        price = p;
    }
    
    public void setQuantity(int q){
        quantity = q;
    }
    
    public void addQuantity(int q) {
        quantity += q;
    }
    
        public double getPrice() {
        return price;
    }
        
   public String getFood() {
        return food;
    }
   
    public int getQuantity() {
        return quantity;
    }
    
    public double totalPrice(){
        double totalPrice = price * quantity;
        return totalPrice;
    }
    
    public String toString(){
        String msg = getFood() + "\t x" + getQuantity()+"\t " +String.format("RM%.2f", totalPrice());
        return msg;
    }
}
