// Family name, Given name:
// Student number:
// Course: IT1 1120
// Assignment Number

import java.util.Scanner;

//Family name, Given name: Langlois, Matthew
//Student number: 7731813
//Course: IT1 1120
//Assignment Number: 3

public class A3Q2 {
    public static void main(String[] args) {
        // part (a) of the main
        Scanner keyboard = new Scanner(System.in);

        System.out.println("***************************");
        System.out.println("        Part (a)");
        System.out.println("***************************");

        do {
            System.out.println("Enter a word and then press enter:");
            String str = keyboard.next();
            char[] word = str.toCharArray();

            isSquareFree(word);
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
        int word_length = keyboard.nextInt();

        char[] square_free_word = makeSquareFree(word_length);

        System.out.println("Here is a square-free word of length "
                + word_length);
        for (int i = 0; i < word_length; i++) {
            System.out.print(square_free_word[i]);
        }
        System.out.println();

        /* by uncommenting the method call below, you can call isSquareFree with your created word 
         to verify that indeed it is square free */

        // isSquareFree(square_free_word);

        /* uncomment the method call below if you want to test if your solution 
         for part b is correct for n=1000. To use it, type in 1000 for the length when prompted by the program, 
         the method below will tell you if the word you created is indeed a correct word of length 1000 as per Thue procedure. */

        // test(square_free_word);
        keyboard.close();
    }

    public static void isSquareFree(char[] word) {
        if (word.length == 1) {
            System.out.println("The word is square free.");
            return;
        }

        for (int i = 0; i <= word.length % 2; i++) {
            for (int j = 1; j <= word.length / 2; j++) {
                int subwords = (word.length / j - (word.length / j) % 2) - 1;
                for (int k = 0; k < subwords; k++) {
                    boolean sqFree = false;
                    for (int idx = ((k * j) + i); idx < (((k + 1) * j) + i); idx++) {
                        if (word[idx] != word[idx + j]) {
                            sqFree = true;
                            break;
                        }
                    }
                    if (!sqFree) {
                        System.out
                                .println("The word, "
                                        + new String(word)
                                        + ", is not square free, since it has subword, "
                                        + new String(word, ((k * j) + i), j)
                                        + " two times starting at position "
                                        + ((k * j) + i));
                        return;
                    }
                }
            }
        }
        System.out.println("The word is square free.");

    }

    // a method the produces a square free word of length n based on Thue's construction
    public static char[] makeSquareFree(int n) {
        char[] sfword = new char[n];
        sfword[0] = 'a';
        while (true) {
            int a = 0;
            int b = 0;
            int c = 0;
            // find out the length of the next array
            for (int i = 0; i < sfword.length; i++) {
                if (sfword[i] == 'a') {
                    a++;
                } else if (sfword[i] == 'b') {
                    b++;
                } else if (sfword[i] == 'c') {
                    c++;
                }
            }
            char[] tmp = new char[a * 5 + b * 6 + c * 7];
            int idx = 0;
            for (char ch : sfword) {
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
            for (int i = 0; i < tmp.length; i++) {
                if (i == n) {
                    break;
                }
                sfword[i] = tmp[i];
            }
            if (tmp.length >= n) {
                break;
            }
        }

        return sfword;

    }

    // a method that tests if a given word of length 1000, is a square-free produced as per Thue's construction
    public static void test(char[] your_sfword) {

        if (your_sfword.length != 1000) {
            System.out
                    .println("This method only tests if part (b) correctly generates a word of length 1000."
                            + "\n Enter 1000 the next time if you want to use this method");
            return;
        }

        String s1 = new String(your_sfword);
        String s2 = "abcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabc";
        if (s1.equals(s2)) {
            System.out
                    .println("Your Thue-procedure-based square-free word of length 1000 is correct.");
        } else {
            System.out
                    .println("Your Thue-procedure-based square-free word of length 1000 is not correct.");
        }

    }

}
