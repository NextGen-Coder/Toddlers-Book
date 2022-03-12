package co.in.nextgencoder.toddlersbook.service;

import co.in.nextgencoder.toddlersbook.GameQuizActivity;
import co.in.nextgencoder.toddlersbook.model.QuestionSet;

public interface QuestionService {

        public QuestionSet getQuestions(GameQuizActivity gameQuizActivity, String packageName);
}
