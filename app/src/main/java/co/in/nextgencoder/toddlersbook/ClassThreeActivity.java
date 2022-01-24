package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClassThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_three);
    }


    public void goToGameQuizActivity(View view) {
        Intent intent = new Intent(getApplicationContext(),GameQuizActivity.class);
        startActivity(intent);
    }

    public void goToFlipCardActivity(View view) {
        Intent intent = new Intent(getApplicationContext(),FlipCardGame.class);
        startActivity(intent);
    }
}