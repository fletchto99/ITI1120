import java.util.Scanner;

// Family name, Given name: Langlois, Matthew
// Student number: 7731813
// Course: IT1 1120
// Assignment Number: 3

public class A3Q2 {
    public static void isSquareFree(final char[] word) {
        if (word.length == 1) {
            System.out.println("The word is square free.");
            return;
        }
        for (int i = 0; i <= word.length % 2; i++) {
            for (int j = 1; j <= word.length / 2; j++) {
                final int subwords = (word.length / j - (word.length / j) % 2) - 1;
                for (int k = 0; k < subwords; k++) {
                    boolean flag = false;
                    for (int idx = ((k * j) + i); idx < (((k + 1) * j) + i); idx++) {
                        if (word[idx] != word[idx + j]) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out
                                .println("The word, "
                                        + new String(word)
                                        + ", is not square free, since it has subword, "
                                        + new String(word, ((k * j) + i), j)
                                        + " two times starting at position "
                                        + (((k * j) + i) + 1));
                        return;
                    }
                }
            }
        }
        System.out.println("The word is square free.");

    }

    public static void isSquareFree2(final char[] word) {
        if (word.length == 1) {
            System.out.println("The word is square free.");
            return;
        }
        for (int idx = 0; idx < word.length; idx++) {
            for (int i = idx; i < word.length - 1; i++) {
                for (int j = i + 1; j < word.length; j++) {
                    if (word[i] == word[j]) {
                        boolean flag = false;
                        for (int pos = 0; pos < j - i; pos++) {
                            if (idx + pos + j - i >= word.length
                                    || word[idx + pos] != word[idx + pos + j
                                            - i]) {
                                flag = true;
                                break;
                            }
                        }
                        if (!flag) {
                            System.out
                                    .println("The word, "
                                            + new String(word)
                                            + ", is not square free, since it has subword, "
                                            + new String(word, idx, j - i)
                                            + " two times starting at position "
                                            + (idx + 1));
                            return;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println("The word is square free.");
    }

    public static void main(final String[] args) {
        // part (a) of the main
        final Scanner keyboard = new Scanner(System.in);

        System.out.println("***************************");
        System.out.println("        Part (a)");
        System.out.println("***************************");

        do {
            System.out.println("Enter a word and then press enter:");
            final String str = keyboard.next();
            final char[] word = str.toCharArray();
            System.out.print("Method 1: ");
            long start, total;
            start = System.nanoTime();
            A3Q2.isSquareFree(word);
            total = System.nanoTime() - start;
            System.out.printf("Time taken to execute method 1: %d ns%n", total);
            System.out.print("Method 2: ");
            start = System.nanoTime();
            A3Q2.isSquareFree2(word);
            total = System.nanoTime() - start;
            System.out.printf("Time taken to execute method 2: %d ns%n", total);

            System.out
                    .println("Do you want to test another word? Press y for yes, or another key for no");

        } while (keyboard.next().charAt(0) == 'y');

        // part (b) of the main

        System.out.println();
        System.out.println("***************************");
        System.out.println("        Part (b)");
        System.out.println("***************************");

        System.out
                .println("How long a square free word on letters a, b and c do you want?");
        System.out.println("Enter an integer greater than zero");
        final int word_length = keyboard.nextInt();

        final char[] square_free_word = A3Q2.makeSquareFree(word_length);

        System.out.println("Here is a square-free word of length "
                + word_length);
        System.out.println(new String(square_free_word));

        /*
         * by uncommenting the method call below, you can call isSquareFree with your created word to verify that indeed it is square free
         */
        long start, total;
        start = System.nanoTime();
        A3Q2.isSquareFree(square_free_word);
        total = System.nanoTime() - start;
        System.out.printf("Time taken to execute method 1: %dns%n", total);
        start = System.nanoTime();
        A3Q2.isSquareFree2(square_free_word);
        total = System.nanoTime() - start;
        System.out.printf("Time taken to execute method 2: %dns%n", total);

        /*
         * uncomment the method call below if you want to test if your solution for part b is correct for n=1000. To use it, type in 1000 for the
         * length when prompted by the program, the method below will tell you if the word you created is indeed a correct word of length 1000 as per
         * Thue procedure.
         */

        // test(square_free_word);
        keyboard.close();
    }

    // a method the produces a square free word of length n based on Thue's construction
    public static char[] makeSquareFree(final int n) {
        final char[] sfword = new char[n];
        sfword[0] = 'a';
        while (true) {
            int size = 0;
            // find out the length of the next array
            for (final char element : sfword) {
                if (element == 'a') {
                    size += 5;
                } else if (element == 'b') {
                    size += 6;
                } else if (element == 'c') {
                    size += 7;
                }
            }
            final char[] tmp = new char[size];
            int idx = 0;
            for (final char ch : sfword) {
                if (ch == 'a') {
                    tmp[idx] = 'a';
                    tmp[idx + 1] = 'b';
                    tmp[idx + 2] = 'c';
                    tmp[idx + 3] = 'a';
                    tmp[idx + 4] = 'b';
                    idx += 5;
                } else if (ch == 'b') {
                    tmp[idx] = 'a';
                    tmp[idx + 1] = 'c';
                    tmp[idx + 2] = 'a';
                    tmp[idx + 3] = 'b';
                    tmp[idx + 4] = 'c';
                    tmp[idx + 5] = 'b';
                    idx += 6;
                } else if (ch == 'c') {
                    tmp[idx] = 'a';
                    tmp[idx + 1] = 'c';
                    tmp[idx + 2] = 'b';
                    tmp[idx + 3] = 'c';
                    tmp[idx + 4] = 'a';
                    tmp[idx + 5] = 'c';
                    tmp[idx + 6] = 'b';
                    idx += 7;
                }
            }
            for (int i = 0; i < tmp.length && i < n; i++) {
                sfword[i] = tmp[i];
            }
            if (tmp.length >= n) {
                break;
            }
        }
        return sfword;

    }

    // a method that tests if a given word of length 1000, is a square-free produced as per Thue's construction
    public static void test(final char[] your_sfword) {

        if (your_sfword.length != 1000) {
            System.out
                    .println("This method only tests if part (b) correctly generates a word of length 1000."
                            + "\n Enter 1000 the next time if you want to use this method");
            return;
        }

        final String s1 = new String(your_sfword);
        final String s2 = "abcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabc";
        if (s1.equals(s2)) {
            System.out
                    .println("Your Thue-procedure-based square-free word of length 1000 is correct.");
        } else {
            System.out
                    .println("Your Thue-procedure-based square-free word of length 1000 is not correct.");
        }

    }

}
