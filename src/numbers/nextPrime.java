// Have the program find prime numbers until the user chooses to stop asking for the next one.
package numbers;

import javax.swing.JOptionPane;

public class nextPrime {
	public static void main(String[] args) {
		System.out.println("Your first Prime Number is 2.");
		int i = 2;
		int response;
		do {
			response = JOptionPane.showConfirmDialog(null, "Do You want to display the next Prime Number?", 
					"Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (response == JOptionPane.YES_OPTION) {
				i++;
				while (!isPrime(i)) {
					i++;
				}
				System.out.printf("The next Prime Number is: %d%n", i);
			}
		} while (response == JOptionPane.YES_OPTION);
		System.exit(0);
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
