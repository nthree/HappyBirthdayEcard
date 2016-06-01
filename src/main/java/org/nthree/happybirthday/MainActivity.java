package org.nthree.happybirthday;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get rid of annoying title bar

        //soundtrack for background
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sailormoontheme);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        //custom font
        String listviewandroid= "fonts/alexbrush.ttf";
            Typeface myTypeface = Typeface.createFromAsset(getAssets(), listviewandroid);
            TextView myTextView = (TextView)findViewById(R.id.textview1);
            TextView myTextView2= (TextView)findViewById(R.id.textview2);
            TextView myTextView3= (TextView)findViewById(R.id.textview3);
            myTextView.setTypeface(myTypeface);
            myTextView2.setTypeface(myTypeface);
            myTextView3.setTypeface(myTypeface);

    }
}
