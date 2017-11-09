// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Scanner scan = new Scanner(System.in);
        
        Random generator = new Random();
        
        System.out.println("Your play?");
        personPlay = scan.next();
        
        computerInt = generator.nextInt(2);
        if (computerInt == 0){
            computerPlay = "R";
        }
        else if (computerInt == 1){
            computerPlay = "P";
        }
        else {
            computerPlay = "S";
        }
        if (computerPlay.equals(personPlay)){
            System.out.println("You tied");
        }
        else if (computerInt == 0){
            if (personPlay.equals("P")){
                System.out.println("You won");
            }
            else{
                System.out.println("You lost");
            }
        }
        else if (computerInt == 1){
            if (personPlay.equals("S")){
                System.out.println("You won");
            }
            else{
                System.out.println("You lost");
            }
        }
        else if (computerInt == 2){
            if (personPlay.equals("R")){
                System.out.println("You won");
            }
            else{
                System.out.println("You lost");
            }
        }
        else {System.out.println("There is an error");
        }
        
        //Get player's play -- note that this is stored as a string
        //Make player's play uppercase for ease of comparison
        //Generate computer's play (0,1,2)
        
        //Translate computer's randomly generated play to string
        //Print computer's play
        System.out.println("Computer played: " + computerPlay);
        //See who won
        
        
    }
}