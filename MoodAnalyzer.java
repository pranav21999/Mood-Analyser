package moodanalyzer;

public class MoodAnalyzer {
	private String message;

	// Constructor
	public MoodAnalyzer() {
	}

	// getter method to access private variable
	public String getMessage() {
		return message;
	}

	// paramerterised Constructor
	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}

	public String analyseMood() {
		try {
			/*
			 * if (message == null) return null;
			 */
			if (message.contains("Sad") || message.contains("SAD"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			// return "Happy";
			throw new NullPointerException("Invalid msg");
		}
	}
