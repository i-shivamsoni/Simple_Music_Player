package com.example.simplemusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button libbtn = findViewById(R.id.btn_lib);
        libbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent libIntent = new Intent(MainActivity.this, Library.class);

                // Start the new activity
                startActivity(libIntent);
            }
        });

    }
}
