package introduction;

public class Deck {

	public static void main(String[] args) {
		int draws = 100;
		String[] suites = {"Spades","Clubs","Hearts","Diamonds"};
		String[] values = {"Ace", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		for(int i=0;i<draws;i++){
		int value = (int)(Math.random()*values.length);
		int suit = (int)(Math.random()*suites.length);
		System.out.println(values[value]+" of " +suites[suit]);
		}
	}

}
