package com.yuntu.kid.trend.pojo;

public class Trend {
	private String id;
	private String user;
	private String word;
	private String img;
	private String video;
	private String time;

	public Trend() {
		super();
	}

	public Trend(String id, String user, String word, String img, String video,
			String time) {
		super();
		this.id = id;
		this.user = user;
		this.word = word;
		this.img = img;
		this.video = video;
		this.time = time;
	}

	public Trend(String user, String word, String img, String video, String time) {
		super();
		this.user = user;
		this.word = word;
		this.img = img;
		this.video = video;
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
