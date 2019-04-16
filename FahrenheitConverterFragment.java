package com.example.jsu.lab4b;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FahrenheitConverterFragment extends Fragment implements View.OnClickListener {

    public FahrenheitConverterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View newView = inflater.inflate(R.layout.fragment_fahrenheit_converter, container, false);
        Button b = (Button) newView.findViewById(R.id.calculateButton);
        b.setOnClickListener(this);
        return newView;
    }

    public void onClick(View v){
        String fahrenheit = ((EditText) getView().findViewById(R.id.fahrenheitEditText)).getText().toString();
        String celsius = ((EditText) getView().findViewById(R.id.celsiusEditText)).getText().toString();

        if (fahrenheit.isEmpty()){
            if (!celsius.isEmpty()){
                double c = Double.valueOf(celsius);
                double f = ((c * 9 / 5) + 32);
                ((EditText) getView().findViewById(R.id.fahrenheitEditText)).setText(Double.toString(f));
            }
        }
        else{
            double f = Double.valueOf(fahrenheit);
            double c = ((f - 32) * 5 / 9);
            ((EditText) getView().findViewById(R.id.celsiusEditText)).setText(Double.toString(c));
        }

    }

}