package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

import co.in.nextgencoder.toddlersbook.model.Course;
import co.in.nextgencoder.toddlersbook.model.Topic;
import co.in.nextgencoder.toddlersbook.service.TopicService;
import co.in.nextgencoder.toddlersbook.serviceimpl.TopicServiceImpl;

public class PDNActivity extends AppCompatActivity {

    private static boolean isRunning = false;
    private static int index = 0;
    private Course course;

    TopicService topicService = new TopicServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdnactivity);

        course = topicService.getClass1ABC( this, getPackageName());
    }

    public void playSound(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create( this, course.getTopics().get(index).getPrimarySoundResId());

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
    }

    public void nextImage(View view) {
        if( index < course.getTopics().size()) {
            index++;
        }
    }
}