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
public class ShoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double tax = 0.2, total = 0.0;
        System.out.println("Welcome to Duke choice Shop ");

        Customer c1 = new Customer();

        c1.setName("Roni");
        c1.setSize("S");
        
       

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("Blue Jacket");
        item1.setPrice((double) 30.6);
        item1.setSize("S");

        item2.setDescription("Grey Tshirt");
        item2.setPrice((double) 20.9);
        item2.setSize("S");

        items[2].setDescription("Skirt");
        items[2].setPrice((double) 22.6);
        items[2].setSize("M");

        items[3].setDescription("Gloves");
        items[3].setPrice((double) 30.9);
        items[3].setSize("X");
        
            
//         System.out.println("Item 1 " + item1.description + item1.price + item1.size);
//         System.out.println("Item 2 " + item2.description + item2.price + item2.size);
        // total = (item1.price + item2.price *2) * (1*tax);
        int measurement = 3;

        c1.addItems(items);

        c1.setSize(measurement);

        System.out.println("Custumer is " + c1.getName() + "," + c1.getSize() + "," + c1.getTotatlClothingCost());
        for (Clothing item : c1.getItems()) {

            //System.out.println("Item :" + item.getDescription()+ "," + item.getSize()+ "," + item.getPrice());
            System.out.println("Item output " + item);

        }
        
        int average = 0;
        int count =   0;
        
        for (Clothing item : c1.getItems()){
             
            if(item.getSize().equals("L")){
                count++;
            average += item.getPrice();
            }
            
        } 
        try{
                average = average /count;
        System.out.println("Average price " + average + ", Count" + count);
        
        }catch (ArithmeticException e){
            System.out.println("Erro Divisor por zero");
        }
        
        
    }

}
