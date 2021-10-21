package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Class2AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class2_animals);
    }

    public void goToArialAnimal(View view) {

        Intent intent = new Intent(getApplicationContext(), PSNActivity.class);
        intent.putExtra( "topicName", "Arial");
        startActivity(intent);

    }

    public void goToDomesticAnimal(View view) {
        Intent intent = new Intent(getApplicationContext(), PSNActivity.class);
        intent.putExtra( "topicName", "Domestic");
        startActivity(intent);
    }

    public void goToAquaticAnimal(View view) {
        Intent intent = new Intent(getApplicationContext(), PSNActivity.class);
        intent.putExtra( "topicName", "Aquatic");
        startActivity(intent);
    }

    public void goToWildAnimals(View view) {
        Intent intent = new Intent(getApplicationContext(), PSNActivity.class);
        intent.putExtra( "topicName", "Wild");
        startActivity(intent);
    }
}