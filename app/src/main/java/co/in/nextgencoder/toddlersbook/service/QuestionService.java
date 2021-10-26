package co.in.nextgencoder.toddlersbook.service;

import co.in.nextgencoder.toddlersbook.GameQuizActivity;
import co.in.nextgencoder.toddlersbook.model.Question;

public interface QuestionService {

        public Question getQuestions(GameQuizActivity gameQuizActivity);
}
