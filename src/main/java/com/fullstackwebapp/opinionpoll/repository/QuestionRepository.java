package com.fullstackwebapp.opinionpoll.repository;

import com.fullstackwebapp.opinionpoll.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
