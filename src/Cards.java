import java.util.ArrayList;

public class Cards {

	public enum Rank {
		TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), 
		NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

		private int Rankpoints;

		Rank(int points) {
			this.Rankpoints = points;
		}

		public int getRankpoints() {
			return this.Rankpoints;
		}
	}

	public enum Suit {
		SPADES(1), CLUBS(2), DIAMONDS(3), HEARTS(4) ;

		private int Suitpoints;

		Suit(int points) {

			this.Suitpoints = points;
		}

		public int getSuitpoints() {
			return this.Suitpoints;
		}
	}

	private final  Rank rank;
	private final Suit suit;

	Cards(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Rank rank() {
		return this.rank;
	}

	public Suit suit() {

		return this.suit;

	}

	public String toString() {
		return rank + " of " + suit;
	}

	private static final ArrayList<Cards> protoDeck = new ArrayList<Cards>();

	// Initialize prototype deck
	static {
		for (Suit suit : Suit.values())
			for (Rank rank : Rank.values())
				protoDeck.add(new Cards(rank, suit));

	}

	public static ArrayList<Cards> newDeck() {

		return new ArrayList<Cards>(protoDeck); // Return copy of prototype deck

	}




}