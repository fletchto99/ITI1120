import java.util.Scanner;

public class L5Q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two integers representing the width and height of the rectangle");
        printRectangle(s.nextInt(), s.nextInt());
        s.close();
    }

    private static void printRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
