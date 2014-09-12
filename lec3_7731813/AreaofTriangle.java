import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * Course: ITI1120
 * Lec 3
 * Langlois, Matthew
 * 7731813
 */

public class AreaofTriangle {

	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		while (true) {
			try {
				double b = Double.parseDouble(JOptionPane
						.showInputDialog("What is the base of the triange?"));
				double h = Double
						.parseDouble(JOptionPane
								.showInputDialog("What is the height of the triangle?"));
				double area = (b * h) / 2 > 2 ? ((b * h) / 2) : -1;
				JOptionPane
						.showMessageDialog(
								null,
								"The area of the triangle is "
										+ (area > 0 ? area + " units squared."
												: "not calcultable with the numbers specified."));
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null,
						"Please enter a valid number");
			}
		}
	}

}