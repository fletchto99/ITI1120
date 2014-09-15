import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

// Family name, Given name: Langlois, Matthew
// Student number: 7731813
// Course: IT1 1120
// Assignment Number: 1

public class a1_7731813 {

	public static void main(final String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			UnsupportedLookAndFeelException {

		// Clean up the UI for any OS
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		final int option = Integer.parseInt(JOptionPane
				.showInputDialog("Which question are you testing?"));
		/*
		 * ================================================== Question 1
		 * ==================================================
		 */
		// TODO: Error checking
		try {
			switch (option) {
				case 1:
					farenheitToKelvin();
					break;
				default:
					JOptionPane.showMessageDialog(null,
							"Invalid question entered");
					break;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	public static final void farenheitToKelvin() throws Exception {
		try {
			final double farenheit = Double.parseDouble(JOptionPane
					.showInputDialog("What is the temperature in Farenheit?"));
			JOptionPane
					.showMessageDialog(
							null,
							String.format(
									"%.1f degrees farenheit is equivlent to %.3f degrees kelvin.",
									farenheit,
									((farenheit - 32) / 1.8) + 273.15));
		} catch (Exception e) {
			throw new Exception(
					"You failed to enter a valid number for the temperature in farenheit.");
		}
	}
}
