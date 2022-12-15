package org.example;

import java.util.List;
import java.util.ArrayList;

public class User {
	private String username;
	private String password;
	private List<User> followers;
	private List<User> following;
	private List<Blog> blogs;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.followers = new ArrayList<>();
		this.following = new ArrayList<>();
		this.blogs = new ArrayList<>();
	}

	public void follow(User user) {
		this.following.add(user);
		user.followers.add(this);
	}

	public void unfollow(User user) {
		this.following.remove(user);
		user.followers.remove(this);
	}

	public List<Blog> getBlogs() {
		return this.blogs;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<User> getFollowers() {
		return followers;
	}

	public void setFollowers(List<User> followers) {
		this.followers = followers;
	}

	public List<User> getFollowing() {
		return following;
	}

	public void setFollowing(List<User> following) {
		this.following = following;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

}
