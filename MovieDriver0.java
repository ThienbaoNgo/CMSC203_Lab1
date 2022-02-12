import java.util.Scanner;

public class MovieDriver0 {
	public static void main(String[] args) {
			
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
			
		System.out.println("Goodbye.");
	}
}
