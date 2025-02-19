/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author opc
 */
class Clothing {
    
    private String description;
    private double price;
    private String size;
    private String items;
    
    public static double MIN_PRICE  = 10.0;
    public static double TAX_RATE = .2;

    public Clothing(String description, double price, String asize) {
        this.description = description;
        this.price = price;
        this.size = asize;
    }

     

       
    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    public void setPrice(double price) {
        
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public String toString(){
           return getDescription()+ "," + getSize()+ "," + getPrice();
    
    }
    
    public int compareto(Clothing c){
           return this.description.compareTo(c.description);
    
    }

    
    
    
}
