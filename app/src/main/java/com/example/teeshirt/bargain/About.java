package com.example.teeshirt.bargain;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import at.markushi.ui.CircleButton;


public class About extends ActionBarActivity {
    public CircleButton cbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        cbtn = (CircleButton)findViewById(R.id.cbtn);

        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(About.this, Categories.class);
                startActivity(i);
            }
        });
    }


}
