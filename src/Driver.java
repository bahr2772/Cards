import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws InterruptedException{


		//	Hand handOut = new Hand();
		//	handOut.deckCheck();

		Scanner select = new Scanner(System.in);



		System.out.println("Select a game: \n\t 1: War \n\t 0: Quit");
		int x = select.nextInt();
	
		switch(x){

				case 0: 
					System.out.println("Have a nice Day");
					break;

					case 1:War start = new War();
							start.getClass();
	}




		select.close();


}

}