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
    private int index = 0;
    private Course course;

    TopicService topicService = new TopicServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdnactivity);

        primaryIV = findViewById( R.id.primaryImage);
        secondaryIV = findViewById( R.id.secondaryImage);

        String topicName = getIntent().getStringExtra( "topicName");

        if( topicName.equals( "ABC"))
            course = topicService.getClass1ABC( this, getPackageName());

        if( topicName.equals( "abc"))
            course = topicService.getClass1abc( this, getPackageName());

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
        --index;
        if( index >= 0) {
            setImages();
        } else {
            index = 0;
        }
    }

    public void nextImage(View view) {
        ++index;
        if( index < course.getSize()) {
            setImages();
        } else {
            index = course.getSize()-1;
        }
    }
}