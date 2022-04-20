package com.example.las_luciernagas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PrimeroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primero);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.primero, menu);
        return true;
    }
    
}
