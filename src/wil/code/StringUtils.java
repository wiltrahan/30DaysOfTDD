package wil.code;

public class StringUtils {
	
	public int findNumberOfOccurences(String sentence, char characterToScanFor) {
		
		try {
			char[] stringToCheckAsCharArray = sentence.toCharArray();
			int numOfOccurences = 0;
			
			for(char letter : stringToCheckAsCharArray) {
				if(letter == characterToScanFor) {
					numOfOccurences++;
				}
			}		
			return numOfOccurences;
			
		}
		catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Must pass a char as second arg: " + e.getMessage());
		}		
	}

}
