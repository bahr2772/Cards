import java.util.ArrayList;
import java.util.List;

public class DeckInClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Cards> deck = new ArrayList<Cards>();
		List<Cards> temp = new ArrayList<Cards>();
		
		//number of decks
		int n = 1;
		
		for (int i = 0; i < n; i++){
		for(Cards.Suit suit : Cards.Suit.values())
			for(Cards.Rank rank : Cards.Rank.values())
				deck.add(new Cards(rank, suit));
		}
		System.out.println(deck);
		System.out.println(deck.subList(0, 51));

		temp = deck.subList(0, 5);
		
		System.out.println(temp);

}
	
}
