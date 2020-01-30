package com.example.oughterardgolfclub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class scoreWomenActivity extends AppCompatActivity {

    private EditText handicap, hole1, hole2, hole3, hole4, hole5, hole6, hole7, hole8, hole9;
    private EditText hole10, hole11, hole12, hole13, hole14, hole15, hole16, hole17, hole18;

    private Button calculate, clear;
    private TextView grossScore, netScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_women);

        handicap = (EditText) findViewById(R.id.handicapeT);

        hole1 = (EditText) findViewById(R.id.eT1);
        hole2 = (EditText) findViewById(R.id.eT2);
        hole3 = (EditText) findViewById(R.id.eT3);
        hole4 = (EditText) findViewById(R.id.eT4);
        hole5 = (EditText) findViewById(R.id.eT5);
        hole6 = (EditText) findViewById(R.id.eT6);
        hole7 = (EditText) findViewById(R.id.eT7);
        hole8 = (EditText) findViewById(R.id.eT8);
        hole9 = (EditText) findViewById(R.id.eT9);
        hole10 = (EditText) findViewById(R.id.eT10);
        hole11 = (EditText) findViewById(R.id.eT11);
        hole12 = (EditText) findViewById(R.id.eT12);
        hole13 = (EditText) findViewById(R.id.eT13);
        hole14 = (EditText) findViewById(R.id.eT14);
        hole15 = (EditText) findViewById(R.id.eT15);
        hole16 = (EditText) findViewById(R.id.eT16);
        hole17 = (EditText) findViewById(R.id.eT17);
        hole18 = (EditText) findViewById(R.id.eT18);


        calculate = (Button) findViewById(R.id.calcButton);
        clear = (Button) findViewById(R.id.clearButton2);
        grossScore = (TextView) findViewById(R.id.grossScore);
        netScore = (TextView) findViewById(R.id.netScore);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int handicapNum = Integer.parseInt(handicap.getText().toString());
                int num1 = Integer.parseInt(hole1.getText().toString());
                int num2 = Integer.parseInt(hole2.getText().toString());
                int num3 = Integer.parseInt(hole3.getText().toString());
                int num4 = Integer.parseInt(hole4.getText().toString());
                int num5 = Integer.parseInt(hole5.getText().toString());
                int num6 = Integer.parseInt(hole6.getText().toString());
                int num7 = Integer.parseInt(hole7.getText().toString());
                int num8 = Integer.parseInt(hole8.getText().toString());
                int num9 = Integer.parseInt(hole9.getText().toString());
                int num10 = Integer.parseInt(hole10.getText().toString());
                int num11 = Integer.parseInt(hole11.getText().toString());
                int num12 = Integer.parseInt(hole12.getText().toString());
                int num13 = Integer.parseInt(hole13.getText().toString());
                int num14 = Integer.parseInt(hole14.getText().toString());
                int num15 = Integer.parseInt(hole15.getText().toString());
                int num16 = Integer.parseInt(hole16.getText().toString());
                int num17 = Integer.parseInt(hole17.getText().toString());
                int num18 = Integer.parseInt(hole18.getText().toString());

                int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 +num9 +
                        num10 + num11 + num12 + num13 + num14 + num15 + num16 + num17 + num18;

                int net = sum - handicapNum;

                grossScore.setText("Gross Score : "+String.valueOf(sum));
                netScore.setText("Net Score : "+ String.valueOf(net));

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                handicap.setText("0");
                grossScore.setText("Gross Score : ");
                netScore.setText("Net Score : ");

                hole1.setText("0");
                hole2.setText("0");
                hole3.setText("0");
                hole4.setText("0");
                hole5.setText("0");
                hole6.setText("0");

                hole7.setText("0");
                hole8.setText("0");
                hole9.setText("0");
                hole10.setText("0");
                hole11.setText("0");
                hole12.setText("0");

                hole13.setText("0");
                hole14.setText("0");
                hole15.setText("0");
                hole16.setText("0");
                hole17.setText("0");
                hole18.setText("0");

            }
        });




    }
}
