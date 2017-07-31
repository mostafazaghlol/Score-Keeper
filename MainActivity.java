package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int scoreteamA=0;
    public int scoreteamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //the Display method.

    public void displayResult(int num,char team){
        char ss=team;
        switch (ss){
            case 'A':
                TextView t1=(TextView)findViewById(R.id.teamAscore);
                t1.setText(String.valueOf(num));
                break;
            case 'B':
                TextView t2=(TextView)findViewById(R.id.teamBscore);
                t2.setText(String.valueOf(num));
                break;

        }

    }
    public void GoalA(View view) {
        scoreteamA++;
        displayResult(scoreteamA,'A');
    }

    public void GoalB(View view) {
        scoreteamB++;
        displayResult(scoreteamB,'B');
    }

    public void RestBut(View view) {
        scoreteamA=0;
        scoreteamB=0;
        displayResult(scoreteamA,'A');
        displayResult(scoreteamB,'B');
    }
}
