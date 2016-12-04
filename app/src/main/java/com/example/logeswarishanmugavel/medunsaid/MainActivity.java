package com.example.logeswarishanmugavel.medunsaid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addProvider(View view) {
        startActivity(new Intent(this, ViewDoctors.class));
    }

    public void emailMeds(View view) {
        startActivity(new Intent(this, EmailDoctor.class));
    }

    public void analyzeMed(View view) {
        startActivity(new Intent(this, Analyze.class));
    }

    public void lookupMed(View view) {
        startActivity(new Intent(this, Lookup.class));
    }

    public void viewMed(View view) {
        startActivity(new Intent(this, ViewMedication.class));
    }

    public void addMed(View view) {
        startActivity(new Intent(this, AddMedication.class));
    }

}
