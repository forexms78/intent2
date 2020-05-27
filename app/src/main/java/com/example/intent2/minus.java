package com.example.intent2;

import android.app.Activity;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.View;
import android.widget.EditText;

public class minus extends Activity {

    EditText txt;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        setContentView(R.layout.minus);

        txt = (EditText) findViewById(R.id.text);

        String s1,s2;
        int n1, n2, n3;
        Intent i;
        i = getIntent();
        s1 = i.getStringExtra("cc");
        s2 = i.getStringExtra("dd");
        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);
        n3 = n1 - n2;
        txt.setText("뺴기="+ n3);
    }
}
