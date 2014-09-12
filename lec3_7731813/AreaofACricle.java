import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * Course: ITI1120
 * Lec 3
 * Langlois, Matthew
 * 7731813
 */

public class AreaofACricle {

	public static void main(final String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException,
	UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		while (true) {
			try {
				final double r = Double.parseDouble(JOptionPane
						.showInputDialog("What is the radius of the circle?"));
				final double area = Math.pow(r, 2) * Math.PI;
				JOptionPane
				.showMessageDialog(
						null,
						"The area of the circle is "
								+ (area > 0 ? new DecimalFormat()
												.format(area)
												+ " units squared."
										: "not calcultable with the numbers specified."));
			} catch (final Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null,
						"Please enter a valid number");
			}
		}
	}

}