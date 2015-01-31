public class L3Q1 {

    public static void main(String[] args) {
        int i = 10, j = 15, k = 20;
        double x = 10.0, y = 2.5;

        if (i < j || j < k && x <= y) {
            System.out.println("Executed 1");
        }

        if (!(j - i < 3) && j % 12 == 3) {
            System.out.println("Executed 2");
        }
        if ((i / 4) == y) {
            System.out.println("Executed 3");
        }
        if ((x / 4) == y) {
            System.out.println("Executed 4");
        }
        if (!(x != i)) {
            System.out.println("Executed 5");
        }
    }

}
