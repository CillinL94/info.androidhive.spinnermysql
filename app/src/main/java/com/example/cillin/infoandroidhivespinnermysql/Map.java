package com.example.cillin.infoandroidhivespinnermysql;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by cillin on 06/07/2015.
 */
public class Map extends Activity
{

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        //This page layout is located in the menu XML file
        //SetContentView links a Java file, to its XML file for the layout
        setContentView(R.layout.map);

        /*Spinner mySpinner = (Spinner)findViewById(R.id.spinFood);
        String text = mySpinner.getSelectedItem().toString();
        EditText e = (EditText) findViewById (R.id.editText1);
        e.setText(text);*/

        String spinnerString;
        if (getIntent() != null && getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle.getString("SPINNER_KEY") != null) {
                spinnerString = bundle.getString("SPINNER_KEY");
            }
        }

        //TextView e = (EditText) findViewById (R.id.Text1);
        //e.setText(spinnerString);

        Button mainm = (Button)findViewById(R.id.mainmenu);
        mainm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This button is linked to the map page
                Intent i = new Intent(Map.this, MainMenu.class);

                //Activating the intent
                startActivity(i);
            }
        });
    }

}
