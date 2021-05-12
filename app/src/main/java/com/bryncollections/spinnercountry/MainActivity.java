package com.bryncollections.spinnercountry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<CountryItem> mCountryList;
    private CountryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();
        Spinner spinnerCountries = findViewById(R.id.spinner_countries);

        mAdapter = new CountryAdapter( this, mCountryList);
        spinnerCountries.setAdapter(mAdapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryItem clickedItem = (CountryItem) parent.getItemAtPosition(position);
                String clickedCountryName = clickedItem.getCountryName();
                Toast.makeText(MainActivity.this, clickedCountryName + " selected ", Toast.LENGTH_LONG).show();
            }


                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }

        });

    }

    private void initList() {
        mCountryList = new ArrayList<>();
        mCountryList.add(new CountryItem("England", R.drawable.england));
        mCountryList.add(new CountryItem("France", R.drawable.france));
        mCountryList.add(new CountryItem("Uk", R.drawable.uk));
        mCountryList.add(new CountryItem("USA", R.drawable.usa));
        mCountryList.add(new CountryItem("Nigeria", R.drawable.nigeria));
    }
}