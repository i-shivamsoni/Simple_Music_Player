package com.example.simplemusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CurrentPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_playing);

        Button btn_NP_lib = findViewById(R.id.btn_NP_lib);

        btn_NP_lib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rIntent = new Intent(CurrentPlaying.this, Library.class);

                // Start the new activity
                startActivity(rIntent);
            }
        });
    }
}
