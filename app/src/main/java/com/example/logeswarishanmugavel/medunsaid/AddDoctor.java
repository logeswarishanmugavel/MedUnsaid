package com.example.logeswarishanmugavel.medunsaid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class AddDoctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_doctor);

        Intent info = getIntent();

        if (info.hasExtra("name")) {
            EditText docname = (EditText) findViewById(R.id.docname);
            docname.setText(info.getStringExtra("name"));

            EditText docphone = (EditText) findViewById(R.id.docphone);
            docphone.setText(info.getStringExtra("number"));

            EditText docemail = (EditText) findViewById(R.id.docemail);
            docemail.setText(info.getStringExtra("email"));
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
//
//    public void clearFields(View view) {
//        EditText docname = (EditText) findViewById(R.id.docname);
//        docname.setText("");
//
//        EditText docphone = (EditText) findViewById(R.id.docphone);
//        docphone.setText("");
//
//        EditText docemail = (EditText) findViewById(R.id.docemail);
//        docemail.setText("");
//
//
//    }

    public void saveContact(View view) {
        Intent save = new Intent(this, ViewDoctors.class);

        save.putExtra("toast", "Provider information saved.");

        startActivity(save);
    }
}
