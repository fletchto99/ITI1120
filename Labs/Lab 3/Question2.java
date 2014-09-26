import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("The temperture in celcius is: %.2f",
                calculateCelcius(s.nextDouble()));
        s.close();
    }

    static double calculateCelcius(double farenheit) {
        return (farenheit - 32) * 5 / 9;
    }

}
