package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class L_segitelu extends AppCompatActivity {
    Button Btn;
    EditText ETalas;
    EditText ETt;
    TextView TVhsl;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_segitelu);
        ETalas = findViewById(R.id.ETalasL);
        ETt = findViewById(R.id.ETtL);
        Btn = findViewById(R.id.BtnHtgLsegitelu);
        TVhsl = findViewById(R.id.TVhslLsegitelu);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double alas = Double.parseDouble(ETalas.getText().toString());
                double tinggi = Double.parseDouble(ETt.getText().toString());
                double luas = (alas * tinggi) / 2.0;

                StringBuilder sb = new StringBuilder();
                sb.append("Luas Segitiga dengan alas: ");
                sb.append(alas);
                sb.append(" dan tinggi: ");
                sb.append(tinggi);
                sb.append(" adalah: ");
                sb.append(luas);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}
