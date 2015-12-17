/**
 * this class model a simple corssword
 * 
 * @author RoguskiA
 * @version 1.0
 */
package model;

import java.util.*;

import dictionary.InteliCwDB;

public class Crossword {

	private LinkedList<CwEntry> entries; /**List of entries USED on the board*/
	private Board b; /** board that where corssword is displated*/
	private InteliCwDB cwdb; /** database of entries*/
	private final long ID = -1; /** huj wie co*/

	/**
	 * Construct new crossoword for a given height and widith
	 * @param h height of crossword
	 * @param w widith of crossword
	 */
	public Crossword (int h, int w){
		
		this.b = new Board(h,w);
		
	}
	
	/**
	 * 
	 * @return read only iterator of entries (all entries in the given crossword)
	 */
	public Iterator<CwEntry> getROEntryIter(){
		return Collections.unmodifiableList(entries).iterator();
	}
		
	/**
	 * Method which checks if the given word is a part of the crossword
	 * @param word, String to search for in the crossword
	 * @return boolean indicating if the word is a part of crossword or not
	 */
	public boolean contains(String word){
		boolean result = false;
		for(int i = 0; i <= this.entries.size() || !result; i++) {
			if (entries.get(i).getWord().equals(word)){
				result = true;
			}		
		}
		return result;
	}
	
	/**
	 * Getter method for board object copy
	 * @return Deep copy of the board
	 */
	public Board getBoardCopy(){
		return b.copyBoard();
	}

	/**
	 * Setter method for corsswords database of Entries (word + clues)
	 * @param cwdb, database to be set
	 */
	public void setCwDB(InteliCwDB cwdb){
		this.cwdb = cwdb;
	}
	
	/**
	 * Getter method for corsswords database of Entries (word + clues)
	 */
	public InteliCwDB getCwDB(){
		return this.cwdb;
	}
	
	/**
	 * Method which add new CwEntry (standard entry + posistion and status) to the crossword according to preverd strategy
	 * @param cwe CwEntry to be set
	 * @param s Strategy to be uesed
	 */
	public final void addCwEntry(CwEntry cwe, Strategy s){
		  entries.add(cwe);
		  s.updateBoard(b,cwe);
		}
	/**
	 * to be described...
	 * @param s
	 */
	public final void generate(Strategy s){
		  CwEntry e = null;
		  while((e = s.findEntry(this)) != null){
		    addCwEntry(e,s);
		  }
		}
	
	
}
