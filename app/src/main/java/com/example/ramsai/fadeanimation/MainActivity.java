package com.example.ramsai.fadeanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    public void fade(View view){
        ImageView dhoni = (ImageView) findViewById(R.id.dhoni);
        ImageView kohli = (ImageView) findViewById(R.id.kohli);
        dhoni.animate().alpha(0f).setDuration(2000);
        kohli.animate().alpha(1f).setDuration(2000);
        kohli.bringToFront();
    }
    public void fadeBack(View view){
        ImageView dhoni = (ImageView) findViewById(R.id.dhoni);
        ImageView kohli = (ImageView) findViewById(R.id.kohli);
        kohli.animate().alpha(0f).setDuration(2000);
        dhoni.animate().alpha(1f).setDuration(2000);
        dhoni.bringToFront();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
