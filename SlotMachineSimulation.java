/**
 * Michael Haugh
 * Programming III
 * CH5PC21 - Slot Machine Simulation
 * 11-27-2018
 */
package ch5pc21;

//Imports the Scanner and Random
import java.util.Scanner;
import java.util.Random;

public class SlotMachineSimulation {


    public static void main(String[] args) {
        
        //Declares the variables.
        int moneyBetted, totalEntered = 0, totalWon = 0;
        String stringNum1, stringNum2, stringNum3;
        String cherries, oranges, plums, bells, melons, bars;
        String answer = "yes";
        int num1, num2, num3;


//LOOP DETERMINES AN OUTCOME FOR EACH OF THE TREE NUM VALUES RANDOMLY GENERATED.      
        while (answer.equalsIgnoreCase("yes")) {

            //Assigns a random number to each of the three num variables.
            Scanner keyboard = new Scanner(System.in);
            Random r = new Random();
            num1 = r.nextInt(5);
            num2 = r.nextInt(5);
            num3 = r.nextInt(5);

//First switch assigns an outcome based upon the random number generated.
            switch (num1) {
                
                case 0:
                    stringNum1 = "Cherries";
                    break;
                    
                case 1:
                    stringNum1 = "Oranges";
                    break;
                    
                case 2:
                    stringNum1 = "Plums";
                    break;
                    
                case 3:
                    stringNum1 = "Bells";
                    break;
                    
                case 4:
                    stringNum1 = "Melons";
                    break;
                    
                default:
                    stringNum1 = "Bars";
                    break;
            }

            
            //Second switch assigns another outcome based upon the random number generated.
            switch (num2) {
                
                case 0:
                    stringNum2 = "Cherries";
                    break;
                    
                case 1:
                    stringNum2 = "Oranges";
                    break;
                    
                case 2:
                    stringNum2 = "Plums";
                    break;
                    
                case 3:
                    stringNum2 = "Bells";
                    break;
                    
                case 4:
                    stringNum2 = "Melons";
                    break;
                    
                default:
                    stringNum2 = "Bars";
                    break;
            }

        //Third switch assigns another outcome based upon the random number generated.
            switch (num3) {
                
                case 0:
                    stringNum3 = "Cherries";
                    break;
                    
                case 1:
                    stringNum3 = "Oranges";
                    break;
                    
                case 2:
                    stringNum3 = "Plums";
                    break;
                    
                case 3:
                    stringNum3 = "Bells";
                    break;
                    
                case 4:
                    stringNum3 = "Melons";
                    break;
                    
                default:
                    stringNum3 = "Bars";
                    break;
            }


            //Asks how much the user would like to bet and inputs this number.
            System.out.print("\nHow much money would you like to bet?: $");
            moneyBetted = keyboard.nextInt();
            totalEntered += moneyBetted;

            //Prints out the three components of the game result.
            System.out.println("\n" + stringNum1 + " " + stringNum2 + " "
                    + stringNum3);

           //
            if (num1 == num2 && num2 == num3) {
                    System.out.println("WINNER! YOU HAVE WON $" + moneyBetted * 3
                        + "!");
                totalWon += moneyBetted * 3;
            } else if (num1 == num2 || num2 == num3) {
                System.out.println("WINNER! YOU HAVE WON $" + moneyBetted * 2
                        + "!");
                totalWon += moneyBetted * 2;
            } else {
                System.out.println("You have won $0.");
            }


            //Asks if the user would like to play again.
            System.out.println("Would you like to play again?");
            answer = keyboard.next();

     //Loop determines whether or not to continue based upon input of yes or no.
            while (!answer.equalsIgnoreCase("no")
                    && !answer.equalsIgnoreCase("yes")) {
                System.out.println("\nInput invalid!");
                System.out.println("Do you want to play again?");
                answer = keyboard.next();
            }

            //Loop displays the total won and total entered if "no" is entered.
            while (answer.equalsIgnoreCase("no")) {
                System.out.println("\nYou entered $" + totalEntered
                        + "!");
                System.out.println("You won $" + totalWon + "!");
                System.exit(0);
                while (totalWon > totalEntered) {
                    System.out.println("You profited $" 
                            + (totalWon-totalEntered) + "!");
                }
            }

        }

    }
}