package com.example.logeswarishanmugavel.medunsaid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by logeswarishanmugavel on 11/17/16.
 */

public class AmoxicillinUser extends AppCompatActivity{

    Button GoToMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amoxicillin_user);
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

    public void amoxicillin(View view) {
        startActivity(new Intent(this, Zofran.class));
    }

    public void edit(View view){
        startActivity(new Intent(this, EditMedication.class));
    }

    public void delete(View view){
        Toast.makeText(getApplicationContext(), "This Medication has been deleted from your list", Toast.LENGTH_SHORT).show();
    }

}
