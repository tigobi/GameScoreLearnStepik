package com.example.gamescore;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int scoreLeft = 0;
    private int scoreRight = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            scoreRight = savedInstanceState.getInt("right");
            scoreLeft = savedInstanceState.getInt("left");
        }
        TextView teamRight = findViewById(R.id.textVIewTeamRightScore);
        TextView teamLeft = findViewById(R.id.textViewTeamLeftScore);
        teamRight.setText(String.valueOf(scoreRight));
        teamLeft.setText(String.valueOf(scoreLeft));

        teamRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreRight += 1;
                teamRight.setText(String.valueOf(scoreRight));
            }
        });
        teamLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreLeft += 1;
                teamLeft.setText(String.valueOf(scoreLeft));
            }
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("right", scoreRight);
        outState.putInt("left", scoreLeft);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}