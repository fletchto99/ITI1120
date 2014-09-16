import java.util.Arrays;
import java.util.Scanner;

// Family name, Given name: Langlois, Matthew
// Student number: 7731813
// Course: IT1 1120
// Assignment Number: 1

public class a1_7731813 {

	public static void main(final String[] args) {
		final Scanner scan = new Scanner(System.in);
		/*
		 * Question 1
		 */
		System.out.println("What is the temperature in Farenheit?");
		final double farenheit = scan.nextDouble();
		System.out
				.printf("%.1f degrees farenheit is equivlent to %.3f degrees kelvin.\r\n",
						farenheit, ((farenheit - 32) / 1.8) + 273.15);
		/*
		 * Question 2
		 */
		System.out.println("How many pounds are there?");
		final double pounds = scan.nextDouble();
		System.out.println("How many ounces are there?");
		final double ounces = scan.nextDouble();
		final double conversion = ((16 * pounds) + ounces) / 35.274;
		System.out
				.printf("%.1f pounds and %.1f ounces is equivlent to %.3f kilograms.\r\n",
						pounds, ounces, conversion);
		/*
		 * Question 3
		 */
		scan.nextLine(); // consume the empty line, caused by nextInt() not consuming the newline
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
		System.out
				.println("Write 3 characters seprated by a space. Recommended (# V Q)");
		final String a = scan.next();
		final String b = scan.next();
		final String c = scan.next();
		System.out
				.println("                                                                 #####"
						.replace("#", a));
		System.out
				.println("                                                                #######"
						.replace("#", a));
		System.out
				.println("                  #                                             ##Q#Q##"
						.replace("#", a).replace("Q", c));
		System.out
				.println("  ######         ###                                            #VVVVV#"
						.replace("#", a).replace("V", b).replace("Q", c));
		System.out
				.println("    ##            #                                           ##  VVV  ##"
						.replace("#", a).replace("V", b).replace("Q", c));
		System.out
				.println("    ##         ###    ### ####   ###    ###  ##### #####     #          ##"
						.replace("#", a).replace("V", b).replace("Q", c));
		System.out
				.println("    ##        #  ##    ###    ##  ##     ##    ##   ##      #            ##"
						.replace("#", a).replace("V", b).replace("Q", c));
		System.out
				.println("    ##           ##    ##     ##  ##     ##      ###        #            ###"
						.replace("#", a).replace("V", b).replace("Q", c));
		System.out
				.println("    ##          ###    ##     ##  ##     ##      ###       QQ#           ##Q"
						.replace("#", a).replace("V", b).replace("Q", c));
		System.out
				.println("    ##         ###     ##     ##  ##     ##     ## ##    QQQQQQ#       #QQQQQQ"
						.replace("#", a).replace("V", b).replace("Q", c));
		System.out
				.println("    ##         ###     ##     ##  ###   ###    ##   ##   QQQQQQQ#     #QQQQQQQ"
						.replace("#", a).replace("V", b).replace("Q", c));
		System.out
				.println("  ############  ###   ####   ####   #### ### ##### #####   QQQQQ#######QQQQQ"
						.replace("#", a).replace("V", b).replace("Q", c));
		/*
		 * Question 6
		 */
		System.out.println("Please enter an uppercase letter.");
		scan.nextLine(); // Consume the empty line
		System.out.println("The lowercase version of you letter is "
				+ scan.nextLine().toLowerCase() + ".");
		/*
		 * Question 7
		 */
		System.out.println("Please enter a non negative number.");
		final double d = scan.nextDouble();
		final double y1 = Math.floor(d);
		final double z1 = 12.0 * Math.abs(d - y1);
		System.out.printf("(%.1f, %.1f)\r\n", y1, z1);
		/*
		 * Question 8
		 */
		System.out.println("Write 3 integers seprated by a space.");
		final int[] ints = new int[] { Integer.parseInt(scan.next()),
				Integer.parseInt(scan.next()), Integer.parseInt(scan.next()) };
		Arrays.sort(ints);
		System.out.println(ints[0]
				+ (ints[0] == ints[1] ? " is a median." : " is not a median."));
		System.out.println(ints[1]
				+ (ints[1] <= ints[2] ? " is a median." : " is not a median."));
		System.out.println(ints[2]
				+ (ints[2] <= ints[1] ? " is a median." : " is not a median."));
		/*
		 * Question 9
		 */
		System.out.println("Enter coordnates in the form X Y.");
		final double x = Double.parseDouble(scan.next());
		final double y = Double.parseDouble(scan.next());
		System.out.println("Enter the side length of the square.");
		final double length = scan.nextDouble();
		System.out.println("Enter a test point in the form X Y.");
		final double test_x = Double.parseDouble(scan.next());
		final double test_y = Double.parseDouble(scan.next());
		System.out
				.println((test_x > x && test_y > y && test_x < x + length && test_y < y
						+ length) ? "The testpoint is within the bounds of the square."
						: "The test point is not within the bounds of the square.");
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
