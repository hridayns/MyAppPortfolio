package com.myappportfolio.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }



    public void onClicked(View v) {
        switch(v.getId()) {
            case R.id.spotify_streamer:
                toast = Toast.makeText(MainActivity.this, R.string.spotify_streamer, Toast.LENGTH_LONG);
                break;
            case R.id.football_scores:
                toast = Toast.makeText(MainActivity.this,R.string.football_scores,Toast.LENGTH_LONG);
                break;
            case R.id.library:
                toast = Toast.makeText(MainActivity.this,R.string.library,Toast.LENGTH_LONG);
                break;
            case R.id.build_it_bigger:
                toast = Toast.makeText(MainActivity.this,R.string.build_it_bigger,Toast.LENGTH_LONG);
                break;
            case R.id.xyz_reader:
                toast = Toast.makeText(MainActivity.this,R.string.xyz_reader,Toast.LENGTH_LONG);
                break;
            case R.id.capstone:
                toast = Toast.makeText(MainActivity.this,R.string.capstone,Toast.LENGTH_LONG);
                break;
        }

        toast.show();
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
