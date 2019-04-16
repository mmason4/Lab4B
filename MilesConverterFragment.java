package com.example.jsu.lab4b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class MilesConverterFragment extends Fragment implements View.OnClickListener {


    public MilesConverterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View newView = inflater.inflate(R.layout.fragment_miles_converter, container, false);
        Button b = (Button) newView.findViewById(R.id.calculateButton);
        b.setOnClickListener(this);
        return newView;
    }

    public void onClick(View v){
        String miles = ((EditText) getView().findViewById(R.id.milesEditText)).getText().toString();
        String kilometers = ((EditText) getView().findViewById(R.id.kilometersEditText)).getText().toString();

        if (miles.isEmpty()){
            if (!kilometers.isEmpty()){
                Double m = Double.valueOf(kilometers) / 1.609344;
                ((EditText) getView().findViewById(R.id.milesEditText)).setText(Double.toString(m));
            }
        }
        else{
            Double km = Double.valueOf(miles) * 1.609344;
            ((EditText) getView().findViewById(R.id.kilometersEditText)).setText(Double.toString(km));
        }
    }

}