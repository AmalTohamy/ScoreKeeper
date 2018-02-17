package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;

    //onSaveInstanceState code from mentor reply on a forum thread
    //https://discussions.udacity.com/t/when-i-rotate-my-device-textview-score-automatically-set-to-zero-and-also-scrollbar-not-working/202374

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("team_A_score", scorePlayerOne);
        savedInstanceState.putInt("team_B_score", scorePlayerTwo);
        super.onSaveInstanceState(savedInstanceState);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            scorePlayerOne= savedInstanceState.getInt("team_A_score");
            scorePlayerTwo= savedInstanceState.getInt("team_B_score");
        }
        else {
            scorePlayerTwo = 0;
            scorePlayerTwo = 0;
        }
        setContentView(R.layout.activity_main);
        displayForFirstPlayer(scorePlayerOne);
        displayForSecondPlayer(scorePlayerTwo);

    }


    public void addOnePlayerOne(View view)
    {
        scorePlayerOne = scorePlayerOne + 1;
        displayForFirstPlayer(scorePlayerOne);
    }


    public void addThreePlayerOne(View view)
    {
        scorePlayerOne = scorePlayerOne + 3;
        displayForFirstPlayer(scorePlayerOne);
    }

    public void addFivePlayerOne(View view)
    {
        scorePlayerOne = scorePlayerOne + 5;
        displayForFirstPlayer(scorePlayerOne);
    }

    public void addNinePlayerOne(View view)
    {
        scorePlayerOne = scorePlayerOne + 9;
        displayForFirstPlayer(scorePlayerOne);
    }


    public void addOnePlayerTwo(View view)
    {
        scorePlayerTwo = scorePlayerTwo + 1;
        displayForSecondPlayer(scorePlayerTwo);
    }


    public void addThreePlayerTwo(View view)
    {
        scorePlayerTwo = scorePlayerTwo + 3;
        displayForSecondPlayer(scorePlayerTwo);
    }

    public void addFivePlayerTwo(View view)
    {
        scorePlayerTwo = scorePlayerTwo + 5;
        displayForSecondPlayer(scorePlayerTwo);
    }

    public void addNinePlayerTwo(View view)
    {
        scorePlayerTwo = scorePlayerTwo + 9;
        displayForSecondPlayer(scorePlayerTwo);
    }

    public void displayForFirstPlayer(int score) {
        TextView scoreView = findViewById(R.id.first_player_score);
        scoreView.setText(String.valueOf(score));
    }

    public void newGame(View view)
    {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        displayForFirstPlayer(scorePlayerOne);
        displayForSecondPlayer(scorePlayerTwo);
    }

    public void displayForSecondPlayer(int score) {
        TextView scoreView = findViewById(R.id.second_player_score);
        scoreView.setText(String.valueOf(score));
    }
}
