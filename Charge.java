
/**
 * Write a description of class Charge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.text.NumberFormat;
public class Charge
{
    public static void main (String[] args)
    {
        double raise;  // employee's current  salary
        String rating= "no";              // amount of the raise
        double currentSalary;          // new salary for the employee
        double newSalary;
        
        Scanner scan = new Scanner(System.in);
 
        System.out.print ("Enter the balance: ");
        currentSalary = scan.nextDouble();
        System.out.print ("Enter the charge");
        raise = scan.nextDouble();
 
        // Compute the raise using if ...
        if(rating.equals("Excellent")){
            raise = 6.0;
        }
        else if (rating.equals("Good")){
            raise = 4.0;
        }
        else{
            raise = 1.5;
        }
        newSalary = currentSalary + raise;
    }
}
