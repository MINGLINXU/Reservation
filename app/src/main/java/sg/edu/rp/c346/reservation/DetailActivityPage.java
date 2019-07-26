package sg.edu.rp.c346.reservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivityPage extends AppCompatActivity {

    TextView tvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailactivity);

        tvDetail = findViewById(R.id.textViewDetails);
        Intent intentReceived = getIntent();
        String name = intentReceived.getStringExtra("Name");
        int telephone = intentReceived.getIntExtra("Telephone", 0);
        int size = intentReceived.getIntExtra("Size", 0);
        boolean isSmoke = intentReceived.getBooleanExtra("Smoking", true);
        String date = intentReceived.getStringExtra("Day");
        String time = intentReceived.getStringExtra("Time");

        String smoke = "";
        if (isSmoke==true) {
            smoke = "smoking";
        } else {
            smoke = "non-smoking";
        }
        tvDetail.setText("New Reservation\nName: " + name + "\nTelephone:" + telephone + "\nSmoking: " + smoke + "\nSize: " + size + "\nDate: " + date + "\nTime: " + time);

    }


}
