package com.example.oefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input;
    TextView answer;
    Button check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=findViewById(R.id.input);
        answer=findViewById(R.id.showAns);
        check=findViewById(R.id.check);


        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s_input=input.getText().toString();
                int in_input=Integer.parseInt(s_input);
                if (in_input%2==0){
                    answer.setText("It is an Even number");
                }
                else {
                    answer.setText("It is an Odd number");
                }
                Toast.makeText(MainActivity.this, "Process Done", Toast.LENGTH_SHORT).show();
            }
        });


    }
}