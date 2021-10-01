package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import co.in.nextgencoder.toddlersbook.model.Course;
import co.in.nextgencoder.toddlersbook.service.TopicService;
import co.in.nextgencoder.toddlersbook.serviceimpl.TopicServiceImpl;

public class PDNActivity extends AppCompatActivity {

    private ImageView primaryIV, secondaryIV;

    private boolean isRunning = false;
    private static int index = 0;
    private Course course;

    TopicService topicService = new TopicServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdnactivity);

        primaryIV = findViewById( R.id.primaryImage);
        secondaryIV = findViewById( R.id.secondaryImage);

        course = topicService.getClass1ABC( this, getPackageName());
        setImages();
    }

    private void setImages() {
        primaryIV.setImageResource( course.getTopics().get( index).getPrimaryImageResId());

        secondaryIV.setImageResource( course.getTopics().get( index).getSecondaryImageResId());
    }

    public void playSound(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create( this, course.getTopics().get( index).getPrimarySoundResId());

        if(!isRunning) {
            mediaPlayer.start();
            isRunning = true;
        }

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                isRunning = false;
            }
        });
    }

    public void prevImage(View view) {
        if( index > 0) {
            index--;
        }
        setImages();
    }

    public void nextImage(View view) {
        if( index < course.getTopics().size()) {
            index++;
        }
        setImages();
    }
}