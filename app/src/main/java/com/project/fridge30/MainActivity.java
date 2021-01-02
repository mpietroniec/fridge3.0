package com.project.fridge30;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.project.fridge30.adapters.PropertyAdapter;
import com.project.fridge30.models.Property;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // UI components

    private RecyclerView mRecyclerView;

    //vars
    private ArrayList<Property> mProperties = new ArrayList<>();
    private PropertyAdapter mPropertyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.propertiesRecView);

        initRecyclerView();
        insertProperties();

//        RecyclerView propertiesRecyclerView = findViewById(R.id.propertiesRecView);
//        ArrayList<Property> mProperties = new ArrayList<>();
//        mProperties.add(new Property(R.drawable.plus, "Dodawanie pooduktów"));
//        mProperties.add(new Property(R.drawable.list, "Lista zakupów"));
//        mProperties.add(new Property(R.drawable.read, "Wyświetl produkty"));
//
//        PropertyAdapter adapter = new PropertyAdapter(mProperties, this);
//        adapter.setProperties(mProperties);
//
//        propertiesRecyclerView.setAdapter(adapter);
//        propertiesRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    private void insertProperties() {
        mProperties.add(new Property(R.drawable.plus, "Dodawanie pooduktów"));
        mProperties.add(new Property(R.drawable.list, "Lista zakupów"));
        mProperties.add(new Property(R.drawable.read, "Wyświetl produkty"));
        mPropertyAdapter.notifyDataSetChanged();
    }

    private void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        mPropertyAdapter = new PropertyAdapter(mProperties, this);
        mRecyclerView.setAdapter(mPropertyAdapter);
    }
}