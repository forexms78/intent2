package com.example.intent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class gub extends Activity {

    EditText txt;
    Button end;
    View.OnClickListener cl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gub);

        txt = (EditText)findViewById(R.id.text);
        end = (Button)findViewById(R.id.end);

        int a,b,c;
        Intent i;
        i = getIntent();
        a = i.getIntExtra("ab",1);
        b = i.getIntExtra("cd",1);
        c = a * b;
        txt.setText("곱샘=" + c);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.end:
                        finish();
                        break;
                }
            }
        };
        end.setOnClickListener(cl);
    }
}
