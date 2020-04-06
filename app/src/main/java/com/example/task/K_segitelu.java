package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class K_segitelu extends AppCompatActivity {
    Button Btn;
    EditText ETa;
    EditText ETm;
    EditText ETt;
    TextView Tvhsl;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_segitelu);
        ETa = findViewById(R.id.ETalasK);
        ETt = findViewById(R.id.ETtK);
        ETm = findViewById(R.id.ETmirK);
        Btn = findViewById(R.id.BtnHtgKsegitelu);
        Tvhsl = findViewById(R.id.TVhslKsegitelu);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double alas = Double.parseDouble(ETa.getText().toString());
                double tinggi = Double.parseDouble(ETt.getText().toString());
                double miring = Double.parseDouble(ETm.getText().toString());
                double keliling = alas + tinggi + miring;

                StringBuilder sb = new StringBuilder();
                sb.append("Keliling Segitiga dengan alas: ");
                sb.append(alas);
                sb.append(" , tinggi: ");
                sb.append(tinggi);
                sb.append(" dan sisi miring: ");
                sb.append(miring);
                sb.append(" adalah: ");
                sb.append(keliling);
                sb.append(BuildConfig.FLAVOR);
                Tvhsl.setText(sb.toString());
            }
        });
    }
}
