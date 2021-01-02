package com.project.fridge30.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.fridge30.R;
import com.project.fridge30.adapters.FridgeProductAdapter;
import com.project.fridge30.models.FridgeProduct;

import java.util.ArrayList;

public class FridgeProductActivity extends AppCompatActivity {
    // UI components
    private RecyclerView mRecyclerView;

    //vars
    private ArrayList<FridgeProduct> mFridgeProducts = new ArrayList<>();
    private FridgeProductAdapter mFridgeProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.propertiesRecView);
        initRecyclerView();
        insertFakeFridgeProducts();
    }

    private void insertFakeFridgeProducts(){
        for (int i = 0; i < 100; i++){
            FridgeProduct fridgeProduct = new FridgeProduct();
            fridgeProduct.setFridgeProductID(i);
            fridgeProduct.setFridgeProductName("Nazwa #" + i);
            fridgeProduct.setFridgeProductAmount(i+1);
            mFridgeProducts.add(fridgeProduct);
        }
        mFridgeProductAdapter.notifyDataSetChanged();
    }
    private void initRecyclerView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        mFridgeProductAdapter = new FridgeProductAdapter(mFridgeProducts, this);
        mRecyclerView.setAdapter(mFridgeProductAdapter);
    }
}
