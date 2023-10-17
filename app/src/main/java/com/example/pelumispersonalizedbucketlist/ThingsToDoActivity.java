package com.example.pelumispersonalizedbucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] thingsToDo = {
                new BucketListEntry ("Buy a Bentley", "My dream car", R.drawable.download__1_,5),
                new BucketListEntry ("Fly in an Helicopter", "Scary but i definitely would do this", R.drawable.download__2_,4),
                new BucketListEntry ("play Golf at a retreat", "i just want to do this", R.drawable.download,2.5f),
                new BucketListEntry ("Drive a race Sports-car", "Feel the need for speed", R.drawable.images,3.5f),
                new BucketListEntry ("Become a full stack Android Developer", "This is a new journey that i just set upon and i will see it through", R.drawable.images__3_,5)

        };
        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }
}