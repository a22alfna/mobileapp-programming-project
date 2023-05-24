package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_page);

        Button mainsida = findViewById(R.id.tillbaks);

        mainsida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent screenIntent = new Intent(AboutActivity.this,MainActivity.class);
                startActivity(screenIntent);
            }
        });
    }
}
