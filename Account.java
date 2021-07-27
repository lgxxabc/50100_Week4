package Week4;

public class Account {
	private static int numAccounts = 0;
	
	// Constructor
	public Account() {
		numAccounts++;
	}
	
	// Getter
	public static int getNumAccounts() {
		return numAccounts;
	}
	
	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = new Account();
		
		System.out.println("Account created: " + Account.getNumAccounts());
		// Output: 
		// Account created: 3
	}
}
