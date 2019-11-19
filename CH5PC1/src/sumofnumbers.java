/**
 * Alex Harkleroad
 * Sum of Numbers
 * Programming III
 * 11/19/2019
 */
import java.util.Scanner;
public class sumofnumbers {

    public static void main(String[] args) {
        
        int num, sum = 0, count = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a postive nonzero interget: ");
        num = keyboard.nextInt();
        
        do{
            if(count < num){
                count++;
                sum+=count; 
            }
            
        }while(count!=num);{
            
            System.out.println("The sum of " + num + " is " + sum);
    }
        while(count!=num){
            count++;
            sum+=count;
    }
        System.out.println("The sum of " + num + " is " + sum);
    }
}