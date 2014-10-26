import java.util.Scanner;

//Family name, Given name: Langlois, Matthew
//Student number: 7731813
//Course: IT1 1120
//Assignment Number: 3

public class A3Q1 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out
                .printf("Which sort routine would you like to use?%n1. Quicksort%n2. bubblesort%n3. insertionsort%n4. selection sort?%n");

        int routine = scan.nextInt();

        System.out.println("How many elements are in the array?");

        int amount = scan.nextInt();

        int[] array = new int[amount];

        System.out.println("Please enter the values of the unsorted array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        median(array, routine);

        System.out.print("The sorted array is ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        scan.close();
    }

    public static void median(int[] array, int routine) {
        if (array.length > 1) {
            switch (routine) {
                case 1:
                    quickSort(array);
                    break;
                case 2:
                    bubbleSort(array);
                    break;
                case 3:
                    insertionSort(array);
                    break;
                case 4:
                    selectionSort(array);
                    break;
            }
        }

        if (array.length % 2 == 0) {
            if (array[(array.length / 2) - 1] == array[(array.length / 2)]) {
                System.out.printf("The median is %d %n",
                        array[(array.length / 2)]);
            } else {

            }
            System.out.printf("The median is %d and %d %n",
                    array[(array.length / 2) - 1], array[(array.length / 2)]);
        } else {
            System.out.printf("The median is %d %n", array[(array.length / 2)]);
        }
    }

    public static void selectionSort(int data[]) {
        int smallest;
        for (int i = 0; i < data.length - 1; i++) {
            smallest = i;
            // see if there is a smaller number further in the array
            for (int index = i + 1; index < data.length; index++) {
                if (data[index] < data[smallest]) {
                    swapElement(data, smallest, index);
                }
            }
        }
    }

    public static void bubbleSort(int data[]) {
        // Loop to control number of passes
        for (int pass = 1; pass < data.length; pass++) {
            // Loop to control # of comparisons for length of array-1
            for (int element = 0; element < data.length - 1; element++) {
                // compare side-by-side elements and swap them if
                // first element is greater than second element
                if (data[element] > data[element + 1]) {
                    swapElement(data, element, element + 1); // call swap method
                }
            }
        }
    }

    // selection sort
    public static void insertionSort(int data[]) {
        int insert;

        for (int next = 1; next < data.length; next++) {
            insert = data[next];
            int moveItem = next;

            while (moveItem > 0 && data[moveItem - 1] > insert) {
                data[moveItem] = data[moveItem - 1];
                moveItem--;
            }
            data[moveItem] = insert;
        }
    }

    // call the quicksort
    public static void quickSort(int data[]) {
        quickSort(data, 0, data.length - 1);
    }

    // quicksort
    public static void quickSort(int data[], int low, int high) {
        int partitionLoc;
        if (low < high) {
            partitionLoc = partition(data, low, high);
            quickSort(data, low, partitionLoc - 1);
            quickSort(data, partitionLoc + 1, high);
        }
    }

    // partition from quicksort
    public static int partition(int data[], int left, int right) {
        boolean moveLeft = true;
        int separator = data[left];

        while (left < right) {
            if (moveLeft == true) {
                while ((data[right] >= separator) && (left < right)) {
                    right--;
                }
                data[left] = data[right];
                moveLeft = false;
            } else {
                while ((data[left] <= separator) && (left < right)) {
                    left++;
                }
                data[right] = data[left];
                moveLeft = true;
            }
        }
        data[left] = separator;
        return left;
    }

    // swap the elements
    public static void swapElement(int array2[], int first, int second) {
        int tmp = array2[first];
        array2[first] = array2[second];
        array2[second] = tmp;
    }

}
