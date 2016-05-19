package com.example.android.fiveways;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tex on 5/17/2016.
 */
public class Four extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);
    }
    public void showFive(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Nr. 3")) {
            Intent intent = new Intent(this, Three.class);
            startActivity(intent);
        } else if (button_text.equals("Nr. 5")) {
            Intent intent = new Intent(this, Five.class);
            startActivity(intent);
        }
        else if (button_text.equals("Home")) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
