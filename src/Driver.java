import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws InterruptedException{

		Scanner select = new Scanner(System.in);

		Cards.class.toString();

		System.out.println("Select a game: \n\t 1: War \n\t 0: Quit");
		int x = select.nextInt();
	
		switch(x){

				case 0: 
					System.out.println("Have a nice Day");
					break;

					case 1:WarGame start = new WarGame();
							start.Game();
	}

		select.close();


}
	
	

}