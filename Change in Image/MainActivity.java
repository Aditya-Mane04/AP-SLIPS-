package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        ImageView img;

        btn=(Button) findViewById(R.id.btn);
        img=(ImageView) findViewById(R.id.img);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(img.getDrawable().getConstantState()==getResources().getDrawable(R.drawable.i1).getConstantState()){
                    img.setImageResource(R.drawable.i2);
                }
                else{
                    img.setImageResource(R.drawable.i1);
                }
            }
        });
    }
}
