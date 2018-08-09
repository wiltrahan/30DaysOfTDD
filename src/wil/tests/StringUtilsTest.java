package wil.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import wil.code.StringUtils;

public class StringUtilsTest {

	@Test
	public void shouldBeAbleToCountNumberOfLettersInSimpleSentence() {
		StringUtils stringUtils = new StringUtils();
		String sentenceToScan = "TDD is awesome";
		char characterToScanFor = 'e';
		int result = stringUtils.findNumberOfOccurences(sentenceToScan, characterToScanFor);
		
		assertEquals(result, 2);
	}
	
	@Test
	public void shouldBeAbleToCountNumberOfLettersInAComplexString() {
		StringUtils stringUtils = new StringUtils();
		String sentenceToScan = "Once is unique, twice is a coincidence, three times is a pattern.";
		char characterToScanFor = 'e';
		int result = stringUtils.findNumberOfOccurences(sentenceToScan, characterToScanFor);
		
		assertEquals(result, 9);
	}

}
