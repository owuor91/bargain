package com.example.teeshirt.bargain;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class GroceriesFragment extends Fragment {


    public static Fragment newInstance(Context context) {
        GroceriesFragment f = new GroceriesFragment();
        return f;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_groceries, null);
        GridView gridview=(GridView)root.findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(getActivity()));
        return root;



    }


}


