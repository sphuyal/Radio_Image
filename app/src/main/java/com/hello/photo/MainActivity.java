package com.hello.photo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    RadioButton btn1,btn2,btn3;
    ImageView imv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        imv = findViewById(R.id.imv);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn1 :
                imv.setImageResource(R.drawable.tiger);
                break;

            case R.id.btn2 :
                imv.setImageResource(R.drawable.lion);
                break;

            case R.id.btn3 :
                imv.setImageResource(R.drawable.horse);
                break;
        }

    }
}

