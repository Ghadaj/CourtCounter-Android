package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAScore = 0;
    private int teamBScore = 0;
   private int buttonId = 0;
 private    TextView scoreA;
   private TextView scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamAPoints(View v) {
        scoreA = (TextView) findViewById(R.id.Team_a);

        buttonId = v.getId();
        if (buttonId == R.id.button3_a)
            teamAScore += 3;
        else if (buttonId == R.id.button2_a)
            teamAScore += 2;
        else if (buttonId == R.id.button1_a)
            teamAScore += 1;
        scoreA.setText(teamAScore + "");
    }

    public void TeamBPoints(View v) {
        scoreB = (TextView) findViewById(R.id.Team_b);

        buttonId = v.getId();
        if (buttonId == R.id.button3_b)
            teamBScore += 3;
        else if (buttonId == R.id.button2_b)
            teamBScore += 2;
        else if (buttonId == R.id.button1_b)
            teamBScore += 1;
        scoreB.setText(teamBScore + "");
    }

    public void reset(View v) {
        teamAScore = 0;
        teamBScore = 0;
        scoreA.setText(teamAScore + "");
        scoreB.setText(teamBScore + "");
    }
}
