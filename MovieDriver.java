import java.util.Scanner;

public class MovieDriver {

	/*
	 * (Incorporate these comments)   
 



Read in the integer that the user types 

Set the number of tickets sold in the movie object 

Print out the information using the movie’s toString method 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner otherScan = new Scanner(System.in);
		boolean flag = true;
		while(flag == true) {
			shell();
			System.out.println("Do you want to enter another? (y or n)");
			String answer = otherScan.nextLine();
			if(answer.compareToIgnoreCase("y") == 0){
				//Do nothing
			}
			else if(answer.compareToIgnoreCase("n") == 0) {
				flag = false;
			}
			else {
				System.out.println("Unable to interpret result, assuming answer is yes.");
				//Do Nothing.
			}
		}
		System.out.println("Goodbye.");
	}
	public static void shell(){ //Note nextInt, use nextLine() straight after to skip the unread \n character
		Scanner input = new Scanner(System.in);
		//Create a new object of type Scanner that reads from the keyboard.
		Movie userMovie = new Movie();
		//Create a new movie object
		System.out.println("Enter the name of a movie.");
		//Prompt the user to enter the title of a movie
		String userTitle = input.nextLine();
		//Read in the line that the user types
		userMovie.setTitle(userTitle);
		//Set the title in the movie object
		System.out.println("Enter the rating of the movie");
		//Prompt the user to enter the movie’s age rating
		String userRating = input.nextLine();
		//Read in the line that the user types
		userMovie.setRating(userRating);
		//Set the rating in the movie object 
		System.out.println("Enter the number of tickets sold for this movie");
		//Prompt the user to enter the number of tickets sold at a (unnamed) theater
		int userTickets = input.nextInt();
		input.nextLine();
		//Read in the integer that the user types 
		userMovie.setSoldTickets(userTickets);
		//Set the number of tickets sold in the movie object 
		System.out.println(userMovie.toString());
		//Print out the information using the movie’s toString method
		
	}
}
