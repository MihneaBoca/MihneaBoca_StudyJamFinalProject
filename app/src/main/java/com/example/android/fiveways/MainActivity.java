package com.example.android.fiveways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPage(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Practice")) {
            Intent intent = new Intent(this, One.class);
            startActivity(intent);
        } else if (button_text.equals("Players")) {
            Intent intent = new Intent(this, Two.class);
            startActivity(intent);
        } else if (button_text.equals("Hold Back")) {
            Intent intent = new Intent(this, Three.class);
            startActivity(intent);
        } else if (button_text.equals("Bluff")) {
            Intent intent = new Intent(this, Four.class);
            startActivity(intent);
        } else if (button_text.equals("Cheat")) {
            Intent intent = new Intent(this, Five.class);
            startActivity(intent);
        } else if (button_text.equals("Result")) {
            Intent intent = new Intent(this, Result.class);
            startActivity(intent);
        } else if (button_text.equals("Exit")) {
            this.finish();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            int pid = android.os.Process.myPid();
            android.os.Process.killProcess(pid);
        }

    }

}


