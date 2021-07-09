package moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	/*
	 * UC1-TC1.1 return sad if given Msg:"I am sad"
	 */
	@Test
	public void givenMessage_whenSad_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Sad");
		String actual = moodAnalyzer.analyseMood();
		String expected = "SAD";
		Assert.assertEquals(expected, actual);
	}
	/*
	 * UC1-TC1.1(Repeat) return SAD if given Msg:"I am SAD" Refactor :pass String
	 * using constructor
	 */

	@Test
	public void givenMessage_whenSAD_ShouldReturnSAD() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am SAD");
		String actual = moodAnalyzer.analyseMood();
		String expected = "SAD";
		Assert.assertEquals(expected, actual);
	}
	/*
	 * UC1-TC1.2(Repeat) return Happy if given Msg:"I am happy" Refactor :pass
	 * String using constructor
	 */

	@Test
	public void givenMessage_whenHappy_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Happy");
		String actual = moodAnalyzer.analyseMood();
		String expected = "HAPPY";
		Assert.assertEquals(expected, actual);
	}

	/*
	 * UC3-TC3.1 return Happy if given String :NULL Refactor :pass String using
	 * constructor
	 */
	@Test
	public void givenMessage_whenNull_ShouldThrowMoodAnalysisException() {
		try {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
			moodAnalyzer.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
	}

	/*
	 * UC3-TC3.2 return Happy if given String :" " Refactor :pass String using
	 * constructor
	 */
	@Test
	public void givenMessage_whenEmpty_ShouldThrowMoodAnalysisException() {
		try {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
			moodAnalyzer.analyseMood();
		} catch (MoodAnalysisException e) {
			System.out.println("here");
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
		}
	}
}
