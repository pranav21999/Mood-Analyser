package moodanalyzer;

public class MoodAnalysisException extends Exception {

	public String message;
	//throw exception in the method AnalyzeMood
	public ExceptionType exceptionType;

	/*
	 * TC 3.2 use Enum for check Empty or NULL
	 */
	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY;
	}

	public MoodAnalysisException(String message, ExceptionType type) {
		this.message = message;
		this.exceptionType = type;
	}
}