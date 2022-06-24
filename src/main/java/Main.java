/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        // generate random int from 0 to 100
        int targetInt = rnd.nextInt(101);
        int counter = 0;

        while (true) {
            System.out.println("Guess a number between 0 and 100, or enter a negative number to exit");
            // check if input is an integer
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Guess a number between 1 and 100.");
                sc.next();
                continue;
            }
            int guess = sc.nextInt();

            if (guess < 0) {
                System.out.printf("You quit.%nNumber of attempts: %d%n", counter);
                break;
            }

            if (guess == targetInt) {
                System.out.printf("You guessed the correct number!%nFailed attempts: %d%n", counter);
                break;
            } else if (guess < targetInt) {
                System.out.println("Higher");
                counter++;
            } else {
                System.out.println("Lower");
                counter++;
            }
        }
    }
}
