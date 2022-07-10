package entities;

import java.util.List;

public class Video extends Lesson {

	String url;
	int seconds;

	public Video() {
		super();
	}

	public Video(String titles, String url, int seconds) {
		super(titles);
		this.url = url;
		this.seconds = seconds;
	}

	public String getUrl() {
		return url;
	}

	public int getSeconds() {
		return seconds;
	}

	@Override
	public int duration() {
		return seconds;
	}

}
