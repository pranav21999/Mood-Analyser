package moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	
	//(uc1.1)return sad 
	@Test
	public void givenMessage_whenSad_ShouldReturnSad() {
		// MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am sad");
		String actual = moodAnalyzer.analyseMood();

		// String actual = moodAnalyzer.analyseMood("I am Sad");
		String expected = "SAD";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void givenMessage_whenSAD_ShouldReturnSAD() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am SAD");
		String actual = moodAnalyzer.analyseMood();
		String expected = "SAD";
		Assert.assertEquals(expected, actual);
	}
	
	//(uc1.2)return  happy 
	@Test
	public void givenMessage_whenHappy_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
		String actual = moodAnalyzer.analyseMood();
		String expected = "HAPPY";
		Assert.assertEquals(expected, actual);
	}



