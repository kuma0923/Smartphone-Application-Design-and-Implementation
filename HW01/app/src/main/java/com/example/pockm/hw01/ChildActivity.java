package com.example.pockm.hw01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    private TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        this.show = (TextView) this.findViewById(R.id.show);
        Intent intent = this.getIntent();
        if (intent.hasExtra("str")) {
            this.show.setText(intent.getStringExtra("str"));
        }
    }
}
