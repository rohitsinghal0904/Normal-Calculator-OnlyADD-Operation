package com.example.nrmlcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.textView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1+f2;
                String s3=Float.toString(f3);
                t1.setText(s3);
                Toast.makeText(MainActivity.this, "The REsult is"+s3, Toast.LENGTH_SHORT).show();
            }
        });
    }
}