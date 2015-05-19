package com.example.teeshirt.bargain;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Products extends ActionBarActivity {
    public Bundle frag;
    private String fragName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);


        frag = getIntent().getExtras();
        if (frag!=null){
            fragName = frag.getString("frag");
            //Toast.makeText(getBaseContext(),fragName,Toast.LENGTH_SHORT).show();
            changeFragment();
        }


    }


    public void changeFragment(){
        Fragment fragment;

        if (fragName.equals("Groceries")){
            fragment = new GroceriesFragment();
            FragmentManager fm  = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentholder,fragment);
            ft.commit();
        }

        if (fragName.equals("Household")){
            fragment = new HouseholdFragment();
            FragmentManager fm  = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentholder,fragment);
            ft.addToBackStack(null);
            ft.commit();
        }

        if (fragName.equals("Grooming")){
            fragment = new GroomingFragment();
            FragmentManager fm  = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentholder,fragment);
            ft.addToBackStack(null);
            ft.commit();
        }

        if (fragName.equals("Deli")){
            fragment = new DeliFragment();
            FragmentManager fm  = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentholder,fragment);
            ft.addToBackStack(null);
            ft.commit();
        }

        if (fragName.equals("Electronics")){
            fragment = new ElectronicsFragment();
            FragmentManager fm  = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentholder,fragment);
            ft.addToBackStack(null);
            ft.commit();
        }

        if (fragName.equals("Liquor")){
            fragment = new LiquorFragment();
            FragmentManager fm  = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentholder,fragment);
            ft.addToBackStack(null);
            ft.commit();
        }

    }



}
