package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import co.in.nextgencoder.toddlersbook.model.Course;
import co.in.nextgencoder.toddlersbook.service.TopicService;
import co.in.nextgencoder.toddlersbook.serviceimpl.TopicServiceImpl;

public class PSNActivity extends AppCompatActivity {

    private ImageView primaryIV;

    private boolean isRunning = false;
    private int index = 0;
    private Course course;

    TopicService topicService = new TopicServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psn);

        primaryIV = findViewById( R.id.primaryImage);

        String topicName = getIntent().getStringExtra( "topicName");

        if( topicName.equals( "Fruits"))
            course = topicService.getClass2Fruits( this, getPackageName());

        if( topicName.equals( "Veggies"))
            course = topicService.getClass2Vegies( this, getPackageName());

        if( topicName.equals( "Shapes"))
            course = topicService.getClass2Shapes( this, getPackageName());

        if( topicName.equals( "Arial"))
            course = topicService.getClass2Arial( this, getPackageName());

        if( topicName.equals( "Domestic"))
            course = topicService.getClass2Domestic( this, getPackageName());

        if( topicName.equals( "Aquatic"))
            course = topicService.getClass2Aquatic( this, getPackageName());

        if( topicName.equals( "Wild"))
            course = topicService.getClass2Wild( this, getPackageName());

        if( topicName.equals( "Color"))
            course = topicService.getClass2Colors( this, getPackageName());

        if( topicName.equals( "123"))
            course = topicService.getClass1Num( this, getPackageName());

        setImages();
    }

    private void setImages() {
        primaryIV.setImageResource( course.getTopics().get( index).getPrimaryImageResId());
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

    public void goToSketchbook(View view) {
        int id = course.getTopics().get( index).getPrimaryImageResId();

        Intent intent = new Intent( this, ExpectedCanvasActivity.class);
        intent.putExtra( "resId", id);
        startActivity( intent);

    }
}