package com.icdatofcusgmail.passdataapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

      //  TextView textView = (TextView) findViewById(R.id.textView);
    //    Bundle bundle = getIntent().getExtras();
     //   bundle.getParcelable("name");
     //   textView.setText(bundle.getString("name"));

     //   TextView textView2 = (TextView) findViewById(R.id.textView2);
     //   Bundle bundle1 = getIntent().getExtras();
     //   bundle1.getParcelable("name2");
     //   textView2.setText(bundle1.getString("name2"));

        Intent in = getIntent();
        Intent inn = getIntent();

        String id = in.getStringExtra("name");
        String idd = inn.getStringExtra("name2");
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView2.setText(id);
        textView.setText(idd);




    }
}
