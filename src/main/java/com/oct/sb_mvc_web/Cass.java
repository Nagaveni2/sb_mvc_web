package com.oct.sb_mvc_web;

public class Cass {
public Cass() {
		super();
		// TODO Auto-generated constructor stub
	}
public Cass(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
private int id;
private String name;
private String author;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}

}
