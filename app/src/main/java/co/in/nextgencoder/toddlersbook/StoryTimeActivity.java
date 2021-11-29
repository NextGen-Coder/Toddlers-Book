package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

import co.in.nextgencoder.toddlersbook.model.Scene;
import co.in.nextgencoder.toddlersbook.model.Story;
import co.in.nextgencoder.toddlersbook.service.StoryService;
import co.in.nextgencoder.toddlersbook.serviceimpl.StoryServiceImpl;

public class StoryTimeActivity extends AppCompatActivity {

    private ImageView primaryIV;

    private boolean isRunning = false;
    private int index = 0;
    private static Story story;
    private MediaPlayer mediaPlayer;

    private StoryService storyService = new StoryServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_time);

        primaryIV = findViewById( R.id.primaryImage);

        int storyId = getIntent().getIntExtra( "storyId", 0);

        story = storyService.getStoryScenes( this, storyId);

        initializeResources();
    }

    private void initializeResources() {
        primaryIV.setImageResource( story.getScenes().get( index).getImageId());
        playSound();
    }

    public void playSound() {
        mediaPlayer = MediaPlayer.create( this, story.getScenes().get( index).getSoundId());
        mediaPlayer.start();
    }

    public void prevChapter(View view) {
        mediaPlayer.stop();
        --index;
        if( index >= 0) {
            initializeResources();
        } else {
            index = 0;
        }
    }

    public void nextChapter(View view) {
        mediaPlayer.stop();
        ++index;
        if( index < story.getScenes().size()) {
            initializeResources();
        } else {
            index = story.getScenes().size()-1;
        }
    }
}