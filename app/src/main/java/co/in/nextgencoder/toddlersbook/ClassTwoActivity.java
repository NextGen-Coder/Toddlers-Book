package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClassTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_two);
    }

    public void goToFruits(View view) {
        Intent intent = new Intent(getApplicationContext(), PSNActivity.class);
        intent.putExtra( "topicName", "Fruits");
        startActivity(intent);
    }

    public void goToVegitables(View view) {
        Intent intent = new Intent(getApplicationContext(), PSNActivity.class);
        intent.putExtra( "topicName", "Veggies");
        startActivity(intent);
    }

    public void goToShapes(View view) {
        Intent intent = new Intent(getApplicationContext(), PSNActivity.class);
        intent.putExtra( "topicName", "Shapes");
        startActivity(intent);
    }

    public void goToAnimals(View view) {
        Intent intent = new Intent(getApplicationContext(), Class2AnimalsActivity.class);
        startActivity(intent);

    }


    public void goToBodyparts(View view) {
        Intent intent = new Intent(getApplicationContext(), BodyPartsActivity.class);
        startActivity(intent);
    }

    public void goToColors(View view) {

        Intent intent = new Intent(getApplicationContext(), PSNActivity.class);
        intent.putExtra( "topicName", "Color");
        startActivity(intent);

    }

    public void goToMatchThePairs(View view) {
    }
}