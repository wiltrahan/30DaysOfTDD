package wil.code;

public class StringUtils {
	
	public int findNumberOfOccurences(String sentence, char characterToScanFor) {
		
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
