import java.util.ArrayList;


public class WarGame  {

	Deal play = new Deal();
	ArrayList<Cards> play1 = play.player1;
	ArrayList<Cards> play2 = play.player2;
	boolean winner = true;
	boolean doubleWar;
	int p1;
	int c2;
	int player1Wins = 0;
	int player2Wins = 0;
	int war = 0;
	int quit = 0 ;
	public void Game() throws InterruptedException {
		System.out.println("Lets Fight");

		playGame();


		System.out.println("Game Over!");
	}//close method

	public void player1Wins () {
		if (play1.size() == 0){
			System.out.println("Game Over");
			winner = false;
		}else{
			System.out.println("Player wins with " + play1.get(0) + "\n");
			play1.add(play1.get(0));
			play1.add(play2.get(0));
			play2.remove(0);
			play1.remove(0);
		}
		//Collections.shuffle(play1);

	}

	public void player2Wins () {
		if (play1.size() == 0){
			System.out.println("Game Over");
			winner = false;
		}else{System.out.println("Computer wins with " + play2.get(0) + "\n");
		play2.add(play2.get(0));
		play2.add(play1.get(0));
		play1.remove(0);
		play2.remove(0);
		}
		//Collections.shuffle(play1);

	}

	public void playGame () throws InterruptedException{
		while(winner){
			for(int i = 1; winner; ++i ){
				System.out.printf("\nRound %d \n\n" , i);
				Thread.sleep(50);
				System.out.printf("Player's Card: " + play1.get(0) + "\nComputer's Card: " + play2.get(0));
				System.out.println("\nPlayer 1 has: "+ play1.size()+" number of cards." + "\tComputer has: "+play2.size()+ " number of cards.\n");

				p1 = play1.get(0).rank().getRankpoints();
				c2 = play2.get(0).rank().getRankpoints();

				compare();
			}
		}
	}
	public void compare () throws InterruptedException{


		if (play1.size() == 0 || play2.size() == 0)
			winner = false;
		else{
			if (p1 > c2)
				player1Wins();
			else if (p1 < c2)
				player2Wins ();
			else if (p1 == c2){
				if (play1.size() <= 3 || play2.size() <= 3 ){
					winner = false;
				}else{
					war();
					//	}while(doubleWar);
				}

			}
		}

	}

	public void war () {

		do{
			if(play1.size() <= 3 || play2.size() <= 3){
				winner = false;
				break;
			}else{
				System.out.println("THIS IS WAR!");
				Cards wc1 = play1.get(3);
				Cards wc2 = play2.get(3);
				System.out.println("Players War Card: " + wc1);
				System.out.println("Computers War Card: " + wc2);
				//Player wins War
				if (wc1.rank().getRankpoints() > wc2.rank().getRankpoints()){
					System.out.println("Player Wins with: " + wc1);
					System.out.println("Player has: "+ play1.size()+"cards."+ " Computer has "+ play2.size()+ " cards.");

					for (int k = 0; k < 4; k++){
						play1.add(play2.get(k));
						play1.add(play1.get(k));
						play1.remove(k);
						play2.remove(k);
					}break;
					//Computer Wins War
				}else if(wc1.rank().getRankpoints() < wc2.rank().getRankpoints()){
					System.out.println("\n Computer Wins with: " + wc2+ "\n");
					System.out.println("Player has: "+ play1.size()+"cards."+ " Computer has "+ play2.size()+" cards.");
					for (int k = 0; k < 4; k++){
						play2.add(play1.get(k));
						play2.add(play2.get(k));
						play1.remove(k);
						play2.remove(k);

					}break;
				}else if(wc1.rank().getRankpoints() == wc1.rank().getRankpoints()){
					doubleWar = true;
					break;
				}

			}
		}while(doubleWar);

	}
}//close class