package com.example.kalkulator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button simpleButton;
    private Button advancedButton;
    private Button aboutButton;
    private Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        simpleButton = findViewById(R.id.simpleButton);
        simpleButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, SimpleCalculatorActivity.class);
                        startActivity(i);
                    }
                }
        );

        advancedButton = findViewById(R.id.advancedButton);
        advancedButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, AdvancedCalculatorActivity.class);
                        startActivity(i);
                    }
                }
        );

        aboutButton = findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, AboutActivity.class);
                        startActivity(i);
                    }
                }
        );


        exitButton = findViewById(R.id.exitButton);
        exitButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        System.exit(0);
                    }
                }
        );

    }
}