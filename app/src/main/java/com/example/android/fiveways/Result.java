package com.example.android.fiveways;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Tex on 5/21/2016.
 */
public class Result extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
    }

    public void submitOrder(View view) {
        EditText nameField=(EditText) findViewById(R.id.your_name);
        String name=nameField.getText().toString();
        CheckBox practice = (CheckBox) findViewById(R.id.Practice);
        boolean hasPractice=practice.isChecked();
        CheckBox players = (CheckBox) findViewById(R.id.Players);
        boolean hasPlayers=players.isChecked();
        CheckBox hold = (CheckBox) findViewById(R.id.hold);
        boolean hasHold=hold.isChecked();
        CheckBox bluff = (CheckBox) findViewById(R.id.Bluff);
        boolean hasBluff=bluff.isChecked();
        CheckBox cheat = (CheckBox) findViewById(R.id.Cheat);
        boolean hasCheat=cheat.isChecked();

        String message= createSummary(name, hasPractice, hasPlayers, hasHold, hasBluff, hasCheat);
        displayRes(message);
    }
    private void displayRes(String message) {
        TextView orderTextView = (TextView) findViewById(R.id.summary_text_view);
        orderTextView.setText(message);
    }
    private String createSummary(String name, boolean hasPractice, boolean hasPlayers, boolean hasHold, boolean hasBluff, boolean hasCheat){
        String message="Name:" +name + "\nPractice? "+hasPractice+"\nPlayers? "+hasPlayers+"\nHold Out? "+hasHold+"\nBluff? "+hasBluff+"\nCheat? "+hasCheat+"\nBy the time you are reading this you have probably already won a game and if you didn't then you should probably keep practicing.\nGood luck!\nAnd don't actually try to cheat.";
        return message;
    }
}
