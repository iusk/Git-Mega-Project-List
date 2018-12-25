// The user enters a cost and then the amount of money given. The program will figure out the change 
// and the number of quarters, dimes, nickels, pennies needed for the change.

package numbers;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class changeReturn {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		double cost = Double.parseDouble(JOptionPane.showInputDialog("Enter the cost."));
		double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount given."));
		cost = Double.parseDouble(df.format(cost));
		amount = Double.parseDouble(df.format(amount));
		while (cost > amount) {
			amount += Double.parseDouble(JOptionPane.showInputDialog("Not Enough Money. Add more."));
		}
		double returnAmount = amount - cost;
		System.out.println(returnAmount);
		System.out.println((int) returnAmount);
		double change = (returnAmount - (int) returnAmount) * 100;
		System.out.println(change);
	}
}
