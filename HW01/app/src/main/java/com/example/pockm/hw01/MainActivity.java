package com.example.pockm.hw01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button = (Button) this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText=(EditText) findViewById(R.id.editText);
                String str="B10509010:"+editText.getText();
                Intent intent = new Intent(MainActivity.this, ChildActivity.class);
                intent.putExtra("str",str);
                startActivity(intent);
            }
        });
    }
}
