import java.util.Random;
import java.util.Scanner;

public class L4Q7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a two digit number");
        int userNumber = s.nextInt();
        int randomNumber = new Random().ints(1, 10, 99).findFirst().getAsInt();
        if (userNumber == randomNumber) {
            System.out.printf("You have won $1000, the random number was %d",
                    randomNumber);
        } else if (reverse(randomNumber) == userNumber) {
            System.out.printf("You have won $300, the random number was %d",
                    randomNumber);
        } else if (contains(userNumber, randomNumber)) {
            System.out.printf("You have won $100, the random number was %d",
                    randomNumber);
        } else {
            System.out.printf("You have won nothing, the random number was %d",
                    randomNumber);
        }
    }

    static int reverse(int n) {
        return Integer.parseInt(new StringBuffer(String.valueOf(n)).reverse()
                .toString());
    }

    static boolean contains(int number, int mayContain) {
        String lotto = String.valueOf(mayContain);
        char one = String.valueOf(number).charAt(0);
        char two = String.valueOf(number).charAt(1);
        return lotto.indexOf(one) > -1 || lotto.indexOf(two) > -1 ? true
                : false;
    }

}
