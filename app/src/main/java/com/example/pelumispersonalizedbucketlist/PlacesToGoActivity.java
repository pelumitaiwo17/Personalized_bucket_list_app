package com.example.pelumispersonalizedbucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();

    }

    private void setupList() {
        BucketListEntry[] PlacesToGo = {
                new BucketListEntry ("Go buy a Bentley", "I don't really have any dream places to go so i put my bentley dream in Lol", R.drawable.download__1_,5),
                new BucketListEntry ("Maldives", "The Picture look like a nice view so ill definitely go there", R.drawable.images__1_,4),
                new BucketListEntry ("Golf Course", "i just want to do this", R.drawable.download,2.5f),
                new BucketListEntry ("Nascar", "Feel the need for speed", R.drawable.images,3.5f),
                new BucketListEntry ("Jamaica", "Looks like a nice vacation spot so ill go there for sure", R.drawable.images__2_,5)

        };
        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(PlacesToGo);
        recyclerView.setAdapter(adapter);
    }
}