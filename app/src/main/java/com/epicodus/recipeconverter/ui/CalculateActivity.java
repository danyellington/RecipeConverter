package com.epicodus.recipeconverter.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.epicodus.recipeconverter.R;

public class CalculateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        Button calculateButton = (Button) findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                EditText etRecipe = (EditText) findViewById(R.id.calculate);
                EditText etAmount = (EditText) findViewById(R.id.calculateAmount);
                EditText etQuantity = (EditText) findViewById(R.id.quantity);
                Intent intent = new Intent(CalculateActivity.this, ResultsActivity.class);

                intent.putExtra("ingredient", etRecipe.getText().toString());
                intent.putExtra("amount", etAmount.getText().toString());
                intent.putExtra("quantity", etQuantity.getText().toString());
                startActivity(intent);
            }
        });
    }

        public void onRadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radio_multiply:
                    if (checked)
                        // Pirates are the best
                        break;
                case R.id.radio_divide:
                    if (checked)
                        // Ninjas rule
                        break;
            }
        }
    }

