package com.epicodus.recipeconverter.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.epicodus.recipeconverter.Constants;
import com.epicodus.recipeconverter.R;
import com.epicodus.recipeconverter.models.Recipe;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ResultsActivity extends AppCompatActivity {
    private int mPosition;
    private Recipe mRecipe;
    private ArrayList<Recipe> mRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        TextView results = (TextView) findViewById(R.id.ingredient);
        TextView results2 = (TextView) findViewById(R.id.ingredient2);
        TextView results3 = (TextView) findViewById(R.id.ingredient3);
        TextView results4 = (TextView) findViewById(R.id.ingredient4);
        TextView results5 = (TextView) findViewById(R.id.ingredient5);
        TextView results6 = (TextView) findViewById(R.id.ingredient6);
        TextView results7 = (TextView) findViewById(R.id.ingredient7);
        TextView results8 = (TextView) findViewById(R.id.ingredient8);


        TextView units = (TextView) findViewById(R.id.units);
        TextView notes = (TextView) findViewById(R.id.notes);
        notes.setMovementMethod(new ScrollingMovementMethod());

        TextView quantity = (TextView) findViewById(R.id.quantity);
        TextView quantity2 = (TextView) findViewById(R.id.quantity2);
        TextView quantity3 = (TextView) findViewById(R.id.quantity3);
        TextView quantity4 = (TextView) findViewById(R.id.quantity4);
        TextView quantity5 = (TextView) findViewById(R.id.quantity5);
        TextView quantity6 = (TextView) findViewById(R.id.quantity6);
        TextView quantity7 = (TextView) findViewById(R.id.quantity7);
        TextView quantity8 = (TextView) findViewById(R.id.quantity8);



        Intent intent = getIntent();
        String str = intent.getStringExtra("ingredient");
        String str2 = intent.getStringExtra("ingredient2");
        String str3 = intent.getStringExtra("ingredient3");
        String str4 = intent.getStringExtra("ingredient4");
        String str5 = intent.getStringExtra("ingredient5");
        String str6 = intent.getStringExtra("ingredient6");
        String str7 = intent.getStringExtra("ingredient7");
        String str8 = intent.getStringExtra("ingredient8");

        String strU = intent.getStringExtra("units");
        String strN = intent.getStringExtra("notes");
        String strQ = intent.getStringExtra("quantity");
        String strQ2 = intent.getStringExtra("quantity2");
        String strQ3 = intent.getStringExtra("quantity3");
        String strQ4 = intent.getStringExtra("quantity4");
        String strQ5 = intent.getStringExtra("quantity5");
        String strQ6 = intent.getStringExtra("quantity6");
        String strQ7 = intent.getStringExtra("quantity7");
        String strQ8 = intent.getStringExtra("quantity8");



        results.setText(str);
        results2.setText(str2);
        results3.setText(str3);
        results4.setText(str4);
        results5.setText(str5);
        results6.setText(str6);
        results7.setText(str7);
        results8.setText(str8);

        units.setText(strU);
        notes.setText(strN);
        quantity.setText(strQ);
        quantity2.setText(strQ2);
        quantity3.setText(strQ3);
        quantity4.setText(strQ4);
        quantity5.setText(strQ5);
        quantity6.setText(strQ6);
        quantity7.setText(strQ7);
        quantity8.setText(strQ8);

    }
}
