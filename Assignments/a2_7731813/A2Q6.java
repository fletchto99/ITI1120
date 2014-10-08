import java.util.Scanner;

//Family name, Given name: Langlois, Matthew
//Student number: 7731813
//Course: IT1 1120
//Assignment Number: 2

public class A2Q6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How big should the tree be?");
        drawTree(s.nextInt());
        s.close();
    }

    private static void drawTree(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size + (i - 1); j++) {
                System.out.print((j < size - i) ? " " : "*");
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int spaces = 1; spaces < size; spaces++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

}
