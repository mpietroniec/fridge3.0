package com.project.fridge30.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.fridge30.R;
import com.project.fridge30.adapters.ShoppingListProductAdapter;
import com.project.fridge30.models.ShoppingListProduct;

import java.util.ArrayList;

public class ShoppingListActivity extends AppCompatActivity {
    // UI components
    private RecyclerView mRecyclerView;

    //vars
    private ArrayList<ShoppingListProduct> mShoppingListProduct = new ArrayList<>();
    private ShoppingListProductAdapter mShoppingListProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);
        mRecyclerView = findViewById(R.id.shoppingListRecyclerView);
        initRecyclerView();
        insertFakeShoppingListProducts();
    }

    private void insertFakeShoppingListProducts(){
        for (int i = 0; i < 100; i++){
            ShoppingListProduct shoppingListProduct = new ShoppingListProduct();
            shoppingListProduct.setShoppingListProductName("Nazwa #" + i);
            shoppingListProduct.setShoppingListProductAmount(i);
            shoppingListProduct.setShoppingListShopName("Nazwa sklepu: " + i);
            mShoppingListProduct.add(shoppingListProduct);
        }
        mShoppingListProductAdapter.notifyDataSetChanged();
    }

    private void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        mShoppingListProductAdapter = new ShoppingListProductAdapter(mShoppingListProduct, this);
        mRecyclerView.setAdapter(mShoppingListProductAdapter);
    }
}
