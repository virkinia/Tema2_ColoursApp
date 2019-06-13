package com.example.colores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonRed, buttonBlue, buttonGreen, buttonBlack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRed = findViewById(R.id.buttonRed);
        buttonRed.setOnClickListener(this);
        buttonBlue = findViewById(R.id.buttonBlue);
        buttonBlue.setOnClickListener(this);
        buttonGreen = findViewById(R.id.buttonGreen);
        buttonGreen.setOnClickListener(this);
        buttonBlack = findViewById(R.id.buttonBlack);
        buttonBlack.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Button b = (Button) v;
        String message = "No ha pulsado nada";

        switch (b.getId())
        {
            //handle multiple view click events
            case R.id.buttonBlack:
                message="Black";
                Log.e("MainActivity", "Black");
            break;
            case R.id.buttonBlue:
                message="Blue";
                Log.e("MainActivity", "Blue");
            break;
            case R.id.buttonRed:
                message="Red";
                Log.e("MainActivity", "Red");
            break;
            case R.id.buttonGreen:
                message="Green";
                Log.e("MainActivity", "Green");
            break;

        }

         Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();


    }
}
