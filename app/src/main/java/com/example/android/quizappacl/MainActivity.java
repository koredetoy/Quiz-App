package com.example.android.quizappacl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;






/**
 * This app is a six question quiz test.
 */
public class MainActivity extends AppCompatActivity {

    //Initial Score
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Question One - Increase score if D is checked.
     */
    public void onQuestionOneClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_one_option_d:
                if (checked)
                    score = score + 10;
                break;
        }
    }
    /**
     * Question two - Increase score if C is checked.
     */
    public void onQuestionTwoClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_two_option_c:
                if (checked)
                    score = score + 10;
                break;
        }
    }
    /**
     * Question Three - Increase score if B is checked.
     */
    public void onQuestionThreeClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_three_option_b:
                if (checked)
                    score = score + 10;
                break;
        }
    }
    /**
     * Question four - Increase score if A is checked.
     */
    public void onQuestionFourClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_four_option_a:
                if (checked)
                    score = score + 10;
                break;
        }
    }
    /**
     * Question Five - Increase score if D is checked.
     */
    public void onQuestionFiveClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_five_option_d:
                if (checked)
                    score = score + 10;
                break;
        }
    }

    /**
     * Question six - Increase score if True is checked.
     */
    public void onQuestionSixClicked(View view) {
        CheckBox questionSixTrueOption = (CheckBox) findViewById(R.id.question_six_true_option);
        // Is the button now checked?
        boolean theCorrectAnswer = questionSixTrueOption.isChecked();

        // Check which checkedBox was clicked
        switch(view.getId()) {
            case R.id.question_six_true_option:
                if (theCorrectAnswer)
                    score = score + 10;
                break;
        }
    }

    /**
     * This method is called when the submitQuiz button is clicked.
     */
    public void submitQuiz(View view) {

        // Display the quiz score on the screen
        uploadResult(score);{
            Toast.makeText(this,"Thank you and Play again", Toast.LENGTH_SHORT).show();
            return;
        }

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void uploadResult(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText("" + number);
    }
}