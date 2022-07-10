package entities;

public class Task extends Lesson {

	String description;
	int questionCount;

	public Task() {
		super();
	}

	public Task(String titles, String description, int questionCount) {
		super(titles);
		this.description = description;
		this.questionCount = questionCount;
	}

	public String getDescription() {
		return description;
	}

	public int getQuestionCount() {
		return questionCount;
	}

	@Override
	public int duration() {
		return questionCount * 5 * 60;
	}

}
