package com.example.chiriku711.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listView;


    //isi data
    String data[]= {

            "data 1",
            "data 2",
            "data 3",
            "data 4",
            "data 5",
            "data 6",
            "data 7",
            "data 8",
            "data 9",
            "data 10",
            "data 11",
            "data 12",
            "data 13",
            "data 14",
            "data 15",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);

        listView.setAdapter(adapter);

    }
}
