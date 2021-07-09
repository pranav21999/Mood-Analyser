package moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

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

	@Test
	public void givenMessage_whenHappy_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Happy");
		String actual = moodAnalyzer.analyseMood();
		String expected = "HAPPY";
		Assert.assertEquals(expected, actual);
	}

	/*UC2.2
	 * Given Null mood Should return Happy
	 */
	@Test
	public void givenMessage_whenNull_ShouldReturnNull() {
		String expected = "Happy";
		try {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
			moodAnalyzer.analyseMood();
		} catch (NullPointerException e) {
			Assert.assertEquals(expected,e.getMessage());
		}
	}

}
