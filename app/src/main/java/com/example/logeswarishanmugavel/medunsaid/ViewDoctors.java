package com.example.logeswarishanmugavel.medunsaid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ViewDoctors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_doctors);

        Intent toast = getIntent();

        if (toast.hasExtra("toast")) {
            Toast.makeText(getApplicationContext(), "Provider information saved.", Toast.LENGTH_SHORT).show();
        }
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

    public void pcDr(View view) {
        Intent info = new Intent(this, AddDoctor.class);

        info.putExtra("name", "Primary Care Doctor");
        info.putExtra("number", "720-453-9000");
        info.putExtra("email", "pcdoctor@doc.com");

        startActivity(info);
    }

    public void pharm(View view) {
        Intent info = new Intent(this, AddDoctor.class);

        info.putExtra("name", "Pharmacist");
        info.putExtra("number", "720-453-8000");
        info.putExtra("email", "pharmacist@pharm.com");

        startActivity(info);
    }

    public void addDoc(View view) {
        startActivity(new Intent(this, AddDoctor.class));
    }
}
