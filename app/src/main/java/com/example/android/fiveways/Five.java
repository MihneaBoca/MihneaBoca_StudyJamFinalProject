package com.example.android.fiveways;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tex on 5/17/2016.
 */
public class Five extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five);
    }
    public void showSix(View view)
    {String button_text;
        button_text=((Button) view).getText().toString();
        if(button_text.equals("Nr. 4"))
        {Intent intent = new Intent(this,Four.class);
            startActivity(intent);}
        else if (button_text.equals("Home")) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
