/**
 * Alex Harkleroad
 * Project
 * Programming III
 * Date
 */
import java.util.Scanner;

public class population {

    public static void main(String[] args) {
        
        //Declare variables
        int initPop = 0, daysToMult = 0;
        double popInc = 0, dailyPop = 0;
        
        //Initialize utilities
        Scanner keyboard = new Scanner(System.in);
        
        //Acquire information
        
        while(initPop < 2){
        System.out.println("What is the initial population of the organisms?");
            initPop = keyboard.nextInt();
            
            if(initPop < 2){
                System.out.println("Please enter a number greater than or "
                        + "equal to 2.");
            }
            System.out.println("");
        }
        while(popInc <= 0.0){
        System.out.println("What is the average daily population increase? "
                + "(Percentage)");
            popInc = keyboard.nextDouble();
            
            if(popInc < 0.0){
                System.out.println("Please enter a positive number for "
                        + "population increase.");
            }
            System.out.println("");
        }
        while(daysToMult < 1){
        System.out.println("How many days will the organisms have to multiply?");
            daysToMult = keyboard.nextInt();
            
            if(daysToMult < 1){
                System.out.println("Please enter a number equal to or greater "
                        + "than 1 for days to multiply.");
            }
            System.out.println("");
        }
        
            
            
            
        }
    }

}
