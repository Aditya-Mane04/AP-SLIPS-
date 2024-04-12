package com.example.myapplication4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;
    private Button showRatingButton;
    private TextView ratingTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ratingBar = findViewById(R.id.ratingBar);
        showRatingButton = findViewById(R.id.showRatingButton);
        ratingTextView = findViewById(R.id.ratingTextView);

        showRatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rating=ratingBar.getRating();
                String message = "Selected Rating: " + rating;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                ratingTextView.setText(message);
            }
        });
    }
}
