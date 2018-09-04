package com.example.kalpesh.samplerecyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] lang = { "Malyalam","Tamil","Telugu","Hindi","Marathi"} ;
        CustAdapter adapter = new CustAdapter(lang);
        RecyclerView sampleList = (RecyclerView) findViewById(R.id.rv_list) ;
        sampleList.setLayoutManager(new LinearLayoutManager(this));
        sampleList.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
