package com.example.teeshirt.bargain;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


public class Brands extends ActionBarActivity {
    ListView list;
    String[] television = {"Sony","Samsung","LG","Sanyo","Skyworth","Hotpoint"};
    Integer[] imageId = {R.drawable.sony,R.drawable.samsung,R.drawable.lg,R.drawable.sanyo,R.drawable.skyworth,R.drawable.hotpoint};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brands);


        CustomList adapter = new CustomList(Brands.this, television, imageId);
        list = (ListView)findViewById(R.id.list);



        list.setAdapter(adapter);

        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(Brands.this, Item.class);
                        startActivity(intent);
                    }
                }
        );




    }






}
