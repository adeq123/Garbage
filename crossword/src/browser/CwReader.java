package browser;

import java.io.*;
import java.util.*;
import model.*;

public class CwReader implements Reader{

	File folderWithCWs;
	LinkedList <Crossword> CwList = new LinkedList<Crossword>();
	
	public CwReader(String folderPath){
		this.folderWithCWs = new File(folderPath);
	}
	
	public LinkedList <String> loadSingleCWToList(File oneFilePath) throws IOException{
		String word;
		LinkedList <String> listWithWords = new LinkedList <String> ();
		BufferedReader czytaj = new BufferedReader(new FileReader(oneFilePath.getAbsolutePath()));
		while(((word = czytaj.readLine()) != null)){ //&& ((clue = czytaj.readLine()) != null)){	
			
			listWithWords.add(word);
		}
		czytaj.close();
		return listWithWords;
	}
	
	public void loadAllCwsToList() throws NumberFormatException, IOException {
		
		
		LinkedList <String> listWithWords;
		File [] filesPathsArray = folderWithCWs.listFiles();
		for(File oneFilePath:filesPathsArray){	
			listWithWords= loadSingleCWToList(oneFilePath);
			CwList.add(new Crossword(listWithWords.size(), listWithWords.getLast().length()
					,Long.valueOf(oneFilePath.getName()), oneFilePath));
			}
		}
		
	@Override
	public void setFolder(String folderPath) {
		this.folderWithCWs = new File(folderPath);
		
	}

	@Override
	public LinkedList <Crossword> getAllCws() {
		return CwList;
		
	}

	
	
	
}
