package moodanalyzer;

public class MoodAnalyzer {

	private String message;

	// constructor
	public MoodAnalyzer() {
	}

	// parameterised constructor
	public MoodAnalyzer(String message) {
		this.message = message;
	}

	/*
	 * throws excetion from class MoodAnalysisException using Enum
	 */
	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message == "")
				throw new MoodAnalysisException("Invalid message", MoodAnalysisException.ExceptionType.ENTERED_EMPTY);
			if (message.toLowerCase().contains("sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Invalid message", MoodAnalysisException.ExceptionType.ENTERED_NULL);
		}
	}
}
