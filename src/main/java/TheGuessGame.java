import java.util.Random;
import java.util.Scanner;

public class TheGuessGame {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int usersTry = -1;
        int counter = 0;

        System.out.println("Guess the number: ");

        while (usersTry != numberToGuess) {
            try {
                usersTry = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Wrong input! Try again: ");
                continue;
            }

            if (usersTry > numberToGuess) {
                System.out.println("The number is too big.");
            } else if (usersTry < numberToGuess) {
                System.out.println("The number is too small.");
            }

            counter++;
        }
        System.out.println("Well done! You needed " + counter + " guesses to win!");
        scanner.close();
    }
}
