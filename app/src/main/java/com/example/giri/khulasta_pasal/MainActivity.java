package com.example.giri.khulasta_pasal;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout.DrawerListener;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;



    EditText editText;
    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
       toggle = new ActionBarDrawerToggle(MainActivity.this ,drawerLayout ,R.string.start , R.string.close);

       drawerLayout.setDrawerListener(toggle);
      // toggle.syncState();

      // getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // int value = Integer.parseInt(editText.getText().toString());
                //String str = "go in another ";

               // if(value == 1234 ){

                 //   Toast.makeText(MainActivity.this, str , Toast.LENGTH_LONG).show();

                   Intent i  = new  Intent(MainActivity.this,Details.class);
                   startActivity(i);
              //  }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new  Intent(MainActivity.this,Map.class);
                startActivity(i);
            }
        });

    }


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        toggle.syncState();

    }
}
