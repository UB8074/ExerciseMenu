package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class L_kotak extends AppCompatActivity {
    Button Btn;
    EditText ETs;
    TextView TVhsl;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_kotak);
        ETs = findViewById(R.id.ETsisiL);
        TVhsl = findViewById(R.id.TVhslLkotak);
        Btn = findViewById(R.id.BtnHtgLkotak);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double sisi = Double.parseDouble(ETs.getText().toString());
                double luasP = sisi * sisi;

                StringBuilder sb = new StringBuilder();
                sb.append("Luas Persegi dengan sisi: ");
                sb.append(sisi);
                sb.append(" adalah: ");
                sb.append(luasP);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}
