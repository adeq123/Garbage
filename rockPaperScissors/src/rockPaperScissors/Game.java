package rockPaperScissors;

public class Game {

	public Parser parser;
	public Command cmd;

	public Game() {
		parser = new Parser();
		cmd = new Command ();
	}

	protected void welcome() {
	    System.out.println("Welcome to our little game :-D");
	}

	private void printHelp() {
	    System.out.println("");
	    System.out.println("All the valid moves and commands: ");
	    cmd.showCommands();
	}

	private Move computerMove() {
	    return cmd.newRandomMove();
	}

	private void printWinner(int who) {
	    
	    if (who == Command.TIE)
	        System.out.println("It is a tie\n");
	    else if (who == Command.WIN)
	        System.out.println("You won!!! :-D \n");
	    else
	        System.out.println("You lose!!! :-( \n");
	}

	private void printMoves(Move player, Move computer) {
	    System.out.println("And the movements were...");
	    System.out.println("Your move: "+ player.getMove());
	    System.out.println("PC   move: "+ computer.getMove());
	}

	private boolean processMove(Move move) {
	    Move pcMove;
	
	    if (move.isUnknown()){
	        System.out.println("Command Unknown");
	        printHelp();
	        return true;
	    }
	
	    if (move.getMove().equals("QUIT")){
	        return false;
	    }
	
	    if (move.getMove().equals("HELP")){
	        printHelp();
	        return true;
	    }
	    pcMove = computerMove();
	    printMoves(move, pcMove);
	    printWinner(move.beats(pcMove));
	    return true;
	}

	public void playGame() {
	
	    boolean continuing = true;
	    Move move;
	    int round = 1;
	    while (continuing){
	        System.out.println("****** "+ round + " round ******");
	        move = parser.getMove();
	        continuing = processMove(move);
	        round++;
	    }
	    System.out.println("BYE!!");
	}

}