package moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	
	/*refacor use case(Repete usecase1.1)
	*passing String(I am Sad)  in Constructor
	*/
	@Test
	public void givenMessage_whenSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am sad");
		String actual = moodAnalyzer.analyseMood();
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
	/*refacor use case(Repeat UC1.2)
	*passing String(I am Happy)  in Constructor
	*/
	
	@Test
	public void givenMessage_whenHappy_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Happy");
		String actual = moodAnalyzer.analyseMood();
		String expected = "HAPPY";
		Assert.assertEquals(expected, actual);
	}
