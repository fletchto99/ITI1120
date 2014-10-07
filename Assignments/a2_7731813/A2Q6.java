import java.util.Scanner;

public class A2Q6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How big should the tree be?");
        drawTree(s.nextInt());
        s.close();
    }

    private static void drawTree(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size + (i-1); j++) {
                if (j < size - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
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
