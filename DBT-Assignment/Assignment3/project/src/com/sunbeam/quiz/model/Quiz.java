package com.sunbeam.quiz.model;

public class Quiz 
{
  public int id;
  public String title;
  public int creatorid;
  
  public Quiz()
  {
	   super();
  }
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getCreatorid() {
	return creatorid;
}
public void setCreatorid(int creatorid) {
	this.creatorid = creatorid;
}

@Override
public String toString() {
	return "Quiz [id=" + id + ", title=" + title + ", creatorid=" + creatorid + "]";
}
  
}
