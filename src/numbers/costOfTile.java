// Calculate the total cost of tile it would take to cover a floor plan of width and height, using a cost entered by the user.
package numbers;

import java.util.Scanner;

public class costOfTile {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the width of the floor in meters: ");
		double width = scanner.nextDouble();
		System.out.print("Enter the height of the floor in meters: ");
		double height = scanner.nextDouble();
		double area = width * height;
		System.out.print("Enter the cost of tile per square meters: ");
		double costPerMeterSquare = scanner.nextDouble();
		if (width > 0 && height > 0 && costPerMeterSquare > 0) {
			double cost = area * costPerMeterSquare;
			System.out.printf("The cost of tiling the floor of area %.2f is: %.2f.", area, cost);
			scanner.close();
		} else {
			System.out.println("The inputs must be positive.");
		}
		System.exit(0);
	}
}
