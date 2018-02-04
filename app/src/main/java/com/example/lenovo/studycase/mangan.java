package com.example.lenovo.studycase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mangan extends AppCompatActivity {
EditText edmakan, edmilea;
Button bteatbus, btubnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangan);
        edmakan = (EditText)findViewById(R.id.makan);
        edmilea = (EditText)findViewById(R.id.milea);
        bteatbus = (Button)findViewById(R.id.eatbus);
        btubnormal = (Button)findViewById(R.id.abnormal);

        bteatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double makan, milea;
                makan = Double.valueOf(edmakan.getText().toString().trim());
                milea = Double.valueOf(edmilea.getText().toString().trim());
            }
        });

    }
}
