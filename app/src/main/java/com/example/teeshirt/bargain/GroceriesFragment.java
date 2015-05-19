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

        View view = inflater.inflate(R.layout.fragment_groceries, container, false);
        GridView gridview=(GridView) view.findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(view.getContext()));


        gridview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                       Toast.makeText(getActivity(),"Wow",Toast.LENGTH_SHORT).show();
                    }
                }
        );

        return view;
    }


}


