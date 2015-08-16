package com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /**
     * This method is used when the button spotify streamer is clicked.
     */
    public void spotifyStreamer(View v) {
        showToast("This button will launch spotify streamer app!");
    }

    /**
     * This method is used when the button scores app is clicked.
     */
    public void scoresApp(View v) {
        showToast("This button will launch scores app!");
    }

    /**
     * This method is used when the button library app is clicked.
     */
    public void libraryApp(View v) {
        showToast("This button will launch library app!");
    }

    /**
     * This method is used when the button build it bigger is clicked.
     */
    public void buildItBigger(View v) {
        showToast("This button will launch build it bigger app!");
    }

    /**
     * This method is used when the button xyz reader is clicked.
     */
    public void xyzReader(View v) {
        showToast("This button will launch xyz reader app!");
    }

    /**
     * This method is used when the button capstone app is clicked.
     */
    public void capstoneApp(View v) {
        showToast("This button will launch my capstone app!");
    }

    /**
     * This method is used to display the toast when the buttons are clicked.
     */
    public void showToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
