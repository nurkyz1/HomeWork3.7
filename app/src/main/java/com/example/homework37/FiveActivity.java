package com.example.homework37;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FiveActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        button= findViewById(R.id.btn5);
        textView= findViewById(R.id.tv);
        editText=findViewById(R.id.edit_txt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = getIntent();
             String text = intent.getStringExtra("name4");
             textView.setText(text);

            }
        });
    }
}