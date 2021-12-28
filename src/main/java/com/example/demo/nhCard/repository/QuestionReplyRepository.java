package com.example.demo.nhCard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.nhCard.data.entity.QuestionReply;

@Repository
public interface QuestionReplyRepository extends JpaRepository<QuestionReply, Integer> {

}
