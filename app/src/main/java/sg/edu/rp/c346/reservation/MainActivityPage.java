package sg.edu.rp.c346.reservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivityPage extends AppCompatActivity {

    ListView lvRes;
    ArrayList<DataList> ResList = new ArrayList<>();
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

        lvRes = findViewById(R.id.ReservationList);

        Intent intentReceived = getIntent();
        String name = intentReceived.getStringExtra("etName");
        int telephone = intentReceived.getIntExtra("etTelephone", 0);
        int size = intentReceived.getIntExtra("etSize", 0);
        String date = intentReceived.getStringExtra("etDay");
        String time = intentReceived.getStringExtra("etTime");



        ResList.add(new DataList("Patrick", 91191199, 10, true, "17/12/2014", "20:25"));


        adapter = new CustomAdapter(this, R.layout.row, ResList);
        lvRes.setAdapter(adapter);

        lvRes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentDetail = new Intent(getBaseContext(), DetailActivityPage.class);
                DataList currentRes = ResList.get(position);
                intentDetail.putExtra("Name", currentRes.getName());
                intentDetail.putExtra("Telephone", currentRes.getTelephone());
                intentDetail.putExtra("Size", currentRes.getSize());
                intentDetail.putExtra("Smoking", currentRes.isSmoking());
                intentDetail.putExtra("Day", currentRes.getDate());
                intentDetail.putExtra("Time", currentRes.getTime());
                startActivity(intentDetail);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if(id == R.id.CreateReserationActivity){
            Intent intentCreat = new Intent(getBaseContext(),MainActivity.class);
            startActivity(intentCreat);
        }

        return super.onOptionsItemSelected(item);
    }




}
