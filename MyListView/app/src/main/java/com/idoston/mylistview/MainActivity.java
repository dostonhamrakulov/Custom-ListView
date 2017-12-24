package com.idoston.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        Toast.makeText(MainActivity.this, "onCreate: Started", Toast.LENGTH_SHORT).show();
        //Log.d(TAG, "onCreate: Started.");

        ArrayList<String> names = new ArrayList<>();
        names.add("Doston");
        names.add("Bobosher");
        names.add("Orifjon");
        names.add("Dilmurod");
        names.add("Xusan");
        names.add("Hyein");
        names.add("Kwon");
        names.add("John");
        names.add("Smith");
        names.add("Anvar");
        names.add("Doston");
        names.add("Bobosher");
        names.add("Orifjon");
        names.add("Dilmurod");
        names.add("Xusan");
        names.add("Hyein");
        names.add("Kwon");
        names.add("John");
        names.add("Smith");
        names.add("Anvar");

        //ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item_layout, names);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, names);
        listView.setAdapter(adapter);


    }
}
