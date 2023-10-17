package com.example.pelumispersonalizedbucketlist;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListeners();
    }

    private void setupClickListeners() {
        CardView thingsToDoCard= findViewById(R.id.cardView_things_to_do);
        CardView placesToGoCard= findViewById(R.id.cardView_places_to_go);

        thingsToDoCard.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ThingsToDoActivity.class);
            startActivity(intent);

        });
        placesToGoCard.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PlacesToGoActivity.class);
            startActivity(intent);

        });
    }
}