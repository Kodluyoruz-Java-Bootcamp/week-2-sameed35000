package org.example;

import java.util.List;

public class Blog {
	private String title;
	private String content;
	private User author;
	private List<Tag> tags;
	private boolean isDraft;

	public Blog(String title, String content, User author, List<Tag> tags) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.tags = tags;
	}

	// Blog'u yayınla
	public void publish() {
		// Yayınla işlemleri burada yapılacak
	}

	// Blog'u sil
	public void delete() {
		// Silme işlemleri burada yapılacak
	}

	// Blog'u taslak olarak kaydet
	public void saveAsDraft() {
		// Taslak olarak kaydetme işlemleri burada yapılacak
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public boolean isDraft() {
		return isDraft;
	}

	public void setDraft(boolean isDraft) {
		this.isDraft = isDraft;
	}

}
