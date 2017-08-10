package com.ali.ahmed.muhammad.portraitlandscapedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.tv_fragment_source);
        textView.setText("Fragment is added through Code");

//        getActionBar().setTitle("Second Activity");

        showFirstFragment();
    }

    private void showFirstFragment() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Fragment fragment = FirstFragment.newInstance();
        fragmentTransaction.add(R.id.fragment_container, fragment, "firstFragment");
        fragmentTransaction.commit();
    }

    public void showThirdActivity(View view) {
        startActivity(new Intent(this, ThirdActivity.class));
    }
}
