package com.epicodus.recipeconverter.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.epicodus.recipeconverter.R;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView results = (TextView) findViewById(R.id.results);
        TextView servings = (TextView) findViewById(R.id.servings);
        TextView quantity = (TextView) findViewById(R.id.quantity);

        Intent intent = getIntent();
        String str = intent.getStringExtra("ingredient");
        String strA = intent.getStringExtra("amount");
        String strQ = intent.getStringExtra("quantity");
        results.setText(str);
        servings.setText(strA);
        quantity.setText(strQ);
    }
}
