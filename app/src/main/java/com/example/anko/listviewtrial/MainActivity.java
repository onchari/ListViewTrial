package com.example.anko.listviewtrial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

//Array of String
    String[] mobileArray = {

        "Android",
        "Iphone",
        "Windows Phone",
        "Webos",
        "Ubuntu",
        "Windows 7",
        "Mac OS X",
        "Blackbery"

};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.array_list, mobileArray);
        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
}
