package com.dohner.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton button = (ImageButton) findViewById(R.id.button);
        final TextView text = (TextView) findViewById(R.id.textView);
        text.setVisibility(View.INVISIBLE);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                checkPriviledge(button,text);
            }

    });


}

    public static void checkPriviledge(ImageButton button, TextView text) {

        button.setVisibility(View.GONE);
        text.setVisibility(View.VISIBLE);

    }

}