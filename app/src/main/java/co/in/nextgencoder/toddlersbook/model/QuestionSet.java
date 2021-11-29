package co.in.nextgencoder.toddlersbook.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionSet {
    
    private List<Question> questions;

    public QuestionSet() { }

    public QuestionSet( List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getSize() {
        return questions.size();
    }

    @Override
    public String toString() {
        return "Course{" +
                ", questions=" + questions +
                '}';
    }
}
