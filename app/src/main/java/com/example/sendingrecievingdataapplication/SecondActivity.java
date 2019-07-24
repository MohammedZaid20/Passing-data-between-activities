package com.example.sendingrecievingdataapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String TheMessage;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent FromMainActivity = getIntent();
        TheMessage = FromMainActivity.getStringExtra("msg");
    }


    @Override
    protected void onStart() {
        super.onStart();
        TextView Message = findViewById(R.id.Message);
        Message.setText(TheMessage);
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}
