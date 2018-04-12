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

                final EditText value1 = (EditText) findViewById(R.id.quantity);
                final EditText value2 = (EditText) findViewById(R.id.calculateAmount);
                final EditText value3 = (EditText) findViewById(R.id.quantity2);
                final EditText value4 = (EditText) findViewById(R.id.quantity3);
                final EditText value5 = (EditText) findViewById(R.id.quantity4);
                final EditText value6 = (EditText) findViewById(R.id.quantity5);
                final EditText value7 = (EditText) findViewById(R.id.quantity6);
                final EditText value8 = (EditText) findViewById(R.id.quantity7);
                final EditText value9 = (EditText) findViewById(R.id.quantity8);

                final TextView result = (TextView) findViewById(R.id.quantity);
                final TextView result2 = (TextView) findViewById(R.id.quantity2);
                final TextView result3 = (TextView) findViewById(R.id.quantity3);
                final TextView result4 = (TextView) findViewById(R.id.quantity4);
                final TextView result5 = (TextView) findViewById(R.id.quantity5);
                final TextView result6 = (TextView) findViewById(R.id.quantity6);
                final TextView result7 = (TextView) findViewById(R.id.quantity7);
                final TextView result8 = (TextView) findViewById(R.id.quantity8);


                int val1 = Integer.parseInt(value1.getText().toString());
                int val2 = Integer.parseInt(value2.getText().toString());
                int val3 = Integer.parseInt(value3.getText().toString());
                int val4 = Integer.parseInt(value4.getText().toString());
                int val5 = Integer.parseInt(value5.getText().toString());
                int val6 = Integer.parseInt(value6.getText().toString());
                int val7 = Integer.parseInt(value7.getText().toString());
                int val8 = Integer.parseInt(value8.getText().toString());
                int val9 = Integer.parseInt(value9.getText().toString());


                Integer answer = val1 * val2;
                Integer answer2 = val3 * val2;
                Integer answer3 = val4 * val2;
                Integer answer4 = val5 * val2;
                Integer answer5 = val6 * val2;
                Integer answer6 = val7 * val2;
                Integer answer7 = val8 * val2;
                Integer answer8 = val9 * val2;

                result.setText(answer.toString());
                result2.setText(answer2.toString());
                result3.setText(answer3.toString());
                result4.setText(answer4.toString());
                result5.setText(answer5.toString());
                result6.setText(answer6.toString());
                result7.setText(answer7.toString());
                result8.setText(answer8.toString());


                Intent intent = new Intent(CalculateActivity.this, ResultsActivity.class);
                EditText etRecipe = (EditText) findViewById(R.id.ingredient);
                EditText etRecipe2 = (EditText) findViewById(R.id.ingredient2);
                EditText etRecipe3 = (EditText) findViewById(R.id.ingredient3);
                EditText etRecipe4 = (EditText) findViewById(R.id.ingredient4);
                EditText etRecipe5 = (EditText) findViewById(R.id.ingredient5);
                EditText etRecipe6 = (EditText) findViewById(R.id.ingredient6);
                EditText etRecipe7 = (EditText) findViewById(R.id.ingredient7);
                EditText etRecipe8 = (EditText) findViewById(R.id.ingredient8);

                EditText etUnit = (EditText) findViewById(R.id.units);
                EditText etQuantity = (EditText) findViewById(R.id.quantity);
                EditText etQuantity2 = (EditText) findViewById(R.id.quantity2);
                EditText etQuantity3 = (EditText) findViewById(R.id.quantity3);
                EditText etQuantity4 = (EditText) findViewById(R.id.quantity4);
                EditText etQuantity5 = (EditText) findViewById(R.id.quantity5);
                EditText etQuantity6 = (EditText) findViewById(R.id.quantity6);
                EditText etQuantity7 = (EditText) findViewById(R.id.quantity7);
                EditText etQuantity8 = (EditText) findViewById(R.id.quantity8);



                EditText etNotes = (EditText) findViewById(R.id.notes);
                intent.putExtra("ingredient", etRecipe.getText().toString());
                intent.putExtra("ingredient2", etRecipe2.getText().toString());
                intent.putExtra("ingredient3", etRecipe3.getText().toString());
                intent.putExtra("ingredient4", etRecipe4.getText().toString());
                intent.putExtra("ingredient5", etRecipe5.getText().toString());
                intent.putExtra("ingredient6", etRecipe6.getText().toString());
                intent.putExtra("ingredient7", etRecipe7.getText().toString());
                intent.putExtra("ingredient8", etRecipe8.getText().toString());

                intent.putExtra("units", etUnit.getText().toString());
                intent.putExtra("notes", etNotes.getText().toString());

                intent.putExtra("quantity", etQuantity.getText().toString());
                intent.putExtra("quantity2", etQuantity2.getText().toString());
                intent.putExtra("quantity3", etQuantity3.getText().toString());
                intent.putExtra("quantity4", etQuantity4.getText().toString());
                intent.putExtra("quantity5", etQuantity5.getText().toString());
                intent.putExtra("quantity6", etQuantity6.getText().toString());
                intent.putExtra("quantity7", etQuantity7.getText().toString());
                intent.putExtra("quantity8", etQuantity8.getText().toString());
                startActivity(intent);
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final EditText value1 = (EditText) findViewById(R.id.quantity);
                final EditText value2 = (EditText) findViewById(R.id.calculateAmount);
                final EditText value3 = (EditText) findViewById(R.id.quantity2);
                final EditText value4 = (EditText) findViewById(R.id.quantity3);
                final EditText value5 = (EditText) findViewById(R.id.quantity4);
                final EditText value6 = (EditText) findViewById(R.id.quantity5);
                final EditText value7 = (EditText) findViewById(R.id.quantity6);
                final EditText value8 = (EditText) findViewById(R.id.quantity7);
                final EditText value9 = (EditText) findViewById(R.id.quantity8);

                final TextView result = (TextView) findViewById(R.id.quantity);
                final TextView result2 = (TextView) findViewById(R.id.quantity2);
                final TextView result3 = (TextView) findViewById(R.id.quantity3);
                final TextView result4 = (TextView) findViewById(R.id.quantity4);
                final TextView result5 = (TextView) findViewById(R.id.quantity5);
                final TextView result6 = (TextView) findViewById(R.id.quantity6);
                final TextView result7 = (TextView) findViewById(R.id.quantity7);
                final TextView result8 = (TextView) findViewById(R.id.quantity8);


                int val1 = Integer.parseInt(value1.getText().toString());
                int val2 = Integer.parseInt(value2.getText().toString());
                int val3 = Integer.parseInt(value3.getText().toString());
                int val4 = Integer.parseInt(value4.getText().toString());
                int val5 = Integer.parseInt(value5.getText().toString());
                int val6 = Integer.parseInt(value6.getText().toString());
                int val7 = Integer.parseInt(value7.getText().toString());
                int val8 = Integer.parseInt(value8.getText().toString());
                int val9 = Integer.parseInt(value9.getText().toString());


                Integer answer = val1 / val2;
                Integer answer2 = val3 / val2;
                Integer answer3 = val4 / val2;
                Integer answer4 = val5 / val2;
                Integer answer5 = val6 / val2;
                Integer answer6 = val7 / val2;
                Integer answer7 = val8 / val2;
                Integer answer8 = val9 / val2;

                result.setText(answer.toString());
                result2.setText(answer2.toString());
                result3.setText(answer3.toString());
                result4.setText(answer4.toString());
                result5.setText(answer5.toString());
                result6.setText(answer6.toString());
                result7.setText(answer7.toString());
                result8.setText(answer8.toString());


                Intent intent = new Intent(CalculateActivity.this, ResultsActivity.class);
                EditText etRecipe = (EditText) findViewById(R.id.ingredient);
                EditText etRecipe2 = (EditText) findViewById(R.id.ingredient2);
                EditText etRecipe3 = (EditText) findViewById(R.id.ingredient3);
                EditText etRecipe4 = (EditText) findViewById(R.id.ingredient4);
                EditText etRecipe5 = (EditText) findViewById(R.id.ingredient5);
                EditText etRecipe6 = (EditText) findViewById(R.id.ingredient6);
                EditText etRecipe7 = (EditText) findViewById(R.id.ingredient7);
                EditText etRecipe8 = (EditText) findViewById(R.id.ingredient8);

                EditText etUnit = (EditText) findViewById(R.id.units);
                EditText etQuantity = (EditText) findViewById(R.id.quantity);
                EditText etQuantity2 = (EditText) findViewById(R.id.quantity2);
                EditText etQuantity3 = (EditText) findViewById(R.id.quantity3);
                EditText etQuantity4 = (EditText) findViewById(R.id.quantity4);
                EditText etQuantity5 = (EditText) findViewById(R.id.quantity5);
                EditText etQuantity6 = (EditText) findViewById(R.id.quantity6);
                EditText etQuantity7 = (EditText) findViewById(R.id.quantity7);
                EditText etQuantity8 = (EditText) findViewById(R.id.quantity8);



                EditText etNotes = (EditText) findViewById(R.id.notes);
                intent.putExtra("ingredient", etRecipe.getText().toString());
                intent.putExtra("ingredient2", etRecipe2.getText().toString());
                intent.putExtra("ingredient3", etRecipe3.getText().toString());
                intent.putExtra("ingredient4", etRecipe4.getText().toString());
                intent.putExtra("ingredient5", etRecipe5.getText().toString());
                intent.putExtra("ingredient6", etRecipe6.getText().toString());
                intent.putExtra("ingredient7", etRecipe7.getText().toString());
                intent.putExtra("ingredient8", etRecipe8.getText().toString());

                intent.putExtra("units", etUnit.getText().toString());
                intent.putExtra("notes", etNotes.getText().toString());

                intent.putExtra("quantity", etQuantity.getText().toString());
                intent.putExtra("quantity2", etQuantity2.getText().toString());
                intent.putExtra("quantity3", etQuantity3.getText().toString());
                intent.putExtra("quantity4", etQuantity4.getText().toString());
                intent.putExtra("quantity5", etQuantity5.getText().toString());
                intent.putExtra("quantity6", etQuantity6.getText().toString());
                intent.putExtra("quantity7", etQuantity7.getText().toString());
                intent.putExtra("quantity8", etQuantity8.getText().toString());
                startActivity(intent);
            }
        });


    }
//    @Override
//    public void onClick(View v) {
//        String edtval = edttxt.getText().toString().trim();
//
//        if(!edtval.equals("")){
//            int val = Integer.parseInt(edtval);
//            int finalval = val - 30;
//
//            textview.setText(finalval+"");
//        }
//    }
}

