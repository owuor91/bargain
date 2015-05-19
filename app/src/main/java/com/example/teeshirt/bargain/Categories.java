package com.example.teeshirt.bargain;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import mehdi.sakout.fancybuttons.FancyButton;


public class Categories extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }

    public void prodActivity(View view){
        Intent intent = new Intent(this, Products.class);
        intent.putExtra("frag", "Groceries");
        startActivity(intent);
    }

    public void prodActivity2(View view){
        Intent intent = new Intent(this, Products.class);
        intent.putExtra( "frag", "Household" );
        startActivity(intent);
    }

    public void prodActivity3(View view){
        Intent intent = new Intent(this, Products.class);
        intent.putExtra( "frag", "Grooming" );
        startActivity(intent);
    }

    public void prodActivity4(View view){
        Intent intent = new Intent(this, Products.class);
        intent.putExtra( "frag", "Deli" );
        startActivity(intent);
    }

    public void prodActivity5(View view){
        Intent intent = new Intent(this, Products.class);
        intent.putExtra( "frag", "Electronics" );
        startActivity(intent);
    }

    public void prodActivity6(View view){
        Intent intent = new Intent(this, Products.class);
        intent.putExtra( "frag", "Liquor" );
        startActivity(intent);
    }


}
