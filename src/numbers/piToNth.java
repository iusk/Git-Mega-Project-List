//Enter a number and have the program generate PI up to that many decimal places. Keep a limit to how far the program will go.
package numbers;

import java.util.Scanner;
import java.math.BigDecimal;

public class piToNth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of digits after decimal upto which you would like to display PI: ");
		int n = scanner.nextInt();
		BigDecimal b1 = new BigDecimal(22);
		BigDecimal b2 = new BigDecimal(7);
		if (n <= 1000 && n >= 0) {
			System.out.println(b1.divide(b2, n, BigDecimal.ROUND_DOWN));
		} else {
			System.out.println("The number of digits must be between 0 and 1000.");
		}
		scanner.close();
		System.exit(0);
	}
}
