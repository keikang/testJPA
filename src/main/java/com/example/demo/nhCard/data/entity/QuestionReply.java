package com.example.demo.nhCard.data.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "QUESTION_REPLY")
@Data
public class QuestionReply implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RNUM")
	private Integer rNum;
	
	@Column(name = "CREATE_DT")
	@CreationTimestamp
	private Timestamp createDt;
	
	
	@Column(name = "CONSULT_ID")
	private String consultId;
	
	@Column(name = "QUESTION_TITLE")
	private String questionTitle;
	
	@Column(name = "REPLY_YN")
	private String replyYn;

	
}
