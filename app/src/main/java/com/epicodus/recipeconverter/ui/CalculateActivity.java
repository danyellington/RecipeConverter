package com.epicodus.recipeconverter.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.epicodus.recipeconverter.R;

import javax.microedition.khronos.egl.EGLDisplay;

public class CalculateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        final Button calculateButton = (Button) findViewById(R.id.calculateButton);
        final Button divButton = (Button) findViewById(R.id.divButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final EditText value1=(EditText) findViewById(R.id.calculateAmount);
                final EditText value2=(EditText) findViewById(R.id.quantity);
                final TextView result=(TextView) findViewById (R.id.quantity);

                    int val1=Integer.parseInt(value1.getText().toString());
                    int val2=Integer.parseInt(value2.getText().toString());
                    Integer answer = val1*val2;
                    result.setText(answer.toString());



                Intent intent = new Intent(CalculateActivity.this, ResultsActivity.class);
                EditText etRecipe = (EditText) findViewById(R.id.calculate);
                EditText etUnit = (EditText) findViewById(R.id.units);
                //EditText etAmount = (EditText) findViewById(R.id.calculateAmount);
                EditText etQuantity = (EditText) findViewById(R.id.quantity);
                EditText etNotes = (EditText) findViewById(R.id.notes);
                intent.putExtra("ingredient", etRecipe.getText().toString());
                intent.putExtra("units", etUnit.getText().toString());
               // intent.putExtra("amount", etAmount.getText().toString());
                intent.putExtra("quantity", etQuantity.getText().toString());
                intent.putExtra("notes", etNotes.getText().toString());
                startActivity(intent);
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final EditText value1 = (EditText) findViewById(R.id.quantity);
                final EditText value2 = (EditText) findViewById(R.id.calculateAmount);
                final TextView result = (TextView) findViewById(R.id.quantity);


                int val1 = Integer.parseInt(value1.getText().toString());
                int val2 = Integer.parseInt(value2.getText().toString());
                Integer answer = val1 / val2;
                result.setText(answer.toString());

                Intent intent = new Intent(CalculateActivity.this, ResultsActivity.class);
                EditText etRecipe = (EditText) findViewById(R.id.calculate);
                EditText etUnit = (EditText) findViewById(R.id.units);
              //  EditText etAmount = (EditText) findViewById(R.id.calculateAmount);
                EditText etQuantity = (EditText) findViewById(R.id.quantity);
                EditText etNotes = (EditText) findViewById(R.id.notes);
                intent.putExtra("ingredient", etRecipe.getText().toString());
                intent.putExtra("units", etUnit.getText().toString());
               // intent.putExtra("amount", etAmount.getText().toString());
                intent.putExtra("quantity", etQuantity.getText().toString());
                intent.putExtra("notes", etNotes.getText().toString());
                startActivity(intent);
            }
        });
        }



//        public void onRadioButtonClicked(View view) {
//            // Is the button now checked?
//            boolean checked = ((RadioButton) view).isChecked();
//
//            // Check which radio button was clicked
//            switch(view.getId()) {
//                case R.id.radio_multiply:
//                    if (checked)
//                        // Pirates are the best
//                        break;
//                case R.id.radio_divide:
//                    if (checked)
//                        // Ninjas rule
//                        break;
//            }
//        }
    }

