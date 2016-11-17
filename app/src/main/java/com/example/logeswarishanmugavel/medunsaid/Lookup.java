package com.example.logeswarishanmugavel.medunsaid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;




public class Lookup extends AppCompatActivity {

    ListView medListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lookup);

        //get list view from xml
        medListView = (ListView) findViewById(R.id.medListView);


        String[] Meds = {
                "Amoxicillin",
                "Bumex",
                "Clonazepam",
                "Digoxin",
                "Hydrocodone",
                "Keflex",
                "Lasix",
                "Lisinopril",
                "Phenergan",
                "Zofran"};

        ListAdapter medAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Meds);
        ListView medListView = (ListView) findViewById(R.id.medListView);
        medListView.setAdapter(medAdapter);

        medListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String medication = String.valueOf(parent.getItemAtPosition(position));

                        if (position == 0) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), Amoxicillin.class);
                            startActivityForResult(myIntent, 0);

                        }
                        if (position == 1) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), Bumex.class);
                            startActivityForResult(myIntent, 0);

                        }
                        if (position == 2) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), Clonazepam.class);
                            startActivityForResult(myIntent, 0);

                        }
                        if (position == 3) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), Digoxin.class);
                            startActivityForResult(myIntent, 0);

                        }
                        if (position == 4) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), Hydrocodone.class);
                            startActivityForResult(myIntent, 0);

                        }
                        if (position == 5) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), Keflex.class);
                            startActivityForResult(myIntent, 0);

                        }
                        if (position == 6) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), Lasix.class);
                            startActivityForResult(myIntent, 0);

                        }
                        if (position == 7) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), Lisinopril.class);
                            startActivityForResult(myIntent, 0);

                        }
                        if (position == 8) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), Phenergan.class);
                            startActivityForResult(myIntent, 0);

                        }
                        if (position == 9) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), Zofran.class);
                            startActivityForResult(myIntent, 0);

                        }
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
}
