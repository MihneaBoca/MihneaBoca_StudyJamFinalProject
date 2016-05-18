package com.example.android.fiveways;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tex on 5/17/2016.
 */
public class Two extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);
    }

    public void showThree(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Nr. 1")) {
            Intent intent = new Intent(this, One.class);
            startActivity(intent);
        } else if (button_text.equals("Nr. 3")) {
            Intent intent = new Intent(this, Three.class);
            startActivity(intent);
        }
    }
}
