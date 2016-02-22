package model;

/**
 * this class model one BoardCell an atom of a Crossword
 * @author RoguskiA
 * @version 1.0
 *
 */
public class BoardCell {

	private char content; /** content of the cell*/

	
	public static final int HORIZONTAL = 0;
	public static final int VERTICAL = 1;
	public static final int BEGINING = 0;
	public static final int IN = 1;
	public static final int END = 2;
	
	private Boolean [][] abilities; //2D array describing possible placement and direction in which single 
	//cell could be used. First row descirbes possible placement in horizontal direction. 
	//The second one describes all possible placements in vertical directions
	
	/**
	 * contruct a simple cell of the board
	 * @param content, String a content of the cell
	 * @param status, Status a status of the cell (enabled, disabled)
	 * @param d, Direection, direction of the entry
	 * @param place, 
	 */
	public BoardCell(char content){
		this.content = content;
		this.abilities = new Boolean [2] [3];
		for (int row = 0; row < 2; row ++)
			for( int column =0; column < 3; column ++)
				abilities [row] [column] = true;
	}

	
	/** Method used to set the content of single cell*/
	public void setConntent(char content) {
		this.content = content;
	}
	
	/**
	 * 
	 * @return content of the single cell
	 */
	public char getContent(){
		return this.content;
	}
	
	public Boolean [] [] getAbilities(){
		return abilities;
	}
	
	public void setAbilities (int row, int column, Boolean value){
		abilities [row] [column] = value;
	}
	
	public Boolean [] [] getAbilities (int row, int column, Boolean value){
		return abilities;
	}
	
	public void setAbilitiesMatrix (Boolean [] [] abilities){
		this.abilities = abilities;
	}
	
	public BoardCell copyCell(){
		BoardCell result = new BoardCell(this.content);
		result.abilities = this.abilities;
		return result;
	}
	
}
