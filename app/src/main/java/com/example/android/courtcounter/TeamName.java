package com.example.android.courtcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TeamName extends AppCompatActivity {
    static String team1Name, team2Name;
    Button nextBtn;
    EditText teamA, teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_name);

        nextBtn = (Button) findViewById(R.id.next_btn);
        teamA = (EditText) findViewById(R.id.first_team);
        teamB = (EditText) findViewById(R.id.second_team);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!teamA.getText().toString().trim().isEmpty() || !teamA.getText().toString().trim().equals(""))
                    team1Name = teamA.getText().toString();
                if (!teamB.getText().toString().trim().isEmpty() || !teamB.getText().toString().trim().equals(""))
                    team2Name = teamB.getText().toString();

                startActivity(new Intent(TeamName.this, MainActivity.class));
            }
        });
    }
}
