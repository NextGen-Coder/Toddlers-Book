package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class FlipCardGame extends AppCompatActivity {

    ImageView curView = null;
    private int countPair = 0;
    final int[] drawable = new int[] { R.drawable.card_0, R.drawable.card_1,
            R.drawable.card_2, R.drawable.card_3, R.drawable.card_4,
            R.drawable.card_5, R.drawable.card_6,R.drawable.card_7};

    int[] pos = {0,1,2,3,4,5,6,7,0,1,2,3,4,5,6,7};
    int currentPos = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_card_game);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        ImageAdapter imageAdapter = new ImageAdapter(this);
        gridView.setAdapter(imageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (currentPos<0){
                   currentPos = position;
                   curView = (ImageView) view;
                   ((ImageView)view).setImageResource(drawable[pos[position]]);
               }
               else{

                   if(currentPos == position){
                       ((ImageView)view).setImageResource(R.drawable.question_mark1);
                   }
                   else if(pos[currentPos] != pos[position]){
                       curView.setImageResource(R.drawable.question_mark1);
                   }
                   else {
                       ( (ImageView)view).setImageResource(drawable[pos[position]]);
                       countPair++;

                       if(countPair == 0){
                           Toast.makeText(getApplicationContext(), "You win", Toast.LENGTH_SHORT).show();
                       }
                   }
                   currentPos = -1;
               }
            }
        });
    }
}