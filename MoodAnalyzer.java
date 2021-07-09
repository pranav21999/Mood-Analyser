package moodanalyzer;

public class MoodAnalyzer {
		//condition of check  Analyser
		public String analyseMood(String message) {
			if (message == null)
				return null;
			if (message.contains("Sad") || message.contains("SAD"))
				return "SAD";
			if (message.contains("Angry"))
				return "ANGRY";
			return "HAPPY";
		}
	}
