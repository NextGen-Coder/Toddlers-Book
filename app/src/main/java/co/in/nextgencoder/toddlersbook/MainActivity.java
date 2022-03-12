package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToClassOneActivity(View view) {
        Intent intent = new Intent(getApplicationContext(),ClassOneActivity.class);
        startActivity(intent);
    }

    public void goToClassTwoActivity(View view) {
        Intent intent = new Intent(getApplicationContext(),ClassTwoActivity.class);
        startActivity(intent);
    }

    public void goToClassThreeActivity(View view) {
        Intent intent = new Intent(getApplicationContext(),ClassThreeActivity.class);
        startActivity(intent);
    }

    public void goToCanvas(View view){
        Intent intent = new Intent(getApplicationContext(),CanvasActivity.class);
        startActivity(intent);
    }

    public void goToStory(View view) {
        Intent intent = new Intent(getApplicationContext(),AllStoriesActivity.class);
        startActivity(intent);
    }

    public void goToStory(View view) {
        Intent intent = new Intent(getApplicationContext(), AllStoriesActivity.class);
        startActivity(intent);
    }
}