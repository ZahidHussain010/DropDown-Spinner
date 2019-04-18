package com.example.gulraiztariq.androidtutorials.examples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.gulraiztariq.androidtutorials.R;

import java.util.ArrayList;
import java.util.List;

public class DropdownActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dropdown);

        spinner =findViewById(R.id.spinnerExample);
        spinner.setOnItemSelectedListener(this);
        // Spinner Drop down elements
        List<String> categories = new ArrayList <String>();
        categories.add("Android");
        categories.add("Asp.Net");
        categories.add("PHP");
        categories.add("Html");
        categories.add("C#");
        categories.add("SQL");
        ArrayAdapter<String> adapter = new ArrayAdapter<String >(this,android.R.layout.simple_spinner_item,categories);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item=parent.getItemAtPosition(position).toString();
        Toast.makeText(this, "Selected Item"+item, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
