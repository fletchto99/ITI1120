import java.util.Arrays;

public class L7Q3 {

    public static void main(String[] args) {
        int[] numbers = new int[15];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Max/Min (method 1): "
                + Arrays.toString(calculateMaxMin(numbers)));
        System.out.println("Max/Min (method 2): "
                + Arrays.toString(calculateMaxMin(numbers)));

    }

    public static int[] calculateMaxMin(int[] array) {
        return new int[] { Arrays.stream(array).max().getAsInt(),
                Arrays.stream(array).min().getAsInt() };
    }

    public static int[] caluclateMaxMinNoStream(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return new int[] { max, min };
    }

}
