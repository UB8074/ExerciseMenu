package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class L_bunder extends AppCompatActivity {
    Button Btn;
    EditText ETj;
    TextView TVhsl;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_bunder);
        ETj = findViewById(R.id.ETjariL);
        Btn = findViewById(R.id.BtnHtgLbunder);
        TVhsl = findViewById(R.id.TVhslLbunder);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double jari = Double.parseDouble(ETj.getText().toString());
                double luas = 3.14 * jari * jari;

                StringBuilder sb = new StringBuilder();
                sb.append("Luas Lingkaran dengan jari-jari: ");
                sb.append(jari);
                sb.append(" adalah: ");
                sb.append(luas);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}
