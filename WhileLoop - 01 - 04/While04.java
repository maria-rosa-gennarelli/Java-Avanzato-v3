import java.util.Random;
import java.util.Scanner;

public class While04 {

    public static void main(String[] args) {

        int number;
        int tries = 0;


        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int guess = randomNumber.nextInt(1, 10);

        System.out.println("Welcome!");

        while (true){
            System.out.println("Enter a number between 1 and 10 !!");
            number = scanner.nextInt();
            tries++;

            if (guess == number){
                System.out.println("Congratulations! You guessed the number with " + tries + " tries!");
                break;
            } else if (guess > number) {
                System.out.println("Number too low, try again! :(");
            } else if (guess < number) {
                System.out.println("Number to high, try again! :D");
            }

        }

    }
}

