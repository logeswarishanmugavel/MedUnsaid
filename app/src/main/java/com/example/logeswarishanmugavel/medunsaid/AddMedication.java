package com.example.logeswarishanmugavel.medunsaid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class AddMedication extends AppCompatActivity {


    Button GoToMainActivity;
    Button GoToViewMedication;

    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medication);
        /*
        GoToViewMedication = (Button)findViewById(R.id.save);

        GoToViewMedication.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Intent code for open new activity through intent.

                Intent intent = new Intent(AddMedication.this, ViewMedication.class);
                startActivity(intent);

            }
        });*/

        /*Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner1_values, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        String text = spinner.getSelectedItem().toString();
        Log.i("my",text);
        TextView t2 = (TextView) findViewById(R.id.howmanylabel2);
        TextView t3 = (TextView) findViewById(R.id.howmanylabel3);
        TextView t4 = (TextView) findViewById(R.id.howmanylabel4);
        EditText e2 = (EditText) findViewById(R.id.howmany2);
        EditText e3 = (EditText) findViewById(R.id.howmany3);
        EditText e4 = (EditText) findViewById(R.id.howmany4);

        if (text == "Twice a day")
        {
            t2.setVisibility(View.VISIBLE);
            e2.setVisibility(View.VISIBLE);
            Log.d("mytag1","Twice");
        }
        else if (text == "Thrice a day")
        {
                t2.setVisibility(View.VISIBLE);
                e2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                e3.setVisibility(View.VISIBLE);
                Log.d("mytag2","Thrice");
        }
        else if (text == "Four times a day")
        {
                    t2.setVisibility(View.VISIBLE);
                    e2.setVisibility(View.VISIBLE);
                    t3.setVisibility(View.VISIBLE);
                    e3.setVisibility(View.VISIBLE);
                    t4.setVisibility(View.VISIBLE);
                    e4.setVisibility(View.VISIBLE);
                    Log.d("mytag3","Four");
        }
        */
    }

    public void clearFields(View view) {
        EditText name = (EditText) findViewById(R.id.medname);
        EditText notes = (EditText) findViewById(R.id.notes);
        Spinner s = (Spinner) findViewById(R.id.spinner1);
        CheckBox mon = (CheckBox) findViewById(R.id.ch1);
        CheckBox tu = (CheckBox) findViewById(R.id.ch2);
        CheckBox wed = (CheckBox) findViewById(R.id.ch3);
        CheckBox th = (CheckBox) findViewById(R.id.ch4);
        CheckBox fri = (CheckBox) findViewById(R.id.ch5);
        CheckBox sat = (CheckBox) findViewById(R.id.ch6);
        CheckBox sun = (CheckBox) findViewById(R.id.ch7);
        EditText qty1 = (EditText) findViewById(R.id.howmany1);
        EditText qty2 = (EditText) findViewById(R.id.howmany2);
        EditText qty3 = (EditText) findViewById(R.id.howmany3);
        EditText qty4 = (EditText) findViewById(R.id.howmany4);
        EditText refillqty = (EditText) findViewById(R.id.refillwhen);

        name.setText("");
        s.setSelection(0);
        mon.setChecked(false);
        tu.setChecked(false);
        wed.setChecked(false);
        th.setChecked(false);
        fri.setChecked(false);
        sat.setChecked(false);
        sun.setChecked(false);
        qty1.setText("");
        qty2.setText("");
        qty3.setText("");
        qty4.setText("");
        refillqty.setText("");
        notes.setText("");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            case R.id.menu_addmed:
                startActivity(new Intent(this, AddMedication.class));
                return true;
            case R.id.menu_viewmed:
                startActivity(new Intent(this, ViewMedication.class));
                return true;
            case R.id.menu_adddoc:
                startActivity(new Intent(this, AddDoctor.class));
                return true;
            case R.id.menu_emaildoc:
                startActivity(new Intent(this, EmailDoctor.class));
                return true;
            case R.id.menu_lookup:
                startActivity(new Intent(this, Lookup.class));
                return true;
            case R.id.menu_analyze:
                startActivity(new Intent(this, Analyze.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void saveMedication(View view) {
        Toast.makeText(getApplicationContext(), "New medication added to your list.", Toast.LENGTH_SHORT).show();
    }

}
