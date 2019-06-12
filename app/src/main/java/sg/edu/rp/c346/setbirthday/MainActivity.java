package sg.edu.rp.c346.setbirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvshow_birth;
    Button btnSet;
    DatePicker dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvshow_birth = findViewById(R.id.textView);
        btnSet = findViewById(R.id.button);
        dp = findViewById(R.id.datePicker);

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = dp.getDayOfMonth();
                int month = dp.getMonth() +1 ;
                int year = dp.getYear();

                tvshow_birth.setText("Your birthday is " + day +"/"+month+"/"+year);
//                Log.v("MainActivity","Your birthday is " + day +"/"+month+"/"+year);
                Log.v("MainActivity","Button Clicked");
            }
        });
    }
}
