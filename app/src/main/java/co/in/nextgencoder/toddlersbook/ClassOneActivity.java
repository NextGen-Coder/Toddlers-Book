package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClassOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_one);
    }

    public void goToUpperAlphaActivity(View view) {
        Intent intent = new Intent(getApplicationContext(),PDNActivity.class);
        intent.putExtra( "topicName", "ABC");
        startActivity(intent);
    }

    public void goToLowerAlphaActivity(View view) {
        Intent intent = new Intent(getApplicationContext(),PDNActivity.class);
        intent.putExtra( "topicName", "abc");
        startActivity(intent);
    }

    public void goToNumActivity(View view) {
        Intent intent = new Intent(getApplicationContext(),PSNActivity.class);
        intent.putExtra( "topicName", "123");
        startActivity(intent);
    }
}