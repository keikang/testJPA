package com.example.demo.nhCard;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.nhCard.data.entity.Board;
import com.example.demo.nhCard.data.entity.QuestionReply;
import com.example.demo.nhCard.service.QuestionReplyService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1/questionReply")
public class QuestionReplyController {
	
	@Autowired
	QuestionReplyService quesReplyService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<QuestionReply> getQuestionReplyList(){
		
		/*
		 * for (QuestionReply questionReply : quesReplyService.questionReplyList()) {
		 * System.err.println("QuestionReplyController : "+questionReply); }
		 */
		
		return quesReplyService.questionReplyList();
	}
	
	@RequestMapping(value = "/makeList", method = RequestMethod.GET)
	public List<Board> getMakeList(){
		Board board = new Board();
		board.setRnum(1);
		board.setTitle("질문제목1");
		board.setContent("질문내용1");
		List<Board> boardList = new ArrayList<Board>();
		boardList.add(board);
		
		return boardList;
	}
}
