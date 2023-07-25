package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary questionLibrary = new QuestionLibrary();
    private TextView tvScore;
    private TextView tvQuestion;
    private Button btnChoice1, btnChoice2, btnChoice3, btnQuit;

    private String answer;
    private int score = 0;
    private int questionNo = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScore = (TextView) findViewById((R.id.tvScore));
        tvQuestion = findViewById((R.id.tvQuestion));
        btnChoice1 = findViewById((R.id.btnChoice1));
        btnChoice2 = findViewById((R.id.btnChoice2));
        btnChoice3 = findViewById((R.id.btnChoice3));
        btnQuit = findViewById((R.id.btnQuit));

        btnChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (btnChoice1.getText() == answer) {
                        score++;
                        updateScore(score);
                        updateQuestion();
                        Toast.makeText(MainActivity.this, "Your answer is correct!", Toast.LENGTH_LONG).show();
                    } else {
                        score--;
                        updateScore(score);
                        updateQuestion();
                        Toast.makeText(MainActivity.this, "Awww... Your answer is incorrect!", Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Finished!!!!", Toast.LENGTH_LONG).show();
                }

            }
        });
        btnChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (btnChoice2.getText() == answer) {
                        score++;
                        updateScore(score);
                        updateQuestion();
                        Toast.makeText(MainActivity.this, "Your answer is correct!", Toast.LENGTH_LONG).show();
                    } else {
                        score--;
                        updateScore(score);
                        updateQuestion();
                        Toast.makeText(MainActivity.this, "Awww... Your answer is incorrect!", Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Finished!!!!", Toast.LENGTH_LONG).show();
                }

            }
        });
        btnChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (btnChoice3.getText() == answer) {
                        score++;
                        updateScore(score);
                        updateQuestion();
                        Toast.makeText(MainActivity.this, "Your answer is correct!", Toast.LENGTH_LONG).show();
                    } else {
                        score--;
                        updateScore(score);
                        updateQuestion();
                        Toast.makeText(MainActivity.this, "Awww... Your answer is incorrect!", Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Finished!!!!", Toast.LENGTH_LONG).show();
                }

            }
        });
        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                updateScore(score);
                questionNo = 0;
                updateQuestion();

            }
        });
    }


    private void updateScore(int point) {
        tvScore.setText("Score: " + point);
    }

    private void updateQuestion() {
        tvQuestion.setText("Question: " + questionLibrary.getQuestion(questionNo));
        btnChoice1.setText(questionLibrary.getChoice1(questionNo));
        btnChoice2.setText(questionLibrary.getChoice2(questionNo));
        btnChoice3.setText(questionLibrary.getChoice3(questionNo));
        answer = questionLibrary.getCorrectAnswer(questionNo);
        questionNo++;
    }
}