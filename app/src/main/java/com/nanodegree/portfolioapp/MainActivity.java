package com.nanodegree.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button spotify, scores, library, build, xyz, capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
    }

    public void initializeViews() {
        spotify = (Button) findViewById(R.id.spotifyStreamerButton);
        scores = (Button) findViewById(R.id.scoresAppButton);
        library = (Button) findViewById(R.id.libraryAppButton);
        build = (Button) findViewById(R.id.buildItBiggerButton);
        xyz = (Button) findViewById(R.id.xyzReaderButton);
        capstone = (Button) findViewById(R.id.capstoneProjectButton);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotifyStreamerButton:
                Toast.makeText(v.getContext(), "")
                break;
            case R.id.scoresAppButton:
                break;
            case R.id.libraryAppButton:
                break;
            case R.id.buildItBiggerButton:
                break;
            case R.id.xyzReaderButton:
                break;
            case R.id.capstoneProjectButton:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}