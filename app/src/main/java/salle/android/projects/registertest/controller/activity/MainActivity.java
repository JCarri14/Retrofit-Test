package salle.android.projects.registertest.controller.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import salle.android.projects.registertest.R;

public class MainActivity extends AppCompatActivity {

    private Button mList;
    private Button mAdvancedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mList = (Button) findViewById(R.id.show_tracks);
        mList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(intent);
            }
        });

        mAdvancedList = (Button) findViewById(R.id.show_advanced_tracks);
        mAdvancedList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AdvancedListActivity.class);
                startActivity(intent);
            }
        });
    }
}
