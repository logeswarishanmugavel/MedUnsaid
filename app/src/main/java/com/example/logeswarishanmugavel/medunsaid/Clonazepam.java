package com.example.logeswarishanmugavel.medunsaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Clonazepam extends AppCompatActivity {

    Button GoToMainActivity;
    Button GoToAddMedication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clonazepam);

        GoToMainActivity = (Button)findViewById(R.id.CancelButton);

        GoToMainActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Intent code for open new activity through intent.

                Intent intent = new Intent(Clonazepam.this, MainActivity.class);
                startActivity(intent);

            }
        });

        GoToAddMedication = (Button)findViewById(R.id.SaveButton);

        GoToAddMedication.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Intent code for open new activity through intent.

                Intent intent = new Intent(Clonazepam.this, AddMedication.class);
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
}
