import java.util.Random;
import java.util.Scanner;
public class Guess {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        System.out.println("I am thinking of a number between 1-100 (inluding both). Can you guess what it is ? ");
      //prompt the user to type a number
        System.out.print("Type a number: ");
        int num = in.nextInt();
      //Print results 
        System.out.println("Your guess is " + num);
        System.out.println("The number I was thinking of is " + number);
        int difference = (number-num);
        System.out.println("You were off by " + difference);
    }
}