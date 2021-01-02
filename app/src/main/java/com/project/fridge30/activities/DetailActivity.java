package com.project.fridge30.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.project.fridge30.R;

public class DetailActivity extends AppCompatActivity {
    TextView detailsProductNameOutput;
    EditText detailsAmountInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailsProductNameOutput = findViewById(R.id.name_input_update);
        detailsAmountInput = findViewById(R.id.amount_input_update);
    }
}