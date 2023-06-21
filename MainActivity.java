package com.example.ui_basics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHelloButtonClicked(view view) {
        TextView txtWelcome = findViewById(R.id.txtWelcome);
        txtWelcome.setText("Hello Again");

    }
}
