package com.example.teeshirt.bargain;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ElectronicsFragment extends Fragment {



    public ElectronicsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View view = inflater.inflate(R.layout.fragment_electronics, container, false);
        final GridView gridView = (GridView)view.findViewById(R.id.gridviewElec);
        gridView.setAdapter(new ElecImageAdapter(view.getContext()));


        gridView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String item = (String)gridView.getItemAtPosition(position);
                        //Intent i = new Intent(view.getContext(), Brands.class);
                        Toast.makeText(getActivity(),item,Toast.LENGTH_SHORT).show();

                    }
                }
        );

        return view;
    }


}
