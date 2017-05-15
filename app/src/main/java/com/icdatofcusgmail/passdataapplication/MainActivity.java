package com.icdatofcusgmail.passdataapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //The below slides up from bottom  1
        overridePendingTransition(R.anim.slide_up_in, R.anim.slide_up_out);

        //moves MainActivity behind by going down then SecondActivity coming up. 2
        overridePendingTransition(R.anim.design_snackbar_in, R.anim.design_snackbar_out);

        //Just like 1
        overridePendingTransition(R.anim.push_in_to_bottom, R.anim.push_out_to_bottom);



        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        Button button = (Button) findViewById(R.id.button6);
        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
    }


        private void sendData() {

        Intent intent = new Intent(getBaseContext(), Main2Activity.class);

        Bundle bundle = new Bundle();
        Bundle bundle1 = new Bundle();
        bundle.putString("name", button2.getText().toString());
        bundle1.putString("name2", button3.getText().toString());

        intent.putExtras(bundle);
        intent.putExtras(bundle1);

        startActivity(intent);
            overridePendingTransition(R.anim.sheet_hide, R.anim.sheet_show);

        }
}
