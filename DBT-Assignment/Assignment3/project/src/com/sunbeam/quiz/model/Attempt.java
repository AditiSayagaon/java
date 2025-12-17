package com.sunbeam.quiz.model;

import java.time.LocalDateTime;
public class Attempt
{
	public int id;
	 public int quizid;
	 public int studentid;
	 public int score;
	 public int total;
	 public LocalDateTime attemptTime;
	 
	  public Attempt()
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

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public LocalDateTime getAttemptTime() {
		return attemptTime;
	}

	public void setAttemptTime(LocalDateTime attemptTime) {
		this.attemptTime = attemptTime;
	}

	@Override
	public String toString() {
		return "Attempt [id=" + id + ", quizid=" + quizid + ", studentid=" + studentid + ", score=" + score + ", total="
				+ total + ", attemptTime=" + attemptTime + "]";
	}
	  
	  
}