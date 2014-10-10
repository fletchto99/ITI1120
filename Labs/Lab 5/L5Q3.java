public class L5Q3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int number = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    number += j;
                }
            }
            if (number == i) {
                System.out.println("True for:" + number);
            }
        }
    }

}
