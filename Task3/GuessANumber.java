import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;
	private static Scanner sc = new Scanner(System.in);
	private static int attempts = 1;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number 1 through 100.");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
		// Create a Scanner object   	 
		// No I don't want to create a new one each time. I am doing it in the class
		
        //use hasNextDouble to check if input is numeric, 
		// No that is the wrong check to make, we want an integer, not a double
        // if so...
		// What do you mean if so? I don't want to store a new variable every time. that just bulks up memory. even if it's only 1 bit at a time, it's still precious.
		
		// Check if it's an integer
		if(sc.hasNextInt()){
			
			// Read user input
			Integer guessedNumber = sc.nextInt();
			
			//   Compare it with the random number
			if(guessedNumber==rnd_number){
		//   Let the user know the result of the comparison
				System.out.println("Correct! Only took: " + attempts + " attempts!");
				
				// return so that we don't continue the calling.
				return;
			
			// check if it's too big,
			} else if(guessedNumber > 100){
				
				// print "error" mesage,
				System.out.print("Silly you, that number is too big. remember 1 through 100.\nTry again:");
			
			// check if it's too small,
			} else if(guessedNumber < 1){
				
				// print "error" mesage,
				System.out.print("Silly you, that number is too small. remember 1 through 100.\nTry again:");
				
			// If it's not correct,
			} else {
				++attempts;
				
        //   Help the user by revealing wether the guess was lower or higher than the target number
				System.out.print("The number is " + (rnd_number<guessedNumber?"lower":"higher") + " than that.\nTry again:");
			}
			
			// clearing the variable as to not leak memory (otherwise it takes up 4 bytes of memory for each incorrect answer)
			// this is only possible cause I am using the non-primitive version of Integer
			guessedNumber = null;
			
		// If it isn't an integer, tell them.
		} else {
			
			// tell it to go to the next line so that it doesn't see the same input again.
			sc.next();
			
			// print "error" mesage.
			System.out.print("Silly you, that's not an integer.\nTry again:");
		}
			
        //   Let the user try again by calling this method recursively
		// Recussively call the same function so make a new guess.
		// This is stopped by the return in the correct if statement.
		makeAGuess();
			
		
        // if input was not numeric show an error message and call this method recursively

    }

}