package openClosed;

public class InterviewQuestionProcessor {

	public static void process(InterviewQuestion question) {
		//This is a typical implementation of the loosely coupled system
		//This class knows nothing about the question and its type!
		//THIS IS PURE ABSTRACTION
		question.execute();
	}
}
