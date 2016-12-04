package com.example.logeswarishanmugavel.medunsaid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by logeswarishanmugavel on 11/17/16.
 */

public class EditMedication extends AppCompatActivity {

    Button GoToMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_medication);

        EditText name = (EditText) findViewById(R.id.medname);
        EditText notes = (EditText) findViewById(R.id.notes);
        Spinner s = (Spinner) findViewById(R.id.spinner1);
        CheckBox tu = (CheckBox) findViewById(R.id.ch2);
        CheckBox th = (CheckBox) findViewById(R.id.ch4);
        CheckBox sat = (CheckBox) findViewById(R.id.ch6);
        EditText qty1 = (EditText) findViewById(R.id.howmany1);
        EditText qty2 = (EditText) findViewById(R.id.howmany2);
        EditText qty3 = (EditText) findViewById(R.id.howmany3);
        EditText qty4 = (EditText) findViewById(R.id.howmany4);
        EditText refillqty = (EditText) findViewById(R.id.refillwhen);


        name.setText("Amoxicillin");
        tu.setChecked(true);
        th.setChecked(true);
        sat.setChecked(true);
        s.setSelection(2);
        qty1.setText("2");
        qty2.setText("1");
        qty3.setText("2");
        qty4.setText("0");
        refillqty.setText("10");


        notes.setText("This Medication has been deleted from your list");
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
                startActivity(new Intent(this, ViewDoctors.class));
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

    public void saveMedication(View view) {
        Toast.makeText(getApplicationContext(), "New medication added to your list.", Toast.LENGTH_SHORT).show();
    }

}
