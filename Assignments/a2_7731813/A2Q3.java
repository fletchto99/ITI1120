import java.util.Scanner;

//Family name, Given name: Langlois, Matthew
//Student number: 7731813
//Course: IT1 1120
//Assignment Number: 2

public class A2Q3 {

    public static void main(String[] args) {
        System.out
                .println("Please enter the year of your car followed by the current year.");
        Scanner s = new Scanner(System.in);
        System.out
                .println(needs_test(s.nextInt(), s.nextInt()) ? "Your car needs an emissions test."
                        : "This year's your lucky year, no test required!");
        s.close();
    }

    private static boolean needs_test(int model, int year) {
        return ((model % 2 == 0 && year % 2 == 1) || (model % 2 == 1 && year % 2 == 0))
                && model + 3 < year && model > year - 20;
    }
}
