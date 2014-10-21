// Family name, Given name:
// Student number:
// Course: IT1 1120
// Assignment Number

import java.util.Scanner;

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

        int sqStart = -1;
        int sqEnd = -1;
        for (int i = 0; i < word.length; i++) {
            if (i == word.length - 1) {
                System.out.println("The word is square free.");
                return;
            }
            if (word[i] == word[i + 1]) {
                sqStart = i;
                sqEnd = i + 1;
                break;
            }
        }
        System.out.println("The word, " + toWord(word)
                + ", is not square free, since it has subword,"
                + toWord(word, sqStart, sqEnd)
                + " two times starting at position " + sqStart);

    }

    public static String toWord(char[] chars) {
        return toWord(chars, 0, chars.length);
    }

    public static String toWord(char[] chars, int begin, int end) {
        String s = "";
        for (int i = begin; i < end; i++) {
            s += chars[i];
        }
        return s;
    }

    // a method the produces a square free word of length n based on Thue's construction
    public static char[] makeSquareFree(int n) {

        char[] sfword = new char[n];
        
        
        
        while (sfword.length < n) {
            //dowork
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
