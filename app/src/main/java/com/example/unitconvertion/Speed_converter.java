package com.example.unitconvertion;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Speed_converter extends AppCompatActivity {

    Spinner fromUnit, toUnit;
    EditText inputValue;
    TextView resultView;
    Button convertBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_converter);

        fromUnit = findViewById(R.id.fromUnit);
        toUnit = findViewById(R.id.toUnit);
        inputValue = findViewById(R.id.inputValue);
        resultView = findViewById(R.id.resultView);
        convertBtn = findViewById(R.id.convertBtn);

        String[] units = {"km/h", "mph", "m/s"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, units);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromUnit.setAdapter(adapter);
        toUnit.setAdapter(adapter);

        convertBtn.setOnClickListener(v -> {
            String inputStr = inputValue.getText().toString().trim();
            if (inputStr.isEmpty()) {
                resultView.setText("Please enter a value.");
                return;
            }

            try {
                double input = Double.parseDouble(inputStr);
                String from = fromUnit.getSelectedItem().toString();
                String to = toUnit.getSelectedItem().toString();

                double result = SpeedConverterUtil.convertSpeed(input, from, to);
                resultView.setText(String.format("%.2f %s", result, to));
            } catch (NumberFormatException e) {
                resultView.setText("Invalid input.");
            }
        });
    }
}
