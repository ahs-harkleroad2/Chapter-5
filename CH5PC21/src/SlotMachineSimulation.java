/**
 * Alex Harkleroad
 * Slot Machine Simulation
 * Programming III
 * 11/22/2019
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class SlotMachineSimulation {

    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#0.00");
        Random r = new Random();
        
        int moneyEntered, totalMoneyEntered = 0, totalMoneyWon = 0, win1, win2;
        char again = 0;
        String slot = "ERROR", slot1 = "ERROR", slot2 = "ERROR", 
                slot3 = "ERROR", input;
      
        do{
            
        System.out.print("How much money would you like to enter? ");
        moneyEntered = keyboard.nextInt();
            
        for(int count = 1; count <= 3; count++){
            int slotNum = r.nextInt(5);
            
            if(slotNum == 0){
                slot = "Cherries";
            }
            if(slotNum == 1){
                slot = "Oranges";
            }
            if(slotNum == 2){
                slot = "Plums";
            }
            if(slotNum == 3){
                slot = "Bells";
            }
            if(slotNum == 4){
                slot = "Melons";
            }
            if(slotNum == 5){
                slot = "Bars";
            
        }
            
            switch(count){
                case 1:
                    slot1 = slot;
                    break;
                case 2:
                    slot2 = slot;
                    break;
                case 3:
                    slot3 = slot;
                    break;
            
            }
        
        }
            System.out.println("");
            System.out.println("| " + slot1 + " | " + slot2 + " | " + slot3
                   + " |");
            System.out.println("");
                
            win1 = (moneyEntered * 2);
            win2 = (moneyEntered * 3);   
                    
            if(slot1.equals(slot2) || slot1.equals(slot3) || 
                    slot2.equals(slot3)){
                System.out.println("You have won $" + win1 + "! Would you like"
                        + " to play again?");
                input = keyboard.next();
                input = input.toUpperCase();
                again = input.charAt(0);
                totalMoneyWon = totalMoneyWon + win1;
            
            }else if(slot1.equals(slot2) && slot1.equals(slot3) 
                    && slot2.equals(slot3)){
                System.out.println("You have won $" + win2 + "! Would you like"
                        + " to play again?");
                input = keyboard.next();
                input = input.toUpperCase();
                again = input.charAt(0);
                totalMoneyWon = totalMoneyWon + win2;
            
            }else{
                System.out.println("You have won $0! Would you like to play"
                            + " again?");
                input = keyboard.next();
                input = input.toUpperCase();
                again = input.charAt(0);
            }
        
    
        }while(again == 'Y');{
        
        System.out.println("");
        System.out.println("Total money entered: $" + totalMoneyEntered);
        System.out.println("");
        System.out.println("Total money won: $" + totalMoneyWon);
    }
    }
}