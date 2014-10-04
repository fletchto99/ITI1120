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
            for (int spaces = 0; spaces < size - i; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < (2*i)-1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 2; i++) {
            for(int spaces=1; spaces < size; spaces++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

}
