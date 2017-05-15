package com.icdatofcusgmail.passdataapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = (Button) findViewById(R.id.okkay);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String s = getIntent().getStringExtra("name");
        String ss = getIntent().getStringExtra("name2");
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("name", s);
        i.putExtra("name2", ss);
        startActivity(i);
    }

}
