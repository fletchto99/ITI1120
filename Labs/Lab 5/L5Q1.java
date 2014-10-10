import java.util.Scanner;

public class L5Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Enter two integers to add.");
            System.out.println(s.nextInt() + s.nextInt());
            System.out.println("Continue? Y/N");
        } while (s.next().equalsIgnoreCase("y"));
        s.close();
    }
}
