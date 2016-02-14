/**
- * This class model a board of a crossword
 * @author RoguskiA
 * @version 1.0
 */
package model;

import java.util.LinkedList;

public class Board {

	private BoardCell [][] board;
	private int w; /** number of rows of the board*/
	private int k; /** number of columns of the board*/
	
	/**
	 * contruct the board with for a given number of columns and rows
	 * @param w number of rows
	 * @param k number of columns
	 */
	public Board (int w, int k){
		
		this.w = w;
		this.k = k;
		board = new BoardCell [w] [k];
		for(int r= 0; r< w; r++)
			for(int c = 0; c < k; c++)
				board [r] [c] =new BoardCell (' ',Status.ENABLED,Direction.HORIZ,Place.INNER);

			
	}
	/**
	 * 
	 * @return number of columns of the board
	 */
	public int getWidth(){
		return this.board [0].length;
	}
	/**
	 * 
	 * @return number of rows of the board 
	 */
	public int getHeight(){
		return this.board.length;
		
	}
	
	/**
	 * Method which returns a cell with a given coordinates
	 * @param x, int x coordinate of the cell
	 * @param y, int y coordinate of the cell
	 * @return cell with a given coordinates
	 */
	public BoardCell getCell(int x, int y){
		return this.board [y] [x];
	}
	
	/**
	 * Method which set a cell to a given coordinates
	 * @param x, int x coordinate of the cell
	 * @param y, int y coordinate of the cell
	 */
	public void setCell(int x, int y, BoardCell c) {
		this.board [y] [x] = c;
	}
	
	/**
	 * 
	 * @return List of all start cells
	 */
	public LinkedList<BoardCell> getStartCells() {
		
		LinkedList startCells = new LinkedList<BoardCell> ();
		
		for(int i=0; i < this.board.length; i++)// wiersze
			for(int j=0; j < this.board[0].length; j++) {//kolumny
				if (board [i] [j].getPlace().ordinal() == 1){
					startCells.add(board [i] [j]);
				}
			}
			
		return startCells;
	}
	
	/**
	 * this method creates a regular expression based on letters between given  coordinates in the board
	 * @param int, fromx x coordinate of the first sign
	 * @param int, fromy y coordinate of the first sign
	 * @param int, tox x coordinate of the last sign
	 * @param int, toy y coordinate of the first sign
	 * @return String, regular expression based on letters between given  coordinates in the board
	 * @throws Exception
	 */
	public String createPattern(int fromx, int fromy, int tox, int toy) throws Exception{
		
		String pattern = "^";
		
		if(fromx == tox){ //vertical
		
			for(int i = fromy; i <= toy; i++){
				pattern += board[i] [fromx];
			}
			
			pattern +="$";
			return pattern;
			
		}else if(fromy == toy){ //horizontal
		
			for(int i = fromx; i <= tox; i++){
				pattern += board[fromy] [i];
			}
			
			pattern +="$";
			return pattern;
		
		}else throw new Exception ("Wrong coordinates the word needs to be either vertical or horizontal!!");
	 
	//return pattern;
}
	 /**
	   * This method makes a deep copy of the board.
	   */
	  public Board copyBoard () {
		  Board result = new Board (this.w,this.k);
		  
		  for(int i = 0;i < board.length; i++) // wiersze
			  for(int j=0; j < board[0].length; j++){//kolumny
				  if(board [i] [j] != null)
				 result.setCell(j, i, board [i] [j].copyCell());
			  }
	  return result;
	  }

	}

