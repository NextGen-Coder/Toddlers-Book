package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

public class GameQuizActivity extends AppCompatActivity {

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_quiz);
        myDialog = new Dialog(this);
    }


    public void option0Clicked(View view) {

        myDialog.setContentView(R.layout.correct);
        myDialog.show();

    }

    public void option1Clicked(View view) {

        myDialog.setContentView(R.layout.wrong);
        myDialog.show();

    }

    public void option2Clicked(View view) {

        myDialog.setContentView(R.layout.wrong);
        myDialog.show();

    }

    public void option3Clicked(View view) {
        myDialog.setContentView(R.layout.wrong);
        myDialog.show();
    }
}