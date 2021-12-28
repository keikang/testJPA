package com.example.demo.nhCard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.nhCard.data.entity.QuestionReply;
import com.example.demo.nhCard.repository.QuestionReplyRepository;

@Service
@Transactional
public class QuestionReplyService {
	
	@Autowired
	QuestionReplyRepository questionReplyRepository;
	
	public List<QuestionReply> questionReplyList(){

		return questionReplyRepository.findAll();
		
	}
}
