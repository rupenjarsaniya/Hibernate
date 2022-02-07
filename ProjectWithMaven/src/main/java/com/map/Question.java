package com.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//One to One:- Only one column attach, which have @Id annotation in Answer table
//One to Many:- One Quetion has Many answers

@Entity
public class Question {
	
//	=======================================One to one========================================
//	@Id
//	@Column(name="question_id")
//	private int questionId;
//	private String question;
//	
//	@OneToOne 
//	@JoinColumn(name="a_id")
//	private Answer answer;
//	
//	
//	public Question(int questionId, String question) {
//		super();
//		this.questionId = questionId;
//		this.question = question;
//	}
//	
//	
//	public Question() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	
//	public int getQuestionId() {
//		return questionId;
//	}
//	
//	public void setQuestionId(int questionId) {
//		this.questionId = questionId;
//	}
//	
//	public String getQuestion() {
//		return question;
//	}
//	
//	public void setQuestion(String question) {
//		this.question = question;
//	}
//
//	public Answer getAnswer() {
//		return answer;
//	}
//
//	public void setAnswer(Answer answer_) {
//		this.answer = answer;
//	}

//	=======================================END One to one========================================
	
	
	
	

//	=======================================One to many========================================
	@Id
	@Column(name="question_id")
	private int questionId;
	private String question;
	
	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Answer> answer;
	
	
	public Question(int questionId, String question) {
		super();
		this.questionId = questionId;
		this.question = question;
	}
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

//	=======================================END One to many========================================

}
