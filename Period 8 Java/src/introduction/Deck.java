package introduction;

public class Deck {

	public static void main(String[] args) {
		String[] suites = {"Spades","Clubs","Hearts","Diamonds"};
		String[] values = {"Jack", "Queen", "King"};
		int value = (int)(Math.random()*values.length);
		int suit = (int)(Math.random()*suites.length);
		System.out.println(values[value]+" of " +suites[suit]);
	}

}
