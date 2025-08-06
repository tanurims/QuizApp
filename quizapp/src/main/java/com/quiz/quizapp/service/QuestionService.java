package com.quiz.quizapp.service;

import com.quiz.quizapp.Question;
import com.quiz.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();

    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Question added successfully";
    }

    public String deleteQuestion(int id) {
        questionDao.deleteById(id);
        return "Question with ID " + id + " has been deleted.";
    }

    public String updateQuestion(Question question) {
        if(questionDao.existsById(question.getId())){
            questionDao.save(question);
            return "Question updated successfully";
        }
        else{
            return "Question with ID " + question.getId() + " does not exist.";
        }
    }
}
