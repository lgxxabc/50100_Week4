package Week4;

public class Box2 {
	int size = 0;

	// Constructor
	public Box2() {

	}

	public static void main(String[] args) {
		Box2 myBox = new Box2();
		myBox.size = 5;
		myBox.printBox('c');
	}
	
	// Print a '*' box
	public void printBox() {
		for (int row = 1; row <= size; row++) {
			for (int star = 1; star <= size; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// Method overload, print a 'c' box
	public void printBox(char c) {
		for (int row = 1; row <= size; row++) {
			for (int star = 1; star <= size; star++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	/*
	 Output:
		ccccc
		ccccc
		ccccc
		ccccc
		ccccc
	 */
}
