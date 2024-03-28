package com.example.gamescore;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int scoreLeft = 0;
    private int scoreRight = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView teamRight = findViewById(R.id.textVIewTeamRightScore);
        TextView teamLeft = findViewById(R.id.textViewTeamLeftScore);
        teamRight.setText(String.valueOf(scoreRight));
        teamLeft.setText(String.valueOf(scoreLeft));

        teamRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreRight+=1;
                teamRight.setText(String.valueOf(scoreRight));
            }
        });
        teamLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreLeft+=1;
                teamLeft.setText(String.valueOf(scoreLeft));
            }
        });

    }
}