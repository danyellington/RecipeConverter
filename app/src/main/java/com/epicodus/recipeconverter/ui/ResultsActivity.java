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


        TextView results = (TextView) findViewById(R.id.results);
        TextView units = (TextView) findViewById(R.id.units);
        TextView quantity = (TextView) findViewById(R.id.quantity);
        TextView notes = (TextView) findViewById(R.id.notes);
        notes.setMovementMethod(new ScrollingMovementMethod());



        Intent intent = getIntent();
        String str = intent.getStringExtra("ingredient");
        String strU = intent.getStringExtra("units");
        String strQ = intent.getStringExtra("quantity");
        String strN = intent.getStringExtra("notes");

        results.setText(str);
        units.setText(strU);
        quantity.setText(strQ);
        notes.setText(strN);
    }

//    @Override
//    public void onClick(View v) {
//
//        if (v == mSaveRecipe) {
//            FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//            String uid = user.getUid();
//
//            DatabaseReference forecastRef = FirebaseDatabase
//                    .getInstance()
//                    .getReference(Constants.FIREBASE_CHILD_RECIPE)
//                    .child(uid);
//
//            DatabaseReference pushRef = forecastRef.push();
//            String pushId = pushRef.getKey();
//            mRecipe.setPushId(pushId);
//            pushRef.setValue(mRecipe);
//
//            Toast.makeText(getContext(), "Saved", Toast.LENGTH_SHORT).show();
//        }
//
//    }
}
