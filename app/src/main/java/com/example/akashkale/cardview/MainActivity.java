package com.example.akashkale.cardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView ComplainId1, MyHistory1, Payment1, ContactDoc, AboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ComplainId1 = (CardView) findViewById(R.id.ComplainId);
        MyHistory1 = (CardView) findViewById(R.id.MyHistory);
        Payment1 = (CardView) findViewById(R.id.Payment);
        ContactDoc = (CardView) findViewById(R.id.ContactDoctor);
        AboutUs = (CardView) findViewById(R.id.AboutUs);
        ComplainId1.setOnClickListener(this);
        MyHistory1.setOnClickListener(this);
        Payment1.setOnClickListener(this);
        ContactDoc.setOnClickListener(this);
        AboutUs.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.ComplainId:
                i = new Intent(MainActivity.this, ComplainActivity.class);
                startActivity(i);
                break;
            case R.id.MyHistory:
                i = new Intent(MainActivity.this, ComplainActivity.class);
                startActivity(i);
                break;
            default:
                break;
/*
        Intent i = new Intent(MainActivity.this, ComplainActivity.class);
        startActivity(i);
        finish();*/
        }
    }
}

