package com.sunbeam.quiz.model;

public class Question 
{
   public int id;
   public int quizid;
   public String text;
   public String a;
   public String b;
   public String c;
   public String d;
   public char correct;
   
   public Question()
   {
	   super();
   }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getQuizid() {
	return quizid;
}

public void setQuizid(int quizid) {
	this.quizid = quizid;
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

public String getA() {
	return a;
}

public void setA(String a) {
	this.a = a;
}

public String getB() {
	return b;
}

public void setB(String b) {
	this.b = b;
}

public String getC() {
	return c;
}

public void setC(String c) {
	this.c = c;
}

public String getD() {
	return d;
}

public void setD(String d) {
	this.d = d;
}

public char getCorrect() {
	return correct;
}

public void setCorrect(char correct) {
	this.correct = correct;
}

@Override
public String toString() {
	return "Question [id=" + id + ", quizid=" + quizid + ", text=" + text + ", a=" + a + ", b=" + b + ", c=" + c
			+ ", d=" + d + ", correct=" + correct + "]";
}
   
   
}
