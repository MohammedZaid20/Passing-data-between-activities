package com.example.sendingrecievingdataapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText MsgEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Mohammed.r.zaid20@Gmail.com
    // +218 94 579 8487
    // Tripoli, Libya FB: @Mohammed.Zaid20

    public void SendingButton(View view) {
        MsgEditText = findViewById(R.id.msgEditTextView);
        String MsgOne = MsgEditText.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("msg",MsgOne);
        if (MsgOne.length() == 0 ) {
            Toast.makeText(this, "write a message before", Toast.LENGTH_SHORT).show();
        } else {
            startActivity(intent);
        }
    }

    public void moveto(View view) {
        Intent moveto = new Intent(this, SecondActivity.class);

    }
}
