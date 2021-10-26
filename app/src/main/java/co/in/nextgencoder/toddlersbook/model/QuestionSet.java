package co.in.nextgencoder.toddlersbook.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionSet {
    
    private List<Question> questions;
    private int size;

    public QuestionSet() { }

    public QuestionSet( int size) {
        questions = new ArrayList<>();
        this.size = size;
    }

    public QuestionSet( List<Question> questions, int size) {
        this.questions = questions;
        this.size = size;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Course{" +
                ", questions=" + questions +
                '}';
    }
}
