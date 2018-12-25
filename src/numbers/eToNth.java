//Enter a number and have the program generate e up to that many decimal places. Keep a limit to how far the program will go.
package numbers;

import java.math.BigDecimal;
import java.util.Scanner;

public class eToNth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of digits upto which you would like to display the decmial of E: ");
		int n = scanner.nextInt();
		BigDecimal b1 = new BigDecimal(Math.E);
		if (n <= 1000 && n >= 0) {
			System.out.println(b1.setScale(n, BigDecimal.ROUND_DOWN));
		} else {
			System.out.println("The number of digits must be between 0 and 1000");
		}
		scanner.close();
		System.exit(0);
	}
}
