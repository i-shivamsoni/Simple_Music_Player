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

        // ImageView Lib = findViewById(R.id.img_lib);
        Button libbtn = findViewById(R.id.btn_lib);
        libbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent libIntent = new Intent(MainActivity.this, Library.class);

                // Start the new activity
                startActivity(libIntent);
            }
        });

    }
}
