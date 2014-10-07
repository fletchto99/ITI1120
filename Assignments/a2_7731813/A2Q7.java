import java.util.Random;
import java.util.Scanner;

public class A2Q7 {

    public static void main(String[] args) {
        int random = random(1, 3);
        System.out
                .printf("Do you want an:%n1. Easy Game?%n2. Difficult Game?%n3. Very hard game?%n");
        Scanner s = new Scanner(System.in);
        int gamemode = 0;
        while (gamemode == 0) {
            int selection = s.nextInt();
            if (selection > 0 && selection < 4) {
                gamemode = selection;
                break;
            }
            System.out.println("Invalid choice.");
        }

        switch (gamemode) {
            case 1:
                playGame(s, random(20, 30), random);
                break;
            case 2:
                playGame(s, random(10, 15), random);
                break;
            case 3:
                playGame(s, random(1, 5), random);
                break;
        }
        System.out.println("Thanks for playing");
    }

    private static void playGame(Scanner s, int guesses, int random) {
        for (int i = guesses; i > 0; --i) {
            System.out.printf(
                    "You have %d guess remaining. What is your next guess?%n",
                    i);
            int guess = s.nextInt();
            if (guess == random) {
                System.out.println("You win!");
                return;
            } else if (guess < random) {
                System.out.println("Too low!");
            } else if (guess > random) {
                System.out.println("Too high!");
            }
        }
        System.out.printf("You loose :( -- The number was %d%n", random);
    }

    /**
     * Returns a random integer with min as the inclusive lower bound and max as
     * the inclusive upper bound.
     * 
     * @param min
     *            The lower bounds to return
     * @param max
     *            The upper bounds to return
     * @return A random integer between the bounds specified
     */
    public static int random(int min, int max) {
        return min + new Random().nextInt(max - min + 1);
    }
}
