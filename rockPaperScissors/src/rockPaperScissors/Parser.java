package rockPaperScissors;

import java.util.Scanner;

public class Parser{
    private Command moves;
    private Scanner reader;


    public Parser(){
    	moves = new Command();
	    reader = new Scanner(System.in);
    }

    public Move getMove(){
        
	    String command = null;
	    System.out.print("Your move: ");
	    
	    String input = reader.nextLine();

	    Scanner tokenizer = new Scanner(input);
        
	    if(tokenizer.hasNext()) {
	        // get first word
                command = tokenizer.next().toUpperCase(); 
                if(tokenizer.hasNext()) {
                    // note: if the command has two or more words, it is not
		            // valid
		            return new Move();
                }
	    }
	    
	    if ( (command != null) && (moves.isValidMoveCommand(command)) )
	        return new Move(command);
	    
	    // we return a move with no associated command, as it is unknown.
	    return new Move();
    }
}

