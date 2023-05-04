/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;


import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        
        System.out.println("Name: ");
        emp.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        emp.tax = sc.nextDouble();
        
        System.out.print("Employee: \n"+emp);
        
        System.out.println(" Which pertentage to increase salary?");
        double salary = sc.nextDouble();
        emp.increaseSalary(salary);
        
        System.out.print("Upadated data: "+emp+"\n");
    }
    
}
