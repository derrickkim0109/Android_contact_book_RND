package com.example.cameragallery_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    //field

    //views
    private FloatingActionButton addRecordBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init views
        addRecordBtn = findViewById(R.id.addRecordBtn);

        //click to start add record activity
        addRecordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start add record activity
                startActivity(new Intent(MainActivity.this, AddUpdateRecodActivity.class));

            }
        });
    }
}