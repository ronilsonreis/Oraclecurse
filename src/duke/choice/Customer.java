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
class Customer {

    private String name;
    private String size;
    //double total;
    private Clothing[] items;

    public Customer(String name,int measurement) {
        this.name = name;
        setSize(measurement);
    }
    
    
   

    public void addItems(Clothing[] someitems) {
        items = someitems;
        
    }
        
    public Clothing[] getItems(){
        
        return items;
    }
    
        
        
    

    public double getTotatlClothingCost() {

        double total = 0.0;

        for (Clothing item : items) {

            //if (c1.getSize().equals(item.getSize())) {

                total = total + item.getPrice();
                //System.out.println("Item :" + item.getDescription() + " " + item.getPrice() + " " + item.getSize());
                //      if(total > 25){break;

                //      }
                //   total = total + total * tax;
                //}
            }

            return total;
        }
   
   

    

public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {

            case 1:
            case 2:
            case 3:
                size = "S";
                break;

            case 4:
            case 5:
            case 6:
                setSize("M");
                break;

            case 7:
            case 8:
            case 9:
                setSize("L");
                break;

            default:
                setSize("XL");
                break;

        }
    }

}
