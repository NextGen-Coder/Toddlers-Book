package co.in.nextgencoder.toddlersbook.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import co.in.nextgencoder.toddlersbook.GameQuizActivity;
import co.in.nextgencoder.toddlersbook.R;
import co.in.nextgencoder.toddlersbook.model.Option;
import co.in.nextgencoder.toddlersbook.model.Question;
import co.in.nextgencoder.toddlersbook.model.QuestionSet;
import co.in.nextgencoder.toddlersbook.service.QuestionService;


public class QuestionServiceImpl implements QuestionService {

    public QuestionSet getQuestions(GameQuizActivity gameQuizActivity, String packageNamjue) {
        QuestionSet questionSet = new QuestionSet();

        List<Question> questionList = new ArrayList<>();
        for( int i=0; i<5; i++) {
            Question question = new Question();

            int questionImgResId = gameQuizActivity.getResources().getIdentifier( "question_"+i, "drawable", packageNamjue);
            question.setImageId( questionImgResId);

            List<Option> options = new ArrayList<>();
            options.add(new Option(0, null));
            options.add(new Option(0, null));
            options.add(new Option(0, null));
            options.add(new Option(0, null));

            for( int j=0; j<3; j++) {
                int index = (int) (Math.random()*4);
                while( options.get(index).getCorrect()==null) {
                    index = (int) (Math.random()*4);
                    int optionImgResId = gameQuizActivity.getResources().getIdentifier( "question_"+i+"_option_"+j, "drawable", packageNamjue);
                    options.set(index, new Option(optionImgResId, false));
                }
            }

            int index = (int) (Math.random()*4);
            while( options.get(index).getCorrect()==null) {
                index = (int) (Math.random() * 4);
                int optionImgResId = gameQuizActivity.getResources().getIdentifier( "question_"+i+"_option_c", "drawable", packageNamjue);
                options.add(index, new Option(optionImgResId, true));
                question.setAnswer(index);
            }

            question.setOptions(options);
            questionList.add( question);
        }
        questionSet.setQuestions(questionList);
        return questionSet;
    }

}
