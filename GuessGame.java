import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lowest number: ");
        int lowest = sc.nextInt();
        System.out.print("Enter the highest number: ");
        int highest = sc.nextInt();
        Random random = new Random();
        int randomNumber = random.nextInt(highest - lowest + 1) + lowest;
        System.out.print("Guess The number: ");
        int guess = sc.nextInt();
        checkTheGuess(randomNumber,guess);

        // int money = getMoneyAmount(n);
    }

    private static void checkTheGuess(int randomNumber, int guess) {
        Scanner sc = new Scanner(System.in);
        if (guess == randomNumber) {
            System.out.print("You guess Correct");
            return;
        }
        int guessno = guess;
        while (guessno != randomNumber ) {
        System.out.println("Again Guess The number");
            guessno = sc.nextInt();
        if (guess == randomNumber)
        {
            System.out.print("You guess Correct");
            return;
        }
            if (guessno > randomNumber) {
                System.out.println("You guess Above");
            }
            if (guessno < randomNumber) {
                System.out.println("You guess Below");
           }
        }
    }

}

