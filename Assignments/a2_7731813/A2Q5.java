import java.util.Scanner;

// Family name, Given name: Langlois, Matthew
// Student number: 7731813
// Course: IT1 1120
// Assignment Number: 2

public class A2Q5 {

    private static void drawRectangle(final int length) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < length; j++) {
                if (i != 1) {
                    System.out.print("*");
                } else if (i == 1) {
                    System.out.print((j == 0 || j == (length - 1)) ? "*" : " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(final String[] args) {
        final Scanner s = new Scanner(System.in);
        System.out.println("What is the side length of the rectangle?");
        A2Q5.drawRectangle(s.nextInt());
        s.close();
    }

}
