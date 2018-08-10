package wil.code;

public class StringUtils {
	
	public int findNumberOfOccurences(String sentence, char characterToScanFor) {
		
		if(Character.isLetter(characterToScanFor) == false) {
			throw new IllegalArgumentException("characterToScanFor must be a char");
		}
		
		char[] stringToCheckAsCharArray = sentence.toCharArray();
		int numOfOccurences = 0;
		
		for(char letter : stringToCheckAsCharArray) {
			if(letter == characterToScanFor) {
				numOfOccurences++;
			}
		}		
		return numOfOccurences;
	}

}
