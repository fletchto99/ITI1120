import static java.lang.System.out;

import java.util.Scanner;

// Family name, Given name: Langlois, Matthew
// Student number: 7731813
// Course: IT1 1120
// Assignment Number: 1

public class a1_7731813 {

	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		// Find out which question is being tested (for debugging purposes)
		// TODO: Remove before submission
		out.println("Which question are you testing?");
		switch (scan.nextInt()) {
			case 1:
				out.println("What is the temperature in Farenheit?");
				final double farenheit = scan.nextDouble();
				out.printf(
						"%.1f degrees farenheit is equivlent to %.3f degrees kelvin.\r\n",
						farenheit, ((farenheit - 32) / 1.8) + 273.15);
				break;
			case 2:
				out.println("How many pounds are there?");
				final double pounds = scan.nextDouble();
				out.println("How many ounces are there?");
				final double ounces = scan.nextDouble();
				final double conversion = ((16 * pounds) + ounces) / 35.274;
				out.printf(
						"%.1f pounds and %.1f ounces is equivlent to %.3f kilograms.\r\n",
						pounds, ounces, conversion);
				break;
			case 3:
				scan.nextLine(); // consume the empty line, caused by nextInt() not consuming the newline
				out.println("Give me a quote.");
				String quote = "\"" + scan.nextLine() + "\"";
				out.println("And who said this?");
				quote = ", a person called " + scan.nextLine() + " said: "
						+ quote;
				out.println("And what year did they say this?");
				quote = "In " + scan.nextInt() + quote;
				out.println("===================================================================================");
				out.println(quote);
				out.println("***********************************************************************************");
				break;
			case 4:
				out.println("Enter a positive integer.");
				int n = scan.nextInt();
				System.out.println((n * (n + 1)) / 2);
				break;
			case 5:
				System.out
						.println("Write 3 characters seprated by a space. Recommended (# V Q)");
				String a = scan.next();
				String b = scan.next();
				String c = scan.next();
				out.println("                                                                 #####"
						.replace("#", a));
				out.println("                                                                #######"
						.replace("#", a));
				out.println("                  #                                             ##Q#Q##"
						.replace("#", a).replace("Q", c));
				out.println("  ######         ###                                            #VVVVV#"
						.replace("#", a).replace("V", b).replace("Q", c));
				out.println("    ##            #                                           ##  VVV  ##"
						.replace("#", a).replace("V", b).replace("Q", c));
				out.println("    ##         ###    ### ####   ###    ###  ##### #####     #          ##"
						.replace("#", a).replace("V", b).replace("Q", c));
				out.println("    ##        #  ##    ###    ##  ##     ##    ##   ##      #            ##"
						.replace("#", a).replace("V", b).replace("Q", c));
				out.println("    ##           ##    ##     ##  ##     ##      ###        #            ###"
						.replace("#", a).replace("V", b).replace("Q", c));
				out.println("    ##          ###    ##     ##  ##     ##      ###       QQ#           ##Q"
						.replace("#", a).replace("V", b).replace("Q", c));
				out.println("    ##         ###     ##     ##  ##     ##     ## ##    QQQQQQ#       #QQQQQQ"
						.replace("#", a).replace("V", b).replace("Q", c));
				out.println("    ##         ###     ##     ##  ###   ###    ##   ##   QQQQQQQ#     #QQQQQQQ"
						.replace("#", a).replace("V", b).replace("Q", c));
				out.println("  ############  ###   ####   ####   #### ### ##### #####   QQQQQ#######QQQQQ"
						.replace("#", a).replace("V", b).replace("Q", c));
				out.println("");
				break;
			case 6:
				scan.nextLine(); // consume the emprty line
				out.println("Please enter an uppercase letter.");
				out.println("The lowercase version of you letter is "
						+ scan.nextLine().toLowerCase() + ".");
				break;
			case 7:
				break;
		}
		scan.close();
	}
}
