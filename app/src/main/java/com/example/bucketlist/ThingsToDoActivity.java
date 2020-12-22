package com.example.bucketlist;

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

        BucketListEntry[] listToDo={
                new BucketListEntry("Climb Kilimanjaor","DO it the difficult way",R.drawable.kilimanjaro,  4.5f),
                new BucketListEntry("See Northern Lights","sfdgklks sdgf d fhh df",R.drawable.northern_lights,  5f),
                new BucketListEntry("Road trip across Italy","skd fnksdn fkldfk lgdfgd",R.drawable.road_trip,  4.5f),
                new BucketListEntry("Scuba dive","In Kho Tao,Thailand",R.drawable.scubadive,  5f),
                new BucketListEntry("Skydive","Without an instructor",R.drawable.skydive,  4f)


        };
        RecyclerView recyclerView=findViewById(R.id.recycler_view_toDo);
        BucketListEntryAdapter adapter=new BucketListEntryAdapter(listToDo);
        recyclerView.setAdapter(adapter);
    }
}