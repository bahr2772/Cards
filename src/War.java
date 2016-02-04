import java.util.ArrayList;
import java.util.Collections;


public class War  {

	Deal play = new Deal();
	ArrayList<Cards> play1 = new ArrayList<Cards>();
	ArrayList<Cards> play2 = new ArrayList<Cards>();


	public War() throws InterruptedException {


		play1 = play.player1;
		play2 = play.player2;

boolean win = false;
while(win)
		System.out.println("Lets Fight");

		for(int i = 1; play1 != play2;i++ ){
			System.out.printf("\nRound %d \n\n" , i);
			Thread.sleep(50);

			for(int j = 0; play1.size()!= 0 || play2.size()!=0;j++){
				System.out.printf("Player's Card: " + play1.get(j) + "\nComputer's Card: " + play2.get(j));
				System.out.println("\nPlayer 1 has: "+ play1.size()+" number of cards." + "\tComputer has: "+play2.size()+ " number of cards.");

				int c1 = play1.get(j).rank().getRankpoints();
				int c2 = play2.get(j).rank().getRankpoints();

				
				
				if (c1 > c2){
					System.out.println("Player wins with " + play1.get(j));
					play1.add(play2.get(0));
					play2.remove(0);
					Collections.shuffle(play1);
						if (play1.size() < 1)
							System.out.println("Game Over");
							win = true;
					break;
				}
				else if (c1 < c2){
					System.out.println("Player lost with " + play1.get(j));
					play2.add(play1.get(0));
					play1.remove(0);
					Collections.shuffle(play2);
						if(play2.size() < 1)
							System.out.println("Game Over");
							win = true;
					break;
				}
				else if(c1 == c2)
					if(play1.size() < 4 || play2.size() < 4){
						System.out.println("Game Over");
						win = true;
					}else{
				System.out.println("THIS IS WAR!");
				Thread.sleep(50);
				Cards wc1 = play1.get(3);
				Cards wc2 = play2.get(3);
				System.out.println("Players War Card: " + wc1);
				System.out.println("Computers War Card: " + wc2);

						if (wc1.rank().getRankpoints() > wc2.rank().getRankpoints()){
							System.out.println("Player Wins with: " + wc1);
							for (int k = 0; k < 4; k++){
								play1.add(play2.get(k));
								play2.remove(k);}
							break;
						}else{
							System.out.println("\n Computer Wins with: " + wc2+ "\n");
							for (int k = 0; k < 4; k++){
								play2.add(play1.get(k));
								play1.remove(k);}
			
							break;
			
						}
					}




			}




		}
	}
}