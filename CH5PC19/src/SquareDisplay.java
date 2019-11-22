/**
 * Alex Harkleroad
 * Square Display
 * Programming III
 * 11/22/2019
 */
import java.util.Scanner;

public class SquareDisplay {

    public static void main(String[] args) {
     
        //Declare variables
        int num, count = 0, count2 = 0;
        String x = "";
        
        //Initialize utlities
        Scanner keyboard = new Scanner(System.in);
        
        //Acquire information
        System.out.println("Please enter a number no greater than 15.");
            num = keyboard.nextInt();
            
            if(num <= 15 && num > 0){
                while(count < num){
                    x += "x";
                    count++;
                }
                while(count2 < num){
                    System.out.println(x);
                    count2++;
                }
            }else if(num > 15){
                System.out.println("That number is too big. Please try again.");
            }else if(num <= 0){
                System.out.println("That number is too small. Please try again.");
            }
    }

}
