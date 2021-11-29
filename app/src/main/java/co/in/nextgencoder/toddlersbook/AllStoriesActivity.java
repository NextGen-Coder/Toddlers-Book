package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AllStoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_stories);
    }

    public void firstStory(View view) {
        Intent intent = new Intent( this, StoryTimeActivity.class);
        intent.putExtra( "storyId", 1);
        startActivity( intent);
    }

    public void secondStory(View view) {
        Intent intent = new Intent( this, StoryTimeActivity.class);
        intent.putExtra( "storyId", 2);
        startActivity( intent);
    }
}