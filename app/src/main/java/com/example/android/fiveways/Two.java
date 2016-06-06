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

    public void showPageOne(View view) {
        Intent intent = new Intent(this, One.class);
        startActivity(intent);
    }

    public void showPageThree(View view) {
        Intent intent = new Intent(this, Three.class);
        startActivity(intent);
    }

    public void getHome(View View) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
