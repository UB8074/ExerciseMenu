package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class K_trapesium extends AppCompatActivity {
    Button Btn;
    EditText ETab;
    EditText ETef;
    EditText ETae;
    TextView TVhsl;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_trapesium);
        ETab = findViewById(R.id.ETpjAB);
        ETef = findViewById(R.id.ETpjEF);
        ETae = findViewById(R.id.ETpjAE);
        Btn = findViewById(R.id.BtnHtgKkotakmir);
        TVhsl = findViewById(R.id.TVhslKkotakmir);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double AB = Double.parseDouble(ETab.getText().toString());
                double EF = Double.parseDouble(ETef.getText().toString());
                double AE = Double.parseDouble(ETef.getText().toString());
                double keliling = AB + EF + (2.0 * AE);

                StringBuilder sb = new StringBuilder();
                sb.append("Luas Trapesium dengan panjang AB: ");
                sb.append(AB);
                sb.append(" dan panjang EF: ");
                sb.append(EF);
                sb.append(" dan tinggi: ");
                sb.append(AE);
                sb.append(" adalah: ");
                sb.append(keliling);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}
