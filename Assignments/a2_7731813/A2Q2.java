import java.util.Scanner;

//Family name, Given name: Langlois, Matthew
//Student number: 7731813
//Course: IT1 1120
//Assignment Number: 2

public class A2Q2 {

    public static void main(String[] args) {
        System.out.println("Please enter a number between 1 and 99");
        Scanner s = new Scanner(System.in);
        System.out.println("The number entered is "
                + (isSafe(s.nextInt()) ? "safe." : "not safe."));
        s.close();
    }

    static boolean isSafe(int n) {
        return n < 89 && n%9!=0 && n%10!=9;
    }

}
