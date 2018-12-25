// Have the user enter a number and find all Prime Factors (if there are any) and display them.
package numbers;

import java.util.Scanner;

public class primeFactors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to find its Prime Factors: ");
		int n = scanner.nextInt();
		if (n > 0) {
			System.out.printf("The Prime Factors of %d are: ", n);
			for (int i = 1; i <= n; i++) {
				if (n % i == 0 && isPrime(i)) {
					System.out.printf("%d ", i);
				}
			}
		} else {
			System.out.println("The number must be positive.");
		}
		scanner.close();
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
