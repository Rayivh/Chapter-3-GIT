
/**
 * Write a description of class Star here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Star
{
    public static void main(String[] args)
    {
        
        int[] array= new int[11];
        int[] array2= new int[6];
        for (int i = 0; i < array.length ;i++){
            array[i] = i;
        }
        
        for (int num : array) {
            //System.out.println(num);
            for (int i = 0; i<num; i++){
                System.out.print("x");
            }
            for (int i = 0; i<10-num; i++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
        //Point of No Return
        System.out.println();
        
        for (int num : array) {
            //System.out.println(num);
            for (int i = 0; i<num; i++){
                System.out.print(" ");
            }
            for (int i = 0; i<10-num; i++){
                System.out.print("x");
            }
            System.out.println("");
        }
        
        System.out.println();
        
        for (int num : array) {
            for (int i = 0; i<10-num; i++){
                System.out.print(" ");
            }
            for (int i = 0; i<num; i++){
                System.out.print("x");
            }
            
            System.out.println();
        }
        
        System.out.println();
        
        for (int num : array) {
            for (int i = 0; i<10-num; i++){
                System.out.print("x");
            }
            for (int i = 0; i<num; i++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
        
    }
    public void PrintItem(String name,int num){
        System.out.println("Your play?");
        System.out.println("Computer played:");
    }
}