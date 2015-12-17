package cw4;

public class Polibiusz implements Algorithm{

	static final char[][] polibiuszMatrix = 
			{{'A','B','C','D','E'},
			 {'F','G','H','I','K'},
			 {'L','M','N','O','P'},
			 {'Q','R','S','T','U'},
			 {'V','W','X','Y','Z'}};
	
	@Override
	public String crypt(String word) {
		String result = "";
		for(int i=0; i < word.length(); i++){
			for(int j = 0; j < polibiuszMatrix.length; j++) //wiersze
				for(int k = 0; k < polibiuszMatrix [0].length; k++) //kolumny
			if(Character.toUpperCase(word.charAt(i)) == polibiuszMatrix [j] [k] ){	
				result =result+j+k+" ";
				break;
			}
		}
		return result;
		
	}

	@Override
	public String decrypt(String word) {
		
		String result = "";
		while(word.length() != 0){
			 result = result + polibiuszMatrix [Character.getNumericValue(word.charAt(0))] [ Character.getNumericValue(word.charAt(1))];
			 if (word.length() > 3){
				 word = word.substring(3);
			 }else {
				 word = "";
			 }
			 
			}
		
		return result;
	}

}
