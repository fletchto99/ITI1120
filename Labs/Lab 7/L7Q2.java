import java.util.Arrays;

public class L7Q2 {

    public static void main(String[] args) {
        
        int[] numbers = new int[15]; // create the array
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        
        System.out.println("Original: " + Arrays.toString(numbers));
        moveZerosTmp(numbers);
        System.out.println("Zero Moved: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        
        System.out.println("Original: " + Arrays.toString(numbers));
        moveZerosSwap(numbers);
        System.out.println("Zeros moved: " + Arrays.toString(numbers));
    }

    public static void moveZerosSwap(int data[]) {
        for (int idx = 0; idx < data.length - 1; idx++) {
            for (int swap = idx + 1; swap < data.length; swap++) {
                if (data[idx] == 0) {
                    swapElement(data, idx, swap);
                }
            }
        }
    }
    
    public static void swapElement(int array[], int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }

    private static void moveZerosTmp(int[] array) {
        int[] tmp = new int[array.length];
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                tmp[idx] = array[i];
                idx++;
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            if (i < idx) {
                array[i] = tmp[i];
            } else {
                array[i] = 0;
            }
        }
    }

}
