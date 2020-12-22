package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListeners();
    }

    private void setupClickListeners() {
        CardView toDoCard;
        CardView toGoCard;
        toDoCard=findViewById(R.id.cardView_toDo);
        toGoCard =findViewById(R.id.cardView_toGo);

        toDoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDoIntent=new Intent(MainActivity.this,ThingsToDoActivity.class);
                startActivity(toDoIntent);
            }
        });

        toGoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toGoIntent=new Intent(MainActivity.this,PlacestoGoActivity.class);
                startActivity(toGoIntent);

            }
        });









    }


}