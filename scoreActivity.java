package com.example.oughterardgolfclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Button mbutton = (Button) findViewById(R.id.menScoreButton);
        Button wbutton = (Button) findViewById(R.id.womenScoreButton);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scoreActivity.this, scoreMenActivity.class);
                startActivity(intent);
            }
        });

        wbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scoreActivity.this, scoreWomenActivity.class);
                startActivity(intent);
            }
        });

    }
}
