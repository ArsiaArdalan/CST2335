package com.example.cst2335.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Automobile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automobile);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    public boolean onCreateOptionsMenu (Menu m) {
        getMenuInflater().inflate(R.menu.main_toolbar, m);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem mi) {
        int id = mi.getItemId();

        switch (id) {
            case R.id.option_livingroom:
                Intent mainIntent = new Intent(Automobile.this, LivingRoom.class);
                startActivity(mainIntent);
                break;

            case R.id.option_kitchen:
                mainIntent = new Intent(Automobile.this, Kitchen.class);
                startActivity(mainIntent);
                break;

            case R.id.option_home:
                mainIntent = new Intent(Automobile.this, House.class);
                startActivity(mainIntent);
                break;

            case R.id.option_automobile:
                mainIntent = new Intent(Automobile.this, Automobile.class);
                startActivity(mainIntent);
                break;

            case R.id.option_about:
                CharSequence text = "Version 1.0, by Seungwan Noh";
                int duration = Toast.LENGTH_SHORT; //= Toast.LENGTH_LONG if Off

                Toast toast = Toast.makeText(Automobile.this, text, duration); //this is the ListActivity
                toast.show(); //display your message box
                break;
        }
        return true;
    }
}

