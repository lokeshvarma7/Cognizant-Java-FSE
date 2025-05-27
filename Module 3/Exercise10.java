// 10. Number Guessing Game
import java.util.Scanner;
import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1, guess;
        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();
            if (guess > target) System.out.println("Too high!");
            else if (guess < target) System.out.println("Too low!");
        } while (guess != target);
        System.out.println("Correct! The number was " + target);
    }
}