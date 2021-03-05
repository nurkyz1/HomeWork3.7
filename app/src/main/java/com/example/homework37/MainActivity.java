package com.example.homework37;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText= findViewById(R.id.edit_txt);
        button=findViewById(R.id.btn);
        textView = findViewById(R.id.tv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),SecondActivity.class);
                String tex= editText.getText().toString();
                intent.putExtra("name",tex);
//                setResult(RESULT_OK,intent);
//                finish();
                startActivity(intent);
            }
        });
    }

//   @Override
//   protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//           super.onActivityResult(requestCode, resultCode, data);
//
//       if (requestCode==40&&resultCode==RESULT_OK){
//              String valueEdit = data.getStringExtra("name");
//            textView.setText(valueEdit);
//        }
//    }
}