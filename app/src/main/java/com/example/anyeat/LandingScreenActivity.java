package com.example.anyeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingScreenActivity extends AppCompatActivity {

    private Button next_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_landing_screen);

        next_btn = (Button) findViewById(R.id.next_btn_alt);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LandingScreenActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}