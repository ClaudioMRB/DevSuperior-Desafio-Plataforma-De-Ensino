package entities;

public abstract class Lesson {
	
	
	
	String titles;

	public Lesson() {
		
	}

	public Lesson(String titles) {
		
		this.titles = titles;
	}
	
	
	
	public String getTitles() {
		return titles;
	}

	

	public abstract int duration();

	

	

	
	
	
	
	
	

}
