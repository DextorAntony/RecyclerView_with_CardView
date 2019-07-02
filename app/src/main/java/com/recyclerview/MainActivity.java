package com.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
Context context;
private List<club> courses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(courses);
        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(courses);
        recyclerView.setAdapter(adapter);
    }

    private void initializeData() {
       courses = new ArrayList<>();
       courses.add(new club("Coding challenges and solutions",R.drawable.cc_ukurhj));
       courses.add(new club("Flutter Dart Bundle",R.drawable.fd_51ls1o));
       courses.add(new club("React Native Bootcamp",R.drawable.rn));
       courses.add(new club("Mongo DB",R.drawable.mongo_ldpa6t));
       courses.add(new club("Bootstrap 4",R.drawable.bs4_e5uhty));
    }


    class club {

        String name;
        int logoId;

        club(String name, int logoId){
            this.name = name;
            this.logoId = logoId;
        }
    }
}
