/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        Customer c1 = new Customer("Roni", 3);

        //.setName("Roni");
        //c1.setSize("S");
        System.out.println("Min Price " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 30.6, "L");
        Clothing item2 = new Clothing("Pants", 20.9, "S");
        Clothing[] items = {item1, item2, new Clothing("Skirt", 22.6, "M"), new Clothing("Tshirt", 30.9, "XL")};

        try {                   // demo 9

            ItemList list = new ItemList(items); // demo 9
            Routing routing = Routing.builder()
                    .get("/items",list).build(); // demo 9
            ServerConfiguration config = ServerConfiguration.builder() // demo 9
                    .bindAddress(InetAddress.getLocalHost()) // demo 9
                    .port(8888).build();// demo 9
            WebServer ws = WebServer.create(config, routing);// demo 9
            ws.start();// demo 9
        } catch (UnknownHostException ex) {// demo 9
            ex.printStackTrace();// demo 9
        }

//         System.out.println("Item 1 " + item1.description + item1.price + item1.size);
//         System.out.println("Item 2 " + item2.description + item2.price + item2.size);
        // total = (item1.price + item2.price *2) * (1*tax);
        int measurement = 8;

        c1.addItems(items);

        //c1.setSize(measurement);
        System.out.println("Custumer is " + c1.getName() + "," + c1.getSize() + "," + c1.getTotatlClothingCost());
        for (Clothing item : c1.getItems()) {

            System.out.println("Item :" + item.getDescription()); //+ "," + item.getSize()+ "," + item.getPrice());

        }

        int average = 0;
        int count = 0;

        for (Clothing item : c1.getItems()) {

            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }

        }
        try {
            average = average / count;
            System.out.println("Average price " + average + ", Count " + count);

        } catch (ArithmeticException e) {
            System.out.println("Erro Divisor por zero");
        }

    }

}
