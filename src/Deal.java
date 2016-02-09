import java.util.ArrayList;
import java.util.Collections;


public class Deal {


	int numOfPlayers = 2;
	ArrayList<Cards> shuffle = Cards.newDeck();
	ArrayList<Cards> player1 = new ArrayList<Cards>();
	ArrayList<Cards> player2 = new ArrayList<Cards>();
	ArrayList<Cards> player3 = new ArrayList<Cards>();
	ArrayList<Cards> player4 = new ArrayList<Cards>();

	public Deal(){

		Collections.shuffle(shuffle);

		switch(numOfPlayers){

		case 2:
			for (int i = 0; i < 52; i++){
				switch(i % 2){
				case (0):
					player1.add(shuffle.get(i));
				break;
				case 1:
					player2.add(shuffle.get(i));
					break;
				}

			}break;
		case 3:
			for (int j = 0; j < 52; j++){ 
				switch(j % 2){
				case (0):
					player1.add(shuffle.get(j));
				player3.add(shuffle.get(j));
				break;

				default:
					player2.add(shuffle.get(j));
					break;
				}

			}break;
		case 4:
			for (int j = 0; j <  52; j++){ 
				switch(j % 2){
				case (0):
					player1.add(shuffle.get(j));
				player3.add(shuffle.get(j));
				break;
				default:
					player2.add(shuffle.get(j));
					player4.add(shuffle.get(j));
					break;
				}

			}	break;


		}
	}
}