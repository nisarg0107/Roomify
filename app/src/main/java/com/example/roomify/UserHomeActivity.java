package com.example.roomify;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class UserHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

        // Set Welcome Message
        TextView welcomeText = findViewById(R.id.welcomeText);
        welcomeText.setText("Welcome, User!");
    }
}
