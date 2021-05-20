package sg.edu.rp.c346.id20032316.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Queue;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.tvQ1Ans);
        //tvAnswer.setText("In Second Activity");

        Intent intentReceived = getIntent(); // defined a variable, get package
        String questionsSelected = intentReceived.getStringExtra("Question"); // get the intent named Question
        tvAnswer.setText(questionsSelected + " answer is: Queue ");
    }
}