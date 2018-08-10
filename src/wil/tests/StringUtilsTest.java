package wil.tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import wil.code.StringUtils;

public class StringUtilsTest {
	
	private static StringUtils _stringUtils;
	
	@BeforeClass
	public static void setUpStringUtilTests() {
		_stringUtils = new StringUtils();
	}

	@Test
	public void shouldBeAbleToCountNumberOfLettersInSimpleSentence() {
		String sentenceToScan = "TDD is awesome";
		char characterToScanFor = 'e';
		int result = _stringUtils.findNumberOfOccurences(sentenceToScan, characterToScanFor);
		
		assertEquals(result, 2);
	}
	
	@Test
	public void shouldBeAbleToCountNumberOfLettersInAComplexString() {
		String sentenceToScan = "Once is unique, twice is a coincidence, three times is a pattern.";
		char characterToScanFor = 'e';
		int result = _stringUtils.findNumberOfOccurences(sentenceToScan, characterToScanFor);
		
		assertEquals(result, 9);
	}

}
