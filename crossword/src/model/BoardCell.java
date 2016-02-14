package model;

/**
 * this class model one BoardCell an atom of a Crossword
 * @author RoguskiA
 * @version 1.0
 *
 */
public class BoardCell {

	private char content; /** content of the cell*/
	private Status status; 
	private Direction d;
	private Place place;
	
	/**
	 * contruct a simple cell of the board
	 * @param content, String a content of the cell
	 * @param status, Status a status of the cell (enabled, disabled)
	 * @param d, Direection, direction of the entry
	 * @param place, 
	 */
	public BoardCell(char content, Status status, Direction d, Place place){
		this.content = content;
		this.status = status;
		this.d = d;
		this.place = place;
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
	
	/** Method used to set the status of the cell*/
	public void setStatus (Status status){
		this.status = status;
	}
	
	/**
	 * 
	 * @return status of the cell
	 */
	public Status getStatus (){
		return this.status;
	}
	
	/** Method used to set direction of the single cell*/
	public void setDirection (Direction d){
		this.d = d;
	}
	
	/**
	 * 
	 * @return direction of the cell
	 */
	public Direction getDirection (){
		return this.d;
	}
	
	/** method used to place of the cell*/
	public void setPlace (Place place){
		this.place = place;
	}
	
	/**
	 * 
	 * @return place of the cell in the word (start, inner or end)
	 */	
	public Place getPlace (){
		return this.place;
	}
	
	public BoardCell copyCell(){
		return new BoardCell(this.content, this.status, this.getDirection(), this.getPlace());
	}
	
}
