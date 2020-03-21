package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import static android.widget.AdapterView.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        final TextView tv1 = findViewById(R.id.tv1);

        btn1.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        tv1.setText("What a beautiful app!");
                                        Log.d("MainActivity", "The world!");
                                    }
                                });

        Log.d("MainActivity", "world");
    }
}
