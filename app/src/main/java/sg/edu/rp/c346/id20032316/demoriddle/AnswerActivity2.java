package sg.edu.rp.c346.id20032316.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer = findViewById(R.id.tvQ2Ans);

        Intent receive = getIntent();
        String question = receive.getStringExtra("Question2");
        tvAnswer.setText(question + " answer is: Gone");

    }
}