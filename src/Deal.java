import java.util.ArrayList;
import java.util.Collections;

public class Deal {

	ArrayList<Cards> shuffle = Cards.newDeck();
	ArrayList<Cards> player1 = new ArrayList<Cards>();
	ArrayList<Cards> player2 = new ArrayList<Cards>();

	public Deal(){

		Collections.shuffle(shuffle);

		

		for (int i = 0; i < 52; i++) {

			if (i % 2 == 0)
				player1.add(shuffle.get(i));

			else
				player2.add(shuffle.get(i));



		}
		System.out.println(" \tThe Shuffled Cards: \n" + shuffle + "\n" );
		System.out.println(" Player 1 " + player1);
		System.out.println(" Player 2 " + player2);



	}


}