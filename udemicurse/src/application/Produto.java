package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class Produto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner scan = new Scanner(System.in);
        
        Product prod = new Product();
        
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        prod.name = scan.nextLine();
        System.out.print("Price: ");
        prod.price = scan.nextDouble();
        System.out.print("Quantity in stock: ");
        prod.quantity = scan.nextInt();
        
        System.out.println("Product data: "+prod+"\n");
        
        System.out.println("Enteder the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        prod.addProducts(quantity);
        System.out.println("Updated data: "+prod);
        
        System.out.println("Enteder the number of products to be remove from stock: ");
        int quantityRemove = scan.nextInt();
        prod.removeProducts(quantityRemove);
        System.out.println("Updated data: "+prod);
        
        scan.close();
    }
    
}
