package moodanalyzer;

public class MoodAnalyser {
	private String message;

	// Constructor without parameter
	public MoodAnalyser() {
	}

	// Constructor with parameter
	public MoodAnalyser(String message) {
		this.message = message;
	}

	// getter method to access private variable
	public String getMessage() {
		return message;
	}

	/*
	 * Handle Exception using try_catch block if User enter NULL data
	 */
	public String analyseMood() {
		try {
			if (message.contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException npe) {//handle Exception
				return "Happy";

		}
	}
}
