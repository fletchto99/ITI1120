import java.util.Scanner;

// Family name, Given name: Langlois, Matthew
// Student number: 7731813
// Course: IT1 1120
// Assignment Number: 1

public class a1_7731813 {

	public static void main(final String[] args) {

		/*
		 * Create a scanner instence to read user input via the console (System.in)
		 */
		final Scanner scan = new Scanner(System.in);

		/*
		 * Question 1
		 */
		System.out.println("What is the temperature in Farenheit?");
		final double farenheit = scan.nextDouble();
		System.out
				.printf("%.1f degrees farenheit is equivlent to %.3f degrees kelvin.%n",
						farenheit, ((farenheit - 32) / 1.8) + 273.15);
		/*
		 * Question 2
		 */
		System.out
				.println("How many pounds are there and how many ounces are there? Format: x.x x.x");
		final double pounds = scan.nextDouble();
		final double ounces = scan.nextDouble();
		final double conversion = ((16 * pounds) + ounces) / 35.274;
		System.out
				.printf("%.1f pounds and %.1f ounces is equivlent to %.3f kilograms. %n",
						pounds, ounces, conversion);
		/*
		 * Question 3
		 */
		scan.nextLine(); // consume the empty line
		System.out.println("Give me a quote.");
		String quote = "\"" + scan.nextLine() + "\"";
		System.out.println("And who said this?");
		quote = ", a person called " + scan.nextLine() + " said: " + quote;
		System.out.println("And what year did they say this?");
		quote = "In " + scan.nextInt() + quote;
		System.out
				.println("===================================================================================");
		System.out.println(quote);
		System.out
				.println("***********************************************************************************");
		/*
		 * Question 4
		 */
		System.out.println("Enter a positive integer.");
		final int n = scan.nextInt();
		System.out.println((n * (n + 1)) / 2);
		/*
		 * Question 5
		 */
		/*
		 *                                                                   #####
		 *                                                                  #######
		 *                    #                                             ##Q#Q##
		 *	  ######         ###                                            #VVVVV#
		 *	    ##            #                                           ##  VVV  ##
		 *	    ##         ###    ### ####   ###    ###  ##### #####     #          ##
		 *	    ##        #  ##    ###    ##  ##     ##    ##   ##      #            ##
		 *	    ##           ##    ##     ##  ##     ##      ###        #            ###
		 *	    ##          ###    ##     ##  ##     ##      ###       QQ#           ##Q
		 *	    ##         ###     ##     ##  ##     ##     ## ##    QQQQQQ#       #QQQQQQ
		 * 	    ##         ###     ##     ##  ###   ###    ##   ##   QQQQQQQ#     #QQQQQQQ
		 *	  ############  ###   ####   ####   #### ### ##### #####   QQQQQ#######QQQQQ
		 */
		System.out
				.println("Write 3 characters seprated by a space. Recommended (# V Q)");
		final String a = scan.next();
		final String b = scan.next();
		final String c = scan.next();
		System.out
				.println("                                                                 "
						+ a + a + a + a + a);
		System.out
				.println("                                                                "
						+ a + a + a + a + a + a + a);
		System.out.println("                  " + a
				+ "                                             " + a + a + c
				+ a + c + a + a);
		System.out.println("  " + a + a + a + a + a + a + "         " + a + a
				+ a + "                                            " + a + b
				+ b + b + b + b + a);
		System.out.println("    " + a + a + "            " + a
				+ "                                           " + a + a + "  "
				+ b + b + b + "  " + a + a);
		System.out.println("    " + a + a + "         " + a + a + a + "    "
				+ a + a + a + " " + a + a + a + a + "   " + a + a + a + "    "
				+ a + a + a + "  " + a + a + a + a + a + " " + a + a + a + a
				+ a + "     " + a + "          " + a + a);
		System.out.println("    " + a + a + "        " + a + "  " + a + a
				+ "    " + a + a + a + "    " + a + a + "  " + a + a + "     "
				+ a + a + "    " + a + a + "   " + a + a + "      " + a
				+ "            " + a + a);
		System.out.println("    " + a + a + "           " + a + a + "    " + a
				+ a + "     " + a + a + "  " + a + a + "     " + a + a
				+ "      " + a + a + a + "        " + a + "            " + a
				+ a + a);
		System.out.println("    " + a + a + "          " + a + a + a + "    "
				+ a + a + "     " + a + a + "  " + a + a + "     " + a + a
				+ "      " + a + a + a + "       " + c + c + a + "           "
				+ a + a + c);
		System.out.println("    " + a + a + "         " + a + a + a + "     "
				+ a + a + "     " + a + a + "  " + a + a + "     " + a + a
				+ "     " + a + a + " " + a + a + "    " + c + c + c + c + c
				+ c + a + "       " + a + c + c + c + c + c + c);
		System.out.println("    " + a + a + "         " + a + a + a + "     "
				+ a + a + "     " + a + a + "  " + a + a + a + "   " + a + a
				+ a + "    " + a + a + "   " + a + a + "   " + c + c + c + c
				+ c + c + c + a + "     " + a + c + c + c + c + c + c + c);
		System.out.println("  " + a + a + a + a + a + a + a + a + a + a + a + a
				+ "  " + a + a + a + "   " + a + a + a + a + "   " + a + a + a
				+ a + "   " + a + a + a + a + " " + a + a + a + " " + a + a + a
				+ a + a + " " + a + a + a + a + a + "   " + c + c + c + c + c
				+ a + a + a + a + a + a + a + c + c + c + c + c);

		/*
		 * Question 6
		 */
		System.out.println("Please enter an uppercase letter.");
		scan.nextLine(); // Consume the empty line
		System.out.println("The lowercase version of you letter is "
				+ (char) (scan.nextLine().charAt(0) + 32) + ".");
		/*
		 * Question 7
		 */
		System.out.println("Please enter a non negative number.");
		final double d = scan.nextDouble();
		final int y1 = (int) d;
		final double z1 = 12.0 * Math.abs(d - y1);
		System.out.printf("(%d, %.1f)%n", y1, z1);
		/*
		 * Question 8
		 */
		System.out.println("Write 3 integers seprated by a space.");
		int med_1 = scan.nextInt();
		int med_2 = scan.nextInt();
		int med_3 = scan.nextInt();
		System.out
				.println(med_1
						+ (((med_1 == med_2 || med_1 == med_3)
								|| (med_1 < med_2 && med_1 > med_3) || (med_1 < med_3 && med_1 > med_2)) ? " is a median."
								: " is not a median."));
		System.out
				.println(med_2
						+ (((med_2 == med_1 || med_2 == med_3)
								|| (med_2 < med_1 && med_2 > med_3) || (med_2 < med_3 && med_2 > med_1)) ? " is a median."
								: " is not a median."));
		System.out
				.println(med_3
						+ (((med_3 == med_2 || med_3 == med_1)
								|| (med_3 < med_2 && med_3 > med_1) || (med_3 < med_1 && med_3 > med_2)) ? " is a median."
								: " is not a median."));
		/*
		 * Question 9
		 */
		System.out.println("Enter coordnates in the form X Y.");
		final double x = scan.nextDouble();
		final double y = scan.nextDouble();
		System.out.println("Enter the side length of the square.");
		final double length = scan.nextDouble();
		System.out.println("Enter a test point in the form X Y.");
		final double test_x = scan.nextDouble();
		final double test_y = scan.nextDouble();
		System.out
				.printf((test_x > x && test_y > y && test_x < x + length && test_y < y
						+ length) ? "The test point (%.1f, %.1f) is within the bounds of the square. %n"
						: "The test point (%.1f, %.1f) is not within the bounds of the square. %n",
						test_x, test_y);
		/*
		 * Question 10
		 */
		System.out.println("Please enter the amount owing.");
		int remainder = (int) (scan.nextDouble() * 100);
		int coins = remainder / 25;
		remainder %= 25;
		coins += remainder / 10;
		remainder %= 10;
		coins += remainder / 5;
		remainder %= 5;
		coins += remainder;
		System.out.println(coins);

		/*
		 * Close the scanner for conventions
		 */
		System.out.println("All done, have a nice day :)");
		scan.close();

	}

}
