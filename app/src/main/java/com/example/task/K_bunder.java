package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class K_bunder extends AppCompatActivity {
    Button Btn;
    EditText ETj;
    TextView tv;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_bunder);
        ETj = findViewById(R.id.ETjariK);
        Btn = findViewById(R.id.BtnHtgKbunder);
        tv = findViewById(R.id.TVhslKbunder);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double jari = Double.parseDouble(ETj.getText().toString());
                double keliling = 3.14 * 2.0 * jari;

                StringBuilder sb = new StringBuilder();
                sb.append("Hasil Keliling Lingkaran dengan jari-jari: ");
                sb.append(jari);
                sb.append(" adalah: ");
                sb.append(keliling);
                sb.append(BuildConfig.FLAVOR);
                tv.setText(sb.toString());
            }
        });
    }
}
