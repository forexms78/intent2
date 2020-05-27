package com.example.intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button add, sub, gub;
    View.OnClickListener cl;
    Intent i,i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.subtract);
        gub = (Button) findViewById(R.id.gub);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.add:
                        i = new Intent(getApplicationContext(), plus.class);
                        int n1, n2;
                        n1 = Integer.parseInt(num1.getText().toString());
                        n2 = Integer.parseInt(num2.getText().toString());
                        i.putExtra("aa",n1);
                        i.putExtra("bb",n2);
                        startActivity(i);
                        break;
                    case R.id.subtract:
                        i = new Intent(getApplicationContext(), minus.class);
                        i.putExtra("cc",num1.getText().toString());
                        i.putExtra("dd",num2.getText().toString());
                        startActivity(i);
                        break;
                    case R.id.gub:
                        i1 = new Intent(getApplicationContext(), gub.class);
                        int n3,n4;
                        n3 = Integer.parseInt(num1.getText().toString());
                        n4 = Integer.parseInt(num2.getText().toString());
                        i1.putExtra("ab",n3);
                        i1.putExtra("cd",n4);
                        startActivity(i1);
                        break;
                }
            }
        };
        add.setOnClickListener(cl);
        sub.setOnClickListener(cl);
        gub.setOnClickListener(cl);
    }
}
