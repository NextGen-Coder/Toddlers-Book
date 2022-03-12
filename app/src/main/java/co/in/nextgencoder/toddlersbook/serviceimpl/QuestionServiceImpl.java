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

    public QuestionSet getQuestions(GameQuizActivity gameQuizActivity, String packageName) {
        QuestionSet questionSet = new QuestionSet();

        List<Question> questionList = new ArrayList<>();
        for( int i=0; i<5; i++) {
            Question question = new Question();

            int questionImgResId = gameQuizActivity.getResources().getIdentifier( "question_"+i, "drawable", packageName);
            question.setImageId( questionImgResId);

            List<Option> options = new ArrayList<>();
            options.add(new Option(0, null));
            options.add(new Option(0, null));
            options.add(new Option(0, null));
            options.add(new Option(0, null));

            while( true) {
                int index = (int) (Math.random() * 4);
                if( options.get(index).getImageId()==0) {
                    int optionImgResId = gameQuizActivity.getResources().getIdentifier("question_" + i + "_option_c", "drawable", packageName);
                    options.set(index, new Option(optionImgResId, true));
                    question.setAnswer(index);
                    break;
                }
            }

            for( int j=0; j<3; j++) {
                while( true) {
                    int index = (int) (Math.random()*4);
                    if( options.get(index).getImageId()==0) {
                        System.out.println("J =====> "+j + " index =======> "+index);
                        int optionImgResId = gameQuizActivity.getResources().getIdentifier( "question_"+i+"_option_"+j, "drawable", packageName);
                        options.set(index, new Option(optionImgResId, false));
                        System.out.println("options =======> "+options);
                        break;
                    }
                }
            }

            question.setOptions(options);
            questionList.add( question);
        }
        questionSet.setQuestions(questionList);
        return questionSet;
    }

}
