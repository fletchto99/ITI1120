import java.util.Scanner;

//Family name, Given name: Langlois, Matthew
//Student number: 7731813
//Course: IT1 1120
//Assignment Number: 3

public class A3Q1 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out
                .printf("Which sort routine would you like to use?%n1. bubblesort%n2. insertionsort%n3. selection sort%n");

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
                    bubbleSort(array);
                    break;
                case 2:
                    insertionSort(array);
                    break;
                case 3:
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
        for (int i = 0; i < data.length - 1; i++) {
            for (int index = i + 1; index < data.length; index++) {
                if (data[index] < data[i]) {
                    swapElement(data, i, index);
                }
            }
        }
    }

    public static void bubbleSort(int data[]) {
        for (int pass = 1; pass < data.length; pass++) {
            for (int element = 0; element < data.length - 1; element++) {
                if (data[element] > data[element + 1]) {
                    swapElement(data, element, element + 1);
                }
            }
        }
    }

    public static void insertionSort(int data[]) {
        for (int next = 1; next < data.length; next++) {
            int insert = data[next];
            int moveItem = next;
            while (moveItem > 0 && data[moveItem - 1] > insert) {
                data[moveItem] = data[moveItem - 1];
                moveItem--;
            }
            data[moveItem] = insert;
        }
    }

    public static void swapElement(int array[], int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }

}
