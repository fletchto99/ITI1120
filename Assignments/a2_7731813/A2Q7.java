import java.util.Random;
import java.util.Scanner;

// Family name, Given name: Langlois, Matthew
// Student number: 7731813
// Course: IT1 1120
// Assignment Number: 2

public class A2Q7 {

    public static void main(final String[] args) {
        final int random = A2Q7.random(1, 3);
        System.out
                .printf("Do you want an:%n1. Easy Game?%n2. Difficult Game?%n3. Very hard game?%n");
        final Scanner s = new Scanner(System.in);
        int gamemode = 0;
        while (gamemode == 0) {
            final int selection = s.nextInt();
            if (selection > 0 && selection < 4) {
                gamemode = selection;
                break;
            }
            System.out.println("Invalid choice.");
        }

        switch (gamemode) {
            case 1:
                A2Q7.playGame(s, A2Q7.random(20, 30), random);
                break;
            case 2:
                A2Q7.playGame(s, A2Q7.random(10, 15), random);
                break;
            case 3:
                A2Q7.playGame(s, A2Q7.random(1, 5), random);
                break;
        }
        System.out.println("Thanks for playing");
    }

    private static void playGame(final Scanner s, final int guesses,
            final int random) {
        for (int i = guesses; i > 0; --i) {
            System.out.printf(
                    "You have %d guess remaining. What is your next guess?%n",
                    i);
            final int guess = s.nextInt();
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

    public static int random(final int min, final int max) {
        return min + new Random().nextInt(max - min + 1); // inclusive of min and max
    }
}
