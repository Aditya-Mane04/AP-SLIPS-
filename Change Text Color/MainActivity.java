package com.example.myapplication;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView et;
    Button b1,b2,b3;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.tv);
        b1=findViewById(R.id.red);
        b2=findViewById(R.id.blue);
        b3=findViewById(R.id.green);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setTextColor(Color.RED);
                et.setTextSize(15);
                et.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setTextColor(Color.BLUE);
                et.setTextSize(20);
                et.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {
                et.setTextColor(Color.GREEN);
                et.setTextSize(25);
                et.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
            }
        });

    }
}
