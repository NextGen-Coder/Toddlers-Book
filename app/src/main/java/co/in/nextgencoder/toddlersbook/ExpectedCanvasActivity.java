package co.in.nextgencoder.toddlersbook;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class ExpectedCanvasActivity extends AppCompatActivity {

    private PaintView paintView;
    private ImageView eraser, brush, backBtn, expectedIV;
    private SeekBar seekBar;
    private Canvas canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expected_canvas);
        paintView = (PaintView) findViewById(R.id.paintView);
        DisplayMetrics metrics = new DisplayMetrics();

        Display display = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize( point);
        int width = point.x;
        int height = point.y;

        metrics.heightPixels = height;
        metrics.widthPixels = width;
        paintView.init(metrics);
        paintView.setCurrentColor( Color.BLACK);

        eraser = findViewById(R.id.eraser_tool);
        expectedIV = findViewById(R.id.expectedImage);

        int resId = getIntent().getIntExtra( "resId", 0);
        expectedIV.setImageResource( resId);

//        expectedIV = (ImageView) findViewById(R.drawable.class1_alpha_letters_0);
//        expectedIV = (ImageView) findViewById(R.drawable.class1_alpha_letters_1);

        SeekBar seekBar = findViewById(R.id.seekbar);
        seekBar.setProgress( 50);
        paintView.setStrokeWidth( seekBar.getProgress()/5);
        seekBar.setBackgroundColor(Color.WHITE);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                System.out.println( progress);
                paintView.setStrokeWidth( progress / 5);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_value, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.normal:
                paintView.normal();
                return true;
            case R.id.emboss:
                paintView.emboss();
                return true;
            case R.id.blur:
                paintView.blur();
                return true;
            case R.id.clear:
                paintView.clear();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void clickOnPaintBrush(View view) {
        brush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), CanvasActivity.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                startActivity(intent);
                brush.getDrawable();
            }
        });
    }
    public void clickOnBackButton(View view) {
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }

    public void clickOnEraser(View view) {
        paintView.setCurrentColor( Color.WHITE);
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void setColor(View view) {
        int color = Color.TRANSPARENT;
        Drawable background = view.getBackground();
//        if (background instanceof ColorDrawable)
//            color = ((ColorDrawable) background).getColor();

        //background DrawableCompat.wrap( background);

        //paintView.setCurrentColor( view.getBackgroundTintList());
    }

    public void setColorBlack(View view) {
        paintView.setCurrentColor( Color.BLACK);
    }

    public void setColorRed(View view) {
        paintView.setCurrentColor( Color.RED);
    }

    public void setColorBlue(View view) {
        paintView.setCurrentColor( Color.rgb( 0, 0, 255));
    }

    public void setColorGreen(View view) {
        paintView.setCurrentColor( Color.rgb( 0, 255, 0));
    }

    public void setColorPurple(View view) {
        paintView.setCurrentColor( Color.rgb( 128, 0, 128));
    }

    public void setColorPink(View view) {
        paintView.setCurrentColor( Color.rgb( 255, 20, 147));
    }

    public void setColorYellow(View view) {
        paintView.setCurrentColor( Color.rgb( 255, 255, 0));
    }

    public void setColorBrown(View view) {
        paintView.setCurrentColor( Color.rgb( 165, 42, 42));
    }

    public void setColorSkin(View view) {
        paintView.setCurrentColor( Color.rgb( 232, 190, 172));
    }

    public void setColorOrange(View view) {
        paintView.setCurrentColor( Color.rgb( 255, 165, 0));
    }
}