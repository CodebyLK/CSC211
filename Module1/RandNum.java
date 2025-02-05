import java.util.*;

public class RandNum {
    public static void main(String[]args){
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);
        int randNum = rand.nextInt(10) + 1;
        int userNum;
        String userName;
        boolean restart = true;
        String nextGameResponse;

        System.out.println("Hi! Can I have your name?");
        userName = scnr.next();
        System.out.print("Welcome " + userName + "! ");

        while(restart){
            System.out.println("Let's play a game. I'm thinking of a number between 1 and 10? \nCan you guess my number? I'll give you 5 guesses. What's your first guess?");
            for (int i = 0; i < 5; i++){
                userNum = scnr.nextInt();
                if (userNum < randNum) {
                    if (i < 4){
                        System.out.println("Too low, try again.");
                    }
                    else{
                        System.out.println("Max attempts exceeded. My lucky number was " + randNum + ". Better luck next time!");
                    }    
                }
                else if (userNum > randNum) {
                    if (i < 4){
                        System.out.println("Too high, try again.");
                    }
                    else{
                        System.out.println("Sorry you lost! Max attempts exceeded. My lucky number was " + randNum + ". Better luck next time!");
                    }    
                }
                else {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    break;
                }
            }

            System.out.println("Would you like to play again? (Y/N)");
            nextGameResponse = scnr.next();
            if (nextGameResponse.equalsIgnoreCase("Y")) {
                restart = true;         
                randNum = rand.nextInt(10) + 1;
            }
            else {
                restart = false;
                System.out.println("Thanks for playing " + userName + "! See you next time!!!");
                
            }
        }
        scnr.close();
    }
}
