import java.util.Scanner;

public class RandomNumberGuesser {
	
	/* 

	 * Class: CMSC203  

	 * Instructor: Grigory Grinberg

	 * Description: Program helps guide user in guessing game experience.

	 * Due: 2/23/2021 

	 * Platform/compiler: Eclipse

	 * I pledge that I have completed the programming assignment independently. 

	   I have not copied the code from a student or any source. 

	   I have not given my code to any student. 

	   Print your Name here: Thienbao Ngo 

	*/

	public static void main(String[] args) {
		Scanner someScanner = new Scanner(System.in);
		boolean keepPlayingFlag = true;
		while(keepPlayingFlag) {
			
			RNG.resetCount();
			
			//Instantiate variables:

			int randNum = RNG.rand(); //(Generate random number using RNG class)

			int nextGuess = 0; 

			int highGuess= 100; 

			int lowGuess = -1; 

			boolean gameWin = false;

			int guessCount = 0; 
			
			//While loop for "gameplay"
			while(gameWin == false){
				
				//Prompt user to enter a number. 

				System.out.println("Enter a number."); 

				 

				if(guessCount == 0){ 

				System.out.println("Enter your First Guess");

				} 
				else{ 

				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess + "."); 

				}

				nextGuess = someScanner.nextInt(); 

				someScanner.nextLine();
				
				guessCount = (RNG.getCount() + 1);
				
				System.out.println("Number of guesses is " + (guessCount)); 
					
					if(RNG.inputValidation(nextGuess,lowGuess, highGuess) == false){ 

					/*This command is within method already. System...print(Guess must be between + lowGuess + and + highGuess + .);*/ 

					//RNG has it's own guess count.

					}
					else if(nextGuess > randNum){ 

					System.out.println("Guess was too high"); 

					highGuess = nextGuess; 

					}
					else if(nextGuess < randNum){ 

					System.out.println("Guess was too low"); 

					lowGuess = nextGuess;

					}

					//Check for win condition. 

					if(nextGuess == randNum){ gameWin = true; 

					} 
				
			}

			System.out.println("Do you want to play again? (y or n)"); 

			//Below is reused code.
			//Printed the header in below options. 

			String answer = someScanner.nextLine(); 

						if(answer.compareToIgnoreCase("y") == 0){ 

							System.out.println();

						} 

						else if(answer.compareToIgnoreCase("n") == 0) { 

							keepPlayingFlag = false; 

						} 

						else { 

							System.out.println("Unable to interpret result, assuming answer is yes."); 

							System.out.println(); 

						} 

			 

			//Then it repeats. Variables reset when they reach the front. 
			
		}
		
		//Loop ends.
		
		someScanner.close();

		System.out.println("Thanks for playing");
		System.out.println();
		
		System.out.println("Student: Thienbao Ngo."); //Name is printed
		System.out.println("Date: 9/29/2021."); //Date is printed
		
	}
	
}
