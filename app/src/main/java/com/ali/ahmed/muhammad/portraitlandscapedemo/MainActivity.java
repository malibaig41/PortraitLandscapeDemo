package com.ali.ahmed.muhammad.portraitlandscapedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.tv_fragment_source);
        textView.setText("Fragment is added through XML");

//        Crashing app
//        getActionBar().setTitle("MainActivity");

    }

    public void showSecondActivity(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
