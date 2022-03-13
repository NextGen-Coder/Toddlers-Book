package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

import co.in.nextgencoder.toddlersbook.model.Option;
import co.in.nextgencoder.toddlersbook.model.QuestionSet;
import co.in.nextgencoder.toddlersbook.service.QuestionService;
import co.in.nextgencoder.toddlersbook.serviceimpl.QuestionServiceImpl;

public class GameQuizActivity extends AppCompatActivity {

    Dialog myDialog;

    ImageView questionImageView;
    ImageView option0ImageView, option1ImageView, option2ImageView, option3ImageView;

    private int index = 0;
    QuestionSet questionSet = new QuestionSet();

    private QuestionService questionService = new QuestionServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_quiz);

        myDialog = new Dialog(this);

        questionImageView = findViewById(R.id.questionImage);
        option0ImageView = findViewById(R.id.option0);
        option1ImageView = findViewById(R.id.option1);
        option2ImageView = findViewById(R.id.option2);
        option3ImageView = findViewById(R.id.option3);

        questionSet = questionService.getQuestions(this, getPackageName());
        setImages();
    }

    private void setImages() {
        questionImageView.setImageResource( questionSet.getQuestions().get( index).getImageId());

        option0ImageView.setImageResource( questionSet.getQuestions().get(index).getOptions().get(0).getImageId());
        option1ImageView.setImageResource( questionSet.getQuestions().get(index).getOptions().get(1).getImageId());
        option2ImageView.setImageResource( questionSet.getQuestions().get(index).getOptions().get(2).getImageId());
        option3ImageView.setImageResource( questionSet.getQuestions().get(index).getOptions().get(3).getImageId());
    }

    private void optionSelected( int selectedIndex) {
        if(questionSet.getQuestions().get(index).getAnswer() == selectedIndex) {
            myDialog.setContentView( R.layout.correct);
            if( questionSet.getQuestions().size() != (index+1)) {
                index++;
                setImages();
            } else {
                Intent intent = new Intent( this, ClassThreeActivity.class);
                startActivity( intent);
            }

        } else {
            myDialog.setContentView( R.layout.wrong);
        }
        myDialog.show();
    }

    public void option0Clicked(View view) {
        optionSelected(0);
    }

    public void option1Clicked(View view) {
        optionSelected(1);
    }

    public void option2Clicked(View view) {
        optionSelected(2);
    }

    public void option3Clicked(View view) {
        optionSelected(3);
    }
}