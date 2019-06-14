package com.example.colores;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class ColorActivity extends AppCompatActivity {

    FloatingActionButton button;
    ImageView image;
    RadioGroup radioGroup;
    RadioButton rbSuave;
    RelativeLayout main;
    Integer color;
    String url = "https://www.google.com/search?q=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        initUI();
        initListener();
        setColorBackground();


        rbSuave.setChecked(true);

    }



    private void initUI() {

        button = findViewById(R.id.floatingActionButton);
        image = findViewById(R.id.image);
        main = findViewById(R.id.MainLayout);
        radioGroup = findViewById(R.id.RadioGroup);
        rbSuave = findViewById(R.id.rBSuave);


    }

    private void initListener(){

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse(url));
                startActivity(viewIntent);
            }
        });



        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                switch (checkedId) {
                    case R.id.rBSuave:
                        image.setAlpha(0.4f);
                        break;

                    case R.id.rBFuerte:
                        image.setAlpha(1f);
                        break;
                }
            }
        });

    }

    private void setColorBackground() {


        color = getIntent().getIntExtra("color", 3);
        main.setBackgroundColor(color);

        switch (color) {
            case Color
                    .BLACK:
                url += "negro";

                image.setImageResource(R.drawable.negro);

                break;
            case Color
                    .BLUE:
                url += "azul";
                image.setImageResource(R.drawable.azul);
                break;
            case Color
                    .RED:
                url += "rojo";
                image.setImageResource(R.drawable.sofa);
                break;
            case Color
                    .GREEN:

                url += "verde";
                image.setImageResource(R.drawable.verde);
                break;


        }

    }
}
