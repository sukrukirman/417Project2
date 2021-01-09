package Views;

import java.util.Scanner;

public class MenuViews {
	public static int getSelection() {
		Scanner scanner = new Scanner(System.in);
		int selection;
		do {
			System.out.println("***MENU***");
			System.out.println("1) Vegan Burger");
			System.out.println("2) Cheese Burger");
			System.out.println("3) Fish Burger");
			System.out.print("Enter selection: ");
			selection = scanner.nextInt();
		} while(selection < 1 || selection > 3);
		return selection;
	}
}