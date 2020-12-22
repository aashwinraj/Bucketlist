package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacestoGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placesto_go);
        setupList();

    }

    private void setupList() {
        BucketListEntry[] toGoList={
                new BucketListEntry("Vietnam","con dao islands,hanao,kong bay,",R.drawable.vietnam,4.5f),
                new BucketListEntry("Kerala","HouseBoats,foods,rafting",R.drawable.kerala,4.5f),
                new BucketListEntry("Japan","hot spings,sushi,tokyo,bullet train",R.drawable.japan,5f),
                new BucketListEntry("Iceland","djaundi waterfalls,northern lights,viking meuseum,nautr reserves",R.drawable.iceland,4.5f),
                new BucketListEntry("The Amazon,Brazil","do dmt and see wildlife",R.drawable.amazon,5f)
        };
        RecyclerView recyclerView=findViewById(R.id.recycler_view_toGo);
        BucketListEntryAdapter adapter=new BucketListEntryAdapter(toGoList);
        recyclerView.setAdapter(adapter);
    }
}