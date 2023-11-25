import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random random_number = new Random();

            int MinimumNumberRange = 1;
            int MaximumNumberRange = 100;
            int Guessed_Number = random_number.nextInt(MaximumNumberRange - MinimumNumberRange + 1) + MinimumNumberRange;
            int MAX_ATTEMPTS = 6;
            int Limit = 0;
            int Score = 0;

            System.out.println("Let's play Guess the Number game!");
            System.out.println("You have " + MAX_ATTEMPTS + " strives to guess the number.");
            System.out.println("Try to guess the number between " + MinimumNumberRange + " to " + MaximumNumberRange + ".");

            while (Limit < MAX_ATTEMPTS) {
                System.out.print("Enter the number you guessed: ");
                int user_assume = sc.nextInt();

                if (user_assume < MinimumNumberRange || user_assume > MaximumNumberRange) {
                    System.out.println("Please enter a number inside a Predefined Range.");
                    continue;
                }

                Limit++;

                if (user_assume == Guessed_Number) {
                    System.out.println("Fantastic ! You've speculated the number!");
                    Score += MAX_ATTEMPTS - Limit + 1;
                    System.out.println("Score of this round is: " + (MAX_ATTEMPTS - Limit + 1));
                    break;
                } else if (user_assume < Guessed_Number) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }

            if (Limit == MAX_ATTEMPTS) {
                System.out.println("Sorry, you've utilized every one of your endeavors. The number was: "  + Guessed_Number);
            }

            System.out.println("Your absolute score is: " + Score);
        }
    }
}
