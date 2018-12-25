// Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number
package numbers;

import java.util.Scanner;

public class FibSeq {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number upto which you would like to display fibonacci sequence: ");
		int n = scanner.nextInt();
		if (n > 0) {
			int i = 1;
			int firstNumber = 1;
			int secondNumber = 1;
			System.out.printf("The fibonacci sequence upto %d is: %d ", n,i);
			while (firstNumber + secondNumber <= n) {
				i = firstNumber + secondNumber;
				firstNumber = secondNumber;
				secondNumber = i;
				System.out.printf("%d ", i);
			}
		} else {
			System.out.println("The number must be positive.");
		}
		scanner.close();
		System.exit(0);
	}
}
