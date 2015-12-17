package cw4;
public class ROT11 implements Algorithm{
	
	public static char [] alphabet ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
		'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	public static int jump = 11;
	
	@Override
	public String crypt (String word) {
		
		String result = "";
		for(int i=0; i < word.length(); i++){
			for(int j = 0; j < alphabet.length; j++)
			if(alphabet [j] == word.charAt(i)){	
				if(alphabet.length - (j+jump) >= 0){
				result =result+alphabet[j + jump];
			}else{
				result =result+alphabet[java.lang.Math.abs(alphabet.length - (j+jump))];
				}
				break;
			}
		}
		return result;
	}

	@Override
	public String decrypt(String word) {
		
		String result = "";
		for(int i=0; i < word.length(); i++){
			for(int j = 0; j < alphabet.length; j++)
			if(alphabet [j] == word.charAt(i)){
				if(j - jump>=0){
				result =result+alphabet[j - jump];
				}else{
					result =result+alphabet[alphabet.length+(j - jump)];
				}
				break;
			}
		}
		return result;
		
	} 

}
