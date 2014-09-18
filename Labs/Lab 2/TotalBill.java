import java.util.Scanner;

public class TotalBill {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your total price and the gratuity amount");
        double sub = s.nextDouble();
        double gratuity = s.nextDouble();
        System.out.printf("The total is %.2f", sub + (sub * gratuity / 100));
        s.close();
    }

}
