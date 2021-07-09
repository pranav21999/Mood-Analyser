package moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

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

