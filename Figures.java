package Week4;

/*
 * =========================================
 * Name:             Guanxiaoxiong Liu 
 * Date:             07/26/2021
 * Course name:      Programming Foundations 
 * Semester:         Summer 2 
 * Assignment Name:  Program 1
 * =========================================
 */

import java.util.Scanner;

public class Figures {
	static void printBox(int size) {
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}

	static void printDiamond(int size) {
		// Upper half diamond
		for (int i = 1; i <= size / 2 + 1; i++) // Control the number of rows
		{
			for (int j = 1; j <= (size / 2 + 1) - i; j++) // Controls the space to be displayed to the left of the first X in each line.
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i; k++) // Control the X to be displayed on each line.
			{
				if (k == 1 || k == 2 * i) // The first and last print X, and the rest print spaces.
				{
					System.out.print("X");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		// Lower half diamond
		for (int i = 1; i <= size / 2; i++) {	// Control the number of rows
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * (size / 2 - i) + 2; k++) {
				if (k == 1 || k == 2 * (size / 2 - i) + 2) // The first and last print X, and the rest print spaces.
				{
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printX(int size) {
		for (int i = 1; i <= size; i++) { // Traverse n rows
			for (int j = 1; j <= size; j++) { // Traverse n columns
				if (i == j || i + j == size + 1) { // Print diagonal lines.
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); // Wrap each line after printing.
		}
	}

	public static void main(String[] args) {
		int size, option;

		Scanner scan = new Scanner(System.in);

		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Guanxiaoxiong Liu");
		System.out.println("PROGRAMMING ASSIGNMENT 2");
		System.out.println();
		System.out.print("Enter the size of the figure (odd number): ");

		size = scan.nextInt();

		while ((size % 2) == 0) {
			System.out.println("Invalid figure size - must be an odd number");
			System.out.println();
			System.out.print("Renter the size of the figure: ");
			size = scan.nextInt();
		}

		System.out.println("MENU: " + "\n" + "1. Print box" + "\n" + "2. Print diamond" + "\n" + "3. Print X" 
				+ "\n" + "4. Quit program");
		System.out.println();
		System.out.print("Please select an option: ");

		option = scan.nextInt();

		while (option != 4) {
			switch (option) {
			case 1:
				System.out.println();
				printBox(size);
				System.out.println();
				break;
			case 2:
				System.out.println();
				printDiamond(size);
				System.out.println();
				break;
			case 3:
				System.out.println();
				printX(size);
				System.out.println();
				break;
			}

			System.out.println("MENU: " + "\n" + "1. Print box" + "\n" + "2. Print diamond" + "\n" + "3. Print X"
					+ "\n" + "4. Quit program");
			System.out.println();
			System.out.print("Please select an option: ");

			option = scan.nextInt();
		}
		System.out.println("Good bye!");

		scan.close();
	}

}
