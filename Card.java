package Week4;

import java.util.Random;

public class Card {
	private final int MaxSuit = 4;
	private final int MaxValue = 13;

	private int suit;
	private int value;

	// Constructor
	public Card() {
		Random ran = new Random();
		suit = ran.nextInt(MaxSuit) + 1; // 1 ~ 4
		value = ran.nextInt(MaxValue) + 1; // 1 ~ 13
	}

	public void setSuit(int suit) {
		if (suit > 0 && suit <= MaxSuit) {
			this.suit = suit;
		}
	}

	public void setValue(int value) {
		if (value > 0 && value <= MaxValue) {
			this.value = value;
		}
	}

	public String getSuit() {
		String suitResult = null;
		if (suit == 1) {
			suitResult = "Hearts";
		} else if (suit == 2) {
			suitResult = "Spades";
		} else if (suit == 3) {
			suitResult = "Clubs";
		} else if (suit == 4) {
			suitResult = "Diamonds";
		}
		return suitResult;
	}

	public String getValue() {
		String valueResult = null;
		switch (value) {
		case 1:
			valueResult = "Ace";
			break;
		case 2:
			valueResult = "2";
			break;
		case 3:
			valueResult = "3";
			break;
		case 4:
			valueResult = "4";
			break;
		case 5:
			valueResult = "5";
			break;
		case 6:
			valueResult = "6";
			break;
		case 7:
			valueResult = "7";
			break;
		case 8:
			valueResult = "8";
			break;
		case 9:
			valueResult = "9";
			break;
		case 10:
			valueResult = "10";
			break;
		case 11:
			valueResult = "Jack";
			break;
		case 12:
			valueResult = "Queen";
			break;
		case 13:
			valueResult = "King";
			break;
		}
		return valueResult;
	}

	public String toString() {
		return getValue() + " of " + getSuit();
	}

	public static void main(String[] args) {
		final int LIMIT = 5;
		String[] array = new String[LIMIT]; // 0 ~ 4

		for (int index = 0; index < LIMIT; index++) {
			array[index] = new Card().toString();
		}
		
//		Output Method 1:
//		System.out.println("The " + LIMIT + " random cards were: ");
//		for (String result : array) {
//			System.out.print(result + "\n");
//		}

//		Output Method 2
		for (int index = 0; index < array.length; index++) {
			System.out.println("The # " + (index + 1) 
					+ " of the card you drawn was: " + array[index]);
		}
	}
}
