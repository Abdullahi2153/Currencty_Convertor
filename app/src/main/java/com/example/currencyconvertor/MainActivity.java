package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextDollar;
    private Button buttonConvert;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextDollar = findViewById(R.id.editTextDollor);
        textViewResult = findViewById(R.id.textViewResult);
        buttonConvert = findViewById(R.id.buttonConvert);

        buttonConvert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (editTextDollar.getText().toString().length() > 0){
            double dollor = Double.parseDouble(editTextDollar.getText().toString());
            double result = dollor * 40;
            textViewResult.setText(result+" kun");
        }else{
            Toast.makeText(this, "Fadlan Gali Tiro", Toast.LENGTH_SHORT).show();
        }


    }
}