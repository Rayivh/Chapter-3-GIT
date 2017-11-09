
/**
 * Write a description of class salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;

public class Salary
{
    public static void main (String[] args)
    {
        double prevBal;  // employee's current  salary
        double charge;   // amount of the raise
        double  minPay;
        double newBal;
        Scanner scan = new Scanner(System.in);
 
        System.out.print ("Enter the previous balance: ");
        prevBal = scan.nextDouble();
        System.out.print ("Enter the charge");
        charge = scan.nextDouble();
        newBal = prevBal + charge;
        newBal = 1.02 * newBal;
        
        if (prevBal<50){
            minPay = newBal;
            System.out.println("Your crippling debt is: " + minPay);
        }
        if (prevBal <301 && prevBal > 50){
            minPay = 50;
            System.out.println("Your crippling debt is: " + minPay);
        }
        if (prevBal > 350){
            minPay = newBal * 0.2;
            System.out.println("Your crippling debt is: " + minPay);
        }
        // Print the result
        
        System.out.println();
    }
}
