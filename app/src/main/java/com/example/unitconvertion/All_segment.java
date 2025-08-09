package com.example.unitconvertion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class All_segment extends AppCompatActivity {
    ImageView weight, length, speed, fuel, cooking, area, volume,time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_all_segment);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        weight = findViewById(R.id.weight);
        length = findViewById(R.id.length);
        speed = findViewById(R.id.speed);
        fuel = findViewById(R.id.fuel);
        time = findViewById(R.id.time);
        cooking = findViewById(R.id.temperature);
        area = findViewById(R.id.area);
        volume = findViewById(R.id.volume);

        weight.setOnClickListener(v -> {
            startActivity(new Intent(All_segment.this, Weight_converter.class));
        });
        length.setOnClickListener(v -> {
            startActivity(new Intent(All_segment.this, Length_converter.class));
        });
        speed.setOnClickListener(v -> {
            startActivity(new Intent(All_segment.this, Speed_converter.class));
        });
        fuel.setOnClickListener(v -> {
            startActivity(new Intent(All_segment.this, Fuel_converter.class));
        });
        time.setOnClickListener(v -> {
            startActivity(new Intent(All_segment.this, Time_converter.class));
        });

        cooking.setOnClickListener(v -> {
            startActivity(new Intent(All_segment.this, Temperature_convertor.class));
        });
        area.setOnClickListener(v -> {
            startActivity(new Intent(All_segment.this, Area_converter.class));
        });
        volume.setOnClickListener(v -> {
            startActivity(new Intent(All_segment.this, Volume_converter.class));
        });







        }


    }
