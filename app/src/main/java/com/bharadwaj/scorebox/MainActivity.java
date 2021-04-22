package com.bharadwaj.scorebox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button cricket_score,cricket_story,foodball_score,foodball_news,tennis_score,
            tennis_news,hockey_score,hockey_news,golf_score,golf_news,chess_news,chess_score;
    private static final String TOAST_TEXT = "Welcome To Score Box";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, TOAST_TEXT, Toast.LENGTH_SHORT).show();

        cricket_score=(Button)findViewById(R.id.cricket_score);
        cricket_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), Output.class)});
            }
        });
        cricket_story=(Button)findViewById(R.id.cricket_story);
        cricket_story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), Cricket_Story_Output.class)});
            }
        });


        foodball_score=(Button)findViewById(R.id.foodball_score);
        foodball_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), Football_Score.class)});
            }
        });
        foodball_news=(Button)findViewById(R.id.foodball_news);
        foodball_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), Football_News.class)});
            }
        });

        tennis_score=(Button)findViewById(R.id.tennis_score);
        tennis_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), Tennis_Score.class)});
            }
        });
        tennis_news=(Button)findViewById(R.id.tennis_news);
        tennis_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), Tennis_News.class)});
            }
        });

        hockey_score=(Button)findViewById(R.id.hockey_score);
        hockey_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), Hockey_Score.class)});
            }
        });
        hockey_news=(Button)findViewById(R.id.hockey_news);
        hockey_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), Hockey_News.class)});
            }
        });

        golf_score=(Button)findViewById(R.id.golf_score);
        golf_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), Golf_Score.class)});
            }
        });
        golf_news=(Button)findViewById(R.id.golf_news);
        golf_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), Golf_News.class)});
            }
        });

       chess_score=(Button)findViewById(R.id.chess_score);
        chess_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), Chess_Score.class)});
            }
        });
        chess_news=(Button)findViewById(R.id.chess_news);
        chess_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), Chess_News.class)});
            }
        });



    }
}
