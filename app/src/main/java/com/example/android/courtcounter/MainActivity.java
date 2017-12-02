package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAScore, teamBScore, buttonId;
    private TextView scoreA, scoreB, team1N, team2N;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team1N = (TextView) findViewById(R.id.team_a_textview);
        team2N = (TextView) findViewById(R.id.team_b_textview);

        scoreA = (TextView) findViewById(R.id.Team_a);
        scoreB = (TextView) findViewById(R.id.Team_b);


        if (TeamName.team1Name != null)
            team1N.setText(TeamName.team1Name);

        if (TeamName.team2Name != null)
            team2N.setText(TeamName.team2Name);

    }

    public void teamAPoints(View v) {
        buttonId = v.getId();
        switch (buttonId) {
            case R.id.button3_a:
                teamAScore += 3;
                break;
            case R.id.button2_a:
                teamAScore += 2;
                break;
            case R.id.button1_a:
                teamAScore += 1;
        }
        scoreA.setText(teamAScore + "");
    }

    public void TeamBPoints(View v) {
        buttonId = v.getId();
        switch (buttonId) {
            case R.id.button3_b:
                teamBScore += 3;
                break;
            case R.id.button2_b:
                teamBScore += 2;
                break;
            case R.id.button1_b:
                teamBScore += 1;
        }
        scoreB.setText(teamBScore + "");
    }

    public void reset(View v) {
        teamAScore = 0;
        teamBScore = 0;
        scoreA.setText(teamAScore + "");
        scoreB.setText(teamBScore + "");
    }
}
