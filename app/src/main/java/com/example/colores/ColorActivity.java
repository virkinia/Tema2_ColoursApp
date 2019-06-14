package com.example.colores;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        LinearLayout main = findViewById(R.id.MainLayout);
        main.setBackgroundColor(getIntent().getIntExtra("color", 3));

    }
}
