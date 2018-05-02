package com.example.campus_comuputer.kibrisorderstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class debugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
        myinit();

    }
    public void myinit(){
        String[] activities = {"Sign in", "Tabbed activity", "Buttom Nav activity", "App settings activity","NavigationalDrawerActivity","ScrollingActivity","ItemListActivity","Custom List Activity"};
        ListView listView =(ListView) findViewById(R.id.debugListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1,activities);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        startActivity(new Intent(debugActivity.this,SignInActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(debugActivity.this,TabbedActivity.class));
                        break;
                    case 2:

                        startActivity(new Intent(debugActivity.this,ButtomNavActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(debugActivity.this,AppSettingsActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(debugActivity.this,NavigationalDrawerActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(debugActivity.this,ScrollingActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(debugActivity.this,ItemListActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(debugActivity.this,customListActivity.class));
                        break;
                }
            }
        });
    }
}
