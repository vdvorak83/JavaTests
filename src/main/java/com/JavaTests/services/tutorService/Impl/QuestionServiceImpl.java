package com.JavaTests.services.tutorService.Impl;

import com.JavaTests.entity.Question;
import com.JavaTests.repository.QuestionRepository;
import com.JavaTests.services.tutorService.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Transactional
    public void addQuestion(Question question) {
        questionRepository.save(question);
    }

    @Transactional
    public Question findByDescription(String description) {
        return questionRepository.findByDescription(description);
    }

    @Transactional
    public List<Question> getQuestions() {
        List<Question> questionList = new ArrayList<>();
        Iterator<Question> iterator = questionRepository.findAll().iterator();
        while(iterator.hasNext())
            questionList.add(iterator.next());
        return questionList;
    }

   /* @Transactional
    public Question editQuestion(Question question) {
        Question questionToupdate = new Test(question.getId(), question.getDescription(), question.getTest(), question.getListAnswer());
        questionRepository.save(questionToupdate);
        return questionToupdate;
    }*/
}
