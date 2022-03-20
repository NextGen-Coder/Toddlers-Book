package co.in.nextgencoder.toddlersbook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import co.in.nextgencoder.toddlersbook.algorithm.MergeSort;
import co.in.nextgencoder.toddlersbook.model.UniqueNumber;

public class OrderedNumbersActivity extends AppCompatActivity {

    private ImageView randomIV0,randomIV1,randomIV2,randomIV3;
    private ImageView sortedIV0, sortedIV1, sortedIV2, sortedIV3;

    private List<UniqueNumber> randomNumbers = new ArrayList<>();
    private List<UniqueNumber> sortedNumbers = new ArrayList<>();

    Dialog myDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordered_numbers);

        myDialog = new Dialog(this);
        randomIV0 = findViewById( R.id.randomIV0);
        randomIV1 = findViewById( R.id.randomIV1);
        randomIV2 = findViewById( R.id.randomIV2);
        randomIV3 = findViewById( R.id.randomIV3);

        sortedIV0 = findViewById( R.id.sortedIV0);
        sortedIV1 = findViewById( R.id.sortedIV1);
        sortedIV2 = findViewById( R.id.sortedIV2);
        sortedIV3 = findViewById( R.id.sortedIV3);

        // 3. Add Elements to Sorted View
        // 4. Remove Elements from Sorted View
        // 5. Add Elements to Random View
        // 6. Check Sorted Using Quick Sort

        randomNumbers = getListOfRandomNumbers();
        initSortedNumbers();

        setInitialImages();
    }

    private void randomClickListener(int number, int id) {
        ImageView imageView = findViewById(id);

        if( number < randomNumbers.size()) {
            if( randomNumbers.get(number).getNumber() != -1) {
                UniqueNumber uniqueNumber = randomNumbers.get( number);
                randomNumbers.set( number, new UniqueNumber());

                setSortedImage( uniqueNumber);
                imageView.setImageResource( R.drawable.empty);
            }
        }
    }

    private void setSortedImage(UniqueNumber uniqueNumber) {
        int index = 0;
        for (UniqueNumber num : sortedNumbers) {
            if( num.getNumber() == -1) {
                sortedNumbers.set( index, uniqueNumber);
                break;
            }
            index++;
        }

        sortedIV0.setImageResource( sortedNumbers.get(0).getImageId());
        sortedIV1.setImageResource( sortedNumbers.get(1).getImageId());
        sortedIV2.setImageResource( sortedNumbers.get(2).getImageId());
        sortedIV3.setImageResource( sortedNumbers.get(3).getImageId());

        if( index==3) {
            checkForWin();
        }
    }

    private void checkForWin() {
        ArrayList<Integer> userNums = new ArrayList<>();
        ArrayList<Integer> sortedNums = new ArrayList<>();

        for (UniqueNumber uniqueNumber : sortedNumbers) {
            userNums.add(uniqueNumber.getNumber());
            sortedNums.add(uniqueNumber.getNumber());
        }

        MergeSort mergeSort = new MergeSort( sortedNums);
        sortedNums = mergeSort.getSortedArray();

        if( userNums.equals( sortedNums)) {
            myDialog.setContentView( R.layout.correct);
        } else {
            myDialog.setContentView( R.layout.wrong);
        }
        myDialog.show();
    }

    private void initSortedNumbers() {
        sortedNumbers.add( 0, new UniqueNumber());
        sortedNumbers.add( 1, new UniqueNumber());
        sortedNumbers.add( 2, new UniqueNumber());
        sortedNumbers.add( 3, new UniqueNumber());
    }

    private void setInitialImages() {
        randomIV0.setImageResource( randomNumbers.get(0).getImageId());
        randomIV1.setImageResource( randomNumbers.get(1).getImageId());
        randomIV2.setImageResource( randomNumbers.get(2).getImageId());
        randomIV3.setImageResource( randomNumbers.get(3).getImageId());

        sortedIV0.setImageResource( sortedNumbers.get(0).getImageId());
        sortedIV1.setImageResource( sortedNumbers.get(1).getImageId());
        sortedIV2.setImageResource( sortedNumbers.get(2).getImageId());
        sortedIV3.setImageResource( sortedNumbers.get(3).getImageId());
    }

    private List<UniqueNumber> getListOfRandomNumbers() {
        Set<Integer> randomGeneratedNumbers = new LinkedHashSet<>();
        List<UniqueNumber> uniqueNumbers = new ArrayList<>();

        while( randomGeneratedNumbers.size()<=3) {
            randomGeneratedNumbers.add( (int)(Math.random()*9));
        }

        for( int element : randomGeneratedNumbers) {
            uniqueNumbers.add( new UniqueNumber( element, this));
        }
        return uniqueNumbers;
    }

    public void randomIV0Clicked(View view) {
        randomClickListener(0, view.getId());
    }

    public void randomIV1Clicked(View view) {
        randomClickListener(1, view.getId());
    }

    public void randomIV2Clicked(View view) {
        randomClickListener(2, view.getId());
    }

    public void randomIV3Clicked(View view) {
        randomClickListener(3, view.getId());
    }
}