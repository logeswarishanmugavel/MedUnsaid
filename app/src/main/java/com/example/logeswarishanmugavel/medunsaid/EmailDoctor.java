package com.example.logeswarishanmugavel.medunsaid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Button;

public class EmailDoctor extends AppCompatActivity {

    Button GoToMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_doctor);

        GoToMainActivity = (Button)findViewById(R.id.cancelEmail);

        GoToMainActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Intent code for open new activity through intent.

                Intent intent = new Intent(EmailDoctor.this, MainActivity.class);
                startActivity(intent);

            }
        });
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

    public void clearFields(View view) {
        EditText notes = (EditText) findViewById(R.id.msgBody);
        notes.setText("");

        Spinner dr = (Spinner) findViewById(R.id.drSelector);
        dr.setSelection(0);
    }

    public void sendMsg(View view) {
        Toast.makeText(getApplicationContext(), "Emailed medication list to provider.", Toast.LENGTH_SHORT).show();
        clearFields(view);
    }
}
