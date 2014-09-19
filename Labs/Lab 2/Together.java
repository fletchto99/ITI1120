import java.util.Scanner;

public class Together {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter an integer");
        System.out.println(s.nextInt() % 2 > 0 ? "The number is odd"
                : "The number is even");
        s.nextLine(); // consume the empty line, created by calling next int

        System.out.println("Enter a character.");
        int c = s.nextLine().charAt(0);
        System.out.println(('A' <= c && c <= 'Z') ? "Yep its a capital."
                : "Nope its not capital");

        s.close();
    }

}
