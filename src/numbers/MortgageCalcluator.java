// Calculate the monthly payments of a fixed term mortgage over given Nth terms at a given interest rate. 
// Also figure out how long it will take the user to pay back the loan. For added complexity, add an option 
// for users to select the compounding interval (Monthly, Weekly, Daily, Continually).

package numbers;

import javax.swing.JOptionPane;

public class MortgageCalcluator {
	public static void main(String[] args) {
		double loan = Double.parseDouble(JOptionPane.showInputDialog("Enter the loan amount"));
		double per_rate = Double.parseDouble(JOptionPane.showInputDialog("Enter the rate of interest(%"));
		double months = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of months for payment"));
		double rate = (per_rate / 100) / 12;
		String[] options = new String[] {"Monthly", "Weekly", "Daily"};
		int response = JOptionPane.showOptionDialog(null, "Select the Compunding Interval", 
				"Compounding Interval", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, 
				options, options[0]);
		switch(response) {
		case 1:
			months /= 4;
			break;
		case 2:
			months /= 30;
			break;
		}
		double payment = (loan * (rate * (Math.pow((1 + rate), months)))) / ((Math.pow(1 + rate, months)) - 1);
		String output = String.format("The monthly payment for the mortgage is: $%.2f compunded %s.", payment, options[response]);
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
}
